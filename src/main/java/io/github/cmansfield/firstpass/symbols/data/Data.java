package io.github.cmansfield.firstpass.symbols.data;

import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.collections4.CollectionUtils;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.apache.commons.lang3.StringUtils;

import java.util.stream.Collectors;
import java.util.*;


@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Data {
  private String type;
  private String returnType;
  private List<AccessModifier> accessModifiers;
  private List<String> templatePlaceHolders;
  private List<String> parameters;
  private boolean isArray = false;

  public Data() {}

  Data(final String type, final String returnType, List<AccessModifier> accessModifiers, List<String> parameters, boolean isArray, List<String> templatePlaceHolders) {
    this.type = type;
    this.returnType = returnType;
    this.accessModifiers = accessModifiers;
    this.parameters = parameters;
    this.isArray = isArray;
    this.templatePlaceHolders = templatePlaceHolders;
  }
  
  public Optional<String> getType() {
    return StringUtils.isBlank(type) ? Optional.empty() : Optional.of(type);
  }

  public Optional<String> getReturnType() {
    return StringUtils.isBlank(returnType) ? Optional.empty() : Optional.of(returnType);
  }

  public List<AccessModifier> getAccessModifiers() {
    return accessModifiers == null ? Collections.emptyList() : accessModifiers;
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
            .append(getAccessModifiers().toString())
            .append(parameters)
            .append(templatePlaceHolders)
            .append(isArray)
            .toHashCode();
  }
}
