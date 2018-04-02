package io.github.cmansfield.symbols;

import io.github.cmansfield.language.recognition.CclGrammarBaseVisitor;
import io.github.cmansfield.language.recognition.CclGrammarParser;
import io.github.cmansfield.symbols.data.AccessModifier;
import io.github.cmansfield.symbols.data.Data;
import org.antlr.v4.runtime.ParserRuleContext;
import org.apache.commons.collections4.CollectionUtils;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.util.*;
import java.util.stream.Collectors;


public class SymbolTableVisitor extends CclGrammarBaseVisitor {
  private static final Logger LOGGER = LoggerFactory.getLogger(SymbolTableVisitor.class);
  private SymbolFactory symbolFactory;
  private Map<String, Symbol> symbols;
  private String scope;
  
  public SymbolTableVisitor() {
    scope = "";
    symbols = new HashMap<>();
    symbolFactory = new SymbolFactory(this);
  }

  public String getScope() {
    return scope;
  }

  public Map<String, Symbol> getSymbols() {
    return symbols == null ? Collections.emptyMap() : symbols;
  }
  
  @Override
  public Object visitMethodDeclaration(CclGrammarParser.MethodDeclarationContext ctx) {
    // TODO - get template declaration
    List<AccessModifier> accessModifiers = SymbolTableUtils.getAccessModifiers(ctx, this);
    String returnType = SymbolTableUtils.getReturnType(ctx, this);
    List<String> parameters = SymbolTableUtils.getParameters(ctx, this);
    String name = SymbolTableUtils.getName(ctx, this);
    
    Data data = new Data("", returnType, accessModifiers.get(0), parameters);
    addNewSymbol(name, SymbolKind.METHOD, data);

    CclGrammarParser.MethodBodyContext methodBodyContext = ctx.children.stream()
            .filter(node -> node instanceof CclGrammarParser.MethodBodyContext)
            .map(context -> (CclGrammarParser.MethodBodyContext)context)
            .findFirst()
            .orElse(null);
    visitMethodBody(methodBodyContext);

    return null;
  }

  @Override
  public Object visitModifier(CclGrammarParser.ModifierContext ctx) {
    if(CollectionUtils.isEmpty(ctx.children)) {
      throw new IllegalArgumentException("No children found in context");
    }
  
    return AccessModifier.find(ctx.children.get(0).getText());
  }

  @Override
  public Object visitType(CclGrammarParser.TypeContext ctx) {
    return getChildText(ctx);
  }

  @Override
  public Object visitParameterList(CclGrammarParser.ParameterListContext ctx) {
    return ctx.children.stream()
            .filter(node -> node instanceof CclGrammarParser.ParameterContext)
            .map(node -> (CclGrammarParser.ParameterContext)node)
            .map(this::visitParameter)
            .map(val -> (String)val)
            .collect(Collectors.toList());
  }

  @Override
  public Object visitParameter(CclGrammarParser.ParameterContext ctx) {
    // TODO - Complete this
    return SymbolIdGenerator.generateId(SymbolKind.PARAM);
  }

  @Override
  public Object visitName(CclGrammarParser.NameContext ctx) {
    return getChildText(ctx);
  }
  
  private void addNewSymbol(String identifier, SymbolKind symbolKind, Data data) {
    Symbol symbol = symbolFactory.getSymbol(identifier, symbolKind, data);

    if(symbols.containsValue(symbol)) {
      return;
    }
    symbol.setSymbolId(SymbolIdGenerator.generateId(symbolKind));

    symbols.put(symbol.getSymbolId(), symbol);
  }

  private String getChildText(ParserRuleContext ctx) {
    if(CollectionUtils.isEmpty(ctx.children)) {
      throw new IllegalArgumentException("No children found in context");
    }

    return ctx.children.get(0).getText();
  }
}
