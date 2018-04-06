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
import java.util.*;
import java.io.*;


class Compiler {
  private final Logger logger = LoggerFactory.getLogger(Compiler.class);

  boolean compile(final String fileName) throws IOException {
    BidiMap<String, Symbol> symbolTable = new DualHashBidiMap<>();
    List<InputStream> streams = new ArrayList<>();
    Set<String> imports = new HashSet<>();

    imports.add(fileName);
    // Populate the import set
    getImports(fileName, imports);

    if(logger.isDebugEnabled()) {
      logger.debug("Import List:\n\t{}",
              imports.stream().collect(Collectors.joining("\n\t")));
    }
    
    try {               // NOSONAR
      for(String file : imports) {
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
    finally {
      for(InputStream stream : streams) {
        if(stream != null) {
          stream.close();
        }
      }
    }

    if(logger.isDebugEnabled() && symbolTable != null) {
      logger.debug("SymbolTable:\n\t{}",
              symbolTable.entrySet().stream()
                      .map(Object::toString)
                      .collect(Collectors.joining("\n\t")));
    }
    return true;
  }

  private void getImports(String fileName, Set<String> imports) throws IOException {
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
    }
    catch (FileNotFoundException e) {
      logger.error("Unable to load file {}", fileName);
    }

    for(String file : visitor.getImports()) {
      if(file.equals(fileName) || imports.contains(file)) {
        continue;
      }
      imports.add(file);
      getImports(file, imports);      
    }
    imports.add(fileName);
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
