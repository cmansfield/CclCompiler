package io.github.cmansfield.compiler.semantics;

import io.github.cmansfield.compiler.CompilerTestUtils;
import org.testng.annotations.Test;

import java.io.IOException;


public class CompilerSemanticsTest {
  @Test (expectedExceptions = IllegalStateException.class)
  public void test_duplicateInstanceVariable() throws IOException {
    CompilerTestUtils.compile("test14.ccl");
  }

  @Test (expectedExceptions = IllegalStateException.class)
  public void test_duplicateLocalVariable() throws IOException {
    CompilerTestUtils.compile("test15.ccl");
  }

  @Test (expectedExceptions = IllegalStateException.class)
  public void test_duplicateParameters() throws IOException {
    CompilerTestUtils.compile("test16.ccl");
  }

  @Test
  public void test_methodOverloading() throws IOException {
    CompilerTestUtils.compile("test18.ccl");
  }
  
  @Test
  public void test_methodOverloadingConstructors() throws IOException {
    CompilerTestUtils.compile("test17.ccl");
  }
  
  @Test (expectedExceptions = IllegalStateException.class)
  public void test_failed_duplicateMethods() throws IOException {
    CompilerTestUtils.compile("test19.ccl");    
  }
}
