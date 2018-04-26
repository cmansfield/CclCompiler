package io.github.cmansfield.compiler;

import io.github.cmansfield.firstpass.symbols.Symbol;
import org.apache.commons.collections4.BidiMap;

import java.io.IOException;
import java.io.File;


public class CompilerTestUtils {
  private CompilerTestUtils() {}
  
  /**
   * This method is used to reduce the amount of code needed to test the
   * different code files
   *
   * @param fileName  The name of the file to try and produce a symbol table for
   * @return          The symbol table if it was successfully produced
   */
  public static BidiMap<String, Symbol> compile(String fileName) throws IOException {
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
  public static BidiMap<String, Symbol> compile(String fileName, CompilerOptions option) throws IOException {
    File file = new File(CompilerTestUtils.class
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

  /**
   * This method is used to reduce the amount of code needed to test the
   * different code files
   *
   * @param fileName  The name of the file to try and produce a symbol table for
   * @return          The Compiler object created
   */
  public static Compiler compileNoThrow(String fileName) throws IOException {
    return compileNoThrow(fileName, null);
  }

  /**
   * This method is used to reduce the amount of code needed to test the
   * different code files
   *
   * @param fileName  The name of the file to try and produce a symbol table for
   * @param option    The additional compiler option for compiling
   * @return          The Compiler object created
   */
  public static Compiler compileNoThrow(String fileName, CompilerOptions option) throws IOException {
    File file = new File(CompilerTestUtils.class
            .getClassLoader()
            .getResource(fileName).getFile());
    Compiler compiler;
    if(option == null) {
      compiler = new Compiler();
    }
    else {
      compiler = new Compiler(option);
    }
    compiler.compile(file.getAbsolutePath());
    
    return compiler;
  }
}
