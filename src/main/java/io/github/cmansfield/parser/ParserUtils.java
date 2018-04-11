package io.github.cmansfield.parser;

import io.github.cmansfield.parser.language.CclGrammarParser;
import org.apache.commons.lang3.StringUtils;

public class ParserUtils {
  private ParserUtils() {}

  /**
   * This method will extract the literal keyword values from the grammar.
   * This will help make the compiler more flexible; if a keyword needs to
   * change then it only will have to change in the ANTLR grammar
   * 
   * @param index One of the CclGrammarParser constant ints for each of the 
   *              keywords (Ex. CclGrammarParser.INT)
   * @return      A string value of the keyword (Ex. "int")
   */
  public static String getLiteralName(int index) {
    String type = CclGrammarParser.VOCABULARY.getLiteralName(index);
    if(StringUtils.isNotBlank(type) && type.length() > 2) {
      type = type.substring(1, type.length() - 1);
    }
    if(type == null) {
      throw new IllegalStateException("Could not find the grammar keyword");
    }
    return type;
  }
}
