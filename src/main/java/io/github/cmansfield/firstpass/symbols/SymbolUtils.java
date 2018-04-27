package io.github.cmansfield.firstpass.symbols;

import io.github.cmansfield.firstpass.symbols.data.Data;
import org.apache.commons.collections4.BidiMap;
import org.apache.commons.lang3.StringUtils;
import io.github.cmansfield.parser.Keyword;

import java.util.stream.Collectors;
import java.util.*;

import static io.github.cmansfield.parser.CclCompilerVisitor.GLOBAL_SCOPE;


public class SymbolUtils {
  private SymbolUtils() {}

  /**
   * This will extract and return the parent symbolId from the scope
   *
   * @param scope The scope to pull the parentId from
   * @return      The parent symbolId discovered, or empty string if not
   */
  public static String getParentSymbolId(String scope) {
    int index = scope.lastIndexOf('.');
    if(index < 0) {
      return "";
    }
    return scope.substring(index + 1, scope.length());
  }

  /**
   * This method will check to make sure all of the symbolIds stored in the
   * symbols actually exist in the symbol table, will throw an
   * IllegalStateException if there is an error
   *
   * @param symbolTable The symbol table to validate
   */
  public static void checkSymbolTable(BidiMap<String, Symbol> symbolTable) {
    symbolTable.entrySet().stream()
            .filter(Objects::nonNull)
            .map(Map.Entry::getValue)
            .filter(Objects::nonNull)
            .map(symbol -> checkParameters(symbolTable, symbol))
            .forEach(symbol -> checkScope(symbolTable, symbol));
  }
  
  /**
   * This will check to make sure all of the parameter IDs found exist in
   * the symbol table, will throw an IllegalStateException if there is an error
   *
   * @param symbolTable Symbol table to look up IDs
   * @param symbol      The Symbol who's parameters are being checked
   * @return            The unmodified Symbol object
   */
  private static Symbol checkParameters(BidiMap<String, Symbol> symbolTable, Symbol symbol) {
    if(symbol == null || symbol.getData() == null) {
      return symbol;
    }
    Data data = symbol.getData();
    data.getParameters().forEach(parameter -> {
      if(!symbolTable.containsKey(parameter)) {
        throw new IllegalStateException(
                String.format("Parameter %s is not in the symbol table", parameter));
      }
    });
    return symbol;
  }

  /**
   * This will check to make sure all of the IDs in a scope exist in
   * the symbol table, will throw an IllegalStateException if there is an error
   *
   * @param symbolTable Symbol table to look up IDs
   * @param symbol      The Symbol who's scope is being checked
   * @return            The unmodified Symbol object
   */
  private static Symbol checkScope(BidiMap<String, Symbol> symbolTable, Symbol symbol) {
    if(symbol == null || StringUtils.isBlank(symbol.getScope())) {
      return symbol;
    }
    String scope = symbol.getScope();
    String parentId;

    while(StringUtils.isNotBlank(parentId = getParentSymbolId(scope))) {
      if(!symbolTable.containsKey(parentId)) {
        throw new IllegalStateException(
                String.format("SymbolId %s is not in the symbol table", parentId));
      }
      scope = symbolTable.get(parentId).getScope();
    }

    return symbol;
  }

  /**
   * This method will extract the correct type for the given Symbol
   *
   * @param symbol    Symbol to extract a type from
   * @return          A string value of the discovered type
   */
  public static String getSymbolType(Symbol symbol) {
    if(symbol == null) {
      return "";
    }
    if(symbol.getSymbolKind() == SymbolKind.CLASS) {
      return symbol.getText();
    }
    Data data = symbol.getData();
    boolean isArray = data.isTypeAnArray();

    if(data.getType().isPresent()) {
      return data.getType().orElse("") + (isArray ? "[]" : "");
    }
    return data.getReturnType().orElse("") + (isArray ? "[]" : "");
  }

  /**
   * This method will simplify method text formatting for logging and errors
   *
   * @param symbolTable     Symbol table to look up IDs
   * @param methodSymbol    The method Symbol to format
   * @return                The method in string format
   */
  public static String formatMethodText(BidiMap<String, Symbol> symbolTable, Symbol methodSymbol) {
    return String.format("%s %s(%s)",
            methodSymbol.getData().getReturnType().orElse(Keyword.VOID.toString()),
            methodSymbol.getText(),
            methodSymbol.getData().getParameters().stream()
                    .map(symbolTable::get)
                    .map(Symbol::getData)
                    .map(Data::getType)
                    .filter(Optional::isPresent)
                    .map(Optional::get)
                    .collect(Collectors.joining(", ")));
  }

  /**
   *  This method will convert a typical scope format into a user friendly format
   *  Ex. scope: g.D00001.C000001.M00001  ->  g.D00001.TestClass.someMethod
   *
   * @param symbolTable   Symbol table to look up IDs
   * @param scope         The scope to convert to a ready friendly format
   * @return              The scope in a user friendly format
   */
  public static String formatScopeText(BidiMap<String, Symbol> symbolTable, String scope) {
    String workingScope = scope;
    String scopeText = "";
    String symbolId;

    while(StringUtils.isNotBlank(symbolId = getParentSymbolId(workingScope))) {
      Symbol symbol = symbolTable.get(symbolId);
      scopeText = (symbol.getSymbolKind() == SymbolKind.PACKAGE
                ? symbolId
                : symbol.getText())
              + (StringUtils.isBlank(scopeText)
                ? ""
                : "." + scopeText);
      workingScope = symbol.getScope();
    }

    return GLOBAL_SCOPE + (StringUtils.isBlank(scopeText) ? "" : "." + scopeText);
  }
}