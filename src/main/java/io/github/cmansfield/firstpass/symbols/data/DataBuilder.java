package io.github.cmansfield.firstpass.symbols.data;

import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
