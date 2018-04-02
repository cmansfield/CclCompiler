package io.github.cmansfield.symbols;

import io.github.cmansfield.language.recognition.CclGrammarBaseListener;
import io.github.cmansfield.language.recognition.CclGrammarParser;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.util.*;


public class SymbolTableListener extends CclGrammarBaseListener {
  private static final Logger LOGGER = LoggerFactory.getLogger(SymbolTableListener.class);
  private SymbolFactory symbolFactory;
  private Set<Symbol> symbols;
  private String scope;
  
  public SymbolTableListener() {
    scope = "";
    symbols = new HashSet<>();
    symbolFactory = new SymbolFactory(this);
  }
  
  public String getScope() {
    return scope;
  }
  
  public Set<Symbol> getSymbols() {
    return symbols == null ? Collections.emptySet() : symbols;
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

    Symbol symbol = symbolFactory.getSymbol(SymbolKind.CLASS, ctx);

    if(symbols.contains(symbol)) {
      return;
    }

    symbols.add(symbol);
  }
}
