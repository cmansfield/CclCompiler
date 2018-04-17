package io.github.cmansfield.compiler.semantics;

import io.github.cmansfield.compiler.syntax.CompilerTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;


public class CompileremanticsTest {
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
}
