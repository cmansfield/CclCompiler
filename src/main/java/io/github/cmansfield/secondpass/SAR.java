package io.github.cmansfield.secondpass;

import java.util.Optional;

/*
Semantic Action Record
 */
public class SAR {
  private final SarType type;
  private String symbolId;
  private Integer lineNumber;
  private String text;

  public SAR(SarType type, String symbolId, String text) {
    this.type = type == null ? SarType.UNKNOWN : type;
    this.symbolId = symbolId == null ? "" : symbolId;
    this.text = text == null ? "" : text;
  }

  public SAR(SarType type, String symbolId, String text, Integer lineNumber) {
    this(type, symbolId, text);
    this.lineNumber = lineNumber;
  }

  public SarType getType() {
    return type;
  }

  public String getSymbolId() {
    return symbolId;
  }

  public Optional<Integer> getLineNumber() {
    return lineNumber == null ? Optional.empty() : Optional.of(lineNumber);
  }

  public String getText() {
    return text;
  }
}
