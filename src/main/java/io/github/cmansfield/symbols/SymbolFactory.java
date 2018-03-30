package io.github.cmansfield.symbols;

import io.github.cmansfield.language.recognition.SymbolTableListener;
import io.github.cmansfield.symbols.data.DataFactory;
import org.antlr.v4.runtime.ParserRuleContext;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;


public class SymbolFactory {
  private static final Logger LOGGER = LoggerFactory.getLogger(SymbolFactory.class);
  private SymbolTableListener symbolTableListener;
  
  public SymbolFactory(SymbolTableListener symbolTableListener) {
    this.symbolTableListener = symbolTableListener;
  }
  
  public Symbol getSymbol(SymbolKind symbolKind, ParserRuleContext ctx) {
    Symbol.SymbolBuilder symbolBuilder = new Symbol().new SymbolBuilder()
            .scope(symbolTableListener.getScope())
            .symbolId(SymbolIdGenerator.generateId(symbolKind))
            .text(ctx.getText())      // TODO - double check this, good chance ctx text won't be what I want here
            .symbolKind(symbolKind)
            .data(DataFactory.getData(ctx));
    
    Symbol symbol = symbolBuilder.build();
    if(symbol == null) {
      String message = "Could not create a symbol at this time";
      LOGGER.error(message);
      throw new IllegalStateException(message);
    }
    
    return symbol;
  }
}
