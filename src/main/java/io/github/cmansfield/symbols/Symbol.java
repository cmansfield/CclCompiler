package io.github.cmansfield.symbols;

import org.apache.commons.lang3.builder.HashCodeBuilder;
import io.github.cmansfield.symbols.data.Data;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.util.Optional;


public class Symbol {
  private static final Logger LOGGER = LoggerFactory.getLogger(Symbol.class);
  private String scope;
  private String symbolId;
  private String text;
  private SymbolKind symbolKind;
  private Data data;
  
  Symbol() {}
  
  private Symbol(String scope, String symbolId, String text, SymbolKind symbolKind, Data data) {
    this.scope = scope;
    this.symbolId = symbolId;
    this.text = text;
    this.symbolKind = symbolKind;
    this.data = data;
  }
  
  public String getScope() {
    return scope == null ? "" : scope;
  }

  public String getSymbolId() {
    return symbolId == null ? "" : symbolId;
  }
  
  public void setSymbolId(String symbolId) {
    this.symbolId = symbolId;
  }

  public String getText() {
    return text == null ? "" : text;
  }

  public SymbolKind getSymbolKind() {
    return symbolKind == null ? SymbolKind.UNKNOWN : symbolKind;
  }

  public Optional<Data> getData() {
    return data == null ? Optional.empty() : Optional.of(data);
  }

  @Override
  public boolean equals(Object obj) {
    if(obj == null) {
      return false;
    }
    if(this == obj) {
      return true;
    }
    if(!(obj instanceof Symbol)) {
      return false;
    }
    Symbol symbol = (Symbol) obj;

    if(this.symbolKind != symbol.symbolKind) {
      return false;
    }
    
    if(this.scope == null) {
      if(symbol.scope != null) {
        return false;
      }
    }
    else if(!this.scope.equals(symbol.scope)) {
      return false;
    }
    
    if(this.text == null) {
      if(symbol.text != null) {
        return false;
      }
    }
    else if(!this.text.equals(symbol.text)) {
      return false;
    }

    if(this.data == null) { 
      return symbol.data == null;
    }
    
    return this.data.equals(symbol.data);
  }

  @Override
  public int hashCode() {
    // Not including the symbolId in this check
    return new HashCodeBuilder(17, 37)
            .append(scope)
            .append(text)
            .append(symbolKind.toString())
            .append(data.hashCode())
            .toHashCode();
  }

  @Override
  public String toString() {
    return String.format("(%s scope: %s)", text, scope);
  }

  
  class SymbolBuilder {
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
      if(this.symbolKind == null || this.symbolKind == SymbolKind.UNKNOWN) {
        LOGGER.error("Symbol {}'s kind is either null or UNKNOWN, it must have a known value", this.symbolId);
        return null;
      }
      if(StringUtils.isEmpty(this.text)) {
        LOGGER.warn("Symbol text for symbol {} is empty", this.symbolId);
      }
      if(this.data == null) {
        this.data = new Data();
      }

      return new Symbol(this.scope, this.symbolId, this.text, this.symbolKind, this.data);
    }
  }
}
