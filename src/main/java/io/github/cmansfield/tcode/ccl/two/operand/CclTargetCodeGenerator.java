package io.github.cmansfield.tcode.ccl.two.operand;

import io.github.cmansfield.firstpass.symbols.SymbolKind;
import io.github.cmansfield.secondpass.icode.IntermediateOpcodes;
import io.github.cmansfield.secondpass.icode.IntermediateCode;
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

    assembly.add(new Asm.AsmBuilder()
            .opcode("AND")
            .operand1(register.toString())
            .operand2(register.toString()).build());
    
    switch (operandSymbol.getSymbolKind()) {
      case MAIN:
        break;
      case CLASS:
        break;
      case METHOD:
        break;
      case CONSTRUCTOR:
        break;
      case PARAM:
        break;
      case INSTANCE_VAR:
        break;
      case LOCAL_VAR:
        break;
      case INT_LIT:
        assembly.add(new Asm.AsmBuilder()
                .opcode("ADI")
                .operand1(register.toString())
                .operand2(operandSymbol.getText()).build());
        break;
      case CHAR_LIT:
        break;
      case STR_LIT:
        break;
      case BOOL_LIT:
        break;
      case SPECIAL_LIT:
        break;
      case FOR:
        break;
      case BLOCK:
        break;
      case PACKAGE:
        break;
      case REFERENCE:
        break;
      case TEMPORARY:
        break;
      case TEMPLATE:
        break;
      case UNKNOWN:
        break;
    }
  }
  
  /**
   * This method will generate the assembly for an 'ADD' quad
   * 
   * @param symbolTable   The symbol table with all of the Symbol information
   * @param quad          The 'ADD' quad used to generate the ASM
   */
  private void add(BidiMap<String, Symbol> symbolTable, Quad quad) {
    // Load operand1 into a DestinationRegister
    // Load operand2 into a SourceRegister
    // ASM: ADD DestinationRegister, SourceRegister
    // Load the address of operand3 into a register3
    // Move the value in the DestinationRegister into location stored in register3

    Register destReg = getNextFreeRegister();
    Register sourceReg = getNextFreeRegister();
    Register memReg = getNextFreeRegister();
    
    loadIntoRegister(destReg, quad.getOperand1(), symbolTable);
    loadIntoRegister(sourceReg, quad.getOperand2(), symbolTable);
    assembly.add(new Asm.AsmBuilder()
            .opcode("ADD")        // TODO - Replace tCode magic strings with a constant
            .operand1(destReg.toString())
            .operand2(sourceReg.toString()).build());
    loadIntoRegister(memReg, quad.getOperand3(), symbolTable);
    assembly.add(new Asm.AsmBuilder()
            .opcode("MOV")
            .operand1(memReg.toString())
            .operand2(destReg.toString()).build());
    
    freeUpAllRegisters();
  }

  /**
   * This method will generate the assembly for an 'MOV' quad
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
      String opcode = quad.getOpcode();
      
      if(IntermediateOpcodes.Other.MOV.toString().equals(opcode)) {
        mov(symbolTable, quad);
      }
      else if(IntermediateOpcodes.Math.ADD.toString().equals(opcode)) {
        add(symbolTable, quad);
      }
      
      // TODO - Continue to add the rest of the Quad opcodes here
    }
    
    return true;
  }
}
