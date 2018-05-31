package io.github.cmansfield.secondpass.icode;

import io.github.cmansfield.parser.Keyword;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IntermediateOpcodeTest {
  
  @Test
  public void test_isOpcode() {
    for(Enum code : IntermediateOpcode.class.getEnumConstants()) {
      assertTrue(IntermediateOpcode.isOpcode(code.toString()));
    }
    assertFalse(IntermediateOpcode.isOpcode("Test"));
  }
  
  @Test
  public void test_getOpcode() {
    assertEquals(IntermediateOpcode.getOpcode(Keyword.PLUS.toString()), IntermediateOpcode.ADD);
    assertEquals(IntermediateOpcode.getOpcode(Keyword.LESS_EQ.toString()), IntermediateOpcode.LE);
    assertEquals(IntermediateOpcode.getOpcode(Keyword.NOT.toString()), IntermediateOpcode.NOT);
    assertNull(IntermediateOpcode.getOpcode("Test"));
  }
}
