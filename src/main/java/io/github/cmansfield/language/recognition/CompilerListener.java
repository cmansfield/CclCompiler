package io.github.cmansfield.language.recognition;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;


public class CompilerListener extends CclGrammarBaseListener {
  private static final Logger LOGGER = LoggerFactory.getLogger(CompilerListener.class);
  
  @Override
  public void enterCompilationUnit(CclGrammarParser.CompilationUnitContext ctx) {
    LOGGER.debug("Entering Compilation Unit");
    LOGGER.debug(ctx.getText());    
  }
  
  @Override
  public void enterStatement(CclGrammarParser.StatementContext ctx) {
    LOGGER.debug("Entering Statement");
  }

  @Override
  public void enterVariableDeclaration(CclGrammarParser.VariableDeclarationContext ctx) {
    LOGGER.debug("Entering Variable Declaration");
    LOGGER.debug(ctx.getText());
  }

  @Override
  public void enterMethodBody(CclGrammarParser.MethodBodyContext ctx) {
    LOGGER.debug("Entering Method Body");
  }
}
