package io.github.cmansfield.language.recognition;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;


public class CompilerListener extends CclGrammarBaseListener {
  private static final Logger LOGGER = LoggerFactory.getLogger(CompilerListener.class);
  
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
}
