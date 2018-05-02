package io.github.cmansfield.parser;

import io.github.cmansfield.parser.language.CclGrammarParser;
import io.github.cmansfield.firstpass.symbols.Symbol;
import org.apache.commons.collections4.BidiMap;

import java.util.List;

public interface CompilerVisitor {
  BidiMap<String, Symbol> getSymbols();
  List<CclGrammarParser.ClassDeclarationContext> getTemplateClassContexts();
  void resetToNewPackage(String packageName);
}
