package io.github.cmansfield.symbols;

import io.github.cmansfield.language.recognition.CclGrammarBaseVisitor;
import io.github.cmansfield.language.recognition.CclGrammarParser;
import io.github.cmansfield.symbols.data.AccessModifier;
import org.apache.commons.collections4.CollectionUtils;
import io.github.cmansfield.symbols.data.Data;
import org.antlr.v4.runtime.ParserRuleContext;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.util.stream.Collectors;
import java.util.*;


public class SymbolTableVisitor extends CclGrammarBaseVisitor {
  private static final Logger LOGGER = LoggerFactory.getLogger(SymbolTableVisitor.class);
  private Map<String, Symbol> symbols;
  private String scope;
  
  public SymbolTableVisitor() {
    scope = "g.p0";
    symbols = new HashMap<>();
  }

  public String getScope() {
    return scope;
  }

  public Map<String, Symbol> getSymbols() {
    return symbols == null ? Collections.emptyMap() : symbols;
  }

  private Symbol addNewSymbol(String identifier, SymbolKind symbolKind, String scope, Data data) {
    Symbol symbol = SymbolFactory.getSymbol(identifier, symbolKind, scope, data);

    if(symbols.containsValue(symbol)) {
      return symbols.get(symbol);
    }
    symbol.setSymbolId(SymbolIdGenerator.generateId(symbolKind));
    symbols.put(symbol.getSymbolId(), symbol);

    return symbol;
  }

  private String getChildText(ParserRuleContext ctx) {
    if(CollectionUtils.isEmpty(ctx.children)) {
      throw new IllegalArgumentException("No children found in context");
    }

    return ctx.children.get(0).getText();
  }
  
  @Override
  public Object visitMethodDeclaration(CclGrammarParser.MethodDeclarationContext ctx) {
    // TODO - get template declaration
    String scopeOrig = scope;

    String name = SymbolTableUtils.getName(ctx, this);
    scope = scope + "." + name;
    
    List<AccessModifier> accessModifiers = SymbolTableUtils.getAccessModifiers(ctx, this);
    String returnType = SymbolTableUtils.getReturnType(ctx, this);
    List<String> parameters = SymbolTableUtils.getParameters(ctx, this);
    
    Data data = new Data("", returnType, accessModifiers, parameters);
    addNewSymbol(name, SymbolKind.METHOD, scopeOrig, data);

    SymbolTableUtils.visitMethodBody(ctx, this);
    scope = scopeOrig;
    
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
    if(ctx.children == null || ctx.children.size() != 2) {
      throw new IllegalArgumentException("Parameter has the wrong number of children nodes");
    }

    String type = ctx.children.get(0).getText();
    String name = ctx.children.get(1).getText();
    Data data = new Data(type, Collections.singletonList(AccessModifier.PRIVATE));
    Symbol symbol = addNewSymbol(name, SymbolKind.PARAM, scope, data);
    
    return symbol.getSymbolId();
  }

  @Override
  public Object visitName(CclGrammarParser.NameContext ctx) {
    return getChildText(ctx);
  }

  @Override
  public Object visitClassName(CclGrammarParser.ClassNameContext ctx) {
    return getChildText(ctx);
  }

  @Override
  public Object visitClassDeclaration(CclGrammarParser.ClassDeclarationContext ctx) {
    String name = SymbolTableUtils.getClassName(ctx, this);
    String scopeOrig = scope;
    scope = scope + "." + name;

    // TODO - get Template Declarations
    List<AccessModifier> accessModifiers = SymbolTableUtils.getAccessModifiers(ctx, this);
    Data data = new Data().new DataBuilder()
            .accessModifiers(accessModifiers)
            .build();
    addNewSymbol(name, SymbolKind.CLASS, scopeOrig, data);
    
    ctx.children.stream()
            .filter(node -> node instanceof CclGrammarParser.ClassMemberDeclarationContext)
            .map(context -> (CclGrammarParser.ClassMemberDeclarationContext)context)
            .forEach(this::visitClassMemberDeclaration);
    scope = scopeOrig;

    return null;
  }

  @Override
  public Object visitConstructorDeclaration(CclGrammarParser.ConstructorDeclarationContext ctx) {
    String name = SymbolTableUtils.getClassName(ctx, this);
    String scopeOrig = scope;
    scope = scope + "." + name;

    List<AccessModifier> accessModifiers = SymbolTableUtils.getAccessModifiers(ctx, this);
    List<String> parameters = SymbolTableUtils.getParameters(ctx, this);

    Data data = new Data().new DataBuilder()
            .accessModifiers(accessModifiers)
            .parameters(parameters)
            .build();
    addNewSymbol(name, SymbolKind.CONSTRUCTOR, scopeOrig, data);

    SymbolTableUtils.visitMethodBody(ctx, this);
    scope = scopeOrig;

    return null;
  }

  @Override
  public Object visitFieldDeclaration(CclGrammarParser.FieldDeclarationContext ctx) {
    String name = SymbolTableUtils.getName(ctx, this);
    List<AccessModifier> accessModifiers = SymbolTableUtils.getAccessModifiers(ctx, this);
    String type = SymbolTableUtils.getType(ctx, this);

    boolean isArray = ctx.children.stream()
            .filter(node -> node instanceof CclGrammarParser.ArrayOperatorContext)
            .count() > 0;

    Data data = new Data().new DataBuilder()
            .accessModifiers(accessModifiers)
            .type(type)
            .build();
    addNewSymbol(name, SymbolKind.FVAR, scope, data);

    return null;
  }
}
