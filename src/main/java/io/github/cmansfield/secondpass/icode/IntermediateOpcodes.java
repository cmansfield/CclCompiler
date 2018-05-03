package io.github.cmansfield.secondpass.icode;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;


public class IntermediateOpcodes {
  private static List<Class<? extends Enum>> opcodeClasses;
  static {
    opcodeClasses = new ArrayList<>();
    opcodeClasses.add(Math.class);
    opcodeClasses.add(Bool.class);
    opcodeClasses.add(Flow.class);
    opcodeClasses.add(Logic.class);
    opcodeClasses.add(Stack.class);
    opcodeClasses.add(Other.class);
    opcodeClasses.add(Invoke.class);
    opcodeClasses.add(Allowcate.class);
  }
  
  public enum Math {
    ADD,
    ADI,
    SUB,
    MUL,
    DIV
  }
  public enum Bool {
    LT,
    GT,
    NE,
    EQ,
    LE,
    GE
  }
  public enum Logic {
    AND,
    OR,
    NOT
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
  public enum Invoke {
    FRAME,
    CALL,
    RTN,
    METH
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
}
