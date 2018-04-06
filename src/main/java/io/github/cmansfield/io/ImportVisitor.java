package io.github.cmansfield.io;

import io.github.cmansfield.parser.include.ImportGrammarBaseVisitor;
import io.github.cmansfield.parser.include.ImportGrammarParser;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.util.stream.Collectors;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.io.File;


public class ImportVisitor extends ImportGrammarBaseVisitor {
  private static final Logger LOGGER = LoggerFactory.getLogger(ImportVisitor.class);
  private List<String> imports;

  public ImportVisitor() {
    this.imports = new ArrayList<>();
  }

  public List<String> getImports() {
    return imports == null ? Collections.emptyList() : imports;
  }

  @Override
  public Object visitImportList(ImportGrammarParser.ImportListContext ctx) {
    if(ctx.children == null || ctx.children.isEmpty()) {
      return null;
    }
    imports = ctx.children.stream()
            .filter(node -> node instanceof ImportGrammarParser.ImportDeclarationContext)
            .map(context -> (ImportGrammarParser.ImportDeclarationContext)context)
            .map(this::visitImportDeclaration)
            .map(value -> (String)value)
            .collect(Collectors.toList());
    return null;
  }

  @Override
  public Object visitImportDeclaration(ImportGrammarParser.ImportDeclarationContext ctx) {
    return ctx.children.stream().filter(node -> node instanceof ImportGrammarParser.DirectoryOrFileContext)
            .map(context -> (ImportGrammarParser.DirectoryOrFileContext)context)
            .map(this::visitDirectoryOrFile)
            .map(value -> (String)value)
            .collect(Collectors.joining(File.separator)) + ".ccl";
  }

  @Override
  public Object visitDirectoryOrFile(ImportGrammarParser.DirectoryOrFileContext ctx) {
    return ctx.getText();
  }
}