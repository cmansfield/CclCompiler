package io.github.cmansfield.symbols.data;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.HashCodeBuilder;

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
    return StringUtils.isBlank(type) ? Optional.empty() : Optional.of(type);
  }

  public Optional<String> getReturnType() {
    return StringUtils.isBlank(returnType) ? Optional.empty() : Optional.of(returnType);
  }

  public AccessModifier getAccessModifier() {
    return accessModifier == null ? AccessModifier.PROJECT : accessModifier;
  }

  public List<String> getParameters() {
    return parameters.isEmpty() ? Collections.emptyList() : parameters;
  }

  @Override
  public boolean equals(Object obj) {
    if(obj == null) {
      return false;
    }
    if(this == obj) {
      return true;
    }
    if(!(obj instanceof Data)) {
      return false;
    }
    Data data = (Data) obj;

    if(!this.type.equals(data.type)) {
      return false;
    }
    if(!this.returnType.equals(data.returnType)) {
      return false;
    }
    if(this.accessModifier != data.accessModifier) {
      return false;
    }
    if(this.parameters.size() != data.parameters.size()) {
      return false;
    }

    return this.parameters.containsAll(data.parameters);
  }

  @Override
  public int hashCode() {
    return new HashCodeBuilder(17, 37)
            .append(type)
            .append(returnType)
            .append(accessModifier.toString())
            .append(parameters)
            .toHashCode();
  }
}
