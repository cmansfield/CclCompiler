package io.github.cmansfield.symbols;

public enum SymbolKind {
  MAIN("X"),
  CLASS("K"),
  METHOD("M"),
  CONSTRUCTOR("N"),
  PARAM("P"),
  FVAR("F"),      // Class Field / Instance variable
  LVAR("L"),      // Local variable
  ILIT("I"),      // Integer literal
  CLIT("C"),      // Character literal
  SLIT("S"),      // String literal
  TEMPLATE("T"),
  UNKNOWN("U");
  
  private String prefix;
  
  private SymbolKind(String prefix) {
    this.prefix = prefix;
  }
  
  public String getPrefix() {
    return prefix;
  }
}
