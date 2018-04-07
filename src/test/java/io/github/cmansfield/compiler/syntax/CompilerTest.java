package io.github.cmansfield.compiler.syntax;

import io.github.cmansfield.compiler.CompilerOptions;
import io.github.cmansfield.symbols.SymbolTableUtils;
import org.apache.commons.collections4.BidiMap;
import io.github.cmansfield.compiler.Compiler;
import io.github.cmansfield.symbols.Symbol;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.File;

import static org.testng.Assert.*;


public class CompilerTest {

  @Test
  public void test_validSymbolTable() throws IOException {
    BidiMap<String, Symbol> symbolTable = compile("test1.ccl");

    assertNotNull(symbolTable);
    assertFalse(symbolTable.isEmpty());
    assertEquals(symbolTable.size(), 70);
    SymbolTableUtils.checkSymbolTable(symbolTable);
  }

  @Test
  public void test_validCharacters() throws IOException {
    BidiMap<String, Symbol> symbolTable = compile("test2.ccl");

    assertNotNull(symbolTable);
    assertFalse(symbolTable.isEmpty());
    assertEquals(symbolTable.size(), 40);
    SymbolTableUtils.checkSymbolTable(symbolTable);
  }

  @Test
  public void test_validStringCharacters() throws IOException {
    BidiMap<String, Symbol> symbolTable = compile("test3.ccl");

    assertNotNull(symbolTable);
    assertFalse(symbolTable.isEmpty());
    assertEquals(symbolTable.size(), 4);
    SymbolTableUtils.checkSymbolTable(symbolTable);
  }

  /**
   * This method is used to reduce the amount of code needed to test the
   * syntax of different code files
   *
   * @param fileName  The name of the file to try and produce a symbol table for
   * @return          The symbol table if it was successfully produced
   */
  private BidiMap<String, Symbol> compile(String fileName) throws IOException {
    File file = new File(getClass()
            .getClassLoader()
            .getResource(fileName).getFile());
    Compiler compiler = new Compiler(CompilerOptions.FIRST_PASS_ONLY);
    if(!compiler.compile(file.getAbsolutePath())) {
      throw new IllegalStateException("The compiler failed to produce the symbol table");
    }
    return compiler.getSymbolTable();
  }
}
