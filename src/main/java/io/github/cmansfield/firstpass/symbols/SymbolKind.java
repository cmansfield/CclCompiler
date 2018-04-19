package io.github.cmansfield.firstpass.symbols;

import org.apache.commons.lang3.StringUtils;

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
  BOOL_LIT("G"),          // Boolean literal
  SPECIAL_LIT("E"),       // Special literals (null)
  FOR("F"),
  BLOCK("B"),
  PACKAGE("D"),
  REFERENCE("R"),
  UNKNOWN("U");
  
  private String prefix;
  
  SymbolKind(String prefix) {
    this.prefix = prefix;
  }
  
  public String getPrefix() {
    return prefix;
  }

  /**
   * Checks to see if the SymbolKind instance is a literal or not
   * Literals are: integers, characters, and strings
   * 
   * @return Boolean, true is the SymbolKind is a literal
   */
  public boolean isLiteral() {
    if(this.name().equals(INT_LIT.toString())) {
      return true;
    }
    if(this.name().equals(CHAR_LIT.toString())) {
      return true;
    }
    if(this.name().equals(BOOL_LIT.toString())) {
      return true;
    }
    if(this.name().equals(SPECIAL_LIT.toString())) {
      return true;
    }
    return this.name().equals(STR_LIT.toString());
  }

  /**
   * This will return a SymbolKind object that matches the string value passed in
   * 
   * @param value The string value of the SymbolKind to search for
   * @return      A SymbolKind objec that matches the value passed in
   */
  public static SymbolKind find(String value) {
    if(StringUtils.isBlank(value)) {
      return SymbolKind.UNKNOWN;
    }
    for(SymbolKind symbolKind : SymbolKind.class.getEnumConstants()) {
      if(symbolKind.toString().equalsIgnoreCase(value)) {
        return symbolKind;
      }
    }

    return SymbolKind.UNKNOWN;
  }
}
