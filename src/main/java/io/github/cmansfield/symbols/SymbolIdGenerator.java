package io.github.cmansfield.symbols;

import java.util.EnumMap;
import java.util.Map;

class SymbolIdGenerator {
  private static Map<SymbolKind, Integer> indexes;

  static {
    indexes = new EnumMap<>(SymbolKind.class);
    for(SymbolKind key : SymbolKind.class.getEnumConstants()) {
      indexes.put(key, 0);
    }
  }

  private SymbolIdGenerator() {}

  /**
   * Generates a unique symbol ID based on the type of Symbol
   * 
   * @param symbolKind  The type of symbol being produced
   * @return            A String value of the new symbol ID
   */
  static String generateId(SymbolKind symbolKind) {
    indexes.put(symbolKind, indexes.get(symbolKind) + 1);
    return String.format("%S%05d", symbolKind.getPrefix(), indexes.get(symbolKind));
  }
}
