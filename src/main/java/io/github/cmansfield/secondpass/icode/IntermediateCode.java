package io.github.cmansfield.secondpass.icode;

import org.apache.commons.lang3.StringUtils;
import io.github.cmansfield.compiler.Label;

import java.util.stream.Collectors;
import java.util.*;


public class IntermediateCode {
  private Map<Label,Deque<String>> labelStackMap;
  private List<Quad> staticICode;
  private List<Quad> iCode;
  private String nextLabel;
  
  public boolean isFieldDeclaration;        // NOSONAR
  
  public IntermediateCode() {
    labelStackMap = new EnumMap<>(Label.class);
    staticICode = new ArrayList<>();
    iCode = new ArrayList<>();
    isFieldDeclaration = false;
  }

  public List<Quad> getICode() {
    return new ArrayList<>(iCode);
  }

  /**
   * This method will 'pop' all of the static initialized field declaration iCode and return
   * the list of quads
   * 
   * @return    A list of quads
   */
  public List<Quad> popAllStaticInitializerICode() {
    List<Quad> staticInitICode = this.staticICode;
    this.staticICode = new ArrayList<>();
    return staticInitICode;
  }

  /**
   * Add a new quad to the list of quads
   * 
   * @param quad  New quad to add
   */
  public void add(Quad quad) {
    if(quad == null) {
      throw new IllegalArgumentException("Quads cannot be null");
    }
    if(nextLabel != null) {
      if(StringUtils.isNotBlank(quad.getLabel())) {
        throw new UnsupportedOperationException("There's a problem here that needs to be fixed");
      }
      
      quad.setLabel(nextLabel);
      nextLabel = null;
    }

    if(isFieldDeclaration) {
      staticICode.add(quad);
    }
    else {
      iCode.add(quad);
    }
  }

  public void clearNextLabel() {
    nextLabel = null;
  }
  
  /**
   * Set the label to be applied to the next quad added
   * 
   * @param label   The string value to apply
   */
  public void setNextLabel(String label) {
    if(nextLabel != null) {
      backPropagate(label);
    }
    nextLabel = label;
  }
  
  public String getNextLabel() {
    return nextLabel;
  }

  /**
   * If there is already a label on standby for the next quad and another label needs to 
   * take its place then we'll need to back propagate. Where all of the instances of the 
   * old label in any quad will be replaced with the new label. 
   * 
   * @param label   The new label to replace the old one
   */
  private void backPropagate(String label) {
    iCode.forEach(quad -> {
      if(nextLabel.equals(quad.getOperand1())) {
        quad.setOperand1(label);
      }
      if(nextLabel.equals(quad.getOperand2())) {
        quad.setOperand2(label);
      }
      if(nextLabel.equals(quad.getOperand3())) {
        quad.setOperand3(label);
      }
    });
  }
  
  /**
   * Push a defined label ID onto the label stack, this is needed when dealing with 'if', 'else',
   * 'for', and 'while' statements. 
   * 
   * @param label   The type of label being stored
   * @param value   The label ID to store for later
   */
  public void pushLabel(Label label, String value) {
    if(label == null || StringUtils.isBlank(value)) {
      return;
    }
    labelStackMap.computeIfAbsent(label, lbl -> labelStackMap.put(lbl, new ArrayDeque<>()));
    
    labelStackMap.get(label).push(value);
  }

  /**
   * Pop a label ID off of the label stack.
   * 
   * @param label   The type of label being removed
   * @return        The label ID if found
   */
  public String popLabel(Label label) {
    if(label == null) {
      return null;
    }
    if(!labelStackMap.containsKey(label)) {
      return null;
    }
    if(labelStackMap.get(label) == null) {
      return null;
    }
    
    return labelStackMap.get(label).pop();
  }

  /**
   * This method will check to see if the latest quad matches the supplied opcode
   * 
   * @param opcode  Opcode to compare with
   * @return        Boolean true if they match
   */
  public boolean isLastOpcode(String opcode) {
    if(StringUtils.isBlank(opcode) || iCode.isEmpty()) {
      return false;
    }
    return opcode.equals(iCode.get(iCode.size() - 1).getOpcode());
  }
  
  @Override
  public String toString() {
    return iCode.stream()
            .map(Object::toString)
            .collect(Collectors.joining("\n"));
  }
}
