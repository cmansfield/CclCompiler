package io.github.cmansfield.compiler.icode;

import io.github.cmansfield.secondpass.icode.IntermediateOpcodes;
import org.apache.commons.collections4.CollectionUtils;
import io.github.cmansfield.compiler.CompilerTestUtils;
import io.github.cmansfield.compiler.CompilerOptions;
import io.github.cmansfield.secondpass.icode.Quad;
import io.github.cmansfield.compiler.Compiler;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class CompilerIntermediateCodeTest {
  private static final int MAIN_CALL_OFFSET = 3; 
  
  @Test
  public void test_while() throws IOException {
    List<String> expectedOpcodes = Arrays.asList(
            IntermediateOpcodes.Method.FRAME.toString(),
            IntermediateOpcodes.Method.CALL.toString(),
            IntermediateOpcodes.Flow.HALT.toString(),
            IntermediateOpcodes.Method.FUNC.toString(),
            IntermediateOpcodes.Bool.LT.toString(),
            IntermediateOpcodes.Flow.BF.toString(),
            IntermediateOpcodes.Other.PRINT.toString(),
            IntermediateOpcodes.Other.READ.toString(),
            IntermediateOpcodes.Flow.JMP.toString(),
            IntermediateOpcodes.Method.RTN.toString());
    Compiler compiler = CompilerTestUtils.compileNoThrow("test101.ccl", CompilerOptions.GENERATE_I_CODE_ONLY);

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isEmpty(exceptions));

    List<Quad> iCode = compiler.getICode();
    assertTrue(CollectionUtils.isNotEmpty(iCode));
    assertEquals(iCode.size(), expectedOpcodes.size());
    assertEquals(iCode.get(4).getLabel(), iCode.get(8).getOperand1());
    assertEquals(iCode.get(5).getOperand2(), iCode.get(9).getLabel());
    
    for (int i = 0; i < iCode.size(); ++i) {
      assertEquals(iCode.get(i).getOpcode(), expectedOpcodes.get(i));  
    }
  }

  @Test
  public void test_if_else() throws IOException {
    List<String> expectedOpcodes = Arrays.asList(
            IntermediateOpcodes.Method.FRAME.toString(),
            IntermediateOpcodes.Method.CALL.toString(),
            IntermediateOpcodes.Flow.HALT.toString(),
            IntermediateOpcodes.Method.FUNC.toString(),
            IntermediateOpcodes.Bool.LT.toString(),
            IntermediateOpcodes.Flow.BF.toString(),
            IntermediateOpcodes.Other.PRINT.toString(),
            IntermediateOpcodes.Flow.JMP.toString(),
            IntermediateOpcodes.Other.PRINT.toString(),
            IntermediateOpcodes.Method.RTN.toString());
    Compiler compiler = CompilerTestUtils.compileNoThrow("test102.ccl", CompilerOptions.GENERATE_I_CODE_ONLY);

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isEmpty(exceptions));

    List<Quad> iCode = compiler.getICode();
    assertTrue(CollectionUtils.isNotEmpty(iCode));
    assertEquals(iCode.size(), expectedOpcodes.size());
    assertEquals(iCode.get(5).getOperand2(), iCode.get(8).getLabel());
    assertEquals(iCode.get(7).getOperand1(), iCode.get(9).getLabel());

    for (int i = 0; i < iCode.size(); ++i) {
      assertEquals(iCode.get(i).getOpcode(), expectedOpcodes.get(i));
    }
  }

  @Test
  public void test_nestedIf() throws IOException {
    List<String> expectedOpcodes = Arrays.asList(
            IntermediateOpcodes.Method.FRAME.toString(),
            IntermediateOpcodes.Method.CALL.toString(),
            IntermediateOpcodes.Flow.HALT.toString(),
            IntermediateOpcodes.Method.FUNC.toString(),
            IntermediateOpcodes.Flow.BF.toString(),
            IntermediateOpcodes.Bool.LT.toString(),
            IntermediateOpcodes.Flow.BF.toString(),
            IntermediateOpcodes.Other.PRINT.toString(),
            IntermediateOpcodes.Method.RTN.toString());
    Compiler compiler = CompilerTestUtils.compileNoThrow("test103.ccl", CompilerOptions.GENERATE_I_CODE_ONLY);

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isEmpty(exceptions));

    List<Quad> iCode = compiler.getICode();
    assertTrue(CollectionUtils.isNotEmpty(iCode));
    assertEquals(iCode.size(), expectedOpcodes.size());
    assertEquals(iCode.get(4).getOperand2(), iCode.get(8).getLabel());
    assertEquals(iCode.get(6).getOperand2(), iCode.get(8).getLabel());

    for (int i = 0; i < iCode.size(); ++i) {
      assertEquals(iCode.get(i).getOpcode(), expectedOpcodes.get(i));
    }
  }

  @Test
  public void test_while_backToBack() throws IOException {
    List<String> expectedOpcodes = Arrays.asList(
            IntermediateOpcodes.Method.FRAME.toString(),
            IntermediateOpcodes.Method.CALL.toString(),
            IntermediateOpcodes.Flow.HALT.toString(),
            IntermediateOpcodes.Method.FUNC.toString(),
            IntermediateOpcodes.Bool.LT.toString(),
            IntermediateOpcodes.Flow.BF.toString(),
            IntermediateOpcodes.Other.PRINT.toString(),
            IntermediateOpcodes.Other.READ.toString(),
            IntermediateOpcodes.Flow.JMP.toString(),
            IntermediateOpcodes.Bool.NE.toString(),
            IntermediateOpcodes.Flow.BF.toString(),
            IntermediateOpcodes.Other.PRINT.toString(),
            IntermediateOpcodes.Flow.JMP.toString(),
            IntermediateOpcodes.Other.PRINT.toString(),
            IntermediateOpcodes.Method.RTN.toString());
    Compiler compiler = CompilerTestUtils.compileNoThrow("test104.ccl", CompilerOptions.GENERATE_I_CODE_ONLY);

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isEmpty(exceptions));

    List<Quad> iCode = compiler.getICode();
    assertTrue(CollectionUtils.isNotEmpty(iCode));
    assertEquals(iCode.size(), expectedOpcodes.size());
    assertEquals(iCode.get(4).getLabel(), iCode.get(8).getOperand1());
    assertEquals(iCode.get(5).getOperand2(), iCode.get(9).getLabel());
    assertEquals(iCode.get(5).getOperand2(), iCode.get(12).getOperand1());
    assertEquals(iCode.get(10).getOperand2(), iCode.get(13).getLabel());

    for (int i = 0; i < iCode.size(); ++i) {
      assertEquals(iCode.get(i).getOpcode(), expectedOpcodes.get(i));
    }
  }
  
  @Test
  public void test_assignment() throws IOException {
    List<String> expectedOpcodes = Arrays.asList(
            IntermediateOpcodes.Method.FRAME.toString(),
            IntermediateOpcodes.Method.CALL.toString(),
            IntermediateOpcodes.Flow.HALT.toString(),
            IntermediateOpcodes.Method.FUNC.toString(),
            IntermediateOpcodes.Other.MOV.toString(),
            IntermediateOpcodes.Method.RTN.toString());
    Compiler compiler = CompilerTestUtils.compileNoThrow("test105.ccl", CompilerOptions.GENERATE_I_CODE_ONLY);

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isEmpty(exceptions));

    List<Quad> iCode = compiler.getICode();
    assertTrue(CollectionUtils.isNotEmpty(iCode));
    assertEquals(iCode.size(), expectedOpcodes.size());

    for (int i = 0; i < iCode.size(); ++i) {
      assertEquals(iCode.get(i).getOpcode(), expectedOpcodes.get(i));
    }
  }

  @Test
  public void test_assignment_fromReference() throws IOException {
    List<String> expectedOpcodes = Arrays.asList(
            IntermediateOpcodes.Method.FUNC.toString(),
            IntermediateOpcodes.Method.RTN.toString(),
            IntermediateOpcodes.Method.FUNC.toString(),
            IntermediateOpcodes.Other.REF.toString(),
            IntermediateOpcodes.Other.MOV.toString(),
            IntermediateOpcodes.Method.RTN.toString());
    Compiler compiler = CompilerTestUtils.compileNoThrow("test106.ccl", CompilerOptions.GENERATE_I_CODE_ONLY);

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isEmpty(exceptions));

    List<Quad> iCode = compiler.getICode();
    assertTrue(CollectionUtils.isNotEmpty(iCode));
    assertEquals(iCode.size(), expectedOpcodes.size() + MAIN_CALL_OFFSET);
    assertEquals(iCode.get(6).getOperand3(), iCode.get(7).getOperand1());

    for (int i = 0; i < expectedOpcodes.size(); ++i) {
      assertEquals(iCode.get(i + MAIN_CALL_OFFSET).getOpcode(), expectedOpcodes.get(i));
    }
  }

  @Test
  public void test_assignment_toReference() throws IOException {
    List<String> expectedOpcodes = Arrays.asList(
            IntermediateOpcodes.Method.FUNC.toString(),
            IntermediateOpcodes.Method.RTN.toString(),
            IntermediateOpcodes.Method.FUNC.toString(),
            IntermediateOpcodes.Other.REF.toString(),
            IntermediateOpcodes.Other.MOV.toString(),
            IntermediateOpcodes.Method.RTN.toString());
    Compiler compiler = CompilerTestUtils.compileNoThrow("test107.ccl", CompilerOptions.GENERATE_I_CODE_ONLY);

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isEmpty(exceptions));

    List<Quad> iCode = compiler.getICode();
    assertTrue(CollectionUtils.isNotEmpty(iCode));
    assertEquals(iCode.size(), expectedOpcodes.size() + MAIN_CALL_OFFSET);
    assertEquals(iCode.get(6).getOperand3(), iCode.get(7).getOperand2());

    for (int i = 0; i < expectedOpcodes.size(); ++i) {
      assertEquals(iCode.get(i + MAIN_CALL_OFFSET).getOpcode(), expectedOpcodes.get(i));
    }
  }

  @Test
  public void test_expression_addition() throws IOException {
    List<String> expectedOpcodes = Arrays.asList(
            IntermediateOpcodes.Method.FUNC.toString(),
            IntermediateOpcodes.Math.ADD.toString(),
            IntermediateOpcodes.Method.RTN.toString());
    Compiler compiler = CompilerTestUtils.compileNoThrow("test108.ccl", CompilerOptions.GENERATE_I_CODE_ONLY);

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isEmpty(exceptions));

    List<Quad> iCode = compiler.getICode();
    assertTrue(CollectionUtils.isNotEmpty(iCode));
    assertEquals(iCode.size(), expectedOpcodes.size() + MAIN_CALL_OFFSET);

    for (int i = 0; i < expectedOpcodes.size(); ++i) {
      assertEquals(iCode.get(i + MAIN_CALL_OFFSET).getOpcode(), expectedOpcodes.get(i));
    }
  }

  @Test
  public void test_expression_multi_additionMultiplication() throws IOException {
    List<String> expectedOpcodes = Arrays.asList(
            IntermediateOpcodes.Method.FUNC.toString(),
            IntermediateOpcodes.Math.MUL.toString(),
            IntermediateOpcodes.Math.ADD.toString(),
            IntermediateOpcodes.Method.RTN.toString());
    Compiler compiler = CompilerTestUtils.compileNoThrow("test109.ccl", CompilerOptions.GENERATE_I_CODE_ONLY);

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isEmpty(exceptions));

    List<Quad> iCode = compiler.getICode();
    assertTrue(CollectionUtils.isNotEmpty(iCode));
    assertEquals(iCode.size(), expectedOpcodes.size() + MAIN_CALL_OFFSET);
    assertEquals(iCode.get(4).getOperand3(), iCode.get(5).getOperand2());

    for (int i = 0; i < expectedOpcodes.size(); ++i) {
      assertEquals(iCode.get(i + MAIN_CALL_OFFSET).getOpcode(), expectedOpcodes.get(i));
    }
  }

  @Test
  public void test_expression_boolean() throws IOException {
    List<String> expectedOpcodes = Arrays.asList(
            IntermediateOpcodes.Method.FUNC.toString(),
            IntermediateOpcodes.Bool.LT.toString(),
            IntermediateOpcodes.Method.RTN.toString());
    Compiler compiler = CompilerTestUtils.compileNoThrow("test110.ccl", CompilerOptions.GENERATE_I_CODE_ONLY);

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isEmpty(exceptions));

    List<Quad> iCode = compiler.getICode();
    assertTrue(CollectionUtils.isNotEmpty(iCode));
    assertEquals(iCode.size(), expectedOpcodes.size() + MAIN_CALL_OFFSET);

    for (int i = 0; i < expectedOpcodes.size(); ++i) {
      assertEquals(iCode.get(i + MAIN_CALL_OFFSET).getOpcode(), expectedOpcodes.get(i));
    }
  }

  @Test
  public void test_expression_boolean_complex() throws IOException {
    List<String> expectedOpcodes = Arrays.asList(
            IntermediateOpcodes.Method.FUNC.toString(),
            IntermediateOpcodes.Bool.LT.toString(),
            IntermediateOpcodes.Bool.NE.toString(),
            IntermediateOpcodes.Logic.AND.toString(),
            IntermediateOpcodes.Method.RTN.toString());
    Compiler compiler = CompilerTestUtils.compileNoThrow("test111.ccl", CompilerOptions.GENERATE_I_CODE_ONLY);

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isEmpty(exceptions));

    List<Quad> iCode = compiler.getICode();
    assertTrue(CollectionUtils.isNotEmpty(iCode));
    assertEquals(iCode.size(), expectedOpcodes.size() + MAIN_CALL_OFFSET);
    assertEquals(iCode.get(4).getOperand3(), iCode.get(6).getOperand1());
    assertEquals(iCode.get(5).getOperand3(), iCode.get(6).getOperand2());

    for (int i = 0; i < expectedOpcodes.size(); ++i) {
      assertEquals(iCode.get(i + MAIN_CALL_OFFSET).getOpcode(), expectedOpcodes.get(i));
    }
  }

  @Test
  public void test_assignment_fromExpression() throws IOException {
    List<String> expectedOpcodes = Arrays.asList(
            IntermediateOpcodes.Method.FUNC.toString(),
            IntermediateOpcodes.Math.MUL.toString(),
            IntermediateOpcodes.Math.DIV.toString(),
            IntermediateOpcodes.Math.ADD.toString(),
            IntermediateOpcodes.Other.MOV.toString(),
            IntermediateOpcodes.Method.RTN.toString());
    Compiler compiler = CompilerTestUtils.compileNoThrow("test112.ccl", CompilerOptions.GENERATE_I_CODE_ONLY);

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isEmpty(exceptions));

    List<Quad> iCode = compiler.getICode();
    assertTrue(CollectionUtils.isNotEmpty(iCode));
    assertEquals(iCode.size(), expectedOpcodes.size() + MAIN_CALL_OFFSET);
    assertEquals(iCode.get(4).getOperand3(), iCode.get(6).getOperand1());
    assertEquals(iCode.get(5).getOperand3(), iCode.get(6).getOperand2());
    assertEquals(iCode.get(6).getOperand3(), iCode.get(7).getOperand1());

    for (int i = 0; i < expectedOpcodes.size(); ++i) {
      assertEquals(iCode.get(i + MAIN_CALL_OFFSET).getOpcode(), expectedOpcodes.get(i));
    }
  }
}
