package io.github.cmansfield.firstpass.symbols;

import io.github.cmansfield.firstpass.symbols.data.Data.DataBuilder;
import io.github.cmansfield.firstpass.symbols.data.AccessModifier;
import io.github.cmansfield.parser.language.CclGrammarParser;
import io.github.cmansfield.firstpass.symbols.data.Data;
import org.apache.commons.collections4.CollectionUtils;
import io.github.cmansfield.parser.CclCompilerVisitor;
import org.apache.commons.collections4.BidiMap;
import io.github.cmansfield.parser.ParserUtils;
import io.github.cmansfield.compiler.Compiler;
import org.antlr.v4.runtime.ParserRuleContext;
import org.apache.commons.lang3.StringUtils;
import io.github.cmansfield.parser.Keyword;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.stream.Collectors;
import java.util.*;


public class SymbolTableVisitor extends CclCompilerVisitor {

  public SymbolTableVisitor(Compiler compiler) {
    super(compiler);
  }

  protected SymbolTableVisitor(Compiler compiler, BidiMap<String, Symbol> symbols, List<CclGrammarParser.ClassDeclarationContext> templateClassContexts) {
    super(compiler, symbols, templateClassContexts);
  }

  @Override
  public Object visitMethodDeclaration(CclGrammarParser.MethodDeclarationContext ctx) {
    SymbolKind symbolKind = SymbolKind.METHOD;
    String symbolId = compiler.generateId(symbolKind);
    String scopeOrig = scope;
    scope = scope + "." + symbolId;

    String name = getMethodName(ctx);
    List<AccessModifier> accessModifiers = getAccessModifiers(ctx);
    String returnType = getReturnType(ctx);
    List<String> parameters = getParameters(ctx);

    Data data = new DataBuilder()
            .returnType(returnType)
            .accessModifiers(accessModifiers)
            .parameters(parameters)
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
  public Object visitParameter(CclGrammarParser.ParameterContext ctx) {
    String type = getType(ctx);
    String name = getName(ctx);
    boolean isArray = isArray(ctx);
    
    Data data = new DataBuilder()
            .type(type)
            .accessModifier(AccessModifier.PRIVATE)
            .isTypeAnArray(isArray)
            .build();
    Symbol symbol = addNewSymbol(name, SymbolKind.PARAM, scope, data);
    
    return symbol.getSymbolId();
  }

  @Override
  public Object visitClassDeclaration(CclGrammarParser.ClassDeclarationContext ctx) {
    SymbolKind symbolKind = SymbolKind.CLASS;
    String symbolId = compiler.generateId(symbolKind);
    String scopeOrig = scope;
    scope = scope + "." + symbolId;

    List<String> templatePlaceHolders = getTemplatePlaceHolders(ctx);
    String name = getClassName(ctx);

    if(!templatePlaceHolders.isEmpty()) {
      templateClassContexts.add(ctx);
    }
    createTemplatePlaceHolderSymbols(templatePlaceHolders, symbolId);
    
    List<AccessModifier> accessModifiers = getAccessModifiers(ctx);
    Data data = new DataBuilder()
            .accessModifiers(accessModifiers)
            .templatePlaceHolders(templatePlaceHolders)
            .build();
    addNewSymbol(
            name,
            SymbolKind.CLASS,
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
    String symbolId = compiler.generateId(symbolKind);
    String scopeOrig = scope;
    scope = scope + "." + symbolId;

    String name = getMethodName(ctx);
    List<AccessModifier> accessModifiers = getAccessModifiers(ctx);
    List<String> parameters = getParameters(ctx);

    Data data = new DataBuilder()
            .accessModifiers(accessModifiers)
            .parameters(parameters)
            .returnType(name)
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
                        
    Data data = new DataBuilder()
            .accessModifiers(accessModifiers)
            .type(type)
            .isTypeAnArray(isArray)
            .build();
    addNewSymbol(name, SymbolKind.INSTANCE_VAR, scope, data);

    traverseAssignmentOperation(ctx);
    
    return null;
  }

  @Override
  public Object visitMainDeclaration(CclGrammarParser.MainDeclarationContext ctx) {
    SymbolKind symbolKind = SymbolKind.MAIN;
    String symbolId = compiler.generateId(symbolKind);
    List<AccessModifier> accessModifiers = getAccessModifiers(ctx);
    Data data = new DataBuilder()
            .returnType(Keyword.VOID.toString())
            .accessModifiers(accessModifiers)
            .build();
    addNewSymbol(Keyword.MAIN.toString(), SymbolKind.MAIN, scope, data, symbolId);

    String scopeOrig = scope;
    scope = scope + "." + symbolId;
    traverseMethodBody(ctx);
    scope = scopeOrig;

    return null;
  }

  @Override
  public Object visitNumericLiteral(CclGrammarParser.NumericLiteralContext ctx) {
    visitLiteral(ctx, CclGrammarParser.INT, SymbolKind.INT_LIT);
    
    return super.visitNumericLiteral(ctx);
  }

  @Override
  public Object visitCharacterLiteral(CclGrammarParser.CharacterLiteralContext ctx) {
    visitLiteral(ctx, CclGrammarParser.CHAR, SymbolKind.CHAR_LIT);

    return super.visitCharacterLiteral(ctx);
  }

  @Override
  public Object visitStringLiteral(CclGrammarParser.StringLiteralContext ctx) {
    visitLiteral(ctx, CclGrammarParser.STRING, SymbolKind.STR_LIT);

    return super.visitStringLiteral(ctx);
  }

  @Override
  public Object visitBooleanLiteral(CclGrammarParser.BooleanLiteralContext ctx) {
    visitLiteral(ctx, CclGrammarParser.BOOL, SymbolKind.BOOL_LIT);

    return super.visitBooleanLiteral(ctx);
  }

  @Override
  public Object visitSpecialLiteral(CclGrammarParser.SpecialLiteralContext ctx) {
    visitLiteral(ctx, CclGrammarParser.NULL, SymbolKind.SPECIAL_LIT);

    return super.visitSpecialLiteral(ctx);
  }

  /**
   * This will get the children from the context and then traverse any modifier nodes and
   * return a list of discovered access modifiers
   *
   * @param ctx     The current context to search for access modifiers
   * @return        List of found access modifiers
   */
  List<AccessModifier> getAccessModifiers(ParserRuleContext ctx) {
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
  List<String> getParameters(ParserRuleContext ctx) {
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
   * This method will create a new literal Symbol given the supplied type
   *
   * @param ctx                 The context to get the text from
   * @param grammarParserIndex  The index that references the keyword in
   *                            the CclGrammarParser's vocabulary
   * @param symbolKind          They type of literal being created
   */
  private void visitLiteral(ParserRuleContext ctx, int grammarParserIndex, SymbolKind symbolKind) {
    ParseTree child = ctx.getChild(0);
    if(child == null) {
      throw new IllegalArgumentException("There should be at least one child node");
    }
    String value = child.getText();
    // Remove quotes around the string
    if(StringUtils.isNotBlank(value) && (value.charAt(0) == '\'' || value.charAt(0) == '\"')) {
      value = value.substring(1, value.length() - 1);
    }
    Data data = new DataBuilder()
            .type(ParserUtils.getLiteralName(grammarParserIndex))
            .accessModifier(AccessModifier.PUBLIC)
            .build();
    addNewSymbol(value, symbolKind, GLOBAL_SCOPE, data);
  }

  /**
   * This method will create new template Symbols for each of the supplied template place holders
   * 
   * @param templatePlaceHolders    List of template place holders
   * @param classId                 The Symbol ID of the template class 
   */
  private void createTemplatePlaceHolderSymbols(List<String> templatePlaceHolders, String classId) {
    for(String placeHolder : templatePlaceHolders) {
      addNewSymbol(
              placeHolder,
              SymbolKind.TEMPLATE,
              scope,
              new DataBuilder()
                      .accessModifier(AccessModifier.PUBLIC)
                      .parameter(classId)
                      .build());
    }
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
  public Object visitMethodName(CclGrammarParser.MethodNameContext ctx) {
    return getChildText(ctx);
  }

  @Override
  public Object visitClassName(CclGrammarParser.ClassNameContext ctx) {
    return getChildText(ctx);
  }

  @Override
  public String toString() {
    return String.format("SymbolTable:%n\t%s",
            symbols.entrySet().stream()
                    .map(Object::toString)
                    .collect(Collectors.joining("\n\t")));
  }
}
