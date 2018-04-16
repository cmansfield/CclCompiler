package io.github.cmansfield.parser;

import io.github.cmansfield.parser.language.CclGrammarBaseVisitor;
import org.apache.commons.collections4.bidimap.DualHashBidiMap;
import io.github.cmansfield.parser.language.CclGrammarParser;
import io.github.cmansfield.firstpass.symbols.data.Data;
import org.apache.commons.collections4.CollectionUtils;
import io.github.cmansfield.firstpass.symbols.*;
import org.apache.commons.collections4.BidiMap;
import org.antlr.v4.runtime.ParserRuleContext;
import org.apache.commons.lang3.StringUtils;
import org.antlr.v4.runtime.tree.ParseTree;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.util.List;


public abstract class CclCompilerVisitor extends CclGrammarBaseVisitor {
  private final Logger logger = LoggerFactory.getLogger(CclCompilerVisitor.class);
  public static final String GLOBAL_SCOPE = "g";
  protected BidiMap<String, Symbol> symbols;
  protected String scope;

  protected CclCompilerVisitor() {
    this.symbols = new DualHashBidiMap<>();
    this.scope = GLOBAL_SCOPE;
  }

  protected CclCompilerVisitor(BidiMap<String, Symbol> symbols) {
    this.symbols = symbols == null ? new DualHashBidiMap<>() : new DualHashBidiMap<>(symbols);
    this.scope = GLOBAL_SCOPE;
  }

  public BidiMap<String, Symbol> getSymbols() {
    return symbols;
  }

  /**
   * This will reset the scope to the new package and create a
   * new Symbol for the package if one does not already exist
   *
   * @param packageName The name of the next package to visit
   */
  public void resetToNewPackage(String packageName) {
    if(StringUtils.isBlank(packageName)) {
      throw new IllegalArgumentException("Package name cannot be blank");
    }

    String symbolId = findSymbolId(
            new SymbolBuilder()
                    .text(packageName)
                    .symbolKind(SymbolKind.PACKAGE)
                    .scope(GLOBAL_SCOPE)
                    .build(),
            false);

    if(StringUtils.isBlank(symbolId)) {
      symbolId = SymbolIdGenerator.generateId(SymbolKind.PACKAGE);
      addNewSymbol(packageName, SymbolKind.PACKAGE, GLOBAL_SCOPE, new Data(), symbolId);
    }
    scope = GLOBAL_SCOPE + "." + symbolId;
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
    SymbolBuilder symbolBuilder = new SymbolBuilder()
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
   * This will get the children from the context and then traverse any methodName nodes
   * and return the name if found
   *
   * @param ctx     The current context to search for any name nodes
   * @return        The name of the node if found, null if not
   */
  protected String getMethodName(ParserRuleContext ctx) {
    if(ctx == null) {
      return null;
    }

    return ctx.children.stream()
            .filter(node -> node instanceof CclGrammarParser.MethodNameContext)
            .map(context -> (CclGrammarParser.MethodNameContext)context)
            .map(this::visitMethodName)
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
    ParseTree child = ctx.children.get(0);
    String text = child.getText();
    if(text.charAt(0) == '\"' || text.charAt(0) == '\'') {
      return text.substring(1, text.length() - 1);
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

  /**
   * This method is used to find Symbols in the symbol table
   *
   * @param name        The Symbol text to find
   * @param symbolKind  The type of Symbol to find
   * @return            The found Symbol's ID
   */
  protected String findSymbolId(String name, SymbolKind symbolKind) {
    return findSymbolId(
            new SymbolBuilder()
                    .text(name)
                    .symbolKind(symbolKind)
                    .build(),
            true);
  }

  /**
   * This will find a Symbol that matches the supplied filter object
   *
   * @param filter      The Symbol object to match against
   * @param errorOnFail Should this method produce an error if a Symbol was not found?
   * @return            The ID of the found Symbol
   */
  protected String findSymbolId(Symbol filter, boolean errorOnFail) {
    List<Symbol> foundSymbols = SymbolFilter.filter(symbols, filter);
    if(foundSymbols.size() != 1 && errorOnFail) {
      String message = String.format("Could not find the symbol for %s", filter.toString());
      logger.error(message);
      throw new IllegalStateException(message);
    }

    return foundSymbols.isEmpty() ? null : foundSymbols.get(0).getSymbolId();
  }

  /**
   * This will get the children from the context and then traverse any method body nodes
   *
   * @param ctx     The current context to search for any method body nodes
   */
  protected void traverseMethodBody(ParserRuleContext ctx) {
    if(ctx == null || ctx.children == null) {
      return;
    }
    ctx.children.stream()
            .filter(node -> node instanceof CclGrammarParser.MethodBodyContext)
            .map(context -> (CclGrammarParser.MethodBodyContext)context)
            .forEach(this::visitMethodBody);
  }
}
