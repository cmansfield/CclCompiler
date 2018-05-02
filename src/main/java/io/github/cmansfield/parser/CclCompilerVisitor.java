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

import java.util.stream.Collectors;
import java.util.*;


public abstract class CclCompilerVisitor extends CclGrammarBaseVisitor implements CompilerVisitor {
  public static final String GLOBAL_SCOPE = "g";
  protected final List<CclGrammarParser.ClassDeclarationContext> templateClassContexts;
  protected BidiMap<String, Symbol> symbols;
  protected String scope;

  protected CclCompilerVisitor() {
    this.templateClassContexts = new ArrayList<>();
    this.symbols = new DualHashBidiMap<>();
    this.scope = GLOBAL_SCOPE;
  }

  protected CclCompilerVisitor(BidiMap<String, Symbol> symbols) {
    this.symbols = symbols == null ? new DualHashBidiMap<>() : new DualHashBidiMap<>(symbols);
    this.templateClassContexts = new ArrayList<>();
    this.scope = GLOBAL_SCOPE;
  }

  protected CclCompilerVisitor(BidiMap<String, Symbol> symbols, List<CclGrammarParser.ClassDeclarationContext> templateClassContexts) {
    this.symbols = symbols == null ? new DualHashBidiMap<>() : new DualHashBidiMap<>(symbols);
    this.templateClassContexts = templateClassContexts == null ? new ArrayList<>() : templateClassContexts;
    this.scope = GLOBAL_SCOPE;
  }
  
  public BidiMap<String, Symbol> getSymbols() {
    return symbols;
  }

  public List<CclGrammarParser.ClassDeclarationContext> getTemplateClassContexts() {
    return templateClassContexts;
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
    Symbol symbol = new SymbolBuilder()
            .symbolKind(symbolKind)
            .text(symbolKind == SymbolKind.TEMPORARY ? symbolId : identifier)
            .scope(scope)
            .data(data)
            .build();

    if(symbolKind != SymbolKind.REFERENCE && symbols.containsValue(symbol)) {
      if(symbol.getSymbolKind().isLiteral()) {
        return symbols.get(symbols.getKey(symbol));
      }
      throw new IllegalStateException(String.format("There is already a %s with the name \'%s\' defined in the scope \'%s\'",
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
            .filter(node -> node instanceof CclGrammarParser.ArrayDeclarationContext)
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
   * This will get the children from the context and then traverse any template nodes and
   * return a String List with all of the found template placeholders
   *
   * @param ctx     The current context to search for any template nodes
   * @return        A String List of found template placeholders
   */
  protected List<String> getTemplatePlaceHolders(ParserRuleContext ctx) {
    return ctx.children.stream()
            .filter(node -> node instanceof CclGrammarParser.TemplateDeclarationContext)
            .map(context -> (CclGrammarParser.TemplateDeclarationContext)context)
            .map(this::visitTemplateDeclaration)
            .flatMap(val -> ((List<String>)val).stream())
            .collect(Collectors.toList());
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
   * This will get the children from the context and then traverse any assignment operation nodes
   *
   * @param ctx     The current context to search for any assignment expression nodes
   */
  protected void traverseAssignmentOperation(ParserRuleContext ctx) {
    ctx.children.stream()
            .filter(node -> node instanceof CclGrammarParser.AssignmentOperationContext)
            .map(context -> (CclGrammarParser.AssignmentOperationContext)context)
            .forEach(this::visitAssignmentOperation);
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
   * Get the method name or identifier name from the child node without
   * running the visitName or visitMethodName methods
   *
   * @param ctx The context to get child text from
   * @return    The child's name
   */
  protected String getNameWithoutVisiting(ParserRuleContext ctx) {
    if(ctx == null) {
      return null;
    }

    return ctx.children.stream()
            .filter(node -> node instanceof CclGrammarParser.NameContext
                    || node instanceof CclGrammarParser.MethodNameContext
                    || node instanceof CclGrammarParser.ClassNameContext)
            .map(context -> context.getChild(0).getText())
            .findFirst()
            .orElse(null);
  }

  /**
   * This will search for the Symbol ID of a given method name, type, and parameters
   *
   * @param name            The name of the method to search for
   * @param symbolKind      The type of method being searched for (constructor or method)
   * @param parameterTypes  The List of parameter types in the method signature 
   * @return                The Symbol ID of the found method
   */
  protected String findMethodSymbolId(String name, SymbolKind symbolKind, List<String> parameterTypes) {
    if(symbolKind != SymbolKind.METHOD && symbolKind != SymbolKind.CONSTRUCTOR) {
      throw new IllegalArgumentException("The Symbol type must be either a method or constructor");
    }
    if(parameterTypes == null) {
      throw new IllegalArgumentException("The parameter types list cannot be null");
    }

    Symbol filter = new SymbolBuilder()
            .symbolKind(symbolKind)
            .scope(scope)
            .text(name)
            .build();
    List<Symbol> foundMethods = SymbolFilter.filter(symbols, filter);
    foundMethods = foundMethods.stream()
            .filter(Objects::nonNull)
            .filter(symbol -> symbol.getData().getParameters().size() == parameterTypes.size())
            .filter(symbol ->
              symbol.getData().getParameters().stream()
                      .map(symbols::get)
                      .filter(Objects::nonNull)
                      .map(Symbol::getData)
                      .filter(Objects::nonNull)
                      .map(data -> data.getType().orElse(""))
                      .filter(StringUtils::isNotBlank)
                      .collect(Collectors.toList())
                  .equals(parameterTypes))
            .collect(Collectors.toList());
    if(CollectionUtils.isEmpty(foundMethods)) {
      throw new IllegalStateException(String.format(
              "Could not find %s \'%s\'",
              symbolKind.toString(),
              name));
    }
    if(foundMethods.size() > 1) {
      throw new IllegalStateException(String.format(
              "Found duplicate %ss in class \'%s\' with method signature \'%s\'",
              symbolKind.toString(),
              symbols.get(SymbolUtils.getParentSymbolId(scope)).getText(),
              String.format(
                      "%s(%s)",
                      name,
                      parameterTypes.stream()
                              .collect(Collectors.joining(", ")))));
    }

    return foundMethods.get(0).getSymbolId();
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
    if(foundSymbols.isEmpty() && errorOnFail) {
      throw new IllegalStateException(String.format("Could not find the symbol for %s", filter.toString()));
    }
    if(foundSymbols.size() > 1 && errorOnFail) {
      Symbol parentSymbol = symbols.get(SymbolUtils.getParentSymbolId(scope));
      throw new IllegalStateException(String.format(
              "Found too many matching %ss with the name \'%s\' in %s \'%s\'",
              filter.getSymbolKind().toString(),
              filter.getText(),
              parentSymbol.getSymbolKind().toString(),
              parentSymbol.getText()));
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

  /**
   * This will get the children from the context and then traverse any parameter list nodes
   *
   * @param ctx     The current context to search for any parameter list nodes
   */
  protected List<String> traverseParameterList(ParserRuleContext ctx) {
    if(ctx == null || ctx.children == null) {
      return Collections.emptyList();
    }
    return ctx.children.stream()
            .filter(node -> node instanceof CclGrammarParser.ParameterListContext)
            .map(context -> (CclGrammarParser.ParameterListContext)context)
            .map(this::visitParameterList)
            .map(value -> (List)value)
            .flatMap(Collection::stream)
            .map(value -> (String)value)
            .collect(Collectors.toList());
  }

  /**
   * This will get the children from the context and then check for any template nodes 
   * and return true if any are found
   *
   * @param ctx     The current context to search for any template nodes
   * @return        Boolean, if template nodes were found
   */
  protected boolean isTemplate(ParserRuleContext ctx) {
    return ctx.children.stream()
            .filter(node -> node instanceof CclGrammarParser.TemplateDeclarationContext)
            .map(context -> (CclGrammarParser.TemplateDeclarationContext)context)
            .count() > 0;
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
            .filter(node -> node instanceof CclGrammarParser.TemplatePlaceHolderContext)
            .map(context -> (CclGrammarParser.TemplatePlaceHolderContext)context)
            .map(this::visitTemplatePlaceHolder)
            .map(value -> (String)value)
            .collect(Collectors.toList());
  }

  @Override
  public Object visitTemplatePlaceHolder(CclGrammarParser.TemplatePlaceHolderContext ctx) {
    return ctx.children.stream()
            .map(ParseTree::getText)
            .findFirst()
            .orElse("");
  }
}
