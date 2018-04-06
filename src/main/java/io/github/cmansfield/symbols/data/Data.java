package io.github.cmansfield.symbols.data;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.StringUtils;

import java.util.stream.Collectors;
import java.util.*;


public class Data {
  private String type;
  private String returnType;
  private List<AccessModifier> accessModifiers;
  private List<String> templatePlaceHolders;
  private List<String> parameters;
  private boolean isArray = false;
  
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

  public Data(final String type, final String returnType, List<AccessModifier> accessModifiers, List<String> parameters, boolean isArray) {
    this(type, returnType, accessModifiers, parameters);
    this.isArray = isArray;
  }

  public Data(final String type, final String returnType, List<AccessModifier> accessModifiers, List<String> parameters, boolean isArray, List<String> templatePlaceHolders) {
    this(type, returnType, accessModifiers, parameters, isArray);
    this.templatePlaceHolders = templatePlaceHolders;
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
    return parameters == null ? Collections.emptyList() : parameters;
  }

  public List<String> getTemplatePlaceHolders() {
    return templatePlaceHolders == null ? Collections.emptyList() : templatePlaceHolders;
  }
  
  public boolean isTypeAnArray() {
    return isArray;
  }
  
  @Override
  public String toString() {
    return String.format(
            "%s%s%s%s%s%s",
            CollectionUtils.isEmpty(templatePlaceHolders) ?
                    "" :
                    "TemplatePlaceHolders:" + getTemplatePlaceHolders().stream()
                            .collect(Collectors.joining(" ")) + " ",
            CollectionUtils.isEmpty(accessModifiers) ? 
                    "" :
                    "AccessModifiers:" + getAccessModifiers().stream()
                      .map(AccessModifier::toString)
                      .collect(Collectors.joining(" ")),
            StringUtils.isBlank(type) ? "" : " Type:" + type, 
            isArray ? " isTypeAnArray:true" : "",
            StringUtils.isBlank(returnType) ? "" : " ReturnType:" + returnType,
            CollectionUtils.isEmpty(parameters) ? 
                    "" :
                    " Parameters:" + getParameters().stream()
                            .collect(Collectors.joining(" ")));
  }
  
  @Override
  public boolean equals(Object obj) {     // NOSONAR
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

    if(this.isArray != data.isArray) {
      return false;
    }
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
    if(this.accessModifiers != null) {
      if(this.accessModifiers.size() != data.accessModifiers.size()) {
        return false;
      }
      Collections.sort(this.accessModifiers);
      Collections.sort(data.accessModifiers);
      if(!this.accessModifiers.equals(data.accessModifiers)) {
        return false;
      }
    }

    if(this.templatePlaceHolders != null) {
      if(!this.templatePlaceHolders.equals(data.templatePlaceHolders)) {
        return false;
      }
    }
    else if(data.templatePlaceHolders != null) {
      return false;
    }
    
    List<String> lhsParameters = this.getParameters();
    List<String> rhsParameters = data.getParameters();
    if(lhsParameters.size() != rhsParameters.size()) {
      return false;
    }
    Collections.sort(lhsParameters);
    Collections.sort(rhsParameters);

    return lhsParameters.equals(rhsParameters);
  }

  @Override
  public int hashCode() {
    return new HashCodeBuilder(17, 37)
            .append(type)
            .append(returnType)
            .append(accessModifiers.toString())
            .append(parameters)
            .append(templatePlaceHolders)
            .append(isArray)
            .toHashCode();
  }
  
  
  public class DataBuilder {
    private String type;
    private String returnType;
    private List<AccessModifier> accessModifiers;
    private List<String> templatePlaceHolders;
    private List<String> parameters;
    private boolean isArray = false;

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
    
    public DataBuilder templatePlaceHolder(String templatePlaceHolder) {
      if(this.templatePlaceHolders == null) {
        this.templatePlaceHolders = new ArrayList<>();
      }
      this.templatePlaceHolders.add(templatePlaceHolder);
      return this;
    }
    
    public DataBuilder templatePlaceHolders(List<String> templatePlaceHolders) {
      if(this.templatePlaceHolders == null) {
        this.templatePlaceHolders = new ArrayList<>();
      }
      this.templatePlaceHolders.addAll(templatePlaceHolders);
      return this;
    }
    
    public DataBuilder isTypeAnArray(boolean isArray) {
      this.isArray = isArray;
      return this;
    }
    
    public Data build() {
      if(accessModifiers != null) {
        Set<String> uniqueAccessModifiers = accessModifiers.stream()
                .map(AccessModifier::toString)
                .collect(Collectors.toSet());

        if(uniqueAccessModifiers.size() != accessModifiers.size()) {
          throw new IllegalArgumentException("There cannot be duplicate access modifiers");
        }
        if(accessModifiers.contains(AccessModifier.PRIVATE) && accessModifiers.contains(AccessModifier.PUBLIC)) {
          throw new IllegalArgumentException("Cannot be both 'private' and 'public' at the same time");
        }
      }

      if(templatePlaceHolders != null) {
        Set<String> uniqueTemplatePlaceHolders = new HashSet<>(templatePlaceHolders);
        if(uniqueTemplatePlaceHolders.size() != templatePlaceHolders.size()) {
          throw new IllegalArgumentException("Each template place holder must be unique");
        }
      }

      return new Data(this.type, this.returnType, this.accessModifiers, this.parameters, this.isArray, this.templatePlaceHolders);
    }
  }
}
