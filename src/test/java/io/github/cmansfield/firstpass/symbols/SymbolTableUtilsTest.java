package io.github.cmansfield.firstpass.symbols;

import org.apache.commons.lang3.StringUtils;
import org.testng.annotations.Test;

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class SymbolTableUtilsTest {

  @Test
  public void test_getParentId() {
    String scope = "g.D00003.X00003.F00001";

    String parentId = SymbolTableUtils.getParentSymbolId(scope);

    assertNotNull(parentId);
    assertTrue(StringUtils.isNotBlank(parentId));
    assertEquals(parentId, "F00001");
  }

  @Test
  public void test_getParentId_globalScope() {
    String scope = "g";

    String parentId = SymbolTableUtils.getParentSymbolId(scope);

    assertNotNull(parentId);
    assertTrue(StringUtils.isBlank(parentId));
  }
}
