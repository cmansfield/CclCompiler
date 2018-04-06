package io.github.cmansfield.symbols.data;

import org.testng.annotations.Test;

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;


public class AccessModifierTest {
  
  @Test
  public void test_find() {
    for(AccessModifier accessModifier : AccessModifier.class.getEnumConstants()) {
      assertEquals(accessModifier, AccessModifier.find(accessModifier.toString()));
    }
  }
  
  @Test
  public void test_find_notFound() {
    AccessModifier accessModifier = AccessModifier.find("Garbage");
    
    assertNull(accessModifier);
  }
  
  @Test
  public void test_find_noVal() {
    AccessModifier accessModifier = AccessModifier.find(null);

    assertNull(accessModifier);
  }
  
  @Test
  public void test_find_differentCase() {
    AccessModifier accessModifier = AccessModifier.find("PRIVATE");

    assertNotNull(accessModifier);
    assertEquals(accessModifier, AccessModifier.PRIVATE);
  }
}
