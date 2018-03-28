package io.github.cmansfield;

import io.github.cmansfield.language.recognition.CclGrammarLexer;
import io.github.cmansfield.language.recognition.CclGrammarParser;
import io.github.cmansfield.language.recognition.CompilerListener;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.io.*;
import java.nio.charset.StandardCharsets;


public class App {
  private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
  private static String fileExt = ".ccl";
  
  private static void usage() {
    LOGGER.info("Usage: CclCompiler <Filename{}>", fileExt);
  }
  
  public static void main(String[] args) {
    if(args.length != 1) {
      usage();
    }
    String fileName = args[0];    
    
    try(FileInputStream inputStream = new FileInputStream(new File(fileName))) {
      if(!fileName.endsWith(fileExt)) {
        usage();
        return;
      }

      CclGrammarLexer lexer = new CclGrammarLexer(
              CharStreams.fromStream(
                      inputStream,
                      StandardCharsets.UTF_8));
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      CclGrammarParser parser = new CclGrammarParser(tokens);
      ParseTree tree = parser.compilationUnit();
      ParseTreeWalker walker = new ParseTreeWalker();
      CompilerListener listener = new CompilerListener();
      walker.walk(listener, tree);
      
    }
    catch (FileNotFoundException e) {
      LOGGER.warn("Unable to load file {}", fileName);
    }
    catch (Exception e) {
      LOGGER.warn("", e);
    }
    
  }
}
