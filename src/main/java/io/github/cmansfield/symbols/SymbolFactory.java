package io.github.cmansfield.symbols;

import io.github.cmansfield.symbols.data.Data;
import org.antlr.v4.runtime.ParserRuleContext;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;


public class SymbolFactory {
  private static final Logger LOGGER = LoggerFactory.getLogger(SymbolFactory.class);
  private SymbolTableVisitor symbolTableListener;
  
  public SymbolFactory(SymbolTableVisitor symbolTableVisitor) {
    this.symbolTableListener = symbolTableVisitor;
  }
  
  public Symbol getSymbol(String identifier, SymbolKind symbolKind, Data data) {
    Symbol.SymbolBuilder symbolBuilder = new Symbol().new SymbolBuilder()
            .scope(symbolTableListener.getScope())
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
