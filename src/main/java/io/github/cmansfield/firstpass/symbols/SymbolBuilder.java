package io.github.cmansfield.firstpass.symbols;

import io.github.cmansfield.firstpass.symbols.data.Data;

public class SymbolBuilder {
  private String scope;
  private String symbolId;
  private String text;
  private SymbolKind symbolKind;
  private Data data;


  public SymbolBuilder scope(String scope) {
    this.scope = scope;
    return this;
  }

  public SymbolBuilder symbolId(String symbolId) {
    this.symbolId = symbolId;
    return this;
  }

  public SymbolBuilder text(String text) {
    this.text = text;
    return this;
  }

  public SymbolBuilder symbolKind(SymbolKind symbolKind) {
    this.symbolKind = symbolKind;
    return this;
  }

  public SymbolBuilder data(Data data) {
    this.data = data;
    return this;
  }

  public Symbol build() {
    if(this.data == null) {
      this.data = new Data();
    }

    return new Symbol(this.scope, this.symbolId, this.text, this.symbolKind, this.data);
  }
}
