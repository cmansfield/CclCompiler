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
  
  static String generateId(SymbolKind symbolKind) {
    indexes.put(symbolKind, indexes.get(symbolKind) + 1);
    return String.format("%S%05d", symbolKind.getPrefix(), indexes.get(symbolKind));
  }
}
