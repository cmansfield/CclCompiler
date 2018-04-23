package io.github.cmansfield.compiler.semantics;

import io.github.cmansfield.compiler.syntax.CompilerTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;


public class CompilerSemanticsTest {
  private CompilerTest compilerTest;
  
  @BeforeClass
  public void setUp() {
    compilerTest = new CompilerTest();
  }

  @Test (expectedExceptions = IllegalStateException.class)
  public void test_duplicateInstanceVariable() throws IOException {
    compilerTest.compile("test14.ccl");
  }

  @Test (expectedExceptions = IllegalStateException.class)
  public void test_duplicateLocalVariable() throws IOException {
    compilerTest.compile("test15.ccl");
  }

  @Test (expectedExceptions = IllegalStateException.class)
  public void test_duplicateParameters() throws IOException {
    compilerTest.compile("test16.ccl");
  }

  @Test
  public void test_methodOverloading() throws IOException {
    compilerTest.compile("test18.ccl");
  }
  
  @Test
  public void test_methodOverloadingConstructors() throws IOException {
    compilerTest.compile("test17.ccl");
  }
  
  @Test (expectedExceptions = IllegalStateException.class)
  public void test_failed_duplicateMethods() throws IOException {
    compilerTest.compile("test19.ccl");    
  }
}
