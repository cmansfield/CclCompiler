package io.github.cmansfield.symbols;

import io.github.cmansfield.parser.language.CclGrammarBaseVisitor;
import org.apache.commons.collections4.bidimap.DualHashBidiMap;
import io.github.cmansfield.parser.language.CclGrammarParser;
import io.github.cmansfield.symbols.data.AccessModifier;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.BidiMap;
import io.github.cmansfield.symbols.data.Data;
import org.antlr.v4.runtime.ParserRuleContext;
import org.apache.commons.lang3.StringUtils;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.stream.Collectors;
import java.util.*;


public class SymbolTableVisitor extends CclGrammarBaseVisitor {
  private static final String GLOBAL_SCOPE = "g";
  private BidiMap<String, Symbol> symbols;
  private String scope;

  
  public SymbolTableVisitor() {
    scope = GLOBAL_SCOPE;
    symbols = new DualHashBidiMap<>();
  }

  public SymbolTableVisitor(BidiMap<String, Symbol> symbols) {
    String packageId = SymbolIdGenerator.generateId(SymbolKind.PACKAGE);
    scope = GLOBAL_SCOPE + "." + packageId;
    this.symbols = symbols;
    addNewSymbol(packageId, SymbolKind.PACKAGE, GLOBAL_SCOPE, new Data(), packageId);
  }

  public String getScope() {
    return scope;
  }

  public BidiMap<String, Symbol> getSymbols() {
    return symbols;
  }

  private Symbol addNewSymbol(String identifier, SymbolKind symbolKind, String scope, Data data) {
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
  private Symbol addNewSymbol(String identifier, SymbolKind symbolKind, String scope, Data data, String symbolId) {
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

  /**
   * Gets the text from the first child in the context
   * 
   * @param ctx The current context to get the child's text from 
   * @return    The text of the first child
   */
  private String getChildText(ParserRuleContext ctx) {
    if(CollectionUtils.isEmpty(ctx.children)) {
      throw new IllegalArgumentException("No children found in context");
    }

    return ctx.children.get(0).getText();
  }
  
  @Override
  public Object visitMethodDeclaration(CclGrammarParser.MethodDeclarationContext ctx) {
    boolean isTemplate = SymbolTableUtils.isTemplate(ctx);
    SymbolKind symbolKind = isTemplate ? SymbolKind.TEMPLATE_METHOD : SymbolKind.METHOD;
    String symbolId = SymbolIdGenerator.generateId(symbolKind);
    String scopeOrig = scope;
    scope = scope + "." + symbolId;

    String name = SymbolTableUtils.getName(ctx, this);
    List<String> templatePlaceHolders = SymbolTableUtils.getTemplatePlaceHolders(ctx, this);
    List<AccessModifier> accessModifiers = SymbolTableUtils.getAccessModifiers(ctx, this);
    String returnType = SymbolTableUtils.getReturnType(ctx, this);
    List<String> parameters = SymbolTableUtils.getParameters(ctx, this);

    Data data = new Data().new DataBuilder()
            .returnType(returnType)
            .accessModifiers(accessModifiers)
            .parameters(parameters)
            .templatePlaceHolders(templatePlaceHolders)
            .build();
    addNewSymbol(
            name,
            symbolKind,
            scopeOrig,
            data,
            symbolId);

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
    String type = ctx.children.get(0).getText();
    String name = ctx.children.get(1).getText();
    boolean isArray = SymbolTableUtils.isArray(ctx);
    
    Data data = new Data().new DataBuilder()
            .type(type)
            .accessModifier(AccessModifier.PRIVATE)
            .isTypeAnArray(isArray)
            .build();
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
    SymbolKind symbolKind = SymbolTableUtils.isTemplate(ctx)
            ? SymbolKind.TEMPLATE_CLASS
            : SymbolKind.CLASS;
    String symbolId = SymbolIdGenerator.generateId(symbolKind);
    String scopeOrig = scope;
    scope = scope + "." + symbolId;

    String name = SymbolTableUtils.getClassName(ctx, this);
    List<String> templatePlaceHolders = SymbolTableUtils.getTemplatePlaceHolders(ctx, this);
    List<AccessModifier> accessModifiers = SymbolTableUtils.getAccessModifiers(ctx, this);
    Data data = new Data().new DataBuilder()
            .accessModifiers(accessModifiers)
            .templatePlaceHolders(templatePlaceHolders)
            .build();
    addNewSymbol(
            name,
            templatePlaceHolders.isEmpty()
                    ? SymbolKind.CLASS
                    : SymbolKind.TEMPLATE_CLASS,
            scopeOrig,
            data,
            symbolId);
    
    ctx.children.stream()
            .filter(node -> node instanceof CclGrammarParser.ClassMemberDeclarationContext)
            .map(context -> (CclGrammarParser.ClassMemberDeclarationContext)context)
            .forEach(this::visitClassMemberDeclaration);
    scope = scopeOrig;

    return null;
  }

  @Override
  public Object visitConstructorDeclaration(CclGrammarParser.ConstructorDeclarationContext ctx) {
    SymbolKind symbolKind = SymbolKind.CONSTRUCTOR;
    String symbolId = SymbolIdGenerator.generateId(symbolKind);
    String scopeOrig = scope;
    scope = scope + "." + symbolId;

    String name = SymbolTableUtils.getClassName(ctx, this);
    List<AccessModifier> accessModifiers = SymbolTableUtils.getAccessModifiers(ctx, this);
    List<String> parameters = SymbolTableUtils.getParameters(ctx, this);

    Data data = new Data().new DataBuilder()
            .accessModifiers(accessModifiers)
            .parameters(parameters)
            .build();
    addNewSymbol(name, SymbolKind.CONSTRUCTOR, scopeOrig, data, symbolId);

    SymbolTableUtils.visitMethodBody(ctx, this);
    scope = scopeOrig;

    return null;
  }

  @Override
  public Object visitFieldDeclaration(CclGrammarParser.FieldDeclarationContext ctx) {
    String name = SymbolTableUtils.getName(ctx, this);
    List<AccessModifier> accessModifiers = SymbolTableUtils.getAccessModifiers(ctx, this);
    String type = SymbolTableUtils.getType(ctx, this);
    boolean isArray = SymbolTableUtils.isArray(ctx);
                        
    Data data = new Data().new DataBuilder()
            .accessModifiers(accessModifiers)
            .type(type)
            .isTypeAnArray(isArray)
            .build();
    addNewSymbol(name, SymbolKind.INSTANCE_VAR, scope, data);

    SymbolTableUtils.visitAssignmentExpression(ctx, this);
    
    return null;
  }

  @Override
  public Object visitVariableDeclaration(CclGrammarParser.VariableDeclarationContext ctx) {
    String type = SymbolTableUtils.getType(ctx, this);
    String name = SymbolTableUtils.getName(ctx, this);
    boolean isArray = SymbolTableUtils.isArray(ctx);
    
    Data data = new Data().new DataBuilder()
            .accessModifier(AccessModifier.PRIVATE)
            .isTypeAnArray(isArray)
            .type(type)
            .build();
    addNewSymbol(name, SymbolKind.LOCAL_VAR, scope, data);

    SymbolTableUtils.visitAssignmentExpression(ctx, this);
    
    return null;
  }

  @Override
  public Object visitCompilationUnit(CclGrammarParser.CompilationUnitContext ctx) {
    SymbolKind symbolKind = SymbolKind.MAIN;
    String symbolId = SymbolIdGenerator.generateId(symbolKind);
    List<ParseTree> children = new ArrayList<>(ctx.children);

    for(ParseTree parseTree: children) {
      if(parseTree instanceof CclGrammarParser.MethodBodyContext) {
        List<AccessModifier> accessModifiers = SymbolTableUtils.getAccessModifiers(ctx, this);
        Data data = new Data().new DataBuilder()
                .returnType("void")
                .accessModifiers(accessModifiers)
                .build();
        addNewSymbol("main", SymbolKind.MAIN, scope, data, symbolId);
        
        String scopeOrig = scope;
        scope += "." + symbolId;         // NOSONAR - will only happen once
        parseTree.accept(this);
        scope = scopeOrig;
      }
      else {
        parseTree.accept(this);
      }
    }
    
    return null;
  }

  @Override
  public Object visitNumericliteral(CclGrammarParser.NumericliteralContext ctx) {
    ParseTree child = ctx.getChild(0);
    if(child == null) {
      throw new IllegalArgumentException("There are no child nodes");
    }
    String value = child.getText();
    Data data = new Data().new DataBuilder()
            .type("int")
            .accessModifier(AccessModifier.PUBLIC)
            .build();
    addNewSymbol(value, SymbolKind.INT_LIT, GLOBAL_SCOPE, data);
    
    return super.visitNumericliteral(ctx);
  }

  @Override
  public Object visitCharacterliteral(CclGrammarParser.CharacterliteralContext ctx) {
    ParseTree child = ctx.getChild(0);
    if(child == null) {
      throw new IllegalArgumentException("There should be at least one child node");
    }
    String value = child.getText();
    // Remove single quotes around the char
    value = value.substring(1, value.length() - 1);
    Data data = new Data().new DataBuilder()
            .type("char")
            .accessModifier(AccessModifier.PUBLIC)
            .build();
    addNewSymbol(value, SymbolKind.CHAR_LIT, GLOBAL_SCOPE, data);
    
    return super.visitCharacterliteral(ctx);
  }

  @Override
  public Object visitStringliteral(CclGrammarParser.StringliteralContext ctx) {
    ParseTree child = ctx.getChild(0);
    if(child == null) {
      throw new IllegalArgumentException("There should be at least one child node");
    }
    String value = child.getText();
    // Remove quotes around the string
    value = value.substring(1, value.length() - 1);
    Data data = new Data().new DataBuilder()
            .type("string")
            .accessModifier(AccessModifier.PUBLIC)
            .build();
    addNewSymbol(value, SymbolKind.STR_LIT, GLOBAL_SCOPE, data);

    return super.visitStringliteral(ctx);
  }

  @Override
  public Object visitTemplateDeclaration(CclGrammarParser.TemplateDeclarationContext ctx) {
    return ctx.children.stream()
            .filter(node -> node instanceof CclGrammarParser.TemplateListContext)
            .map(context -> (CclGrammarParser.TemplateListContext)context)
            .map(this::visitTemplateList)
            .findFirst()
            .orElse(Collections.emptyList());
  }

  @Override
  public Object visitTemplateList(CclGrammarParser.TemplateListContext ctx) {
    return ctx.children.stream()
            .filter(node -> !",".equals(node.getText()))
            .map(ParseTree::getText)
            .collect(Collectors.toList());
  }

  @Override
  public Object visitStatementWithScope(CclGrammarParser.StatementWithScopeContext ctx) {
    if(ctx.children == null || ctx.children.isEmpty()) {
      throw new IllegalArgumentException("There must be child nodes at this point in the tree");
    }
    SymbolKind symbolKind = SymbolKind.UNKNOWN;
    String symbolId;
    String scopeOrig = scope;
    ParseTree child = ctx.getChild(0);

    if("{".equals(child.getText())) {
      symbolKind = SymbolKind.BLOCK;
    }
    else if("for".equals(child.getText())) {
      symbolKind = SymbolKind.FOR;
    }
    
    if(symbolKind == SymbolKind.UNKNOWN) {
      throw new IllegalStateException(
              String.format("Unknown statement \"%s\" found", StringUtils.isBlank(child.getText()) ? "" : child.getText()));
    }

    symbolId = SymbolIdGenerator.generateId(symbolKind);
    scope += "." + symbolId;
    
    Data data = new Data().new DataBuilder().accessModifier(AccessModifier.PRIVATE).build();
    addNewSymbol(symbolId, symbolKind, scopeOrig, data, symbolId);
    
    super.visitStatementWithScope(ctx);
    scope = scopeOrig;
    
    return null;
  }
}
