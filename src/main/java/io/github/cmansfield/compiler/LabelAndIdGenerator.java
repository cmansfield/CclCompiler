package io.github.cmansfield.compiler;

import io.github.cmansfield.firstpass.symbols.SymbolKind;

import java.util.EnumMap;
import java.util.Map;

public class LabelAndIdGenerator {
  private final Map<SymbolKind, Integer> indexes;

  public LabelAndIdGenerator() {
    indexes = new EnumMap<>(SymbolKind.class);
    for(SymbolKind key : SymbolKind.class.getEnumConstants()) {
      indexes.put(key, 0);
    }
  }

  /**
   * Generates a unique symbol ID based on the type of Symbol
   * 
   * @param symbolKind  The type of symbol being produced
   * @return            A String value of the new symbol ID
   */
  public String generateId(SymbolKind symbolKind) {
    indexes.put(symbolKind, indexes.get(symbolKind) + 1);
    return String.format("%S%05d", symbolKind.getPrefix(), indexes.get(symbolKind));
  }
}
