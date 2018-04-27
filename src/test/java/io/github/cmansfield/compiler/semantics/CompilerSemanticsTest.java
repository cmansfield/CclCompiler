package io.github.cmansfield.compiler.semantics;

import io.github.cmansfield.compiler.CompilerTestUtils;
import org.apache.commons.collections4.CollectionUtils;
import io.github.cmansfield.compiler.Compiler;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


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
  
  @Test
  public void test_fail_privateConstructor() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test20.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isNotEmpty(exceptions));
    assertEquals(exceptions.size(), 2);
    assertTrue("11 : CONSTRUCTOR 'TestClass TestClass()' is private and cannot be accessed".equals(exceptions.get(1)));
  }

  @Test
  public void test_fail_duplicateConstructor() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test21.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isNotEmpty(exceptions));
    assertEquals(exceptions.size(), 2);
    assertTrue("Found duplicate CONSTRUCTORs in class 'TestClass' with method signature 'TestClass()'".equals(exceptions.get(1)));
  }

  @Test
  public void test_fail_badConstructorName() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test23.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isNotEmpty(exceptions));
    assertEquals(exceptions.size(), 2);
    assertTrue("9 : Could not find method that matching 'Company()'".equals(exceptions.get(1)));
  }

  @Test
  public void test_fail_undefinedType() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test24.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isNotEmpty(exceptions));
    assertEquals(exceptions.size(), 2);
    assertTrue("3 : The type 'Employee' does not exist!".equals(exceptions.get(1)));
  }

  @Test
  public void test_callMethodWithInClass() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test25.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isEmpty(exceptions));
  }

  @Test
  public void test_callStaticMethodWithInClass() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test26.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isEmpty(exceptions));
  }

  @Test
  public void test_callPrivateStaticMethodWithInClass() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test27.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isEmpty(exceptions));
  }

  @Test
  public void test_fail_callPrivateStaticMethod() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test28.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isNotEmpty(exceptions));
    assertEquals(exceptions.size(), 2);
    assertTrue("11 : METHOD 'int max()' is private and cannot be accessed".equals(exceptions.get(1)));
  }

  @Test
  public void test_callStaticMethod() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test29.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isEmpty(exceptions));
  }

  @Test
  public void test_assignNullValue() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test30.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isEmpty(exceptions));
  }

  @Test
  public void test_fail_assignNullToPrimitive() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test31.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isNotEmpty(exceptions));
    assertEquals(exceptions.size(), 2);
    assertTrue("3 : Cannot perform assignment operation 'int number = null null'".equals(exceptions.get(1)));
  }

  @Test
  public void test_assignBooleanExpression() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test32.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isEmpty(exceptions));
  }

  @Test
  public void test_assignmentExpressionNewObjectAsArgument() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test33.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isEmpty(exceptions));
  }

  @Test
  public void test_assignmentExpressionCastAsArgument() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test34.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isEmpty(exceptions));
  }

  @Test
  public void test_fail_assignmentExpressionCastAsArgument() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test35.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isNotEmpty(exceptions));
    assertEquals(exceptions.size(), 2);
    assertTrue("Unable to complete the first pass at this time".equals(exceptions.get(0)));
  }

  @Test
  public void test_scopeWithBlocks() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test40.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isEmpty(exceptions));
  }

  @Test
  public void test_array() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test36.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isEmpty(exceptions));
  }

  @Test
  public void test_fail_array_badInitType() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test37.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isNotEmpty(exceptions));
    assertEquals(exceptions.size(), 2);
    assertTrue("4 : Cannot perform assignment operation 'int[] numbers = bool[] new bool[]'".equals(exceptions.get(1)));
  }

  @Test
  public void test_fail_array_badAssignmentType() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test38.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isNotEmpty(exceptions));
    assertEquals(exceptions.size(), 2);
    assertTrue("5 : Cannot perform assignment operation 'int[] numbers = bool true'".equals(exceptions.get(1)));
  }

  @Test
  public void test_array_objects() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test39.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isEmpty(exceptions));
  }



  // TODO - Complete this mega compile file
  @Test (enabled = false)
  public void test_fail_() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test22.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isNotEmpty(exceptions));
    assertEquals(exceptions.size(), 2);
    assertTrue("Found duplicate CONSTRUCTORs in class 'TestClass' with method signature 'TestClass()'".equals(exceptions.get(1)));
  }
}
