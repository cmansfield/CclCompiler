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
    assertTrue(exceptions.get(1).contains("11 : CONSTRUCTOR 'TestClass' is private and cannot be accessed from scope"));
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
    assertTrue(exceptions.get(1).contains("11 : METHOD 'max' is private and cannot be accessed from scope"));
  }

  @Test
  public void test_callStaticMethod() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test29.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isEmpty(exceptions));
  }

  @Test
  public void test_fail_callInstanceMethodFromStaticContext() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test76.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isNotEmpty(exceptions));
    assertEquals(exceptions.size(), 2);
    assertTrue("12 : Cannot access instance method 'someOtherMethod' from a static context".equals(exceptions.get(1)));
  }

  @Test
  public void test_fail_callStaticMethodFromInstance() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test77.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isNotEmpty(exceptions));
    assertEquals(exceptions.size(), 2);
    assertTrue("13 : Cannot access static method 'someMethod' from instance 'testClass'".equals(exceptions.get(1)));
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
    assertTrue("3 : Cannot perform assignment operation 'int = null'".equals(exceptions.get(1)));
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
    assertTrue(exceptions.get(1).contains("4 : Cannot perform assignment operation 'int[] = bool[]"));
  }

  @Test
  public void test_fail_array_badAssignmentType() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test38.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isNotEmpty(exceptions));
    assertEquals(exceptions.size(), 2);
    assertTrue("5 : Cannot perform assignment operation 'int[] = bool'".equals(exceptions.get(1)));
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
    assertTrue("4 : Cannot perform boolean operation 'bool && null'".equals(exceptions.get(1)));
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
    assertTrue("4 : Cannot perform boolean operation 'bool && string'".equals(exceptions.get(1)));
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
    assertTrue("5 : Cannot perform assignment operation 'int = string'".equals(exceptions.get(1)));
  }

  @Test
  public void test_spawn() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test62.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isEmpty(exceptions));
  }

  @Test (enabled = false)
  public void test_fail_spawn_badSetType() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test63.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isNotEmpty(exceptions));
    assertEquals(exceptions.size(), 2);
    assertTrue("12 : The set type of a spawned thread must be of type 'int', found 'spawn METHOD set bool'".equals(exceptions.get(1)));
  }

  @Test (enabled = false)
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

  @Test
  public void test_block() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test67.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isEmpty(exceptions));
  }

  @Test
  public void test_block_nestedScope() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test68.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isEmpty(exceptions));
  }

  @Test
  public void test_fail_block_notInMain() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test69.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isNotEmpty(exceptions));
    assertEquals(exceptions.size(), 2);
    assertTrue("5 : The 'block' statement can only be used method 'main'".equals(exceptions.get(1)));
  }

  @Test
  public void test_fail_class_constAccessModifier() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test70.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isNotEmpty(exceptions));
    assertEquals(exceptions.size(), 2);
    assertTrue("3 : 'public const class TestClass' classes cannot have the access modifier 'const'".equals(exceptions.get(1)));
  }

  @Test
  public void test_fail_method_constAccessModifier() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test71.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isNotEmpty(exceptions));
    assertEquals(exceptions.size(), 2);
    assertTrue("6 : 'public const void someMethod' METHODs cannot have the access modifier 'const'".equals(exceptions.get(1)));
  }

  @Test
  public void test_fail_constructor_constAccessModifier() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test72.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isNotEmpty(exceptions));
    assertEquals(exceptions.size(), 2);
    assertTrue("6 : 'const TestClass TestClass' CONSTRUCTORs cannot have the access modifier 'const'".equals(exceptions.get(1)));
  }

  @Test
  public void test_main_validAccessModifiers() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test73.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isEmpty(exceptions));
  }

  @Test
  public void test_fail_main_constAccessModifier() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test74.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isNotEmpty(exceptions));
    assertEquals(exceptions.size(), 2);
    assertTrue("3 : 'public static const void main' main cannot have the access modifiers 'const' or 'private'".equals(exceptions.get(1)));
  }

  @Test
  public void test_fail_main_privateAccessModifier() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test75.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isNotEmpty(exceptions));
    assertEquals(exceptions.size(), 2);
    assertTrue("3 : 'private static void main' main cannot have the access modifiers 'const' or 'private'".equals(exceptions.get(1)));
  }

  @Test
  public void test_staticVariable() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test78.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isEmpty(exceptions));
  }

  @Test
  public void test_instanceVariableInStaticClass() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test79.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isNotEmpty(exceptions));
    assertEquals(exceptions.size(), 2);
    assertTrue("4 : INSTANCE_VAR 'number' must be 'static' when in a static class".equals(exceptions.get(1)));
  }

  @Test
  public void test_const() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test80.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isEmpty(exceptions));
  }

  @Test
  public void test_assignToConst() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test81.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isNotEmpty(exceptions));
    assertEquals(exceptions.size(), 2);
    assertTrue("7 : REFERENCE 'MAX' is a constant and cannot be assigned to".equals(exceptions.get(1)));
  }

  @Test
  public void test_import_staticClass() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test82.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isEmpty(exceptions));
  }

  @Test
  public void test_import_instanceClass() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test84.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isEmpty(exceptions));
  }

  @Test
  public void test_fail_import_privateClass() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test86.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isNotEmpty(exceptions));
    assertEquals(exceptions.size(), 2);
    assertTrue(exceptions.get(1).contains("5 : CLASS 'Test' is private and cannot be accessed from scope"));
  }

  @Test
  public void test_not() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test88.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isEmpty(exceptions));
  }

  @Test
  public void test_fail_not_badType() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test89.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isNotEmpty(exceptions));
    assertEquals(exceptions.size(), 2);
    assertTrue("4 : Boolean 'not (!)' operator must preceed a boolean value, found type 'int'".equals(exceptions.get(1)));
  }

  @Test
  public void test_braceInitializer() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test90.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isEmpty(exceptions));
  }

  @Test
  public void test_braceInitializer_empty() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test91.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isEmpty(exceptions));
  }

  @Test
  public void test_fail_braceInitializer_badType() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test92.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isNotEmpty(exceptions));
    assertEquals(exceptions.size(), 2);
    assertTrue("4 : Not all of the values in the brace initializer are the same type, found '{int, int, bool, int}'".equals(exceptions.get(1)));
  }

  @Test
  public void test_templates() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test93.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isEmpty(exceptions));
  }

  @Test
  public void test_templates_objects() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test94.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isEmpty(exceptions));
  }

  @Test
  public void test_templates_templatesOfTemplates() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test95.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isEmpty(exceptions));
  }

  @Test
  public void test_templates_templatesOfTemplateObjects() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test96.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isEmpty(exceptions));
  }

  @Test
  public void test_templates_assignNull() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test100.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isEmpty(exceptions));
  }

  @Test
  public void test_fail_templates_initTemplateClass() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test97.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isNotEmpty(exceptions));
    assertEquals(exceptions.size(), 2);
    assertTrue("15 : Class 'List<T>' is a template class and cannot be instantiated".equals(exceptions.get(1)));
  }

  @Test
  public void test_fail_templates_wrongType() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test98.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isNotEmpty(exceptions));
    assertEquals(exceptions.size(), 2);
    assertTrue("19 : Cannot perform assignment operation 'List<Employee> = List<int>'".equals(exceptions.get(1)));
  }

  @Test
  public void test_fail_templates_missingType() throws IOException {
    Compiler compiler = CompilerTestUtils.compileNoThrow("test99.ccl");

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isNotEmpty(exceptions));
    assertEquals(exceptions.size(), 2);
    assertTrue("19 : Cannot perform assignment operation 'List = List<Employee>'".equals(exceptions.get(1)));
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
