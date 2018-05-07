package io.github.cmansfield.compiler;

public enum Label {
  OVERFLOW("OVERFLOW"),
  UNDERFLOW("UNDRFLOW"),
  HEAPFULL("HEAP_FULL"),
  MAIN("MAIN"),
  ENDIF("END_IF"),
  ENDELSE("END_ELSE"),
  BEGIN("BEGIN"),
  ENDWHILE("END_WHILE"),
  METHOD("METHOD"),
  INIT("INIT"),
  LABEL("LABEL");
  
  private final String value;
  
  Label(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}
