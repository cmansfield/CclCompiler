package io.github.cmansfield.secondpass;

import io.github.cmansfield.firstpass.symbols.data.AccessModifier;
import io.github.cmansfield.parser.language.CclGrammarParser;
import io.github.cmansfield.firstpass.symbols.data.Data;
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


public class SemanticsVisitor extends CclCompilerVisitor {
  private final Logger logger = LoggerFactory.getLogger(SemanticsVisitor.class);
  private Deque<SAR> sas;
  
  public SemanticsVisitor(SemanticsVisitor semanticsVisitor, String packageName) {
    this(semanticsVisitor.getSymbols(), packageName);
    sas = new ArrayDeque<>();
    sas.addAll(semanticsVisitor.getSemanticActionStack());
  }
  
  public SemanticsVisitor(BidiMap<String, Symbol> symbols, String packageName) {
    super(symbols);
    sas = new ArrayDeque<>();
    
    String symbolId = findSymbolId(
            new Symbol().new SymbolBuilder()
              .text(packageName)
              .symbolKind(SymbolKind.PACKAGE)
              .scope(GLOBAL_SCOPE)
              .build(),
            true);

    scope = GLOBAL_SCOPE + "." + symbolId;
  }

  public Deque<SAR> getSemanticActionStack() {
    return sas == null ? new ArrayDeque<>() : sas;
  }
  
  /**
   * This method is used to find Symbols in the symbol table
   * 
   * @param name        The Symbol text to find
   * @param symbolKind  The type of Symbol to find
   * @return            The found Symbol's ID
   */
  private String findSymbolId(String name, SymbolKind symbolKind) {
    return findSymbolId(
            new Symbol().new SymbolBuilder()
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
  private String findSymbolId(Symbol filter, boolean errorOnFail) {
    List<Symbol> foundSymbols = SymbolFilter.filter(symbols, filter);
    if(foundSymbols.size() != 1 && errorOnFail) {
      String message = String.format("Could not find the symbol for %s", filter.toString());
      logger.error(message);
      throw new IllegalStateException(message);
    }
    
    return foundSymbols.isEmpty() ? null : foundSymbols.get(0).getSymbolId();
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
    sas.push(new SAR(SarType.LITERAL, symbolId, symbols.get(symbolId).getText(), ctx.start.getLine()));
  }
  
  /**
   * Move this method from SymbolTableVisitor to this class because we don't want to create
   * local variables until the second pass or else the symbol table could say they exist before
   * they are instantiated
   */
  @Override
  public Object visitVariableDeclaration(CclGrammarParser.VariableDeclarationContext ctx) {
    String type = getType(ctx);
    String name = getName(ctx);
    boolean isArray = isArray(ctx);

    Data data = new Data().new DataBuilder()
            .accessModifier(AccessModifier.PRIVATE)
            .isTypeAnArray(isArray)
            .type(type)
            .build();
    addNewSymbol(name, SymbolKind.LOCAL_VAR, scope, data);

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
    String name = getClassName(ctx);
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
    String name = getName(ctx);
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
  public Object visitCompilationUnit(CclGrammarParser.CompilationUnitContext ctx) {
    List<ParseTree> children = new ArrayList<>(ctx.children);
    
    for(ParseTree parseTree: children) {
      if(parseTree instanceof CclGrammarParser.MethodBodyContext) {
        String symbolId = findSymbolId(ParserUtils.getLiteralName(CclGrammarParser.MAIN), SymbolKind.MAIN);
        if(StringUtils.isBlank(symbolId)) {
          return null;
        }
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
}
