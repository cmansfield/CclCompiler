package io.github.cmansfield;

import io.github.cmansfield.parser.include.ImportGrammarParser;
import org.apache.commons.collections4.bidimap.DualHashBidiMap;
import io.github.cmansfield.parser.include.ImportGrammarLexer;
import io.github.cmansfield.parser.language.CclGrammarParser;
import io.github.cmansfield.parser.language.CclGrammarLexer;
import io.github.cmansfield.symbols.SymbolTableVisitor;
import org.apache.commons.collections4.BidiMap;
import org.antlr.v4.runtime.CommonTokenStream;
import io.github.cmansfield.io.ImportVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import io.github.cmansfield.symbols.Symbol;
import org.antlr.v4.runtime.CharStreams;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.io.*;


public class Compiler {
  private final Logger logger = LoggerFactory.getLogger(Compiler.class);

  public boolean compile(final String fileName) throws IOException {

    List<String> files = new ArrayList<>();
    files.add(fileName);
    files.addAll(getImports(fileName));
    List<InputStream> streams = new ArrayList<>();
    BidiMap<String, Symbol> symbolTable = new DualHashBidiMap<>();

    try {
      for(String file : files) {
        streams.add(new FileInputStream(new File(file)));
      }
      for(InputStream inputStream : streams) {
        symbolTable = populateSymbolTable(inputStream, new SymbolTableVisitor(symbolTable));
      }
    }
    catch (FileNotFoundException e) {
      logger.error("Unable to load file", e);
      return false;
    }
    catch (Exception e) {
      logger.error("", e);
      return false;
    }
    finally {
      for(InputStream stream : streams) {
        if(stream != null) {
          stream.close();
        }
      }
    }

    logger.debug("SymbolTable:\n\t{}",
            symbolTable.entrySet().stream()
                    .map(Object::toString)
                    .collect(Collectors.joining("\n\t")));

    return true;
  }

  private List<String> getImports(String fileName) throws IOException {
    ImportVisitor visitor = new ImportVisitor();

    try(FileInputStream inputStream = new FileInputStream(new File(fileName))) {

      ImportGrammarLexer lexer = new ImportGrammarLexer(
              CharStreams.fromStream(
                      inputStream,
                      StandardCharsets.UTF_8));
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      ImportGrammarParser parser = new ImportGrammarParser(tokens);

      if(parser.getNumberOfSyntaxErrors() > 0) {
        logger.error("Syntax errors found");
        throw new IllegalStateException("Unable to retrieve the list of imports");
      }

      ParseTree tree = parser.importList();
      visitor.visit(tree);

      logger.debug("Import List:\n\t{}",
              visitor.getImports().stream()
                      .collect(Collectors.joining("\n\t")));
    }
    catch (FileNotFoundException e) {
      logger.error("Unable to load file {}", fileName);
      return Collections.emptyList();
    }
    catch (Exception e) {
      logger.error("", e);
      throw e;
    }

    return visitor.getImports();
  }

  private BidiMap<String, Symbol> populateSymbolTable(InputStream inputStream, SymbolTableVisitor visitor) throws IOException {
    if(inputStream == null) {
      logger.warn("Input stream was null");
      return null;
    }

    CclGrammarLexer lexer = new CclGrammarLexer(
            CharStreams.fromStream(
                    inputStream,
                    StandardCharsets.UTF_8));
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    CclGrammarParser parser = new CclGrammarParser(tokens);
    ParseTree tree = parser.compilationUnit();

    if(parser.getNumberOfSyntaxErrors() > 0) {
      logger.error("Syntax errors found");
      return null;
    }

    visitor.visit(tree);

    return visitor.getSymbols();
  }
}
