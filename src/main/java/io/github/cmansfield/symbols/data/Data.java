package io.github.cmansfield.symbols.data;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Optional;
import java.util.List;


public class Data {
  private String type;
  private String returnType;
  private AccessModifier accessModifier;
  private List<String> parameters;
  
  public Data() {
    accessModifier = AccessModifier.PROJECT;
    parameters = new ArrayList<>();
  }

  public Data(final String type, AccessModifier accessModifier) {
    this.accessModifier = accessModifier;
    this.type = type;
  }
  
  public Data(final String type, final String returnType, AccessModifier accessModifier, List<String> parameters) {
    this(type, accessModifier);
    this.returnType = returnType;
    this.parameters = parameters;
  }
  
  public Optional<String> getType() {
    return type == null ? Optional.empty() : Optional.of(type);
  }

  public Optional<String> getReturnType() {
    return returnType == null ? Optional.empty() : Optional.of(returnType);
  }

  public AccessModifier getAccessModifier() {
    return accessModifier;
  }

  public List<String> getParameters() {
    return parameters.isEmpty() ? Collections.emptyList() : parameters;
  }
}
