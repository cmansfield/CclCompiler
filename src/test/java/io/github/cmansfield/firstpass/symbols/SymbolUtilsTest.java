package io.github.cmansfield.firstpass.symbols;

import org.apache.commons.lang3.StringUtils;
import org.testng.annotations.Test;

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class SymbolUtilsTest {

  @Test
  public void test_getParentId() {
    String scope = "g.D00003.X00003.F00001";

    String parentId = SymbolUtils.getParentSymbolId(scope);

    assertNotNull(parentId);
    assertTrue(StringUtils.isNotBlank(parentId));
    assertEquals(parentId, "F00001");
  }

  @Test
  public void test_getParentId_globalScope() {
    String scope = "g";

    String parentId = SymbolUtils.getParentSymbolId(scope);

    assertNotNull(parentId);
    assertTrue(StringUtils.isBlank(parentId));
  }

  @Test
  public void test_getPackageId() {
    String scope = "g.D00003.C00003.M000002.F00001";

    String packageId = SymbolUtils.getPackageId(scope);

    assertTrue(StringUtils.isNotBlank(packageId));
    assertEquals(packageId, "D00003");
  }
}
