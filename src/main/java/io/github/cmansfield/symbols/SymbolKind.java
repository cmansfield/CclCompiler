package io.github.cmansfield.symbols;

public enum SymbolKind {
  MAIN("X"),
  CLASS("K"),
  METHOD("M"),
  CONSTRUCTOR("N"),
  PARAM("P"),
  IVAR("O"),
  LVAR("L"),
  ILIT("I"),
  CLIT("C"),
  SLIT("S"),
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
