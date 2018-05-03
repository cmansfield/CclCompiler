package io.github.cmansfield.secondpass.icode;

import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;

public class IntermediateCode {
  private List<Quad> iCode;
  
  IntermediateCode() {
    iCode = new ArrayList<>();
  }

  void addQuad(Quad quad) {
    if(quad == null) {
      throw new IllegalArgumentException("Quads cannot be null");
    }
    iCode.add(quad);    
  }
  
  @Override
  public String toString() {
    return iCode.stream()
            .map(Object::toString)
            .collect(Collectors.joining("\n"));
  }
}
