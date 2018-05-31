package io.github.cmansfield.secondpass.icode;

import io.github.cmansfield.parser.Keyword;
import org.apache.commons.lang3.StringUtils;

public enum IntermediateOpcode {
  // Math
  ADD(Keyword.PLUS.toString()),
  ADI,
  SUB(Keyword.MINUS.toString()),
  MUL(Keyword.MULTI.toString()),
  DIV(Keyword.DIV.toString()),
  // Boolean
  LT(Keyword.LESS.toString()),
  GT(Keyword.GREATER.toString()),
  NE(Keyword.NOT_EQ.toString()),
  EQ(Keyword.EQUALS.toString()),
  LE(Keyword.LESS_EQ.toString()),
  GE(Keyword.GREAT_EQ.toString()),
  // Logic
  AND(Keyword.AND.toString()),
  OR(Keyword.OR.toString()),
  NOT(Keyword.NOT.toString()),
  // Flow
  BF,
  BT,
  JMP,
  HALT,
  // Stack
  PUSH,
  POP,
  PEEK,
  // Method
  FRAME,
  CALL,
  RTN,
  FUNC,
  // Allowcate
  NEWI,
  NEW,
  // Threading
  BLCK,
  LOCK,
  SPWN,
  UNLCK,
  // Other
  MOV,
  MOVI,
  PRINT,
  READ,
  REF,
  AREF;

  private final String operator;

  IntermediateOpcode() {
    this.operator = "";
  }

  IntermediateOpcode(String operator) {
    this.operator = operator;
  }

  /**
   * A boolean check to see if the supplied string is a valid opcode
   * 
   * @param opcode  String opcode to check if valid
   * @return        Boolean true if the supplied value is a valid opcode
   */
  public static boolean isOpcode(String opcode) {
    if(StringUtils.isBlank(opcode)) {
      return false;
    }
    for(Enum code : IntermediateOpcode.class.getEnumConstants()) {
      if(code.toString().equals(opcode)) {
        return true;
      }
    }
    return false;
  }

  /**
   * This will return the corresponding opcode for the supplied operator
   * 
   * @param operator  The operator to convert to opcode
   * @return          The corresponding opcode if found
   */
  public static IntermediateOpcode getOpcode(String operator) {
    if(StringUtils.isBlank(operator)) {
      return null;
    }
    for(IntermediateOpcode opcode : IntermediateOpcode.class.getEnumConstants()) {
      if(opcode.operator.equals(operator)) {
        return opcode;
      }
    }
    return null;
  }
}
