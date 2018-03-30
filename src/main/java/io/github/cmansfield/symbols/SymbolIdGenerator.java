package io.github.cmansfield.symbols;

class SymbolIdGenerator {
  private static int id = 1;
  
  private SymbolIdGenerator() {}
  
  static String generateId(SymbolKind symbolKind) {
    return String.format("%S%05d", symbolKind.getPrefix(), id++);
  }
}
