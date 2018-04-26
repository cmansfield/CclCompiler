package io.github.cmansfield.secondpass;

import io.github.cmansfield.firstpass.symbols.SymbolKind;

public enum SarType {
  IDENTIFIER,
  LITERAL,
  REFERENCE,
  TYPE,
  METHOD,
  BEGINNING_ARG_LIST,
  ARG_LIST,
  ARRAY,
  TEMPLATE,
  TEMPORARY,
  UNKNOWN;

  /**
   * This method will return the type of SAR given the Symbols type
   *
   * @param symbolKind  The type of Symbol
   * @return            The matched SarType to Symbol type
   */
  public static SarType getSarType(SymbolKind symbolKind) {
    switch (symbolKind) {
      case PARAM:
      case LOCAL_VAR:
      case INSTANCE_VAR:
        return SarType.IDENTIFIER;
      case CLASS:
        return SarType.TYPE;
      case MAIN:
      case METHOD:
      case CONSTRUCTOR:
        return SarType.METHOD;
      case INT_LIT:
      case STR_LIT:
      case CHAR_LIT:
      case BOOL_LIT:
      case SPECIAL_LIT:
        return SarType.LITERAL;
      case FOR:
      case BLOCK:
      case PACKAGE:
        return SarType.UNKNOWN;
      default:
        return SarType.UNKNOWN;
    }
  }
}
