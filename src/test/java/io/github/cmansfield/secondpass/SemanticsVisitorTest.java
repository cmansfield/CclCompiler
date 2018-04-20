package io.github.cmansfield.secondpass;

import io.github.cmansfield.firstpass.symbols.data.AccessModifier;
import io.github.cmansfield.firstpass.symbols.data.DataBuilder;
import org.apache.commons.collections4.bidimap.DualHashBidiMap;
import io.github.cmansfield.parser.language.CclGrammarParser;
import io.github.cmansfield.firstpass.symbols.SymbolBuilder;
import io.github.cmansfield.firstpass.symbols.SymbolFilter;
import io.github.cmansfield.compiler.syntax.CompilerTest;
import io.github.cmansfield.firstpass.symbols.SymbolKind;
import org.apache.commons.collections4.CollectionUtils;
import io.github.cmansfield.parser.CclCompilerVisitor;
import io.github.cmansfield.compiler.CompilerOptions;
import io.github.cmansfield.firstpass.symbols.Symbol;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import org.apache.commons.collections4.BidiMap;
import io.github.cmansfield.parser.ParserUtils;
import org.antlr.v4.runtime.ParserRuleContext;
import org.apache.commons.lang3.StringUtils;
import org.testng.annotations.BeforeClass;
import org.antlr.v4.runtime.CommonToken;
import org.testng.annotations.Test;

import java.util.function.BiConsumer;
import java.io.IOException;
import java.util.*;

import static org.mockito.Mockito.mock;
import static org.testng.Assert.*;


public class SemanticsVisitorTest {
  private CompilerTest compilerTest;

  @BeforeClass
  public void setUp() {
    this.compilerTest = new CompilerTest();
  }

  @Test
  public void test_copyConstructor() {
    List<SAR> testSars = Arrays.asList(
            new SAR(SarType.LITERAL, "l40003", "16"),
            new SAR(SarType.LITERAL, "l40004", "3"),
            new SAR(SarType.LITERAL, "l40005", "92"));
    Deque<SAR> sas = new ArrayDeque<>();
    testSars.forEach(sas::push);
    
    Deque<SAR> copySas = new ArrayDeque<>(sas);

    assertNotNull(copySas);
    assertEquals(copySas.size(), 3);
    assertFalse(sas == copySas);
    testSars.forEach(sar -> assertEquals(sas.pollLast(), sar));
  }
  
  @Test
  public void test_sas_numericLiteral() {
    final String symbolText = "5";
    
    testLiteral(
            symbolText, 
            SymbolKind.INT_LIT, 
            CclGrammarParser.NUMERIC_LITERAL, 
            new CclGrammarParser.NumericLiteralContext(null, 0), 
            (visitor, ctx) -> visitor.visitNumericLiteral((CclGrammarParser.NumericLiteralContext) ctx));
  }

  @Test
  public void test_sas_characterLiteral() {
    final String symbolText = "k";

    testLiteral(
            symbolText,
            SymbolKind.CHAR_LIT,
            CclGrammarParser.CHARACTER_LITERAL,
            new CclGrammarParser.CharacterLiteralContext(null, 0),
            (visitor, ctx) -> visitor.visitCharacterLiteral((CclGrammarParser.CharacterLiteralContext) ctx));
  }

  @Test
  public void test_sas_stringLiteral() {
    final String symbolText = "Hello World";

    testLiteral(
            symbolText,
            SymbolKind.STR_LIT,
            CclGrammarParser.STRING_LITERAL,
            new CclGrammarParser.StringLiteralContext(null, 0),
            (visitor, ctx) -> visitor.visitStringLiteral((CclGrammarParser.StringLiteralContext) ctx));
  }

  @Test
  public void test_sas_booleanLiteral() {
    final String symbolText = "false";

    testLiteral(
            symbolText,
            SymbolKind.BOOL_LIT,
            CclGrammarParser.BOOLEAN_LITERAL,
            new CclGrammarParser.BooleanLiteralContext(null, 0),
            (visitor, ctx) -> visitor.visitBooleanLiteral((CclGrammarParser.BooleanLiteralContext) ctx));
  }

  @Test
  public void test_sas_specialLiteral() {
    final String symbolText = "null";

    testLiteral(
            symbolText,
            SymbolKind.SPECIAL_LIT,
            CclGrammarParser.SPECIAL_LITERAL,
            new CclGrammarParser.SpecialLiteralContext(null, 0),
            (visitor, ctx) -> visitor.visitSpecialLiteral((CclGrammarParser.SpecialLiteralContext) ctx));
  }

  @Test
  public void test_traceScopeToFindSymbolId() throws IOException {
    SymbolKind symbolKind = SymbolKind.LOCAL_VAR;
    String fileName = "test7.ccl";
    String text = "name";

    BidiMap<String, Symbol> symbolTable = compilerTest.compile(fileName);
    SemanticsVisitor visitor = new SemanticsVisitor(symbolTable);
    Symbol filter = new SymbolBuilder()
            .symbolKind(symbolKind)
            .text(text)
            .build();
    List<Symbol> found = SymbolFilter.filter(symbolTable, filter);
    String scope = found.get(0).getScope();
    String symbolId = visitor.traceScopeToFindSymbolId(text, SarType.IDENTIFIER, scope);
    Symbol symbol = symbolTable.get(symbolId);

    assertTrue(StringUtils.isNotBlank(symbolId));
    assertNotNull(symbol);
    assertEquals(symbol.getText(), text);
    assertEquals(symbol.getSymbolKind(), symbolKind);
  }

  @Test
  public void test_traceScopeToFindSymbolId_notFound() throws IOException {
    BidiMap<String, Symbol> symbolTable = compilerTest.compile("test7.ccl");
    SemanticsVisitor visitor = new SemanticsVisitor(symbolTable);
    String symbolId = visitor.traceScopeToFindSymbolId("something", SarType.IDENTIFIER, "g.D00001.C00001.M00001");

    assertNull(symbolId);
  }

  @Test
  public void test_traceScopeToFindSymbolId_noText() throws IOException {
    SemanticsVisitor visitor = new SemanticsVisitor(null);
    String symbolId = visitor.traceScopeToFindSymbolId("", SarType.IDENTIFIER, "g.D00001.C00001.M00001");

    assertNotNull(symbolId);
    assertTrue(StringUtils.isBlank(symbolId));
  }

  @Test
  public void test_traceScopeToFindSymbolId_foundInParentScope() throws IOException {
    SymbolKind symbolKind = SymbolKind.INSTANCE_VAR;
    String fileName = "test8.ccl";
    String text = "name";

    BidiMap<String, Symbol> symbolTable = compilerTest.compile(fileName);
    SemanticsVisitor visitor = new SemanticsVisitor(symbolTable);
    Symbol filter = new SymbolBuilder()
            .symbolKind(SymbolKind.LOCAL_VAR)
            .text("last")
            .build();
    List<Symbol> found = SymbolFilter.filter(symbolTable, filter);
    String scope = found.get(0).getScope();
    String symbolId = visitor.traceScopeToFindSymbolId(text, SarType.IDENTIFIER, scope);
    Symbol symbol = symbolTable.get(symbolId);

    assertNotNull(symbol);
    assertEquals(symbol.getText(), text);
    assertEquals(symbol.getSymbolKind(), symbolKind);
  }

  @Test
  public void test_duplicate() throws IOException {
    BidiMap<String, Symbol> symbolTable = compilerTest.compile("test10.ccl", CompilerOptions.FIRST_PASS_ONLY);
    SemanticsVisitor visitor = new SemanticsVisitor(symbolTable);

    symbolTable.entrySet().stream()
            .map(Map.Entry::getValue)
            .forEach(symbol -> {
              SymbolKind symbolKind = symbol.getSymbolKind();
              if(        symbolKind == SymbolKind.METHOD 
                      || symbolKind == SymbolKind.CLASS 
                      || symbolKind == SymbolKind.CONSTRUCTOR) {
                visitor.setScope(symbol.getScope());
                visitor.duplicate(symbol.getText(), symbol.getSymbolKind());
              }
            });
  }

  @Test (expectedExceptions = IllegalStateException.class)
  public void test_duplicate_fail_duplicateClasses() throws IOException {
    BidiMap<String, Symbol> symbolTable = compilerTest.compile("test11.ccl", CompilerOptions.FIRST_PASS_ONLY);
    SemanticsVisitor visitor = new SemanticsVisitor(symbolTable);

    symbolTable.entrySet().stream()
            .map(Map.Entry::getValue)
            .forEach(symbol -> {
              SymbolKind symbolKind = symbol.getSymbolKind();
              if(symbolKind == SymbolKind.CLASS) {
                visitor.setScope(symbol.getScope());
                visitor.duplicate(symbol.getText(), symbol.getSymbolKind());
              }
            });
  }

  @Test (expectedExceptions = IllegalStateException.class)
  public void test_duplicate_fail_duplicateMethods() throws IOException {
    BidiMap<String, Symbol> symbolTable = compilerTest.compile("test12.ccl", CompilerOptions.FIRST_PASS_ONLY);
    SemanticsVisitor visitor = new SemanticsVisitor(symbolTable);

    symbolTable.entrySet().stream()
            .map(Map.Entry::getValue)
            .forEach(symbol -> {
              SymbolKind symbolKind = symbol.getSymbolKind();
              if(symbolKind == SymbolKind.METHOD) {
                visitor.setScope(symbol.getScope());
                visitor.duplicate(symbol.getText(), symbol.getSymbolKind());
              }
            });
  }

  @Test (expectedExceptions = IllegalStateException.class)
  public void test_duplicate_fail_duplicateConstructors() throws IOException {
    BidiMap<String, Symbol> symbolTable = compilerTest.compile("test13.ccl", CompilerOptions.FIRST_PASS_ONLY);
    SemanticsVisitor visitor = new SemanticsVisitor(symbolTable);

    symbolTable.entrySet().stream()
            .map(Map.Entry::getValue)
            .forEach(symbol -> {
              SymbolKind symbolKind = symbol.getSymbolKind();
              if(symbolKind == SymbolKind.CONSTRUCTOR) {
                visitor.setScope(symbol.getScope());
                visitor.duplicate(symbol.getText(), symbol.getSymbolKind());
              }
            });
  }
  
  @Test
  public void test_typeExist_primitives() {
    ParserRuleContext mockContext = mock(ParserRuleContext.class);
    mockContext.start = new CommonToken(-1);
    List<String> primitiveTypes = Arrays.asList(
            ParserUtils.getLiteralName(CclGrammarParser.INT),
            ParserUtils.getLiteralName(CclGrammarParser.CHAR),
            ParserUtils.getLiteralName(CclGrammarParser.BOOL),
            ParserUtils.getLiteralName(CclGrammarParser.STRING),
            ParserUtils.getLiteralName(CclGrammarParser.VOID));

    for(String type : primitiveTypes) {
      SemanticsVisitor visitor = new SemanticsVisitor(null);
      visitor.typePush(mockContext, type);
      visitor.typeExist();
      Deque<SAR> sas = visitor.getSemanticActionStack();

      assertNotNull(sas);
      assertEquals(sas.size(), 1);
      SAR sar = sas.pop();
      assertNotNull(sar);
      assertEquals(sar.getType(), SarType.TYPE);
      assertEquals(sar.getText(), type);
    }
  }
  
  @Test
  public void test_typeExist_nonePrimitive() {
    ParserRuleContext mockContext = mock(ParserRuleContext.class);
    mockContext.start = new CommonToken(-1);
    final String scope = "g.D00001";
    final String text = "SomeClass";
    BidiMap<String, Symbol> symbolTable = new DualHashBidiMap<>();
    symbolTable.put("C00001", new SymbolBuilder()
            .symbolId("C00001")
            .scope(scope)
            .symbolKind(SymbolKind.CLASS)
            .text(text)
            .build());
    SemanticsVisitor visitor = new SemanticsVisitor(symbolTable);
    visitor.setScope(scope);
    
    visitor.typePush(mockContext, text);
    visitor.typeExist();
    SAR sar = visitor.getSemanticActionStack().pop();

    assertNotNull(sar);
    assertEquals(sar.getText(), text);
    assertEquals(sar.getType(), SarType.TYPE);
    assertTrue(StringUtils.isNotBlank(sar.getSymbolId()));
    assertNotNull(symbolTable.get(sar.getSymbolId()));
  }
  
  @Test
  public void test_endOfArgumentList() {
    SemanticsVisitor visitor = new SemanticsVisitor(null);
    Deque<SAR> sas = visitor.getSemanticActionStack();
    sas.push(new SAR(SarType.BEGINNING_ARG_LIST, "", "", 5));
    sas.push(new SAR(SarType.IDENTIFIER, "I00001", "", 5));
    sas.push(new SAR(SarType.IDENTIFIER, "I00002", "", 5));
    sas.push(new SAR(SarType.IDENTIFIER, "I00003", "", 5));
    
    visitor.endOfArgumentList();

    assertTrue(CollectionUtils.isNotEmpty(sas));
    assertEquals(sas.size(), 1);
    SAR sar = sas.pop();
    assertNotNull(sar);
    assertTrue(sar.getLineNumber().isPresent());
    assertEquals(sar.getLineNumber().get(), Integer.valueOf(5));
    assertEquals(sar.getType(), SarType.ARG_LIST);
    List<String> symbolIds = sar.getSymbolIds();
    assertTrue(CollectionUtils.isNotEmpty(symbolIds));
    assertEquals(symbolIds.size(), 3);
    assertTrue(symbolIds.contains("I00001"));
    assertTrue(symbolIds.contains("I00002"));
    assertTrue(symbolIds.contains("I00003"));
  }

  @Test (expectedExceptions = IllegalStateException.class)
  public void test_endOfArgumentList_emtpySas() {
    SemanticsVisitor visitor = new SemanticsVisitor(null);
    
    visitor.endOfArgumentList();
  }

  @Test (expectedExceptions = IllegalStateException.class)
  public void test_endOfArgumentList_noBal() {
    SemanticsVisitor visitor = new SemanticsVisitor(null);
    Deque<SAR> sas = visitor.getSemanticActionStack();
    sas.push(new SAR(SarType.IDENTIFIER, "I00001", "", 5));
    sas.push(new SAR(SarType.IDENTIFIER, "I00002", "", 5));
    sas.push(new SAR(SarType.IDENTIFIER, "I00003", "", 5));

    visitor.endOfArgumentList();
  }

  @Test
  public void test_endOfArgumentList_missingSymbolId() {
    SemanticsVisitor visitor = new SemanticsVisitor(null);
    Deque<SAR> sas = visitor.getSemanticActionStack();
    sas.push(new SAR(SarType.BEGINNING_ARG_LIST, "", "", 5));
    sas.push(new SAR(SarType.IDENTIFIER, "I00002", "", 5));
    sas.push(new SAR(SarType.IDENTIFIER, "", "", 5));

    try {
      visitor.endOfArgumentList();
      fail("Should have errored out");
    }
    catch(IllegalStateException e) {
      assertTrue(e.getMessage().contains("Missing SymbolId for SAR"));
    }
  }
  
  @Test
  public void test_referenceExist_instanceVariable() {
    BidiMap<String, Symbol> symbolTable = new DualHashBidiMap<>();
    String scope = "g.D00001";
    String className = "MyClass";
    String instanceId = "L00001";
    String instanceText = className.toLowerCase();
    String instanceVarId = "I00001";
    String instanceVarText = "number";
    String classId = "C00001";
    symbolTable.put(instanceId, new SymbolBuilder()
            .scope(scope + ".X00001")
            .symbolKind(SymbolKind.LOCAL_VAR)
            .symbolId(instanceId)
            .text(instanceText)
            .data(new DataBuilder()
                    .type(className)
                    .build())
            .build());
    symbolTable.put(classId, new SymbolBuilder()
            .scope(scope)
            .symbolKind(SymbolKind.CLASS)
            .symbolId(classId)
            .text(className)
            .build());
    symbolTable.put(instanceVarId, new SymbolBuilder()
            .scope(scope + "." + classId)
            .symbolKind(SymbolKind.INSTANCE_VAR)
            .symbolId(instanceVarId)
            .text(instanceVarText)
            .data(new DataBuilder()
                    .type(ParserUtils.getLiteralName(CclGrammarParser.INT))
                    .accessModifier(AccessModifier.PUBLIC)
                    .build())
            .build());
    SemanticsVisitor visitor = new SemanticsVisitor(symbolTable);
    Deque<SAR> sas = visitor.getSemanticActionStack();
    sas.push(new SAR(SarType.IDENTIFIER, instanceId, instanceText, 5));
    sas.push(new SAR(SarType.IDENTIFIER, instanceVarId, instanceVarText, 5));
    
    visitor.referenceExist();

    assertTrue(CollectionUtils.isNotEmpty(sas));
    assertEquals(sas.size(), 1);
    SAR sar = sas.pop();
    assertNotNull(sar);
    assertEquals(sar.getText(), instanceText + "." + instanceVarText);
    assertEquals(sar.getLineNumber().orElse(0), Integer.valueOf(5));
    assertTrue(StringUtils.isNotBlank(sar.getSymbolId()));
    assertEquals(sar.getType(), SarType.REFERENCE);
    List<String> referenceIds = sar.getSymbolIds();
    assertTrue(CollectionUtils.isNotEmpty(referenceIds));
    assertEquals(referenceIds.size(), 2);
    assertEquals(referenceIds.get(0), classId);
    assertEquals(referenceIds.get(1), instanceVarId);
  }

  @Test
  public void test_referenceExist_instanceMethod() {
    BidiMap<String, Symbol> symbolTable = new DualHashBidiMap<>();
    String scope = "g.D00001";
    String className = "MyClass";
    String instanceId = "L00001";
    String instanceText = className.toLowerCase();
    String methodId = "M00001";
    String methodText = "someMethod";
    String classId = "C00001";
    symbolTable.put(instanceId, new SymbolBuilder()
            .scope(scope + ".X00001")
            .symbolKind(SymbolKind.LOCAL_VAR)
            .symbolId(instanceId)
            .text(instanceText)
            .data(new DataBuilder()
                    .type(className)
                    .build())
            .build());
    symbolTable.put(classId, new SymbolBuilder()
            .scope(scope)
            .symbolKind(SymbolKind.CLASS)
            .symbolId(classId)
            .text(className)
            .build());
    symbolTable.put(methodId, new SymbolBuilder()
            .scope(scope + "." + classId)
            .symbolKind(SymbolKind.METHOD)
            .symbolId(methodId)
            .text(methodText)
            .data(new DataBuilder()
                    .returnType(ParserUtils.getLiteralName(CclGrammarParser.INT))
                    .accessModifier(AccessModifier.PUBLIC)
                    .build())
            .build());
    SemanticsVisitor visitor = new SemanticsVisitor(symbolTable);
    Deque<SAR> sas = visitor.getSemanticActionStack();
    sas.push(new SAR(SarType.IDENTIFIER, instanceId, instanceText, 5));
    sas.push(new SAR(SarType.IDENTIFIER, methodId, methodText, 5));

    visitor.referenceExist();

    assertTrue(CollectionUtils.isNotEmpty(sas));
    assertEquals(sas.size(), 1);
    SAR sar = sas.pop();
    assertNotNull(sar);
    assertEquals(sar.getText(), instanceText + "." + methodText);
    assertEquals(sar.getLineNumber().orElse(0), Integer.valueOf(5));
    assertTrue(StringUtils.isNotBlank(sar.getSymbolId()));
    assertEquals(sar.getType(), SarType.REFERENCE);
    List<String> referenceIds = sar.getSymbolIds();
    assertTrue(CollectionUtils.isNotEmpty(referenceIds));
    assertEquals(referenceIds.size(), 2);
    assertEquals(referenceIds.get(0), classId);
    assertEquals(referenceIds.get(1), methodId);
  }

  @Test
  public void test_referenceExist_staticVariable() {
    BidiMap<String, Symbol> symbolTable = new DualHashBidiMap<>();
    String scope = "g.D00001";
    String className = "MyClass";
    String instanceVarId = "I00001";
    String instanceVarText = "number";
    String classId = "C00001";
    symbolTable.put(classId, new SymbolBuilder()
            .scope(scope)
            .symbolKind(SymbolKind.CLASS)
            .symbolId(classId)
            .text(className)
            .build());
    symbolTable.put(instanceVarId, new SymbolBuilder()
            .scope(scope + "." + classId)
            .symbolKind(SymbolKind.INSTANCE_VAR)
            .symbolId(instanceVarId)
            .text(instanceVarText)
            .data(new DataBuilder()
                    .type(ParserUtils.getLiteralName(CclGrammarParser.INT))
                    .accessModifier(AccessModifier.PUBLIC)
                    .accessModifier(AccessModifier.STATIC)
                    .build())
            .build());
    SemanticsVisitor visitor = new SemanticsVisitor(symbolTable);
    Deque<SAR> sas = visitor.getSemanticActionStack();
    sas.push(new SAR(SarType.TYPE, classId, className, 5));
    sas.push(new SAR(SarType.IDENTIFIER, instanceVarId, instanceVarText, 5));

    visitor.referenceExist();

    assertTrue(CollectionUtils.isNotEmpty(sas));
    assertEquals(sas.size(), 1);
    SAR sar = sas.pop();
    assertNotNull(sar);
    assertEquals(sar.getText(), className + "." + instanceVarText);
    assertEquals(sar.getLineNumber().orElse(0), Integer.valueOf(5));
    assertTrue(StringUtils.isNotBlank(sar.getSymbolId()));
    assertEquals(sar.getType(), SarType.REFERENCE);
    List<String> referenceIds = sar.getSymbolIds();
    assertTrue(CollectionUtils.isNotEmpty(referenceIds));
    assertEquals(referenceIds.size(), 2);
    assertEquals(referenceIds.get(0), classId);
    assertEquals(referenceIds.get(1), instanceVarId);
  }

  @Test
  public void test_referenceExist_staticMethod() {
    BidiMap<String, Symbol> symbolTable = new DualHashBidiMap<>();
    String scope = "g.D00001";
    String className = "MyClass";
    String methodId = "M00001";
    String methodText = "number";
    String classId = "C00001";
    symbolTable.put(classId, new SymbolBuilder()
            .scope(scope)
            .symbolKind(SymbolKind.CLASS)
            .symbolId(classId)
            .text(className)
            .build());
    symbolTable.put(methodId, new SymbolBuilder()
            .scope(scope + "." + classId)
            .symbolKind(SymbolKind.METHOD)
            .symbolId(methodId)
            .text(methodText)
            .data(new DataBuilder()
                    .returnType(ParserUtils.getLiteralName(CclGrammarParser.INT))
                    .accessModifier(AccessModifier.PUBLIC)
                    .accessModifier(AccessModifier.STATIC)
                    .build())
            .build());
    SemanticsVisitor visitor = new SemanticsVisitor(symbolTable);
    Deque<SAR> sas = visitor.getSemanticActionStack();
    sas.push(new SAR(SarType.TYPE, classId, className, 5));
    sas.push(new SAR(SarType.IDENTIFIER, methodId, methodText, 5));

    visitor.referenceExist();

    assertTrue(CollectionUtils.isNotEmpty(sas));
    assertEquals(sas.size(), 1);
    SAR sar = sas.pop();
    assertNotNull(sar);
    assertEquals(sar.getText(), className + "." + methodText);
    assertEquals(sar.getLineNumber().orElse(0), Integer.valueOf(5));
    assertTrue(StringUtils.isNotBlank(sar.getSymbolId()));
    assertEquals(sar.getType(), SarType.REFERENCE);
    List<String> referenceIds = sar.getSymbolIds();
    assertTrue(CollectionUtils.isNotEmpty(referenceIds));
    assertEquals(referenceIds.size(), 2);
    assertEquals(referenceIds.get(0), classId);
    assertEquals(referenceIds.get(1), methodId);
  }

  @Test
  public void test_referenceExist_fail_emptySas() {
    SemanticsVisitor visitor = new SemanticsVisitor(null);
    
    try {
      visitor.referenceExist();
      fail();
    }
    catch(IllegalStateException e) {
      assertTrue(e.getMessage().contains("SAS does not have enough SARs"));
    }
  }

  @Test
  public void test_referenceExist_fail_tooFewSars() {
    SemanticsVisitor visitor = new SemanticsVisitor(null);
    Deque<SAR> sas = visitor.getSemanticActionStack();
    sas.push(new SAR(SarType.TYPE, "C00001", "MyClass", 5));
    
    try {
      visitor.referenceExist();
      fail();
    }
    catch(IllegalStateException e) {
      assertTrue(e.getMessage().contains("SAS does not have enough SARs"));
    }
  }

  @Test
  public void test_referenceExist_fail_badFieldSarType() {
    SemanticsVisitor visitor = new SemanticsVisitor(null);
    Deque<SAR> sas = visitor.getSemanticActionStack();
    sas.push(new SAR(SarType.TYPE, "C00001", "MyClass", 5));
    sas.push(new SAR(SarType.TYPE, "C00002", "SomeOtherClass", 5));

    try {
      visitor.referenceExist();
      fail();
    }
    catch(IllegalStateException e) {
      assertTrue(e.getMessage().contains("is not something that can be referenced"));
    }
  }

  @Test
  public void test_referenceExist_fail_missingType() {
    SemanticsVisitor visitor = new SemanticsVisitor(null);
    Deque<SAR> sas = visitor.getSemanticActionStack();
    sas.push(new SAR(SarType.IDENTIFIER, "I00001", "number", 5));
    sas.push(new SAR(SarType.IDENTIFIER, "L00001", "MyClass", 5));

    try {
      visitor.referenceExist();
      fail();
    }
    catch(IllegalStateException e) {
      assertTrue(e.getMessage().contains("Could not find the symbol"));
    }
  }

  @Test
  public void test_referenceExist_fail_badParentSarType() {
    SemanticsVisitor visitor = new SemanticsVisitor(null);
    Deque<SAR> sas = visitor.getSemanticActionStack();
    sas.push(new SAR(SarType.LITERAL, "I00001", "13", 5));
    sas.push(new SAR(SarType.IDENTIFIER, "M00001", "someMethod", 5));

    try {
      visitor.referenceExist();
      fail();
    }
    catch(IllegalStateException e) {
      assertTrue(e.getMessage().contains("is not a object or a class and cannot referenced from"));
    }
  }
  
  @Test
  public void test_referenceExist_fail_privateAccessModifier() {
    BidiMap<String, Symbol> symbolTable = new DualHashBidiMap<>();
    String scope = "g.D00001";
    String className = "MyClass";
    String instanceVarId = "I00001";
    String instanceVarText = "number";
    String classId = "C00001";
    symbolTable.put(classId, new SymbolBuilder()
            .scope(scope)
            .symbolKind(SymbolKind.CLASS)
            .symbolId(classId)
            .text(className)
            .build());
    symbolTable.put(instanceVarId, new SymbolBuilder()
            .scope(scope + "." + classId)
            .symbolKind(SymbolKind.INSTANCE_VAR)
            .symbolId(instanceVarId)
            .text(instanceVarText)
            .data(new DataBuilder()
                    .type(ParserUtils.getLiteralName(CclGrammarParser.INT))
                    .accessModifier(AccessModifier.PRIVATE)
                    .accessModifier(AccessModifier.STATIC)
                    .build())
            .build());
    SemanticsVisitor visitor = new SemanticsVisitor(symbolTable);
    Deque<SAR> sas = visitor.getSemanticActionStack();
    sas.push(new SAR(SarType.TYPE, classId, className, 5));
    sas.push(new SAR(SarType.IDENTIFIER, instanceVarId, instanceVarText, 5));

    try {
      visitor.referenceExist();
      fail();
    }
    catch(IllegalStateException e) {
      assertTrue(e.getMessage().contains("is private and cannot be accessed"));
    }
  }

  @Test
  public void test_referenceExist_fail_staticAccessModifier() {
    BidiMap<String, Symbol> symbolTable = new DualHashBidiMap<>();
    String scope = "g.D00001";
    String className = "MyClass";
    String instanceVarId = "I00001";
    String instanceVarText = "number";
    String classId = "C00001";
    symbolTable.put(classId, new SymbolBuilder()
            .scope(scope)
            .symbolKind(SymbolKind.CLASS)
            .symbolId(classId)
            .text(className)
            .build());
    symbolTable.put(instanceVarId, new SymbolBuilder()
            .scope(scope + "." + classId)
            .symbolKind(SymbolKind.INSTANCE_VAR)
            .symbolId(instanceVarId)
            .text(instanceVarText)
            .data(new DataBuilder()
                    .type(ParserUtils.getLiteralName(CclGrammarParser.INT))
                    .accessModifier(AccessModifier.PUBLIC)
                    .build())
            .build());
    SemanticsVisitor visitor = new SemanticsVisitor(symbolTable);
    Deque<SAR> sas = visitor.getSemanticActionStack();
    sas.push(new SAR(SarType.TYPE, classId, className, 5));
    sas.push(new SAR(SarType.IDENTIFIER, instanceVarId, instanceVarText, 5));

    try {
      visitor.referenceExist();
      fail();
    }
    catch(IllegalStateException e) {
      assertTrue(e.getMessage().contains("is not static and cannot be accessed in a static context"));
    }
  }

  /**
   * This is a template method for testing each of the different type of literals
   * 
   * @param symbolText    The expected text
   * @param symbolKind    The type of Symbol
   * @param parserIndex   The CclGrammarParser index that refers to the token type
   */
  private void testLiteral(String symbolText, SymbolKind symbolKind, int parserIndex, ParserRuleContext ctx, BiConsumer<SemanticsVisitor, ParserRuleContext> visitMethod) {
    final String fakePackageName = "fakeFile.ccl";
    final String symbolId = "Z00001";
    final Integer lineNumber = 10;
    BidiMap<String, Symbol> symbols = new DualHashBidiMap<>();
    symbols.put("D00001", new SymbolBuilder()
            .scope(CclCompilerVisitor.GLOBAL_SCOPE)
            .symbolId("D00001")
            .symbolKind(SymbolKind.PACKAGE)
            .text(fakePackageName)
            .build());
    symbols.put(symbolId, new SymbolBuilder()
            .scope(CclCompilerVisitor.GLOBAL_SCOPE)
            .symbolId(symbolId)
            .symbolKind(symbolKind)
            .text(symbolText)
            .build());
    SemanticsVisitor semanticsVisitor = new SemanticsVisitor(symbols);
    semanticsVisitor.resetToNewPackage(fakePackageName);
    
    CommonToken startToken = new CommonToken(parserIndex);
    startToken.setLine(lineNumber);
    ctx.start = startToken;
    ctx.children = new ArrayList<>();
    CommonToken commonToken = new CommonToken(parserIndex);
    commonToken.setText(symbolText);
    ctx.children.add(new TerminalNodeImpl(commonToken));

    visitMethod.accept(semanticsVisitor, ctx);
    Deque<SAR> sas = semanticsVisitor.getSemanticActionStack();

    assertNotNull(sas);
    assertFalse(sas.isEmpty());
    SAR sar = sas.getFirst();
    assertNotNull(sar);
    assertTrue(sar.getLineNumber().isPresent());
    assertEquals(sar.getLineNumber().get(), lineNumber);
    assertEquals(sar.getSymbolId(), symbolId);
    assertEquals(sar.getText(), symbolText);
    assertEquals(sar.getType(), SarType.LITERAL);
  }
}
