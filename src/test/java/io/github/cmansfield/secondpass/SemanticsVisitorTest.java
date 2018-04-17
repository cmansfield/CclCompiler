package io.github.cmansfield.secondpass;

import org.apache.commons.collections4.bidimap.DualHashBidiMap;
import io.github.cmansfield.parser.language.CclGrammarParser;
import io.github.cmansfield.firstpass.symbols.SymbolBuilder;
import io.github.cmansfield.firstpass.symbols.SymbolFilter;
import io.github.cmansfield.compiler.syntax.CompilerTest;
import io.github.cmansfield.firstpass.symbols.SymbolKind;
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

  @Test (expectedExceptions = IllegalStateException.class)
  public void test_traceScopeToFindSymbolId_notFound() throws IOException {
    BidiMap<String, Symbol> symbolTable = compilerTest.compile("test7.ccl");
    SemanticsVisitor visitor = new SemanticsVisitor(symbolTable);
    visitor.traceScopeToFindSymbolId("something", SarType.IDENTIFIER, "g.D00001.C00001.M00001");

    fail("Should not get to this point");
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
