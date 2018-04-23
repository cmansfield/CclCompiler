package io.github.cmansfield.secondpass;

import java.util.stream.Collectors;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Optional;
import java.util.List;

/*
Semantic Action Record
 */
public class SAR {
  private final String text;
  private List<String> symbolIds;
  private Integer lineNumber;
  private String symbolId;
  private SarType type;

  public SAR(SarType type, String text) {
    this.type = type == null ? SarType.UNKNOWN : type;
    this.text = text == null ? "" : text;
    this.symbolIds = new ArrayList<>();
    this.symbolId = "";
  }
  
  public SAR(SarType type, String symbolId, String text) {
    this(type, text);
    this.symbolId = symbolId == null ? "" : symbolId;
  }

  public SAR(SarType type, String symbolId, String text, Integer lineNumber) {
    this(type, symbolId, text);
    this.lineNumber = lineNumber;
  }

  public SarType getType() {
    return type;
  }

  public void setType(SarType type) {
    this.type = type;
  }
  
  public String getSymbolId() {
    return symbolId == null ? "" : symbolId;
  }
  
  public void setSymbolId(String symbolId) {
    this.symbolId = symbolId;
  }

  public List<String> getSymbolIds() {
    return symbolIds == null ? Collections.emptyList() : symbolIds;
  }

  public void setSymbolIds(List<String> symbolIds) {
    if(symbolIds == null) {
      return;
    }
    this.symbolIds = symbolIds;
  }
  
  public void addSymbolId(String symbolId) {
    if(symbolIds == null) {
      symbolIds = new ArrayList<>();
    }
    symbolIds.add(symbolId);
  }
  
  public Optional<Integer> getLineNumber() {
    return lineNumber == null ? Optional.empty() : Optional.of(lineNumber);
  }

  public void setLineNumber(Integer lineNumber) {
    this.lineNumber = lineNumber;
  }
  
  public String getText() {
    return text;
  }

  @Override
  public String toString() {
    return String.format(
            "SAR - type:%s SymbolId:\'%s\' lineNumber:%s text:\'%s\' argIds(%s)",
            type.toString(),
            getSymbolId(),
            getLineNumber().orElse(-1),
            getText(),
            getSymbolIds().stream().collect(Collectors.joining(", ")));
  }
}
