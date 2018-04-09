package io.github.cmansfield.secondpass;

import io.github.cmansfield.parser.CclCompilerVisitor;
import io.github.cmansfield.firstpass.symbols.Symbol;
import org.apache.commons.collections4.BidiMap;

public class SemanticsVisitor extends CclCompilerVisitor {

  public SemanticsVisitor(BidiMap<String, Symbol> symbols, String packageName) {
    super(symbols, packageName);
  }


}
