package io.github.cmansfield.firstpass.symbols;

import io.github.cmansfield.firstpass.symbols.data.AccessModifier;
import io.github.cmansfield.parser.language.CclGrammarParser;
import io.github.cmansfield.firstpass.symbols.data.Data;
import org.apache.commons.collections4.CollectionUtils;
import io.github.cmansfield.parser.CclCompilerVisitor;
import io.github.cmansfield.parser.ParserUtils;
import org.apache.commons.collections4.BidiMap;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.stream.Collectors;
import java.util.*;


public class SymbolTableVisitor extends CclCompilerVisitor {

  public SymbolTableVisitor(BidiMap<String, Symbol> symbols, String packageName) {
    super(symbols, packageName);
  }
  
  @Override
  public Object visitMethodDeclaration(CclGrammarParser.MethodDeclarationContext ctx) {
    boolean isTemplate = isTemplate(ctx);
    SymbolKind symbolKind = isTemplate ? SymbolKind.TEMPLATE_METHOD : SymbolKind.METHOD;
    String symbolId = SymbolIdGenerator.generateId(symbolKind);
    String scopeOrig = scope;
    scope = scope + "." + symbolId;

    String name = getName(ctx);
    List<String> templatePlaceHolders = getTemplatePlaceHolders(ctx);
    List<AccessModifier> accessModifiers = getAccessModifiers(ctx);
    String returnType = getReturnType(ctx);
    List<String> parameters = getParameters(ctx);

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

    traverseMethodBody(ctx);
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
    boolean isArray = isArray(ctx);
    
    Data data = new Data().new DataBuilder()
            .type(type)
            .accessModifier(AccessModifier.PRIVATE)
            .isTypeAnArray(isArray)
            .build();
    Symbol symbol = addNewSymbol(name, SymbolKind.PARAM, scope, data);
    
    return symbol.getSymbolId();
  }

  @Override
  public Object visitClassDeclaration(CclGrammarParser.ClassDeclarationContext ctx) {
    SymbolKind symbolKind = isTemplate(ctx)
            ? SymbolKind.TEMPLATE_CLASS
            : SymbolKind.CLASS;
    String symbolId = SymbolIdGenerator.generateId(symbolKind);
    String scopeOrig = scope;
    scope = scope + "." + symbolId;

    String name = getClassName(ctx);
    List<String> templatePlaceHolders = getTemplatePlaceHolders(ctx);
    List<AccessModifier> accessModifiers = getAccessModifiers(ctx);
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

    String name = getClassName(ctx);
    List<AccessModifier> accessModifiers = getAccessModifiers(ctx);
    List<String> parameters = getParameters(ctx);

    Data data = new Data().new DataBuilder()
            .accessModifiers(accessModifiers)
            .parameters(parameters)
            .build();
    addNewSymbol(name, SymbolKind.CONSTRUCTOR, scopeOrig, data, symbolId);

    traverseMethodBody(ctx);
    scope = scopeOrig;

    return null;
  }

  @Override
  public Object visitFieldDeclaration(CclGrammarParser.FieldDeclarationContext ctx) {
    String name = getName(ctx);
    List<AccessModifier> accessModifiers = getAccessModifiers(ctx);
    String type = getType(ctx);
    boolean isArray = isArray(ctx);
                        
    Data data = new Data().new DataBuilder()
            .accessModifiers(accessModifiers)
            .type(type)
            .isTypeAnArray(isArray)
            .build();
    addNewSymbol(name, SymbolKind.INSTANCE_VAR, scope, data);

    visitAssignmentExpression(ctx);
    
    return null;
  }

  @Override
  public Object visitCompilationUnit(CclGrammarParser.CompilationUnitContext ctx) {
    SymbolKind symbolKind = SymbolKind.MAIN;
    String symbolId = SymbolIdGenerator.generateId(symbolKind);
    List<ParseTree> children = new ArrayList<>(ctx.children);

    for(ParseTree parseTree: children) {
      if(parseTree instanceof CclGrammarParser.MethodBodyContext) {
        List<AccessModifier> accessModifiers = getAccessModifiers(ctx);
        Data data = new Data().new DataBuilder()
                .returnType(ParserUtils.getLiteralName(CclGrammarParser.VOID))
                .accessModifiers(accessModifiers)
                .build();
        addNewSymbol(ParserUtils.getLiteralName(CclGrammarParser.MAIN), SymbolKind.MAIN, scope, data, symbolId);
        
        String scopeOrig = scope;
        scope = scope + "." + symbolId;         // NOSONAR - will only happen once
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
  public Object visitNumericLiteral(CclGrammarParser.NumericLiteralContext ctx) {
    ParseTree child = ctx.getChild(0);
    if(child == null) {
      throw new IllegalArgumentException("There are no child nodes");
    }
    String value = child.getText();
    Data data = new Data().new DataBuilder()
            .type(ParserUtils.getLiteralName(CclGrammarParser.INT))
            .accessModifier(AccessModifier.PUBLIC)
            .build();
    addNewSymbol(value, SymbolKind.INT_LIT, GLOBAL_SCOPE, data);
    
    return super.visitNumericLiteral(ctx);
  }

  @Override
  public Object visitCharacterLiteral(CclGrammarParser.CharacterLiteralContext ctx) {
    ParseTree child = ctx.getChild(0);
    if(child == null) {
      throw new IllegalArgumentException("There should be at least one child node");
    }
    String value = child.getText();
    // Remove single quotes around the char
    value = value.substring(1, value.length() - 1);
    Data data = new Data().new DataBuilder()
            .type(ParserUtils.getLiteralName(CclGrammarParser.CHAR))
            .accessModifier(AccessModifier.PUBLIC)
            .build();
    addNewSymbol(value, SymbolKind.CHAR_LIT, GLOBAL_SCOPE, data);
    
    return super.visitCharacterLiteral(ctx);
  }

  @Override
  public Object visitStringLiteral(CclGrammarParser.StringLiteralContext ctx) {
    ParseTree child = ctx.getChild(0);
    if(child == null) {
      throw new IllegalArgumentException("There should be at least one child node");
    }
    String value = child.getText();
    // Remove quotes around the string
    value = value.substring(1, value.length() - 1);
    Data data = new Data().new DataBuilder()
            .type(ParserUtils.getLiteralName(CclGrammarParser.STRING))
            .accessModifier(AccessModifier.PUBLIC)
            .build();
    addNewSymbol(value, SymbolKind.STR_LIT, GLOBAL_SCOPE, data);

    return super.visitStringLiteral(ctx);
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

  /**
   * This will get the children from the context and then traverse any modifier nodes and
   * return a list of discovered access modifiers
   *
   * @param ctx     The current context to search for access modifiers
   * @return        List of found access modifiers
   */
  private List<AccessModifier> getAccessModifiers(ParserRuleContext ctx) {
    if(ctx == null) {
      return Collections.emptyList();
    }

    return ctx.children.stream()
            .filter(node -> node instanceof CclGrammarParser.ModifierContext)
            .map(context -> (CclGrammarParser.ModifierContext)context)
            .map(this::visitModifier)
            .map(am -> (AccessModifier)am)
            .collect(Collectors.toList());
  }

  /**
   * This will get the children from the context and then traverse any parameter nodes and
   * return a String List with the symbol IDs of the newly created parameter symbols
   *
   * @param ctx     The current context to search for any parameter nodes
   * @return        A String List of symbol IDs for the newly created parameter symbols
   */
  private List<String> getParameters(ParserRuleContext ctx) {
    if(ctx == null) {
      return Collections.emptyList();
    }

    return ctx.children.stream()
            .filter(node -> node instanceof CclGrammarParser.ParameterListContext)
            .map(context -> (CclGrammarParser.ParameterListContext)context)
            .map(this::visitParameterList)
            .map(val -> (List<String>)val)
            .flatMap(Collection::stream)
            .collect(Collectors.toList());
  }

  /**
   * This will get the children from the context and then traverse any method body nodes 
   *
   * @param ctx     The current context to search for any method body nodes
   */
  private void traverseMethodBody(ParserRuleContext ctx) {
    if(ctx == null || ctx.children == null) {
      return;
    }
    ctx.children.stream()
            .filter(node -> node instanceof CclGrammarParser.MethodBodyContext)
            .map(context -> (CclGrammarParser.MethodBodyContext)context)
            .forEach(this::visitMethodBody);
  }

  /**
   * This will get the children from the context and then check for any template nodes 
   * and return true if any are found
   *
   * @param ctx     The current context to search for any template nodes
   * @return        Boolean, if template nodes were found
   */
  private boolean isTemplate(ParserRuleContext ctx) {
    return ctx.children.stream()
            .filter(node -> node instanceof CclGrammarParser.TemplateDeclarationContext)
            .map(context -> (CclGrammarParser.TemplateDeclarationContext)context)
            .count() > 0;
  }

  /**
   * This will get the children from the context and then traverse any template nodes and
   * return a String List with all of the found template placeholders
   *
   * @param ctx     The current context to search for any template nodes
   * @return        A String List of found template placeholders 
   */
  private List<String> getTemplatePlaceHolders(ParserRuleContext ctx) {
    return ctx.children.stream()
            .filter(node -> node instanceof CclGrammarParser.TemplateDeclarationContext)
            .map(context -> (CclGrammarParser.TemplateDeclarationContext)context)
            .map(this::visitTemplateDeclaration)
            .flatMap(val -> ((List<String>)val).stream())
            .collect(Collectors.toList());
  }
}
