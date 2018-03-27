package io.github.cmansfield.language.recognition;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;


public class CompilerListener extends CclGrammarBaseListener {
  private static final Logger LOGGER = LoggerFactory.getLogger(CompilerListener.class);
  
  @Override
  public void enterCompilationUnit(CclGrammarParser.CompilationUnitContext ctx) {
    LOGGER.info("Entering Compilation Unit");
    LOGGER.info(ctx.getText());    
    
    
  }
}
