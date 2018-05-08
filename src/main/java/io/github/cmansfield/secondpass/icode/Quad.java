package io.github.cmansfield.secondpass.icode;

import org.apache.commons.lang3.StringUtils;

public class Quad {
  private String label;
  private String opcode;
  private String operand1;
  private String operand2;
  private String operand3;
  private String comment;
  
  Quad(String opcode, String operand1) {
    this.label = "";
    this.opcode = opcode;
    this.operand1 = operand1;
  }
  
  Quad(String opcode, String operand1, String operand2) {
    this(opcode, operand1);
    this.operand2 = operand2;
  }

  Quad(String opcode, String operand1, String operand2, String operand3) {
    this(opcode, operand1, operand2);
    this.operand3 = operand3;
  }

  void setLabel(String label) {
    this.label = StringUtils.isBlank(label) ? "" : label;
  }
  
  void setOperand1(String operand1) {
    this.operand1 = operand1;
  }
  
  void setOperand2(String operand2) {
    this.operand2 = operand2;
  }
  
  void setOperand3(String operand3) {
    this.operand3 = operand3;
  }
  
  void setComment(String comment) {
    this.comment = comment;
  }

  public String getLabel() {
    return label;
  }

  public String getOpcode() {
    return opcode;
  }

  public String getOperand1() {
    return operand1;
  }

  public String getOperand2() {
    return operand2;
  }

  public String getOperand3() {
    return operand3;
  }

  public String getComment() {
    return comment;
  }

  @Override
  public String toString() {
    return String.format(
            "%-55s%s", 
            String.format(
              "%-20s%-6s%s%s%s", 
              label,
              opcode, 
              StringUtils.isBlank(operand1) ? "" : operand1,
              StringUtils.isBlank(operand2) ? "" : ", " + operand2,
              StringUtils.isBlank(operand3) ? "" : ", " + operand3),
            StringUtils.isBlank(comment) ? "" : "; " + comment);
  }
}
