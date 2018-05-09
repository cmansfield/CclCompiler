package io.github.cmansfield.secondpass.icode;

import io.github.cmansfield.parser.Keyword;
import org.apache.commons.lang3.StringUtils;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class IntermediateOpcodesTest {
  
  @Test
  public void test_isOpcode() {
    for(Class<? extends Enum> clazz : IntermediateOpcodes.opcodeClasses) {
      for(Enum code : clazz.getEnumConstants()) {
        assertTrue(IntermediateOpcodes.isOpcode(code.toString()));
      }
    }
    
    assertFalse(IntermediateOpcodes.isOpcode("Test"));
  }
  
  @Test
  public void test_getOpcode() {
    assertEquals(IntermediateOpcodes.getOpcode(Keyword.PLUS.toString()), IntermediateOpcodes.Math.ADD.toString());
    assertEquals(IntermediateOpcodes.getOpcode(Keyword.LESS_EQ.toString()), IntermediateOpcodes.Bool.LE.toString());
    assertEquals(IntermediateOpcodes.getOpcode(Keyword.NOT.toString()), IntermediateOpcodes.Logic.NOT.toString());
    assertTrue(StringUtils.isBlank(IntermediateOpcodes.getOpcode("Test")));
  }
}
