package io.github.cmansfield.parser;

import io.github.cmansfield.parser.language.CclGrammarParser;
import org.apache.commons.lang3.StringUtils;

import java.util.stream.Collectors;
import java.util.List;

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

  /**
   * This will get a string representation of a type and check to see if it is a primitive type
   * 
   * @param type  The type to check against
   * @return      Boolean true if it is a primitive 
   */
  public static boolean isPrimitiveType(String type) {
    if(StringUtils.isBlank(type)) {
      return false;
    }
    if(type.equals(Keyword.INT.toString())) {
      return true;
    }
    if(type.equals(Keyword.CHAR.toString())) {
      return true;
    }
    if(type.equals(Keyword.BOOL.toString())) {
      return true;
    }
    if(type.equals(Keyword.STRING.toString())) {
      return true;
    }
    return type.equals(Keyword.VOID.toString());
  }

  /**
   * This will correctly format the defined template types into a formatted string
   * 
   * @param templateTypes   List of defined template types
   * @return                A formatted String with the supplied types
   */
  public static String templateTextFormat(List<String> templateTypes) {
    boolean isTemplate = !templateTypes.isEmpty();
    return String.format(
            "%s%s%s",
            isTemplate ? "<" : "",
            templateTypes.stream().collect(Collectors.joining(",")),
            isTemplate ? ">" : "");
  }
}
