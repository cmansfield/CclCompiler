package io.github.cmansfield.firstpass.symbols.data;

public enum AccessModifier {
  PUBLIC("public"),
  PROJECT(""),
  PRIVATE("private"),
  STATIC("static"),
  CONST("const");
  
  private final String value;
  
  AccessModifier(String value) {
    this.value = value;
  }

  /**
   * Find the AccessModifier those string value matches the supplied String
   * 
   * @param val AccessModifier to find
   * @return    A found AccessModifier or null if not found
   */
  public static AccessModifier find(String val) {
    if(val == null) {
      return null;
    }
    for(AccessModifier accessModifier : AccessModifier.class.getEnumConstants()) {
      if(val.equalsIgnoreCase(accessModifier.toString())) {
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
