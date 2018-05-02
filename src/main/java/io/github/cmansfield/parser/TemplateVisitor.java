package io.github.cmansfield.parser;

import io.github.cmansfield.firstpass.symbols.Symbol;

import java.util.List;

public interface TemplateVisitor extends CompilerVisitor {
  void compileTemplateClass(Symbol templateClass, List<String> templateTypes, int lineNumber);
}
