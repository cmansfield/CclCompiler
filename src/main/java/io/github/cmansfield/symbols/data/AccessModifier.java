package io.github.cmansfield.symbols.data;

import org.apache.commons.lang3.StringUtils;

public enum AccessModifier {
  PUBLIC("public"),
  PROJECT(""),
  PRIVATE("private"),
  STATIC("static"),
  CONST("const");
  
  private final String value;
  
  private AccessModifier(String value) {
    this.value = value;
  }
  
  public static AccessModifier find(String val) {
    if(StringUtils.isBlank(val)) {
      return null;
    }
    for(AccessModifier accessModifier : AccessModifier.class.getEnumConstants()) {
      if(val.equals(accessModifier.toString())) {
        return accessModifier;
      }
    }
    return null;
  }

  @Override
  public String toString() {
    return value;
  }
}
