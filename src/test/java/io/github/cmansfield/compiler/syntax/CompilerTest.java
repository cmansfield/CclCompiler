package io.github.cmansfield.compiler.syntax;

import io.github.cmansfield.firstpass.symbols.SymbolTableUtils;
import io.github.cmansfield.parser.language.CclGrammarParser;
import io.github.cmansfield.firstpass.symbols.SymbolFilter;
import io.github.cmansfield.firstpass.symbols.SymbolKind;
import org.apache.commons.collections4.CollectionUtils;
import io.github.cmansfield.compiler.CompilerOptions;
import io.github.cmansfield.firstpass.symbols.Symbol;
import io.github.cmansfield.parser.ParserUtils;
import org.apache.commons.collections4.BidiMap;
import io.github.cmansfield.compiler.Compiler;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
import java.io.File;

import static org.testng.Assert.*;


public class CompilerTest {

  @Test
  public void test_validSymbolTable() throws IOException {
    BidiMap<String, Symbol> symbolTable = compile("test1.ccl", CompilerOptions.FIRST_PASS_ONLY);

    assertNotNull(symbolTable);
    assertFalse(symbolTable.isEmpty());
    assertEquals(symbolTable.size(), 47);
    SymbolTableUtils.checkSymbolTable(symbolTable);
  }

  @Test
  public void test_validCharacters() throws IOException {
    BidiMap<String, Symbol> symbolTable = compile("test2.ccl", CompilerOptions.FIRST_PASS_ONLY);

    assertNotNull(symbolTable);
    assertFalse(symbolTable.isEmpty());
    assertEquals(symbolTable.size(), 21);
    SymbolTableUtils.checkSymbolTable(symbolTable);
  }

  @Test (expectedExceptions = IllegalStateException.class)
  public void test_invalidCharacter() throws IOException {
    BidiMap<String, Symbol> symbolTable = compile("test4.ccl", CompilerOptions.FIRST_PASS_ONLY);

    fail("Should have received an exception before now");
  }

  @Test
  public void test_validStringCharacters() throws IOException {
    BidiMap<String, Symbol> symbolTable = compile("test3.ccl", CompilerOptions.FIRST_PASS_ONLY);

    assertNotNull(symbolTable);
    assertFalse(symbolTable.isEmpty());
    assertEquals(symbolTable.size(), 3);
    SymbolTableUtils.checkSymbolTable(symbolTable);
  }

  @Test
  public void test_duplicateBooleanValues() throws IOException {
    BidiMap<String, Symbol> symbolTable = compile("test5.ccl", CompilerOptions.FIRST_PASS_ONLY);

    assertNotNull(symbolTable);
    assertFalse(symbolTable.isEmpty());
    assertEquals(symbolTable.size(), 4);
    SymbolTableUtils.checkSymbolTable(symbolTable);
    List<Symbol> foundSymbols = SymbolFilter.filter(symbolTable, new Symbol().new SymbolBuilder()
            .symbolKind(SymbolKind.BOOL_LIT)
            .build());
    assertTrue(CollectionUtils.isNotEmpty(foundSymbols));
    assertEquals(foundSymbols.size(), 2);

    Symbol literalTrue;
    Symbol literalFalse;
    if(ParserUtils.getLiteralName(CclGrammarParser.TRUE).equals(foundSymbols.get(0).getText())) {
      literalTrue = foundSymbols.get(0);
      literalFalse = foundSymbols.get(1);
    }
    else {
      literalFalse = foundSymbols.get(0);
      literalTrue = foundSymbols.get(1);
    }

    assertEquals(literalTrue.getText(), ParserUtils.getLiteralName(CclGrammarParser.TRUE));
    assertEquals(literalTrue.getData().getType().get(), ParserUtils.getLiteralName(CclGrammarParser.BOOL));
    assertEquals(literalFalse.getText(), ParserUtils.getLiteralName(CclGrammarParser.FALSE));
    assertEquals(literalFalse.getData().getType().get(), ParserUtils.getLiteralName(CclGrammarParser.BOOL));
  }

  @Test
  public void test_duplicateNullValues() throws IOException {
    BidiMap<String, Symbol> symbolTable = compile("test6.ccl", CompilerOptions.FIRST_PASS_ONLY);

    assertNotNull(symbolTable);
    assertFalse(symbolTable.isEmpty());
    assertEquals(symbolTable.size(), 3);
    SymbolTableUtils.checkSymbolTable(symbolTable);
    List<Symbol> foundSymbols = SymbolFilter.filter(symbolTable, new Symbol().new SymbolBuilder()
            .symbolKind(SymbolKind.SPECIAL_LIT)
            .build());
    assertTrue(CollectionUtils.isNotEmpty(foundSymbols));
    assertEquals(foundSymbols.size(), 1);
    Symbol literalNull = foundSymbols.get(0);
    assertEquals(literalNull.getText(), ParserUtils.getLiteralName(CclGrammarParser.NULL));
    assertEquals(literalNull.getData().getType().get(), ParserUtils.getLiteralName(CclGrammarParser.NULL));
  }

  @Test
  public void test_stringLiteralsWithOtherExpressions() throws IOException {
    BidiMap<String, Symbol> symbolTable = compile("test9.ccl", CompilerOptions.FIRST_PASS_ONLY);

    assertNotNull(symbolTable);
    assertEquals(symbolTable.size(), 4);
  }
  
  /**
   * This method is used to reduce the amount of code needed to test the
   * different code files
   *
   * @param fileName  The name of the file to try and produce a symbol table for
   * @return          The symbol table if it was successfully produced
   */
  public BidiMap<String, Symbol> compile(String fileName) throws IOException {
    return compile(fileName, null);
  }

  /**
   * This method is used to reduce the amount of code needed to test the
   * different code files
   *
   * @param fileName  The name of the file to try and produce a symbol table for
   * @param option    The additional compiler option for compiling
   * @return          The symbol table if it was successfully produced
   */
  public BidiMap<String, Symbol> compile(String fileName, CompilerOptions option) throws IOException {
    File file = new File(getClass()
            .getClassLoader()
            .getResource(fileName).getFile());
    Compiler compiler;
    if(option == null) {
      compiler = new Compiler();
    }
    else {
      compiler = new Compiler(option);
    }
    if(!compiler.compile(file.getAbsolutePath())) {
      throw new IllegalStateException("The compiler failed to produce the symbol table");
    }
    return compiler.getSymbolTable();
  }
}
