package io.github.cmansfield.parser;

import io.github.cmansfield.parser.language.CclGrammarBaseVisitor;
import io.github.cmansfield.firstpass.symbols.SymbolIdGenerator;
import io.github.cmansfield.parser.language.CclGrammarParser;
import io.github.cmansfield.firstpass.symbols.SymbolKind;
import io.github.cmansfield.firstpass.symbols.data.Data;
import org.apache.commons.collections4.CollectionUtils;
import io.github.cmansfield.firstpass.symbols.Symbol;
import org.apache.commons.collections4.BidiMap;
import org.antlr.v4.runtime.ParserRuleContext;

public abstract class CclCompilerVisitor extends CclGrammarBaseVisitor {
  protected static final String GLOBAL_SCOPE = "g";
  protected BidiMap<String, Symbol> symbols;
  protected String scope;

  protected CclCompilerVisitor(BidiMap<String, Symbol> symbols) {
    this.symbols = symbols;
  }
  
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

  /**
   * This will get the children from the context and then check for any array nodes 
   * and return true if any are found
   *
   * @param ctx     The current context to search for any array nodes
   * @return        Boolean, if array nodes were found
   */
  protected boolean isArray(ParserRuleContext ctx) {
    return ctx.children.stream()
            .filter(node -> node instanceof CclGrammarParser.ArrayOperatorContext)
            .count() > 0;
  }

  /**
   * This will get the children from the context and then traverse any type nodes and
   * return a String
   *
   * @param ctx     The current context to search for type nodes
   * @return        A String of the found type
   */
  protected String getType(ParserRuleContext ctx) {
    return getReturnType(ctx);
  }

  /**
   * This will get the children from the context and then traverse any type nodes and
   * return a String
   *
   * @param ctx     The current context to search for type nodes
   * @return        A String of the found type
   */
  protected String getReturnType(ParserRuleContext ctx) {
    if(ctx == null) {
      return null;
    }

    return ctx.children.stream()
            .filter(node -> node instanceof CclGrammarParser.TypeContext)
            .map(context -> (CclGrammarParser.TypeContext)context)
            .map(this::visitType)
            .map(val -> (String)val)
            .findFirst()
            .orElse(null);
  }

  /**
   * This will get the children from the context and then traverse any name nodes 
   * and return the name if found
   *
   * @param ctx     The current context to search for any name nodes
   * @return        The name of the node if found, null if not
   */
  protected String getName(ParserRuleContext ctx) {
    if(ctx == null) {
      return null;
    }
    
    return ctx.children.stream()
            .filter(node -> node instanceof CclGrammarParser.NameContext)
            .map(context -> (CclGrammarParser.NameContext)context)
            .map(this::visitName)
            .map(val -> (String)val)
            .findFirst()
            .orElse(null);
  }

  /**
   * This will get the children from the context and then traverse any assignment expression nodes 
   *
   * @param ctx     The current context to search for any assignment expression nodes
   */
  protected void visitAssignmentExpression(ParserRuleContext ctx) {
    ctx.children.stream()
            .filter(node -> node instanceof CclGrammarParser.AssignmentExpressionContext)
            .map(context -> (CclGrammarParser.AssignmentExpressionContext)context)
            .forEach(this::visitAssignmentExpression);
  }

  /**
   * Gets the text from the first child in the context
   *
   * @param ctx The current context to get the child's text from 
   * @return    The text of the first child
   */
  protected String getChildText(ParserRuleContext ctx) {
    if(CollectionUtils.isEmpty(ctx.children)) {
      throw new IllegalArgumentException("No children found in context");
    }

    return ctx.children.get(0).getText();
  }

  /**
   * This will get the children from the context and then traverse any class name nodes 
   * and return a class name if found
   *
   * @param ctx     The current context to search for any class name nodes
   * @return        The class name if found, null if not
   */
  protected String getClassName(ParserRuleContext ctx) {
    if(ctx == null) {
      return null;
    }

    return ctx.children.stream()
            .filter(node -> node instanceof CclGrammarParser.ClassNameContext)
            .map(context -> (CclGrammarParser.ClassNameContext)context)
            .map(this::visitClassName)
            .map(val -> (String)val)
            .findFirst()
            .orElse(null);
  }
  
  @Override
  public Object visitType(CclGrammarParser.TypeContext ctx) {
    return getChildText(ctx);
  }

  @Override
  public Object visitName(CclGrammarParser.NameContext ctx) {
    return getChildText(ctx);
  }

  @Override
  public Object visitClassName(CclGrammarParser.ClassNameContext ctx) {
    return getChildText(ctx);
  }
}
