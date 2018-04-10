package io.github.cmansfield.secondpass;

import io.github.cmansfield.firstpass.symbols.data.AccessModifier;
import io.github.cmansfield.firstpass.symbols.SymbolIdGenerator;
import io.github.cmansfield.firstpass.symbols.SymbolTableUtils;
import io.github.cmansfield.parser.language.CclGrammarParser;
import io.github.cmansfield.firstpass.symbols.SymbolKind;
import io.github.cmansfield.firstpass.symbols.data.Data;
import io.github.cmansfield.parser.CclCompilerVisitor;
import io.github.cmansfield.firstpass.symbols.Symbol;
import org.apache.commons.collections4.BidiMap;
import org.apache.commons.lang3.StringUtils;
import org.antlr.v4.runtime.tree.ParseTree;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.util.ArrayList;
import java.util.List;


public class SemanticsVisitor extends CclCompilerVisitor {
  private final Logger logger = LoggerFactory.getLogger(SemanticsVisitor.class);
  
  public SemanticsVisitor(BidiMap<String, Symbol> symbols, String packageName) {
    super(symbols);
    Symbol symbol = SymbolTableUtils.findSymbol(symbols, packageName, SymbolKind.PACKAGE, GLOBAL_SCOPE);
    
    if(symbol == null) {
      String message = String.format("Could not find the Symbol for package %s", packageName); 
      logger.error(message);
      throw new IllegalStateException(message);
    }
    scope = GLOBAL_SCOPE + "." + symbol.getSymbolId();
  }

  private String findSymbolId(String name, SymbolKind symbolKind) {
    return findSymbolId(name, symbolKind, true);
  }
  
  private String findSymbolId(String name, SymbolKind symbolKind, boolean errorOnFail) {
    Symbol symbol = SymbolTableUtils.findSymbol(symbols, name, symbolKind, scope);
    if(symbol == null && errorOnFail) {
      String message = String.format("Could not find the symbol for %s %s", symbolKind.toString(), name);
      logger.error(message);
      throw new IllegalStateException(message);
    }
    
    return symbol == null ? null : symbol.getSymbolId();
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
    else if("for".equals(child.getText())) {
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
    
    String symbolId = findSymbolId(name, SymbolKind.CLASS, false);
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

    String symbolId = findSymbolId(name, SymbolKind.METHOD, false);
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
    String symbolId = findSymbolId("main", SymbolKind.MAIN);
    if(StringUtils.isBlank(symbolId)) {
      return null;
    }
    List<ParseTree> children = new ArrayList<>(ctx.children);
    
    for(ParseTree parseTree: children) {
      if(parseTree instanceof CclGrammarParser.MethodBodyContext) {
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
}
