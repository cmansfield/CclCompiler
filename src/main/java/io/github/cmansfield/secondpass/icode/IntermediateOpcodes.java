package io.github.cmansfield.secondpass.icode;

import org.apache.commons.lang3.StringUtils;
import io.github.cmansfield.parser.Keyword;

import java.util.ArrayList;
import java.util.List;


public class IntermediateOpcodes {
  static List<Class<? extends Enum>> opcodeClasses;
  private static List<java.lang.reflect.Method> opcodeMethods;
  
  static {
    opcodeClasses = new ArrayList<>();
    opcodeClasses.add(Math.class);
    opcodeClasses.add(Bool.class);
    opcodeClasses.add(Flow.class);
    opcodeClasses.add(Logic.class);
    opcodeClasses.add(Stack.class);
    opcodeClasses.add(Other.class);
    opcodeClasses.add(Method.class);
    opcodeClasses.add(Allowcate.class);

    opcodeMethods = new ArrayList<>();
    for(Class<?> clazz : IntermediateOpcodes.class.getDeclaredClasses()) {
      try {
        opcodeMethods.add(clazz.getDeclaredMethod("getOpcode", String.class));
      }
      catch(Exception e) {
        // Move onto the next class
      }
    }
  }
  
  public enum Math {
    ADD,
    ADI,
    SUB,
    MUL,
    DIV;
    
    public static String getOpcode(String operand) {
      if(Keyword.PLUS.toString().equals(operand)) {
        return ADD.toString();
      }
      if(Keyword.MINUS.toString().equals(operand)) {
        return SUB.toString();
      }
      if(Keyword.MULTI.toString().equals(operand)) {
        return MUL.toString();
      }
      if(Keyword.DIV.toString().equals(operand)) {
        return DIV.toString();
      }
      return null;
    }
  }
  public enum Bool {
    LT,
    GT,
    NE,
    EQ,
    LE,
    GE;

    public static String getOpcode(String operand) {
      if(Keyword.LESS.toString().equals(operand)) {
        return LT.toString();
      }
      if(Keyword.GREATER.toString().equals(operand)) {
        return GT.toString();
      }
      if(Keyword.NOT_EQ.toString().equals(operand)) {
        return NE.toString();
      }
      if(Keyword.EQUALS.toString().equals(operand)) {
        return EQ.toString();
      }
      if(Keyword.LESS_EQ.toString().equals(operand)) {
        return LE.toString();
      }
      if(Keyword.GREAT_EQ.toString().equals(operand)) {
        return GE.toString();
      }
      return null;
    }
  }
  public enum Logic {
    AND,
    OR,
    NOT;

    public static String getOpcode(String operand) {
      if(Keyword.AND.toString().equals(operand)) {
        return AND.toString();
      }
      if(Keyword.OR.toString().equals(operand)) {
        return OR.toString();
      }
      if(Keyword.NOT.toString().equals(operand)) {
        return NOT.toString();
      }
      return null;
    }
  }
  public enum Flow {
    BF,
    BT,
    JMP
  }
  public enum Stack {
    PUSH,
    POP,
    PEEK
  }
  public enum Method {
    FRAME,
    CALL,
    RTN,
    FUNC
  }
  public enum Allowcate {
    NEWI,
    NEW,
    RTN,
    METH
  }
  public enum Other {
    MOV,
    MOVI,
    PRINT,
    READ,
    REF,
    AREF
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
    for(Class<? extends Enum> clazz : opcodeClasses) {
      for(Enum code : clazz.getEnumConstants()) {
        if(code.toString().equals(opcode)) {
          return true;
        }
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
  public static String getOpcode(String operator) {
    for(java.lang.reflect.Method method : opcodeMethods) {
      try {
        String opcode = (String)method.invoke(null, operator);

        if(StringUtils.isNotBlank(opcode)) {
          return opcode;
        }
      }
      catch(Exception e) {
        // Move onto the next class
      }
    }
    
    return "";
  }
}
