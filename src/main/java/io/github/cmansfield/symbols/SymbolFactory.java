package io.github.cmansfield.symbols;

import io.github.cmansfield.symbols.data.Data;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;


public class SymbolFactory {
  private static final Logger LOGGER = LoggerFactory.getLogger(SymbolFactory.class);
  
  private SymbolFactory() {
  }
  
  public static Symbol getSymbol(String identifier, SymbolKind symbolKind, String scope, Data data) {
    Symbol.SymbolBuilder symbolBuilder = new Symbol().new SymbolBuilder()
            .scope(scope)
            .text(identifier)
            .symbolKind(symbolKind)
            .data(data);
    
    Symbol symbol = symbolBuilder.build();
    if(symbol == null) {
      String message = "Could not create a symbol at this time";
      LOGGER.error(message);
      throw new IllegalStateException(message);
    }
    
    return symbol;
  }
}
