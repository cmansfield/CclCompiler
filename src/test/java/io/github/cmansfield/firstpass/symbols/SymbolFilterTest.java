package io.github.cmansfield.firstpass.symbols;

import io.github.cmansfield.firstpass.symbols.data.AccessModifier;
import io.github.cmansfield.compiler.syntax.CompilerTest;
import io.github.cmansfield.firstpass.symbols.data.Data;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.BidiMap;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class SymbolFilterTest {
  private BidiMap<String, Symbol> symbolTable;

  @BeforeClass
  public void setUp() throws IOException {
    CompilerTest compilerTest = new CompilerTest();
    symbolTable = compilerTest.compile("test1.ccl");
  }

  @Test
  public void test_filter() {
    Symbol filter = new Symbol().new SymbolBuilder()
            .text("TestClass")
            .symbolKind(SymbolKind.CLASS)
            .build();
    List<Symbol> symbols = SymbolFilter.filter(
            symbolTable,
            filter);

    assertTrue(CollectionUtils.isNotEmpty(symbols));
    assertEquals(symbols.size(), 1);
    Symbol found = symbols.get(0);
    assertEquals(found.getText(), filter.getText());
    assertEquals(found.getSymbolKind(), filter.getSymbolKind());
  }

  @Test
  public void test_filter_everythingWithInScope() {
    Symbol classFilter = new Symbol().new SymbolBuilder()
            .text("YourClass")
            .symbolKind(SymbolKind.CLASS)
            .build();
    Symbol classSymbol = SymbolFilter.filter(
            symbolTable,
            classFilter).get(0);
    Symbol filter = new Symbol().new SymbolBuilder()
            .scope(classSymbol.getScope() + "." + classSymbol.getSymbolId())
            .build();
    List<Symbol> symbols = SymbolFilter.filter(
            symbolTable,
            filter);

    assertTrue(CollectionUtils.isNotEmpty(symbols));
    assertEquals(symbols.size(), 4);
  }

  @Test
  public void test_filter_Data() {
    Data filterData = new Data().new DataBuilder()
            .templatePlaceHolder("T")
            .templatePlaceHolder("V")
            .build();
    Symbol filter = new Symbol().new SymbolBuilder()
            .data(filterData)
            .build();
    List<Symbol> symbols = SymbolFilter.filter(
            symbolTable,
            filter);

    assertTrue(CollectionUtils.isNotEmpty(symbols));
    assertEquals(symbols.size(), 1);
    Symbol found = symbols.get(0);
    assertEquals(found.getSymbolKind(), SymbolKind.TEMPLATE_METHOD);
    assertEquals(found.getText(), "doSomething");
  }

  @Test
  public void test_filter_allPrivateWithInScope() {
    Data filterData = new Data().new DataBuilder()
            .accessModifier(AccessModifier.PRIVATE)
            .build();
    Symbol classFilter = new Symbol().new SymbolBuilder()
            .text("YourClass")
            .symbolKind(SymbolKind.CLASS)
            .build();
    Symbol classSymbol = SymbolFilter.filter(
            symbolTable,
            classFilter).get(0);
    Symbol filter = new Symbol().new SymbolBuilder()
            .scope(classSymbol.getScope() + "." + classSymbol.getSymbolId())
            .data(filterData)
            .build();
    List<Symbol> symbols = SymbolFilter.filter(
            symbolTable,
            filter);

    assertTrue(CollectionUtils.isNotEmpty(symbols));
    assertEquals(symbols.size(), 2);
  }
}
