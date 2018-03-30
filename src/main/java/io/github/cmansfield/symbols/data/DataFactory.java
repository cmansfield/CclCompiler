package io.github.cmansfield.symbols.data;

import org.antlr.v4.runtime.ParserRuleContext;

public class DataFactory {

  private DataFactory() {}
  
  public static Data getData(ParserRuleContext ctx) {
    
    return new Data();
  }
}
