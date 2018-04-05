package io.github.cmansfield.symbols;

public enum SymbolKind {
  MAIN("X"),
  CLASS("C"),
  METHOD("M"),
  CONSTRUCTOR("N"),
  PARAM("P"),
  FVAR("V"),      // Class Field / Instance variable
  LVAR("L"),      // Local variable
  ILIT("I"),      // Integer literal
  CLIT("A"),      // Character literal
  SLIT("S"),      // String literal
  TEMPLATE_CLASS("T"),
  TEMPLATE_METHOD("K"),
  FOR("F"),
  BLOCK("B"),
  UNKNOWN("U");
  
  private String prefix;
  
  private SymbolKind(String prefix) {
    this.prefix = prefix;
  }
  
  public String getPrefix() {
    return prefix;
  }
}
