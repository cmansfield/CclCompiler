package io.github.cmansfield.compiler;

import io.github.cmansfield.firstpass.symbols.SymbolTableVisitor;
import io.github.cmansfield.parser.include.ImportGrammarParser;
import org.apache.commons.collections4.bidimap.DualHashBidiMap;
import io.github.cmansfield.parser.include.ImportGrammarLexer;
import io.github.cmansfield.parser.language.CclGrammarParser;
import io.github.cmansfield.parser.language.CclGrammarLexer;
import io.github.cmansfield.firstpass.symbols.SymbolUtils;
import io.github.cmansfield.secondpass.SemanticsVisitor;
import io.github.cmansfield.parser.CclCompilerVisitor;
import io.github.cmansfield.firstpass.symbols.Symbol;
import io.github.cmansfield.io.SymbolTableWriter;
import org.apache.commons.collections4.BidiMap;
import org.antlr.v4.runtime.CommonTokenStream;
import io.github.cmansfield.io.ImportVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStreams;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;
import java.util.*;
import java.io.*;


public class Compiler {
  private final Logger logger = LoggerFactory.getLogger(Compiler.class);
  private Set<CompilerOptions> options;
  private BidiMap<String, Symbol> symbolTable;

  public Compiler(CompilerOptions... options) {
    if(options != null) {
      this.options = new HashSet<>(Arrays.asList(options));
    }
    else {
      this.options = Collections.emptySet();
    }
  }

  public BidiMap<String, Symbol> getSymbolTable() {
    return symbolTable == null ? new DualHashBidiMap<>() : symbolTable;
  }

  /**
   * This will compile the file supplied
   * 
   * @param fileName      The name of the file to be compiled
   * @return              Boolean, true if the file was compiled without errors
   */
  public boolean compile(final String fileName) throws IOException {
    if(!runFirstPass(fileName)) {
      logger.error("Unable to complete the first pass at this time");
      return false;
    }
    if(options.contains(CompilerOptions.FIRST_PASS_ONLY)) {
      SymbolUtils.checkSymbolTable(symbolTable);

      if(options.contains(CompilerOptions.EXPORT_SYMBOL_TABLE)) {
        SymbolTableWriter.exportSymbolTable(symbolTable);
      }
      return true;
    }
    if(!runSecondPass(fileName)) {
      logger.error("Unable to complete the second pass at this time");
      return false;
    }
    if(options.contains(CompilerOptions.EXPORT_SYMBOL_TABLE)) {
      SymbolTableWriter.exportSymbolTable(symbolTable);
    }

    // TODO - Remove this when ready
    SymbolUtils.checkSymbolTable(symbolTable);

    return true;
  }

  /**
   * This method will house all of the logic for the first pass; this includes
   * the lexical analysis, syntax, and populating the symbol table
   *
   * @param fileName  The code file to compile
   * @return          A boolean true if everything ran correctly
   */
  private boolean runFirstPass(final String fileName) throws IOException {
    if(symbolTable != null) {
      symbolTable.clear();
    }
    return runPass(fileName, new SymbolTableVisitor());
  }

  /**
   * This method will house all of the logic for the second pass; this includes
   * the creating the template classes, iCode, and tCode
   *
   * @param fileName  The code file to compile
   * @return          A boolean true if everything ran correctly
   */
  private boolean runSecondPass(final String fileName) throws IOException {
    return runPass(fileName, new SemanticsVisitor(symbolTable));
  }

  /**
   * This will create visitors of the supplied type and have them visit the
   * grammar tree
   *
   * @param fileName  Root file to be traversed
   * @param visitor   An instance of the type of visitor we want at this time
   * @return          Boolean true if the visitor was able to visit the tree
   *                  without issue
   */
  private boolean runPass(final String fileName, CclCompilerVisitor visitor) throws IOException {
    Map<String,InputStream> streams = new HashMap<>();
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
        streams.put(file, new FileInputStream(new File(file)));
      }
      for(Map.Entry<String, InputStream> entry : streams.entrySet()) {
        visitor.resetToNewPackage(entry.getKey());
        visitCodeTree(entry.getValue(), visitor);
      }
    }
    catch (FileNotFoundException e) {
      logger.error("Unable to load file", e);
      return false;
    }
    catch (Exception e) {
      logger.error("There were errors", e);
      return false;
    }
    finally {
      for(Map.Entry<String, InputStream> entry : streams.entrySet()) {
        if(entry.getValue() != null) {
          entry.getValue().close();
        }
      }
    }

    symbolTable = visitor.getSymbols();

    if(logger.isDebugEnabled()) {
      logger.debug(visitor.toString());
    }

    return true;
  }

  /**
   * This will populate the Set passed in with any unique imports found in the file supplied
   * This will recursively call itself to ensure all import files are found
   * 
   * @param fileName      The name of the file to extract all files to import
   * @param imports       A Set with already discovered import files
   */
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

  /**
   * This will parse and traverse the input stream
   *
   * @param inputStream A stream to pull code characters from
   * @param visitor     The visitor to be used to traverse the newly created tree
   */
  private void visitCodeTree(InputStream inputStream, CclCompilerVisitor visitor) throws IOException {
    if(inputStream == null) {
      logger.warn("Input stream was null");
      return;
    }

    CclGrammarLexer lexer = new CclGrammarLexer(
            CharStreams.fromStream(
                    inputStream,
                    StandardCharsets.UTF_8));
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    CclGrammarParser parser = new CclGrammarParser(tokens);
    ParseTree tree = parser.compilationUnit();

    if(parser.getNumberOfSyntaxErrors() > 0) {
      throw new IllegalStateException(
              "Syntax " + parser.getNumberOfSyntaxErrors() + " errors found");
    }

    visitor.visit(tree);
  }
}
