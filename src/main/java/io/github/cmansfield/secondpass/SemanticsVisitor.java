package io.github.cmansfield.secondpass;

import io.github.cmansfield.firstpass.symbols.data.AccessModifier;
import io.github.cmansfield.parser.language.CclGrammarParser;
import io.github.cmansfield.firstpass.symbols.data.Data;
import org.apache.commons.collections4.CollectionUtils;
import io.github.cmansfield.parser.CclCompilerVisitor;
import io.github.cmansfield.firstpass.symbols.*;
import io.github.cmansfield.parser.ParserUtils;
import org.apache.commons.collections4.BidiMap;
import org.antlr.v4.runtime.ParserRuleContext;
import org.apache.commons.lang3.StringUtils;
import org.antlr.v4.runtime.tree.ParseTree;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.util.*;
import java.util.stream.Collectors;


public class SemanticsVisitor extends CclCompilerVisitor {
  private final Logger logger = LoggerFactory.getLogger(SemanticsVisitor.class);
  private Deque<SAR> sas;

  public SemanticsVisitor(BidiMap<String, Symbol> symbols) {
    super(symbols);
    sas = new ArrayDeque<>();
  }

  public Deque<SAR> getSemanticActionStack() {
    return sas == null ? new ArrayDeque<>() : sas;
  }

  /**
   * This method will create a simple filter object for searching
   * 
   * @param text        Match the Symbol with this text
   * @param symbolKind  Match Symbols of this kind
   * @param scope       Match Symbols within this scope
   * @return            The Symbol filter used to find Symbols in the symbol table
   */
  private Symbol generateFilter(String text, SymbolKind symbolKind, String scope) {
    return new Symbol().new SymbolBuilder()
            .text(text)
            .symbolKind(symbolKind)
            .scope(scope)
            .build();
  }

  /**
   * This will walk up from the current scope to try and find the
   * Symbol Id of the Symbol that matches the supplied text
   *
   * @param text    Text of the Symbol to find
   * @param sarType The SarType of the symbol we are searching for
   * @return        The ID of the found Symbol
   */
  private String traceScopeToFindSymbolId(String text, SarType sarType) {
    return traceScopeToFindSymbolId(text, sarType, scope);
  }

  /**
   * This will walk up from the scope provided to try and find the
   * Symbol Id of the Symbol that matches the supplied text
   *
   * @param text          The text of the Symbol we want to find
   * @param sarType The SarType of the symbol we are searching for
   * @param currentScope  The desired scope to search for a matching Symbol
   * @return              The ID of the found Symbol
   */
  String traceScopeToFindSymbolId(String text, SarType sarType, String currentScope) {
    if(StringUtils.isBlank(text)) {
      logger.warn("Cannot find the symbolId of something with a blank text");
      return "";
    }
    if(sarType == null || sarType == SarType.UNKNOWN) {
      logger.warn("Unknown SarType provided");
      return "";
    }
    if(StringUtils.isBlank(currentScope)) {
      throw new IllegalStateException(String.format("Could not find Symbol \'%s\'", text));
    }

    if("g.D00001.C00001".equals(currentScope) && "name".equals(text)) {
      System.out.println(this.toString());
      System.out.printf("");
    }

    Symbol filter = new Symbol().new SymbolBuilder()
            .text(text)
            .scope(currentScope)
            .build();
    List<Symbol> found = SymbolFilter.filter(symbols, filter);

    // We have to make sure we are only comparing SAR's of the same type otherwise
    // a class instance var with the same name as the class' method would produce
    // an error. We only want to produce an error if variables of the same scope
    // have the same name
    found = found.stream()
            .filter(symbol -> sarType == SarType.getSarType(symbol.getSymbolKind()))
            .collect(Collectors.toList());

    if(CollectionUtils.isEmpty(found)) {
      if(GLOBAL_SCOPE.equals(currentScope)) {
        throw new IllegalStateException(String.format("Could not find Symbol \'%s\'", text));
      }
      String parentId = SymbolTableUtils.getParentScope(currentScope);
      Symbol parentSymbol = symbols.get(parentId);
      if(parentSymbol == null) {
        throw new IllegalStateException(String.format(
                "Bad scope \'%s\' symbolId \'%s\' not found",
                currentScope,
                parentId));
      }
      return traceScopeToFindSymbolId(
              text,
              sarType,
              parentSymbol.getScope());
    }
    if(found.size() > 1) {
      throw new IllegalStateException(String.format(
                    "All of these Symbols have the same name/identifier in scope: %s%n%s",
                    currentScope,
                    found.stream()
                            .map(Symbol::toString)
                            .collect(Collectors.joining("\n"))));
    }

    return found.get(0).getSymbolId();
  }

  /**
   * Get the method name or identifier name from the child node without
   * running the visitName or visitMethodName methods
   *
   * @param ctx The context to get child text from
   * @return    The child's name
   */
  private String getNameWithoutVisiting(ParserRuleContext ctx) {
    if(ctx == null) {
      return null;
    }

    return ctx.children.stream()
            .filter(node -> node instanceof CclGrammarParser.NameContext
                    || node instanceof CclGrammarParser.MethodNameContext)
            .map(context -> context.getChild(0).getText())
            .findFirst()
            .orElse(null);
  }

  /*
    ************ Semantic methods ************
   */

  /**
   * #literalPush
   * This method will push a new literal semantic action record onto the SAS
   *
   * @param ctx         The context of where int the tree the visitor currently is
   * @param symbolKind  The type of literal being pushed onto the SAS
   */
  private void literalPush(ParserRuleContext ctx, SymbolKind symbolKind) {
    String symbolId = findSymbolId(
            generateFilter(
                    getChildText(ctx),
                    symbolKind,
                    GLOBAL_SCOPE),
            true);

    // literalPush
    sas.push(new SAR(
            SarType.LITERAL, 
            symbolId, 
            symbols.get(symbolId).getText(), 
            ctx.start.getLine()));
  }

  /**
   * #identifierPush
   * This method wil push a new identifier semantic action record onto the SAS
   * 
   * @param ctx   The context of where int the tree the visitor currently is
   * @param text  The name of the identifier to be pushed
   */
  private void identifierPush(ParserRuleContext ctx, String text) {
    // identifierPush
    SAR sar = new SAR(SarType.IDENTIFIER, text);
    sar.setLineNumber(ctx.start.getLine());
    sas.push(sar);
  }

  /**
   * #identifierExist
   * This method will pop off the top SAR from the SAS and then check to make sure
   * the identifier exists and does not conflict with other identifiers. If the
   * identifier is found in the SymbolTable then the symbolId is added to the SAR
   */
  private void identifierExist(SarType sarType) {
    if(sas.isEmpty()) {
      throw new IllegalStateException("SAS is empty when trying to check if an identifier exists");
    }
    SAR sar = sas.pop();
    String symbolId = traceScopeToFindSymbolId(sar.getText(), sarType);
    if(StringUtils.isBlank(symbolId)) {
      Optional<Integer> lineNumberOpt = sar.getLineNumber();
      throw new IllegalStateException(String.format(
              "The identifier \'%s\' on line %s does not exist!",
              lineNumberOpt.isPresent() ? lineNumberOpt.get() : "UNKNOWN",
              sar.getText()));
    }
    sar.setSymbolId(symbolId);
    sas.push(sar);
  }
  
  /**
   * Move this method from SymbolTableVisitor to this class because we don't want to create
   * local variables until the second pass or else the symbol table could say they exist before
   * they are instantiated
   */
  @Override
  public Object visitVariableDeclaration(CclGrammarParser.VariableDeclarationContext ctx) {
    String type = getType(ctx);
    String name = getNameWithoutVisiting(ctx);
    boolean isArray = isArray(ctx);

    Data data = new Data().new DataBuilder()
            .accessModifier(AccessModifier.PRIVATE)
            .isTypeAnArray(isArray)
            .type(type)
            .build();
    addNewSymbol(name, SymbolKind.LOCAL_VAR, scope, data);

    getName(ctx);     // This adds the identifier to the SAS and verifies it
    visitAssignmentExpression(ctx);

    return null;
  }

  /**
   * Move this method from SymbolTableVisitor to this class because we don't want to create
   * symbols for blocks or for-loops before we have reached them. It makes it impossible to
   * look these up on the second pass
   */
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
    else if(ParserUtils.getLiteralName(CclGrammarParser.FOR).equals(child.getText())) {
      symbolKind = SymbolKind.FOR;
    }

    if(symbolKind == SymbolKind.UNKNOWN) {
      throw new IllegalStateException(
              String.format("Unknown statement \"%s\" found", StringUtils.isBlank(child.getText()) ? "" : child.getText()));
    }

    symbolId = SymbolIdGenerator.generateId(symbolKind);
    scope = scope + "." + symbolId;

    Data data = new Data().new DataBuilder().accessModifier(AccessModifier.PRIVATE).build();
    addNewSymbol(symbolId, symbolKind, scopeOrig, data, symbolId);

    super.visitStatementWithScope(ctx);
    scope = scopeOrig;

    return null;
  }

  @Override
  public Object visitClassDeclaration(CclGrammarParser.ClassDeclarationContext ctx) {
    String name = getClassName(ctx);
    String scopeOrig = scope;

    String symbolId = findSymbolId(
            new Symbol().new SymbolBuilder()
              .text(name)
              .symbolKind(SymbolKind.CLASS)
              .build(),
            false);
    if(StringUtils.isBlank(symbolId)) {
      symbolId = findSymbolId(name, SymbolKind.TEMPLATE_CLASS);
    }
    if(StringUtils.isBlank(symbolId)) {
      return null;
    }
    
    scope = scope + "." + symbolId;
    Object result = super.visitClassDeclaration(ctx);
    scope = scopeOrig;
    
    return result; 
  }

  @Override
  public Object visitConstructorDeclaration(CclGrammarParser.ConstructorDeclarationContext ctx) {
    String name = getMethodName(ctx);
    String scopeOrig = scope;

    String symbolId = findSymbolId(name, SymbolKind.CONSTRUCTOR);
    if(StringUtils.isBlank(symbolId)) {
      return null;
    }

    scope = scope + "." + symbolId;
    Object result = super.visitConstructorDeclaration(ctx);
    scope = scopeOrig;

    return result;
  }

  @Override
  public Object visitMethodDeclaration(CclGrammarParser.MethodDeclarationContext ctx) {
    String name = getMethodName(ctx);
    if(name == null) {
      throw new IllegalStateException("Method name came back null, should not be null after the first pass");
    }
    String scopeOrig = scope;

    String symbolId = findSymbolId(
            new Symbol().new SymbolBuilder()
              .text(name)
              .symbolKind(SymbolKind.METHOD)
              .build(),
            false);
    if(StringUtils.isBlank(symbolId)) {
      symbolId = findSymbolId(name, SymbolKind.TEMPLATE_METHOD);
    }
    if(StringUtils.isBlank(symbolId)) {
      return null;
    }

    scope = scope + "." + symbolId;
    Object result = super.visitMethodDeclaration(ctx);
    scope = scopeOrig;

    return result;
  }

  @Override
  public Object visitMainDeclaration(CclGrammarParser.MainDeclarationContext ctx) {
    String symbolId = findSymbolId(ParserUtils.getLiteralName(CclGrammarParser.MAIN), SymbolKind.MAIN);
    String scopeOrig = scope;
    scope = String.format("%s.%s", scope, symbolId);
    traverseMethodBody(ctx);
    scope = scopeOrig;

    return null;
  }

  @Override
  public Object visitNumericLiteral(CclGrammarParser.NumericLiteralContext ctx) {
    literalPush(ctx, SymbolKind.INT_LIT);
    return super.visitNumericLiteral(ctx);
  }

  @Override
  public Object visitCharacterLiteral(CclGrammarParser.CharacterLiteralContext ctx) {
    literalPush(ctx, SymbolKind.CHAR_LIT);
    return super.visitCharacterLiteral(ctx);
  }

  @Override
  public Object visitStringLiteral(CclGrammarParser.StringLiteralContext ctx) {
    literalPush(ctx, SymbolKind.STR_LIT);
    return super.visitStringLiteral(ctx);
  }

  @Override
  public Object visitBooleanLiteral(CclGrammarParser.BooleanLiteralContext ctx) {
    literalPush(ctx, SymbolKind.BOOL_LIT);
    return super.visitBooleanLiteral(ctx);
  }

  @Override
  public Object visitSpecialLiteral(CclGrammarParser.SpecialLiteralContext ctx) {
    literalPush(ctx, SymbolKind.SPECIAL_LIT);
    return super.visitSpecialLiteral(ctx);
  }

  @Override
  public Object visitClassName(CclGrammarParser.ClassNameContext ctx) {
    String name = getChildText(ctx);

    // #isDuplicate(name);
    return getChildText(ctx);
  }

  @Override
  public Object visitMethodName(CclGrammarParser.MethodNameContext ctx) {
    String name = getChildText(ctx);

    // #isDuplicate(name);
    return getChildText(ctx);
  }

  @Override
  public Object visitName(CclGrammarParser.NameContext ctx) {
    if(ctx == null) {
      throw new IllegalStateException("NameContext cannot be null");
    }
    String name = getChildText(ctx);

    identifierPush(ctx, name);
    identifierExist(SarType.IDENTIFIER);
    return getChildText(ctx);
  }

  @Override
  public Object visitType(CclGrammarParser.TypeContext ctx) {
    return getChildText(ctx);
  }

  @Override
  public Object visitMemberRefz(CclGrammarParser.MemberRefzContext ctx) {
    String name = getNameWithoutVisiting(ctx);
    identifierPush(ctx, name);

    ctx.children.stream()
            .filter(node -> node instanceof CclGrammarParser.FnArrMemberContext)
            .map(context -> (CclGrammarParser.FnArrMemberContext)context)
            .forEach(this::visitFnArrMember);
    // TODO - #referenceExist

    ctx.children.stream()
            .filter(node -> node instanceof CclGrammarParser.MemberRefzContext)
            .map(context -> (CclGrammarParser.MemberRefzContext)context)
            .forEach(this::visitMemberRefz);
    return null;
  }

  @Override
  public String toString() {
    return String.format("SymbolTable:%n\t%s%nSemantic Action Stack%n\t%s",
            symbols.entrySet().stream()
                    .map(Object::toString)
                    .collect(Collectors.joining("\n\t")),
            sas.stream()
                    .map(Object::toString)
                    .collect(Collectors.joining("\n\t")));
  }
}
