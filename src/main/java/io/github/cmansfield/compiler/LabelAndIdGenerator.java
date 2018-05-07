package io.github.cmansfield.compiler;

import io.github.cmansfield.firstpass.symbols.SymbolKind;

import java.util.EnumMap;
import java.util.Map;

class LabelAndIdGenerator {
  private final Map<SymbolKind, Integer> indexes;
  private final Map<Label, Integer> labels;

  LabelAndIdGenerator() {
    indexes = new EnumMap<>(SymbolKind.class);
    for(SymbolKind key : SymbolKind.class.getEnumConstants()) {
      indexes.put(key, 0);
    }

    labels = new EnumMap<>(Label.class);
    for(Label key : Label.class.getEnumConstants()) {
      labels.put(key, 0);
    }
  }

  /**
   * Generates a unique symbol ID based on the type of Symbol
   * 
   * @param symbolKind  The type of symbol being produced
   * @return            A String value of the new symbol ID
   */
  String generateId(SymbolKind symbolKind) {
    indexes.put(symbolKind, indexes.get(symbolKind) + 1);
    return String.format("%s%05d", symbolKind.getPrefix(), indexes.get(symbolKind));
  }

  /**
   * This method will generate a unique label each time this method is called for
   * this object
   * 
   * @param label   The label type
   * @return        A unique label
   */
  String generateLabel(Label label) {
    labels.put(label, labels.get(label) + 1);
    return String.format("%05d_%s", labels.get(label), label.toString());
  }
}
