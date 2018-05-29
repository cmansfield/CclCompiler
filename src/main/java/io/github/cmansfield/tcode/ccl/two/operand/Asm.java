package io.github.cmansfield.tcode.ccl.two.operand;

import org.apache.commons.lang3.StringUtils;

public class Asm {
  private String label;
  private String opcode;
  private String operand1;
  private String operand2;
  private String comment;

  private Asm() {}
  
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

  public String getComment() {
    return comment;
  }

  @Override
  public String toString() {
    return String.format(
            "%-55s%s",
            String.format(
                    "%-20s%-6s%s%s",
                    label == null ? "" : label,
                    opcode,
                    StringUtils.isBlank(operand1) ? "" : operand1,
                    StringUtils.isBlank(operand2) ? "" : ", " + operand2),
            StringUtils.isBlank(comment) ? "" : "; " + comment);
  }

  
  public static class AsmBuilder {
    private String label;
    private String opcode;
    private String operand1;
    private String operand2;
    private String comment;
    
    public AsmBuilder label(String label) {
      this.label = label;
      return this;
    }    
    
    public AsmBuilder opcode(String opcode) {
      this.opcode = opcode;
      return this;
    }
    
    public AsmBuilder operand1(String operand1) {
      this.operand1 = operand1;
      return this;
    }
    
    public AsmBuilder operand2(String operand2) {
      this.operand2 = operand2;
      return this;
    }
    
    public AsmBuilder comment(String comment) {
      this.comment = comment;
      return this;
    }
    
    public Asm build() {
      Asm asm = new Asm();
      
      if(StringUtils.isBlank(opcode)) {
        throw new IllegalArgumentException("The assembly statement cannot be empty");
      }
      
      asm.label = label;
      asm.opcode = opcode;
      asm.operand1 = operand1;
      asm.operand2 = operand2;
      asm.comment = comment;
      
      return asm;
    }
  }
}
