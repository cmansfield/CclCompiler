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
    assertTrue("3 : Cannot perform assignment operation 'int number = null'".equals(exceptions.get(1)));
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

  @Test
  public void test_array_objectsInitComplex() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test41.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isEmpty(exceptions));
  }

  @Test
  public void test_if() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test42.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isEmpty(exceptions));
  }

  @Test
  public void test_fail_if_badType() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test43.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isNotEmpty(exceptions));
    assertEquals(exceptions.size(), 2);
    assertTrue("4 : 'if' statement requires type 'bool' found 'if(int)'".equals(exceptions.get(1)));
  }

  @Test
  public void test_fail_if_badSecondType() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test44.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isNotEmpty(exceptions));
    assertEquals(exceptions.size(), 2);
    assertTrue("4 : Cannot perform boolean operation 'bool (5 > 3) && null'".equals(exceptions.get(1)));
  }

  @Test
  public void test_fail_if_accessingVarInScope() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test45.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isNotEmpty(exceptions));
    assertEquals(exceptions.size(), 2);
    assertTrue(exceptions.get(1).contains("8 : Could not find Symbol 'number' in scope"));
  }

  @Test
  public void test_while() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test46.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isEmpty(exceptions));
  }

  @Test
  public void test_fail_while_badType() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test47.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isNotEmpty(exceptions));
    assertEquals(exceptions.size(), 2);
    assertTrue("4 : 'while' statement requires type 'bool' found 'while(int)'".equals(exceptions.get(1)));
  }

  @Test
  public void test_fail_while_badSecondType() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test48.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isNotEmpty(exceptions));
    assertEquals(exceptions.size(), 2);
    assertTrue("4 : Cannot perform boolean operation 'bool (5 > 3) && string Hello'".equals(exceptions.get(1)));
  }

  @Test
  public void test_fail_while_accessingVarInScope() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test49.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isNotEmpty(exceptions));
    assertEquals(exceptions.size(), 2);
    assertTrue(exceptions.get(1).contains("10 : Could not find Symbol 'number' in scope"));
  }

  @Test
  public void test_for() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test50.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isEmpty(exceptions));
  }

  @Test
  public void test_for_nonAssignmentFirstExpression() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test56.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isEmpty(exceptions));
  }

  @Test
  public void test_for_missingFirstExpression() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test51.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isEmpty(exceptions));
  }

  @Test
  public void test_for_missingLastExpression() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test52.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isEmpty(exceptions));
  }

  @Test
  public void test_fail_for_missingSecondExpression() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test53.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isNotEmpty(exceptions));
    assertEquals(exceptions.size(), 2);
    assertTrue("Unable to complete the first pass at this time".equals(exceptions.get(0)));
  }

  @Test
  public void test_fail_for_wrongSecondExpressionType() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test54.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isNotEmpty(exceptions));
    assertEquals(exceptions.size(), 2);
    assertTrue("4 : The second expression of a 'for-loop' must be of type 'bool', found 'for( ; int; )'".equals(exceptions.get(1)));
  }

  @Test
  public void test_fail_for_wrongSecondExpressionTypeMasked() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test55.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isNotEmpty(exceptions));
    assertEquals(exceptions.size(), 2);
    assertTrue("4 : The second expression of a 'for-loop' must be of type 'bool', found 'for( ; int; )'".equals(exceptions.get(1)));
  }

  @Test
  public void test_ternary() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test57.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isEmpty(exceptions));
  }

  @Test
  public void test_ternary_complex() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test58.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isEmpty(exceptions));
  }

  @Test
  public void test_fail_ternary_misMatchingTypes() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test59.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isNotEmpty(exceptions));
    assertEquals(exceptions.size(), 2);
    assertTrue("5 : Ternary expressions must return the same type, found 'bool ? string : int'".equals(exceptions.get(1)));
  }

  @Test
  public void test_fail_ternary_nonBoolFirstExpression() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test60.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isNotEmpty(exceptions));
    assertEquals(exceptions.size(), 2);
    assertTrue("4 : The first ternary expression must be type 'bool', found 'int ? string : string'".equals(exceptions.get(1)));
  }

  @Test
  public void test_fail_ternary_badAssign() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test61.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isNotEmpty(exceptions));
    assertEquals(exceptions.size(), 2);
    assertTrue("5 : Cannot perform assignment operation 'int number = string bool ? string : string'".equals(exceptions.get(1)));
  }

  @Test
  public void test_spawn() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test62.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isEmpty(exceptions));
  }

  @Test
  public void test_fail_spawn_badSetType() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test63.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isNotEmpty(exceptions));
    assertEquals(exceptions.size(), 2);
    assertTrue("12 : The set type of a spawned thread must be of type 'int', found 'spawn METHOD set bool'".equals(exceptions.get(1)));
  }

  @Test
  public void test_fail_spawn_badSpawnType() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test64.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isNotEmpty(exceptions));
    assertEquals(exceptions.size(), 2);
    assertTrue("6 : Newly spawned threads must be supplied a 'METHOD', found 'INT_LIT'".equals(exceptions.get(1)));
  }

  @Test
  public void test_lock() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test65.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isEmpty(exceptions));
  }

  @Test
  public void test_fail_lock_badMutexType() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test66.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isNotEmpty(exceptions));
    assertEquals(exceptions.size(), 2);
    assertTrue("5 : Mutex locks must be of type 'int', found 'bool'".equals(exceptions.get(1)));
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
