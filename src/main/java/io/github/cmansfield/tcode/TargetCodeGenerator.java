package io.github.cmansfield.tcode;

import io.github.cmansfield.secondpass.icode.IntermediateCode;
import io.github.cmansfield.firstpass.symbols.Symbol;
import org.apache.commons.collections4.BidiMap;

import java.util.List;

public interface TargetCodeGenerator {
  String getId();
  List<String> getOutput();
  boolean generate(BidiMap<String, Symbol> symbolTable, IntermediateCode iCode);
}
