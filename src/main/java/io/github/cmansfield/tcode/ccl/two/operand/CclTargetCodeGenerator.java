package io.github.cmansfield.tcode.ccl.two.operand;

import io.github.cmansfield.secondpass.icode.IntermediateOpcode;
import io.github.cmansfield.secondpass.icode.IntermediateCode;
import io.github.cmansfield.firstpass.symbols.SymbolKind;
import io.github.cmansfield.tcode.TargetCodeGenerator;
import io.github.cmansfield.firstpass.symbols.Symbol;
import io.github.cmansfield.secondpass.icode.Quad;
import org.apache.commons.collections4.BidiMap;

import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;


public class CclTargetCodeGenerator implements TargetCodeGenerator {
  private static final String T_CODE_COMMENT_INDENT = "\t\t\t";
  private final Map<Register, Boolean> registers;
  private final List<Asm> assembly;
  
  
  public CclTargetCodeGenerator() {
    registers = new EnumMap<>(Register.class);
    assembly = new ArrayList<>();
    
    for(Register clazz : Register.class.getEnumConstants()) {
      registers.put(clazz, false);
    }
  }

  /**
   * This will return the next unused register and set it's value to being used
   * 
   * @return  Returns a Register enum object
   */
  private Register getNextFreeRegister() {
    for(Map.Entry<Register, Boolean> entry : registers.entrySet()) {
      if(!entry.getValue()){
        registers.put(entry.getKey(), true);
        return entry.getKey();
      }
    }
    
    throw new IllegalStateException("No registers are available, this shouldn't ever happen");
  }

  /**
   * This method will set all of the registers in the registers map to not being used
   */
  private void freeUpAllRegisters() {
    for(Map.Entry<Register, Boolean> entry : registers.entrySet()) {
      registers.put(entry.getKey(), false);
    }
  }

  /**
   * This method will clear the value stored in the supplied register
   * 
   * @param register  Register to clear
   */
  private void clearRegister(Register register) {
    assembly.add(new Asm.AsmBuilder()
            .opcode(Opcodes.SUB)
            .operand1(register.toString())
            .operand2(register.toString())
            .comment(T_CODE_COMMENT_INDENT + "Clear register " + register.toString()).build());
  }
  
  /**
   * This method will generate the assembly for loading a value or address of the supplied 
   * operand into the supplied register
   * 
   * @param register      The Register to load the value or address into
   * @param operand       The operand to load
   * @param symbolTable   The symbol table for Symbol reference 
   */
  // TODO - Continue to update this method
  private void loadIntoRegister(Register register, String operand, BidiMap<String, Symbol> symbolTable) {

    Symbol operandSymbol = symbolTable.get(operand);
    
    if(operandSymbol == null) {
      throw new IllegalArgumentException("Should have found a symbol for the supplyed operand '" + operand + "'");
    }
    
    switch (operandSymbol.getSymbolKind()) {
      case INT_LIT:
        clearRegister(register);
        assembly.add(new Asm.AsmBuilder()
                .opcode(Opcodes.ADI)
                .operand1(register.toString())
                .operand2(operandSymbol.getText()).build());
        break;
      case CLASS:
      case PARAM:
      case INSTANCE_VAR:
      case LOCAL_VAR:
      case CHAR_LIT:
      case STR_LIT:
      case BOOL_LIT:
      case SPECIAL_LIT:
      case PACKAGE:
      case REFERENCE:
      case TEMPORARY:
      case TEMPLATE:
        assembly.add(new Asm.AsmBuilder()
                .opcode("Load")
                .operand1(register.toString())
                .operand2(operandSymbol.getText())
                .comment("Replace this when load logic is complete").build());
        break;
      case UNKNOWN:
      default:
        throw new IllegalStateException(String.format(
                "Cannot load an '%s' Symbol '%s' into Register '%s'",
                SymbolKind.UNKNOWN,
                operandSymbol.getSymbolId(),
                register));
    }
  }

  /**
   * This method will generate asm for all math statements
   *
   * @param symbolTable   The symbol table with all of the Symbol information
   * @param quad          The quad used to generate the ASM
   */
  private void math(BidiMap<String, Symbol> symbolTable, Quad quad) {
    // Load operand1 into a DestinationRegister
    // Load operand2 into a SourceRegister
    // ASM: opcode DestinationRegister, SourceRegister
    // Load the address of operand3 into register3
    // Move the value in the DestinationRegister into location stored in register3

    Register destReg = getNextFreeRegister();
    Register sourceReg = getNextFreeRegister();
    Register memReg = getNextFreeRegister();

    loadIntoRegister(destReg, quad.getOperand1(), symbolTable);
    loadIntoRegister(sourceReg, quad.getOperand2(), symbolTable);
    assembly.add(new Asm.AsmBuilder()
            .opcode(quad.getOpcode().toString())
            .operand1(destReg.toString())
            .operand2(sourceReg.toString()).build());
    loadIntoRegister(memReg, quad.getOperand3(), symbolTable);
    assembly.add(new Asm.AsmBuilder()
            .opcode(Opcodes.MOV)
            .operand1(memReg.toString())
            .operand2(destReg.toString()).build());
  }

  /**
   * This method will generate the assembly for an iCode 'EQ' quad
   * 
   * @param symbolTable   The symbol table with all of the Symbol information
   * @param quad          The iCode quad used to generate the ASM
   */
  private void equals(BidiMap<String, Symbol> symbolTable, Quad quad) {
    // Load operand1 into a register1
    // Load operand2 into a register2
    // Load operand3 into a register3
    // ASM: CMP register1, register2                ; Compare  
    // Clear register2                              ; Set False
    // ASM: BRZ register1, LABEL_TRUE
    // ASM: JMP LABEL_FALSE                         ; Jump
    // ASM: LABEL_TRUE  ADI register2, 1            ; Set True
    // LABEL_FALSE - Move the value in register2 into location stored in register3

    Register r1 = getNextFreeRegister();
    Register r2 = getNextFreeRegister();
    Register r3 = getNextFreeRegister();
  
    loadIntoRegister(r1, quad.getOperand1(), symbolTable);
    loadIntoRegister(r2, quad.getOperand2(), symbolTable);
    loadIntoRegister(r3, quad.getOperand3(), symbolTable);
    
    assembly.add(new Asm.AsmBuilder()
            .opcode(Opcodes.CMP)
            .operand1(r1.toString())
            .operand2(r2.toString()).build());
    clearRegister(r2);
    assembly.add(new Asm.AsmBuilder()
            .opcode(Opcodes.BRZ)
            .operand1(r1.toString())
            .operand2("LABEL_TRUE").build());         // TODO - Replace these labels with generated labels
    assembly.add(new Asm.AsmBuilder()
            .opcode(Opcodes.JMP)
            .operand1("LABEL_FALSE").build());
    assembly.add(new Asm.AsmBuilder()
            .label("LABEL_TRUE")
            .opcode(Opcodes.ADI)
            .operand1(r2.toString())
            .operand2("1").build());
    assembly.add(new Asm.AsmBuilder()
            .label("LABEL_FALSE")
            .opcode(Opcodes.MOV)
            .operand1(r3.toString())
            .operand2(r2.toString()).build());
  }
  
  /**
   * This method will generate the assembly for an iCode 'MOV' quad
   * 
   * @param symbolTable   The symbol table with all of the Symbol information
   * @param quad          The 'MOV' quad used to generate the ASM
   */
  private void mov(BidiMap<String, Symbol> symbolTable, Quad quad) {
    // Load operand1 into a SourceRegister
    // Load the address of the destination into the DestinationRegister
    // Move the value in the SourceRegister into location stored in the DestinationRegister
    // ASM: MOV DestinationRegister, SourceRegister
    
    freeUpAllRegisters();
  }

  /**
   * This method will generate the assembly for an iCode 'FUNC' quad
   *
   * @param symbolTable   The symbol table with all of the Symbol information
   * @param quad          The 'FUNC' quad used to generate the ASM
   */
  private void method(BidiMap<String, Symbol> symbolTable, Quad quad) {
    // ASM: METHOD_LABEL SUB R0, R0     ; Just a placeholder for the method label
    // ASM: ADI SP, -number of bytes for local and temp var

    assembly.add(new Asm.AsmBuilder()
            .label(quad.getLabel())
            .opcode(Opcodes.SUB)
            .operand1(Register.R0.toString())
            .operand2(Register.R0.toString()).build());

    // TODO - this next statement is optional if there are no local or temp var
    assembly.add(new Asm.AsmBuilder()
            .opcode(Opcodes.ADI)
            .operand1(Register.SP.toString())
            .operand2("Calculate size in bytes").build());

    freeUpAllRegisters();
  }

  /**
   * This method will generate the assembly for an iCode 'RTN' quad
   *
   * @param symbolTable   The symbol table with all of the Symbol information
   * @param quad          The 'RTN' quad used to generate the ASM
   */
  private void rtn(BidiMap<String, Symbol> symbolTable, Quad quad) {
    // ASM: LDR R0, FP       ; De-allocation
    // ASM: MOV SP, FP
    // ASM: ADI FP, -8      ; Point to the PFP that points to the last frame
    // ASM: LDR FP, FP      ; FP points to the beginning of the last frame
    // ASM: JMR R0

    throw new UnsupportedOperationException("Not implemented yet");
  }

  /**
   * This method will generate the assembly for an iCode 'HALT' quad
   */
  private void halt() {
    // ASM: TRP 0
    assembly.add(new Asm.AsmBuilder()
            .opcode(Opcodes.TRP)
            .operand1(TrapCodes.STOP).build());
  }
  
  @Override
  public String getId() {
    return "Two Operand CCL Target Code";
  }

  @Override
  public List<String> getOutput() {
    return assembly.stream()
            .map(Object::toString)
            .collect(Collectors.toList());
  }

  @Override
  public boolean generate(BidiMap<String, Symbol> symbolTable, IntermediateCode iCode) {

    for (Quad quad : iCode.getICode()) {
      IntermediateOpcode opcode = quad.getOpcode();

      switch (opcode) {
        case ADI:
          break;
        case ADD:
        case SUB:
        case MUL:
        case DIV:
          math(symbolTable, quad);
          break;
        case LT:
          break;
        case GT:
          break;
        case NE:
          break;
        case EQ:
          equals(symbolTable, quad);
          break;
        case LE:
          break;
        case GE:
          break;
        case AND:
          break;
        case OR:
          break;
        case NOT:
          break;
        case BF:
          break;
        case BT:
          break;
        case JMP:
          break;
        case HALT:
          halt();
          break;
        case PUSH:
          break;
        case POP:
          break;
        case PEEK:
          break;
        case FRAME:
          break;
        case CALL:
          break;
        case RTN:
          rtn(symbolTable, quad);
          break;
        case FUNC:
          method(symbolTable, quad);
          break;
        case NEWI:
          break;
        case NEW:
          break;
        case BLCK:
          break;
        case LOCK:
          break;
        case SPWN:
          break;
        case UNLCK:
          break;
        case MOV:
          mov(symbolTable, quad);
          break;
        case MOVI:
          break;
        case PRINT:
          break;
        case READ:
          break;
        case REF:
          break;
        case AREF:
          break;
      }
    }
    
    return true;
  }

  @Override
  public String toString() {
    return assembly.stream()
            .map(Object::toString)
            .collect(Collectors.joining("\n"));
  }
}
