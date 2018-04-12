package io.github.cmansfield.secondpass;

import org.apache.commons.collections4.bidimap.DualHashBidiMap;
import io.github.cmansfield.parser.language.CclGrammarParser;
import io.github.cmansfield.firstpass.symbols.SymbolKind;
import io.github.cmansfield.parser.CclCompilerVisitor;
import io.github.cmansfield.firstpass.symbols.Symbol;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import org.apache.commons.collections4.BidiMap;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.CommonToken;
import org.testng.annotations.Test;

import java.util.function.BiConsumer;
import java.util.*;

import static org.testng.Assert.*;


public class SemanticsVisitorTest {
  
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
    symbols.put("D00001", new Symbol().new SymbolBuilder()
            .scope(CclCompilerVisitor.GLOBAL_SCOPE)
            .symbolId("D00001")
            .symbolKind(SymbolKind.PACKAGE)
            .text(fakePackageName)
            .build());
    symbols.put(symbolId, new Symbol().new SymbolBuilder()
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
