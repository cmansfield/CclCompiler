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
  
  @Test
  public void test_while() throws IOException {
    List<String> expectedOpcodes = Arrays.asList(
            IntermediateOpcodes.Method.FUNC.toString(),
            IntermediateOpcodes.Bool.LT.toString(),
            IntermediateOpcodes.Flow.BF.toString(),
            IntermediateOpcodes.Other.PRINT.toString(),
            IntermediateOpcodes.Other.READ.toString(),
            IntermediateOpcodes.Flow.JMP.toString(),
            IntermediateOpcodes.Method.RTN.toString());
    Compiler compiler = CompilerTestUtils.compileNoThrow("test101.ccl", CompilerOptions.GENERATE_ICODE_ONLY);

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isEmpty(exceptions));

    List<Quad> iCode = compiler.getICode();
    assertTrue(CollectionUtils.isNotEmpty(iCode));
    assertEquals(iCode.size(), expectedOpcodes.size());
    assertEquals(iCode.get(1).getLabel(), iCode.get(5).getOperand1());
    assertEquals(iCode.get(2).getOperand2(), iCode.get(6).getLabel());
    
    for (int i = 0; i < iCode.size(); ++i) {
      assertEquals(iCode.get(i).getOpcode(), expectedOpcodes.get(i));  
    }
  }

  @Test
  public void test_if_else() throws IOException {
    List<String> expectedOpcodes = Arrays.asList(
            IntermediateOpcodes.Method.FUNC.toString(),
            IntermediateOpcodes.Bool.LT.toString(),
            IntermediateOpcodes.Flow.BF.toString(),
            IntermediateOpcodes.Other.PRINT.toString(),
            IntermediateOpcodes.Flow.JMP.toString(),
            IntermediateOpcodes.Other.PRINT.toString(),
            IntermediateOpcodes.Method.RTN.toString());
    Compiler compiler = CompilerTestUtils.compileNoThrow("test102.ccl", CompilerOptions.GENERATE_ICODE_ONLY);

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isEmpty(exceptions));

    List<Quad> iCode = compiler.getICode();
    assertTrue(CollectionUtils.isNotEmpty(iCode));
    assertEquals(iCode.size(), expectedOpcodes.size());
    assertEquals(iCode.get(2).getOperand2(), iCode.get(5).getLabel());
    assertEquals(iCode.get(4).getOperand1(), iCode.get(6).getLabel());

    for (int i = 0; i < iCode.size(); ++i) {
      assertEquals(iCode.get(i).getOpcode(), expectedOpcodes.get(i));
    }
  }

  @Test
  public void test_nestedIf() throws IOException {
    List<String> expectedOpcodes = Arrays.asList(
            IntermediateOpcodes.Method.FUNC.toString(),
            IntermediateOpcodes.Flow.BF.toString(),
            IntermediateOpcodes.Bool.LT.toString(),
            IntermediateOpcodes.Flow.BF.toString(),
            IntermediateOpcodes.Other.PRINT.toString(),
            IntermediateOpcodes.Method.RTN.toString());
    Compiler compiler = CompilerTestUtils.compileNoThrow("test103.ccl", CompilerOptions.GENERATE_ICODE_ONLY);

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isEmpty(exceptions));

    List<Quad> iCode = compiler.getICode();
    assertTrue(CollectionUtils.isNotEmpty(iCode));
    assertEquals(iCode.size(), expectedOpcodes.size());
    assertEquals(iCode.get(1).getOperand2(), iCode.get(5).getLabel());
    assertEquals(iCode.get(3).getOperand2(), iCode.get(5).getLabel());

    for (int i = 0; i < iCode.size(); ++i) {
      assertEquals(iCode.get(i).getOpcode(), expectedOpcodes.get(i));
    }
  }

  @Test
  public void test_while_backToBack() throws IOException {
    List<String> expectedOpcodes = Arrays.asList(
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
    Compiler compiler = CompilerTestUtils.compileNoThrow("test104.ccl", CompilerOptions.GENERATE_ICODE_ONLY);

    assertNotNull(compiler);
    List<String> exceptions = compiler.getExceptions();
    assertTrue(CollectionUtils.isEmpty(exceptions));

    List<Quad> iCode = compiler.getICode();
    assertTrue(CollectionUtils.isNotEmpty(iCode));
    assertEquals(iCode.size(), expectedOpcodes.size());
    assertEquals(iCode.get(1).getLabel(), iCode.get(5).getOperand1());
    assertEquals(iCode.get(2).getOperand2(), iCode.get(6).getLabel());
    assertEquals(iCode.get(2).getOperand2(), iCode.get(9).getOperand1());
    assertEquals(iCode.get(7).getOperand2(), iCode.get(10).getLabel());

    for (int i = 0; i < iCode.size(); ++i) {
      assertEquals(iCode.get(i).getOpcode(), expectedOpcodes.get(i));
    }
  }
}