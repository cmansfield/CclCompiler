package io.github.cmansfield.firstpass.symbols;

import io.github.cmansfield.firstpass.symbols.data.Data;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.BidiMap;
import org.apache.commons.lang3.StringUtils;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SymbolFilter {
  private SymbolFilter() {}

  /**
   * This method will filter out a list of Symbols that match the supplied
   * elements of the filter object. If the filter object does not contain a
   * value then that value is not matched against the other Symbol
   *
   * @param symbolTable The table object to get Symbols to iterate over
   * @param filter      The Symbol object to match against
   * @return            A list of all of the Symbols that matched against
   *                    the filter
   */
  public static List<Symbol> filter(BidiMap<String, Symbol> symbolTable, Symbol filter) {
    Map<Object, Function<Symbol,Object>> filterMap = generateFilterMap(filter);

    return symbolTable.entrySet().stream()
            .map(Map.Entry::getValue)
            .filter(symbol -> filterMap.entrySet().stream()
                      .allMatch(entry -> {
                        Object filterField = entry.getKey();
                        Object symbolField = entry.getValue().apply(symbol);

                        if(filterField instanceof Data) {
                          return dataContains((Data)filterField, (Data)symbolField);
                        }
                        return filterField.equals(symbolField); }))
            .collect(Collectors.toList());
  }

  /**
   * Basic filter method for Data objects, checks to see if the symbol's Data
   * object matches what the filter is looking for.
   *
   * @param filterData  The filter's Data object to match against
   * @param symbolData  The Data object to see if it matches with the filter
   * @return            Boolean true if they match
   */
  private static boolean dataContains(Data filterData, Data symbolData) {
    if(filterData.getReturnType().isPresent()) {
      if(!symbolData.getReturnType().isPresent()) {
        return false;
      }
      if(!filterData.getReturnType().get().equals(symbolData.getReturnType().get())) {
        return false;
      }
    }
    if(filterData.getType().isPresent()) {
      if(!symbolData.getType().isPresent()) {
        return false;
      }
      if(!filterData.getType().get().equals(symbolData.getType().get())) {
        return false;
      }
    }
    if(CollectionUtils.isNotEmpty(filterData.getParameters())) {
      if(!symbolData.getParameters().containsAll(filterData.getParameters())) {
        return false;
      }
    }
    if(CollectionUtils.isNotEmpty(filterData.getAccessModifiers())) {
      if(!symbolData.getAccessModifiers().containsAll(filterData.getAccessModifiers())) {
        return false;
      }
    }
    if(CollectionUtils.isNotEmpty(filterData.getTemplatePlaceHolders())) {
      if(!symbolData.getTemplatePlaceHolders().containsAll(filterData.getTemplatePlaceHolders())) {
        return false;
      }
    }

    return true;
  }

  /**
   * This method will return a map of all of the filter methods that yield a value
   * and exclude those that are blank or null. This will make filtering much faster
   * if we don't have to call those unused methods for each Symbol. We need to use
   * a Function for each Symbol we are comparing against because we don't know the
   * instance until we begin comparing.
   *
   * @param filter  The Symbol object used to find all other Symbol objects that
   *                closely match it
   * @return        A Map of filter values and Functions used for comparisons
   */
  private static Map<Object, Function<Symbol,Object>> generateFilterMap(Symbol filter) {
    Map<Object, Function<Symbol,Object>> map = new HashMap<>();

    if(StringUtils.isNotBlank(filter.getScope())) {
      map.put(filter.getScope(), Symbol::getScope);
    }
    if(StringUtils.isNotBlank(filter.getSymbolId())) {
      map.put(filter.getSymbolId(), Symbol::getSymbolId);
    }
    if(StringUtils.isNotBlank(filter.getText()) || filter.getSymbolKind() == SymbolKind.STR_LIT) {
      map.put(filter.getText(), Symbol::getText);
    }
    if(filter.getSymbolKind() != SymbolKind.UNKNOWN) {
      map.put(filter.getSymbolKind(), Symbol::getSymbolKind);
    }
    if(!filter.getData().equals(new Data())) {
      map.put(filter.getData(), Symbol::getData);
    }

    return map;
  }
}
