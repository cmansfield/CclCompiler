package io.github.cmansfield.secondpass.icode;

import org.apache.commons.lang3.StringUtils;

public class QuadBuilder {
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
    
    Quad quad = new Quad(opcode, operand1, operand2, operand3);
    quad.setLabel(label);
    quad.setComment(comment);
    
    return quad;
  }
}
