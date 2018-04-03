package io.github.cmansfield.symbols.data;

import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.StringUtils;

import java.util.stream.Collectors;
import java.util.*;


public class Data {
  private String type;
  private String returnType;
  private List<AccessModifier> accessModifiers;
  private List<String> parameters;
  
  public Data() {
    accessModifiers = new ArrayList<>();
    accessModifiers.add(AccessModifier.PROJECT);
    parameters = new ArrayList<>();
  }

  public Data(final String type, List<AccessModifier> accessModifiers) {
    this.accessModifiers = accessModifiers;
    this.type = type;
  }
  
  public Data(final String type, final String returnType, List<AccessModifier> accessModifiers, List<String> parameters) {
    this(type, accessModifiers);
    this.returnType = returnType;
    this.parameters = parameters;
  }
  
  public Optional<String> getType() {
    return StringUtils.isBlank(type) ? Optional.empty() : Optional.of(type);
  }

  public Optional<String> getReturnType() {
    return StringUtils.isBlank(returnType) ? Optional.empty() : Optional.of(returnType);
  }

  public List<AccessModifier> getAccessModifiers() {
    return accessModifiers == null ? Collections.singletonList(AccessModifier.PROJECT) : accessModifiers;
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

    if(this.type == null) {
      if(data.type != null) {
        return false;
      }
    }
    else if(!this.type.equals(data.type)) {
      return false;
    }
    
    if(this.returnType == null) {
      if(data.returnType != null) {
        return false;
      }
    }
    else if(!this.returnType.equals(data.returnType)) {
      return false;
    }
    
    if(this.accessModifiers == null && data.accessModifiers != null) {
      return false;
    }
    if(data.accessModifiers == null && this.accessModifiers != null) {
      return false;
    }
    if(this.accessModifiers.size() != data.accessModifiers.size()) {
      return false;
    }
    Collections.sort(this.accessModifiers);
    Collections.sort(data.accessModifiers);
    if(!this.accessModifiers.equals(data.accessModifiers)) {
      return false;
    }

    if(this.parameters == null && data.parameters != null) {
      return false;
    }
    if(data.parameters == null && this.parameters != null) {
      return false;
    }
    if(this.parameters.size() != data.parameters.size()) {
      return false;
    }
    Collections.sort(this.parameters);
    Collections.sort(data.parameters);

    return this.parameters.equals(data.parameters);
  }

  @Override
  public int hashCode() {
    return new HashCodeBuilder(17, 37)
            .append(type)
            .append(returnType)
            .append(accessModifiers.toString())
            .append(parameters)
            .toHashCode();
  }
  
  
  public class DataBuilder {
    private String type;
    private String returnType;
    private List<AccessModifier> accessModifiers;
    private List<String> parameters;

    public DataBuilder type(String type) {
      this.type = type;
      return this;
    }
    
    public DataBuilder returnType(String returnType) {
      this.returnType = returnType;
      return this;
    }
    
    public DataBuilder accessModifier(AccessModifier accessModifier) {
      if(accessModifiers == null) {
        accessModifiers = new ArrayList<>();
      }
      accessModifiers.add(accessModifier);
      return this;
    }
    
    public DataBuilder accessModifiers(List<AccessModifier> accessModifiers) {
      if(this.accessModifiers == null) {
        this.accessModifiers = new ArrayList<>();
      }
      this.accessModifiers.addAll(accessModifiers);
      return this;
    }
    
    public DataBuilder parameter(String parameter) {
      if(parameters == null) {
        parameters = new ArrayList<>();
      }
      parameters.add(parameter);
      return this;
    }
    
    public DataBuilder parameters(List<String> parameters) {
      if(this.parameters == null) {
        this.parameters = new ArrayList<>();
      }
      this.parameters.addAll(parameters);
      return this;
    }
    
    public Data build() {
      Set<String> uniqueAccessModifiers = accessModifiers.stream()
              .map(AccessModifier::toString)
              .collect(Collectors.toSet());
      
      if(uniqueAccessModifiers.size() != accessModifiers.size()) {
        throw new IllegalArgumentException("There cannot be duplicate access modifiers");
      }
      
      return new Data(this.type, this.returnType, this.accessModifiers, this.parameters);
    }
  }
}
