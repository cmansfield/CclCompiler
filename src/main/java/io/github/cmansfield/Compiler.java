package io.github.cmansfield;

import io.github.cmansfield.language.recognition.CclGrammarLexer;
import io.github.cmansfield.language.recognition.CclGrammarParser;
import io.github.cmansfield.language.recognition.CompilerListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStreams;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.nio.charset.StandardCharsets;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.File;


public class Compiler {
  private final Logger logger = LoggerFactory.getLogger(Compiler.class);

  public boolean compile(final String fileName) {
    try(FileInputStream inputStream = new FileInputStream(new File(fileName))) {

      CclGrammarLexer lexer = new CclGrammarLexer(
              CharStreams.fromStream(
                      inputStream,
                      StandardCharsets.UTF_8));
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      CclGrammarParser parser = new CclGrammarParser(tokens);
      ParseTree tree = parser.compilationUnit();

      if(parser.getNumberOfSyntaxErrors() > 0) {
        logger.error("Syntax errors found");
        return false;
      }

      ParseTreeWalker walker = new ParseTreeWalker();
      CompilerListener listener = new CompilerListener();
      walker.walk(listener, tree);
    }
    catch (FileNotFoundException e) {
      logger.error("Unable to load file {}", fileName);
      return false;
    }
    catch (Exception e) {
      logger.error("", e);
      return false;
    }

    return true;
  }
}
