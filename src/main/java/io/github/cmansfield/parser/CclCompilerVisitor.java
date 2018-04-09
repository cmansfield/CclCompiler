package io.github.cmansfield.parser;

import io.github.cmansfield.parser.language.CclGrammarBaseVisitor;
import io.github.cmansfield.firstpass.symbols.SymbolIdGenerator;
import io.github.cmansfield.firstpass.symbols.SymbolKind;
import io.github.cmansfield.firstpass.symbols.data.Data;
import io.github.cmansfield.firstpass.symbols.Symbol;
import org.apache.commons.collections4.BidiMap;

public abstract class CclCompilerVisitor extends CclGrammarBaseVisitor {
  protected static final String GLOBAL_SCOPE = "g";
  protected BidiMap<String, Symbol> symbols;
  protected String scope;

  protected CclCompilerVisitor() {}

  protected CclCompilerVisitor(BidiMap<String, Symbol> symbols, String packageName) {
    String packageId = SymbolIdGenerator.generateId(SymbolKind.PACKAGE);
    scope = GLOBAL_SCOPE + "." + packageId;
    this.symbols = symbols;
    addNewSymbol(packageName, SymbolKind.PACKAGE, GLOBAL_SCOPE, new Data(), packageId);
  }

  public BidiMap<String, Symbol> getSymbols() {
    return symbols;
  }

  protected Symbol addNewSymbol(String identifier, SymbolKind symbolKind, String scope, Data data) {
    return addNewSymbol(identifier, symbolKind, scope, data, SymbolIdGenerator.generateId(symbolKind));
  }

  /**
   * Will create and add a new Symbol to the symbol table based on the supplied parameters
   *
   * @param identifier  The token's text
   * @param symbolKind  The type of symbol being created
   * @param scope       The scope where this symbol belongs
   * @param data        A Data object with more detailed information about the symbol
   * @param symbolId    A unique identifier for the symbol
   * @return            The newly created symbol or if it's a duplicate it will return the
   *                    original symbol object from the symbol table
   */
  protected Symbol addNewSymbol(String identifier, SymbolKind symbolKind, String scope, Data data, String symbolId) {
    Symbol.SymbolBuilder symbolBuilder = new Symbol().new SymbolBuilder()
            .scope(scope)
            .text(identifier)
            .symbolKind(symbolKind)
            .data(data);
    Symbol symbol = symbolBuilder.build();

    if(symbols.containsValue(symbol)) {
      if(symbol.getSymbolKind().isLiteral()) {
        return symbols.get(symbols.getKey(symbol));
      }
      throw new IllegalStateException(String.format("There is already a %s with the name %s defined in the scope %s",
              symbol.getSymbolKind().toString(), symbol.getText(), symbol.getScope()));
    }
    symbol.setSymbolId(symbolId);
    symbols.put(symbol.getSymbolId(), symbol);

    return symbol;
  }
}
