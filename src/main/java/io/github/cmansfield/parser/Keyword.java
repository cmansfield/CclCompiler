package io.github.cmansfield.parser;

import io.github.cmansfield.parser.language.CclGrammarParser;

public enum Keyword {
  PUBLIC(ParserUtils.getLiteralName(CclGrammarParser.PUBLIC)),
  PRIVATE(ParserUtils.getLiteralName(CclGrammarParser.PRIVATE)),
  STATIC(ParserUtils.getLiteralName(CclGrammarParser.STATIC)),
  CONST(ParserUtils.getLiteralName(CclGrammarParser.CONST)),
  INT(ParserUtils.getLiteralName(CclGrammarParser.INT)),
  CHAR(ParserUtils.getLiteralName(CclGrammarParser.CHAR)),
  BOOL(ParserUtils.getLiteralName(CclGrammarParser.BOOL)),
  STRING(ParserUtils.getLiteralName(CclGrammarParser.STRING)),
  VOID(ParserUtils.getLiteralName(CclGrammarParser.VOID)),
  TRUE(ParserUtils.getLiteralName(CclGrammarParser.TRUE)),
  FALSE(ParserUtils.getLiteralName(CclGrammarParser.FALSE)),
  NULL(ParserUtils.getLiteralName(CclGrammarParser.NULL)),
  THIS(ParserUtils.getLiteralName(CclGrammarParser.THIS)),
  IF(ParserUtils.getLiteralName(CclGrammarParser.IF)),
  ELSE(ParserUtils.getLiteralName(CclGrammarParser.ELSE)),
  WHILE(ParserUtils.getLiteralName(CclGrammarParser.WHILE)),
  FOR(ParserUtils.getLiteralName(CclGrammarParser.FOR)),
  NEW(ParserUtils.getLiteralName(CclGrammarParser.NEW)),
  RETURN(ParserUtils.getLiteralName(CclGrammarParser.RETURN)),
  PRINT(ParserUtils.getLiteralName(CclGrammarParser.PRINT)),
  READ(ParserUtils.getLiteralName(CclGrammarParser.READ)),
  SPAWN(ParserUtils.getLiteralName(CclGrammarParser.SPAWN)),
  SET(ParserUtils.getLiteralName(CclGrammarParser.SET)),
  BLOCK(ParserUtils.getLiteralName(CclGrammarParser.BLOCK)),
  LOCK(ParserUtils.getLiteralName(CclGrammarParser.LOCK)),
  UNLOCK(ParserUtils.getLiteralName(CclGrammarParser.UNLOCK)),
  IMPORT(ParserUtils.getLiteralName(CclGrammarParser.IMPORT)),
  CLASS(ParserUtils.getLiteralName(CclGrammarParser.CLASS)),
  MAIN(ParserUtils.getLiteralName(CclGrammarParser.MAIN)),
  NOT_EQ(ParserUtils.getLiteralName(CclGrammarParser.NOT_EQ)),
  NOT(ParserUtils.getLiteralName(CclGrammarParser.NOT)),
  AND(ParserUtils.getLiteralName(CclGrammarParser.AND)),
  OR(ParserUtils.getLiteralName(CclGrammarParser.OR)),
  PLUS(ParserUtils.getLiteralName(CclGrammarParser.PLUS)),
  MINUS(ParserUtils.getLiteralName(CclGrammarParser.MINUS)),
  MULTI(ParserUtils.getLiteralName(CclGrammarParser.MULTI)),
  DIV(ParserUtils.getLiteralName(CclGrammarParser.DIV)),
  EQUALS(ParserUtils.getLiteralName(CclGrammarParser.EQUALS)),
  LESS_EQ(ParserUtils.getLiteralName(CclGrammarParser.LESS_EQ)),
  GREAT_EQ(ParserUtils.getLiteralName(CclGrammarParser.GREAT_EQ)),
  LESS(ParserUtils.getLiteralName(CclGrammarParser.LESS)),
  GREATER(ParserUtils.getLiteralName(CclGrammarParser.GREATER)),
  ASSIGN(ParserUtils.getLiteralName(CclGrammarParser.ASSIGN)),
  QUESTION(ParserUtils.getLiteralName(CclGrammarParser.QUESTION)),
  COLON(ParserUtils.getLiteralName(CclGrammarParser.COLON));
  
  private final String value;
  
  Keyword(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}
