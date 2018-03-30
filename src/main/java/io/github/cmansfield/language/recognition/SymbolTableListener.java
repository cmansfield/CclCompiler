package io.github.cmansfield.language.recognition;

import org.apache.commons.collections4.CollectionUtils;
import io.github.cmansfield.symbols.SymbolFactory;
import io.github.cmansfield.symbols.SymbolKind;
import io.github.cmansfield.symbols.Symbol;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.util.*;


public class SymbolTableListener extends CclGrammarBaseListener {
  private static final Logger LOGGER = LoggerFactory.getLogger(SymbolTableListener.class);
  private SymbolFactory symbolFactory;
  private Map<String, Symbol> symbols;
  private String scope;
  
  public SymbolTableListener() {
    scope = "";
    symbols = new HashMap<>();
    symbolFactory = new SymbolFactory(this);
  }
  
  public String getScope() {
    return scope;
  }
  
  public Map<String, Symbol> getSymbols() {
    return symbols  == null ? Collections.emptyMap() : symbols;
  }
  
  @Override
  public void enterCompilationUnit(CclGrammarParser.CompilationUnitContext ctx) {
    LOGGER.debug("Compilation Unit\t\t{}", ctx.getText());    
  }
  
  @Override
  public void enterStatement(CclGrammarParser.StatementContext ctx) {
    LOGGER.debug("Statement\t\t{}", ctx.getText());
  }

  @Override
  public void enterVariableDeclaration(CclGrammarParser.VariableDeclarationContext ctx) {
    LOGGER.debug("Variable Declaration\t\t{}", ctx.getText());
  }

  @Override
  public void enterMethodBody(CclGrammarParser.MethodBodyContext ctx) {
    LOGGER.debug("Entering Method Body");
  }

  @Override
  public void enterImportDeclaration(CclGrammarParser.ImportDeclarationContext ctx) {
    LOGGER.debug("Import Declaration\t\t{}", ctx.getText());
  }

  @Override
  public void enterClassDeclaration(CclGrammarParser.ClassDeclarationContext ctx) {
    LOGGER.debug("Class Declaration\t\t{}", ctx.getText());
  }

  @Override
  public void enterExpressionz(CclGrammarParser.ExpressionzContext ctx) {
    LOGGER.debug("Expressionz\t\t{}", ctx.getText());
    
    CclGrammarParser.MathOperationContext exCtx = ctx.mathOperation();
  }

  @Override
  public void enterExpression(CclGrammarParser.ExpressionContext ctx) {
    LOGGER.debug("Expression\t\t{}", ctx.getText());
  }

  @Override
  public void enterClassName(CclGrammarParser.ClassNameContext ctx) {
    LOGGER.debug("Class Name\t\t{}", ctx.getText());

    // TODO - Check to see if the "Class Name" is actually a template
    
    if(symbols.containsKey(ctx.getText())) {
      return;
    }
    
    Symbol symbol = symbolFactory.getSymbol(SymbolKind.CLASS, ctx);
    symbols.put(symbol.getText(), symbol);
  }
}
