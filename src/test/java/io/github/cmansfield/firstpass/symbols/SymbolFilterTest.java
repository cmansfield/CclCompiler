package io.github.cmansfield.firstpass.symbols;

import io.github.cmansfield.firstpass.symbols.data.AccessModifier;
import io.github.cmansfield.firstpass.symbols.data.DataBuilder;
import io.github.cmansfield.firstpass.symbols.data.Data;
import io.github.cmansfield.compiler.CompilerTestUtils;
import org.apache.commons.collections4.CollectionUtils;
import io.github.cmansfield.parser.CclCompilerVisitor;
import io.github.cmansfield.compiler.CompilerOptions;
import org.apache.commons.collections4.BidiMap;
import org.apache.commons.lang3.StringUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.stream.Collectors;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class SymbolFilterTest {
  private BidiMap<String, Symbol> symbolTable;

  @BeforeClass
  public void setUp() throws IOException {
    symbolTable = CompilerTestUtils.compile("test1.ccl", CompilerOptions.FIRST_PASS_ONLY);
  }

  @Test
  public void test_filter() {
    Symbol filter = new SymbolBuilder()
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
    Symbol classFilter = new SymbolBuilder()
            .text("YourClass")
            .symbolKind(SymbolKind.CLASS)
            .build();
    Symbol classSymbol = SymbolFilter.filter(
            symbolTable,
            classFilter).get(0);
    Symbol filter = new SymbolBuilder()
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
    Data filterData = new DataBuilder()
            .templatePlaceHolder("T")
            .templatePlaceHolder("V")
            .build();
    Symbol filter = new SymbolBuilder()
            .data(filterData)
            .build();
    List<Symbol> symbols = SymbolFilter.filter(
            symbolTable,
            filter);

    assertTrue(CollectionUtils.isNotEmpty(symbols));
    assertEquals(symbols.size(), 1);
    Symbol found = symbols.get(0);
    assertEquals(found.getSymbolKind(), SymbolKind.METHOD);
    assertEquals(found.getText(), "doSomething");
  }

  @Test
  public void test_filter_allPrivateWithInScope() {
    Data filterData = new DataBuilder()
            .accessModifier(AccessModifier.PRIVATE)
            .build();
    Symbol classFilter = new SymbolBuilder()
            .text("YourClass")
            .symbolKind(SymbolKind.CLASS)
            .build();
    Symbol classSymbol = SymbolFilter.filter(
            symbolTable,
            classFilter).get(0);
    Symbol filter = new SymbolBuilder()
            .scope(classSymbol.getScope() + "." + classSymbol.getSymbolId())
            .data(filterData)
            .build();
    List<Symbol> symbols = SymbolFilter.filter(
            symbolTable,
            filter);

    assertTrue(CollectionUtils.isNotEmpty(symbols));
    assertEquals(symbols.size(), 2);
  }
  
  @Test
  public void test_filter_findEmptyStringLiteral() throws IOException {
    BidiMap<String, Symbol> symbolTable = CompilerTestUtils.compile("test9.ccl", CompilerOptions.FIRST_PASS_ONLY);
    Symbol filter = new SymbolBuilder()
            .text("")
            .symbolKind(SymbolKind.STR_LIT)
            .build();
    
    List<Symbol> symbols = SymbolFilter.filter(symbolTable, filter);

    assertNotNull(symbols);
    assertEquals(symbols.size(), 1);
    Symbol symbol = symbols.get(0);
    assertNotNull(symbol);
    assertEquals(symbol.getText(), "");
    assertTrue(StringUtils.isNotBlank(symbol.getSymbolId()));
    assertEquals(symbol.getScope(), CclCompilerVisitor.GLOBAL_SCOPE);
    assertEquals(symbol.getSymbolKind(), SymbolKind.STR_LIT);
    Data data = symbol.getData();
    assertNotNull(data);
    assertEquals(data.getAccessModifiers().get(0), AccessModifier.PUBLIC);
  }

  @Test
  public void test_filter_chainedFiltering() throws IOException {
    BidiMap<String, Symbol> symbolTable = CompilerTestUtils.compile("test1.ccl", CompilerOptions.FIRST_PASS_ONLY);
    List<Symbol> symbols = symbolTable.entrySet().stream()
            .map(Map.Entry::getValue)
            .collect(Collectors.toList());

    List<Symbol> found = SymbolFilter.filter(symbols, new SymbolBuilder()
            .symbolKind(SymbolKind.METHOD)
            .build());
    Symbol foundSymbol = SymbolFilter.filter(found, new SymbolBuilder()
            .text("doSomething")
            .build()).get(0);
    found = SymbolFilter.filter(found, new SymbolBuilder()
            .scope(foundSymbol.getScope())
            .build());

    assertTrue(CollectionUtils.isNotEmpty(found));
    assertEquals(found.size(), 2);
    String scope = found.get(0).getScope();
    assertEquals(found.get(1).getScope(), scope);
  }
}
