package io.github.cmansfield.symbols;

public enum SymbolKind {
  MAIN("X"),
  CLASS("C"),
  METHOD("M"),
  CONSTRUCTOR("N"),
  PARAM("P"),
  INSTANCE_VAR("V"),      // Class Field / Instance variable
  LOCAL_VAR("L"),         // Local variable
  INT_LIT("I"),           // Integer literal
  CHAR_LIT("A"),          // Character literal
  STR_LIT("S"),           // String literal
  TEMPLATE_CLASS("T"),
  TEMPLATE_METHOD("K"),
  FOR("F"),
  BLOCK("B"),
  PACKAGE("D"),
  UNKNOWN("U");
  
  private String prefix;
  
  private SymbolKind(String prefix) {
    this.prefix = prefix;
  }
  
  public String getPrefix() {
    return prefix;
  }
  
  public boolean isLiteral() {
    if(this.name().equals(INT_LIT.toString())) {
      return true;
    }
    if(this.name().equals(CHAR_LIT.toString())) {
      return true;
    }
    return this.name().equals(STR_LIT.toString());
  }
}
