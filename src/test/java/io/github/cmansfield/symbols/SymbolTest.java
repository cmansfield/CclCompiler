package io.github.cmansfield.symbols;

import io.github.cmansfield.symbols.data.AccessModifier;
import io.github.cmansfield.symbols.data.Data;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.testng.Assert.*;


public class SymbolTest {
  private Symbol symbol;

  @BeforeMethod
  public void setUp() {
    List<String> parameters = new ArrayList<>();
    parameters.add("P104");
    parameters.add("P105");
    parameters.add("P106");
    symbol = new Symbol().new SymbolBuilder()
            .scope("g.MyClass_package.MyClass")
            .symbolId("M004")
            .text("MyClass")
            .symbolKind(SymbolKind.METHOD)
            .data(new Data("", "int", Collections.singletonList(AccessModifier.PRIVATE), parameters))
            .build();
  }

  @Test
  public void test_equals() {
    List<String> moreParameters = new ArrayList<>();
    moreParameters.add("P104");
    moreParameters.add("P105");
    moreParameters.add("P106");
    Symbol anotherSymbol = new Symbol().new SymbolBuilder()
            .scope("g.MyClass_package.MyClass")
            .symbolId("M004")
            .text("MyClass")
            .symbolKind(SymbolKind.METHOD)
            .data(new Data("", "int", Collections.singletonList(AccessModifier.PRIVATE), moreParameters))
            .build();

    assertTrue(symbol.equals(anotherSymbol));
  }

  @Test
  public void test_equals_sameObj() {
    assertTrue(symbol.equals(symbol));
  }

  @Test
  public void test_equals_differentSymbolIds() {
    Symbol anotherSymbol = new Symbol().new SymbolBuilder()
            .scope("g.MyClass_package.MyClass")
            .symbolId("M010")
            .text("MyClass")
            .symbolKind(SymbolKind.METHOD)
            .data(symbol.getData().isPresent() ? symbol.getData().get() : null)
            .build();

    assertTrue(symbol.equals(anotherSymbol));
  }

  @Test
  public void test_notEquals_dataParameters() {
    List<String> moreParameters = new ArrayList<>();
    moreParameters.add("P104");
    moreParameters.add("P105");
    moreParameters.add("P107");
    Symbol anotherSymbol = new Symbol().new SymbolBuilder()
            .scope("g.MyClass_package.MyClass")
            .symbolId("M004")
            .text("MyClass")
            .symbolKind(SymbolKind.METHOD)
            .data(new Data("", "int", Collections.singletonList(AccessModifier.PRIVATE), moreParameters))
            .build();

    assertFalse(symbol.equals(anotherSymbol));
  }

  @Test
  public void test_notEquals_nullObj() {
    assertFalse(symbol.equals(null));
  }

  @Test
  public void test_notEquals_differentObjType() {
    assertFalse(symbol.equals("John"));
  }

  @Test
  public void test_notEquals_symbolKind() {
    Symbol anotherSymbol = new Symbol().new SymbolBuilder()
            .scope("g.MyClass_package.MyClass")
            .symbolId("M004")
            .text("MyClass")
            .symbolKind(SymbolKind.CLASS)
            .data(symbol.getData().isPresent() ? symbol.getData().get() : null)
            .build();

    assertFalse(symbol.equals(anotherSymbol));
  }

  @Test
  public void test_notEquals_text() {
    Symbol anotherSymbol = new Symbol().new SymbolBuilder()
            .scope("g.MyClass_package.MyClass")
            .symbolId("M004")
            .text("YourClass")
            .symbolKind(SymbolKind.METHOD)
            .data(symbol.getData().isPresent() ? symbol.getData().get() : null)
            .build();

    assertFalse(symbol.equals(anotherSymbol));
  }

  @Test
  public void test_hashCode_differentSymbolIds() {
    List<String> moreParameters = new ArrayList<>();
    moreParameters.add("P104");
    moreParameters.add("P105");
    moreParameters.add("P106");
    Symbol anotherSymbol = new Symbol().new SymbolBuilder()
            .scope("g.MyClass_package.MyClass")
            .symbolId("M010")
            .text("MyClass")
            .symbolKind(SymbolKind.METHOD)
            .data(new Data("", "int", Collections.singletonList(AccessModifier.PRIVATE), moreParameters))
            .build();

    assertEquals(symbol.hashCode(), anotherSymbol.hashCode());
  }

  @Test
  public void test_fail_hashCode_differentParameters() {
    List<String> moreParameters = new ArrayList<>();
    moreParameters.add("P104");
    moreParameters.add("P105");
    moreParameters.add("P114");
    Symbol anotherSymbol = new Symbol().new SymbolBuilder()
            .scope("g.MyClass_package.MyClass")
            .symbolId("M004")
            .text("MyClass")
            .symbolKind(SymbolKind.METHOD)
            .data(new Data("", "int", Collections.singletonList(AccessModifier.PRIVATE), moreParameters))
            .build();

    assertNotEquals(symbol.hashCode(), anotherSymbol.hashCode());
  }
}
