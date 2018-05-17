package io.github.cmansfield.secondpass.icode;

import org.apache.commons.lang3.StringUtils;

public class Quad {
  private String label;
  private String opcode;
  private String operand1;
  private String operand2;
  private String operand3;
  private String comment;
  
  private Quad(String opcode, String operand1) {
    this.opcode = opcode;
    this.operand1 = operand1;
  }
  
  private Quad(String opcode, String operand1, String operand2) {
    this(opcode, operand1);
    this.operand2 = operand2;
  }

  Quad(String opcode, String operand1, String operand2, String operand3) {
    this(opcode, operand1, operand2);
    this.operand3 = operand3;
  }

  void setLabel(String label) {
    this.label = label;
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
              label == null ? "" : label,
              opcode, 
              StringUtils.isBlank(operand1) ? "" : operand1,
              StringUtils.isBlank(operand2) ? "" : ", " + operand2,
              StringUtils.isBlank(operand3) ? "" : ", " + operand3),
            StringUtils.isBlank(comment) ? "" : "; " + comment);
  }


  public static class QuadBuilder {
    private String label;
    private String opcode;
    private String operand1;
    private String operand2;
    private String operand3;
    private String comment;

    public QuadBuilder label(String label) {
      this.label = label;
      return this;
    }

    public QuadBuilder opcode(String opcode) {
      this.opcode = opcode;
      return this;
    }

    public QuadBuilder operand1(String operand1) {
      this.operand1 = operand1;
      return this;
    }

    public QuadBuilder operand2(String operand2) {
      this.operand2 = operand2;
      return this;
    }

    public QuadBuilder operand3(String operand3) {
      this.operand3 = operand3;
      return this;
    }

    public QuadBuilder comment(String comment) {
      this.comment = comment;
      return this;
    }

    public Quad build() {
      if(StringUtils.isBlank(opcode)) {
        throw new IllegalArgumentException("A quad's opcode cannot be blank");
      }
      if(!IntermediateOpcodes.isOpcode(opcode)) {
        throw new IllegalArgumentException(String.format(
                "Opcode \'%s\' is not a valid opcode",
                opcode));
      }

      Quad quad = new Quad(opcode, operand1, operand2, operand3);
      quad.setLabel(label);
      quad.setComment(comment);

      return quad;
    }
  }
}
