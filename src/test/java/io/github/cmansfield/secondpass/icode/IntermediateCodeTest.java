package io.github.cmansfield.secondpass.icode;

import io.github.cmansfield.secondpass.icode.Quad.QuadBuilder;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import io.github.cmansfield.compiler.Label;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;


public class IntermediateCodeTest {
  private IntermediateCode iCode;
  
  @BeforeMethod
  public void setUp() {
    iCode = new IntermediateCode();
  }
  
  @Test
  public void test_add() {
    iCode.add(new QuadBuilder()
            .opcode(IntermediateOpcodes.Flow.JMP.toString())
            .operand1("00001_Label")
            .build());

    List<Quad> listICode = iCode.getICode();
    assertTrue(CollectionUtils.isNotEmpty(listICode));
    assertEquals(listICode.size(), 1);
    Quad quad = listICode.get(0);
    assertNotNull(quad);
    assertEquals(quad.getOpcode(), IntermediateOpcodes.Flow.JMP.toString());
    assertEquals(quad.getOperand1(), "00001_Label");
    assertNull(quad.getOperand2());
    assertNull(quad.getOperand3());
    assertTrue(StringUtils.isBlank(quad.getLabel()));
    assertNull(quad.getComment());
  }
  
  @Test
  public void test_add_withLabel() {
    String iCodeLabel = "00002_Label";
    iCode.setNextLabel(iCodeLabel);
    
    iCode.add(new QuadBuilder()
            .opcode(IntermediateOpcodes.Flow.JMP.toString())
            .operand1("00002_Label")
            .build());

    List<Quad> listICode = iCode.getICode();
    assertTrue(CollectionUtils.isNotEmpty(listICode));
    assertEquals(listICode.get(0).getLabel(), iCodeLabel);
  }
  
  @Test (expectedExceptions = UnsupportedOperationException.class)
  public void test_add_quadHadLabelAndNextLabel() {
    iCode.setNextLabel("Something");

    iCode.add(new QuadBuilder()
            .label("00001_Label")
            .opcode(IntermediateOpcodes.Flow.JMP.toString())
            .operand1("00002_Label")
            .build());
  }
  
  @Test
  public void test_setNextLabel_backPropagate() {
    String origLabel = "00001_Label";
    String newLabel = "00002_Label";
    iCode.add(new QuadBuilder()
            .opcode(IntermediateOpcodes.Flow.JMP.toString())
            .operand1(origLabel)
            .operand2(origLabel)
            .operand3(origLabel)
            .build());
    iCode.setNextLabel(origLabel);
    
    iCode.setNextLabel(newLabel);

    Quad quad = iCode.getICode().get(0);
    assertNotNull(quad);
    assertEquals(quad.getOperand1(), newLabel);
    assertEquals(quad.getOperand2(), newLabel);
    assertEquals(quad.getOperand3(), newLabel);
  }
  
  @Test
  public void test_pushAndPopLabel() {
    String label = "00001_Label";
    
    iCode.pushLabel(Label.BEGIN, "Test");
    iCode.pushLabel(Label.BEGIN, label);
    iCode.pushLabel(Label.END_IF, "Another test");
    String poppedLabel = iCode.popLabel(Label.BEGIN);
    
    assertTrue(StringUtils.isNotBlank(poppedLabel));
    assertEquals(label, poppedLabel);
  }
  
  @Test
  public void test_popLabel_empty() {
    String poppedLabel = iCode.popLabel(Label.BEGIN);
    
    assertNull(poppedLabel);
  }
}
