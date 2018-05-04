package io.github.cmansfield.secondpass.icode;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class QuadTest {
  
  @Test (enabled = false)
  public void test_quad_toString() {
    List<Quad> quads = new ArrayList<>();
    quads.add(new Quad("AND", "L00001", "I00001", "T00001"));
    quads.get(0).setLabel("FOR_001");
    quads.add(new Quad("PEEK", "L00001"));
    quads.add(new Quad("GT", "L00001", "I00001", "T00001"));
    quads.add(new Quad("JMP", "LABEL"));
    quads.get(3).setComment("This is a test comment");
    quads.add(new Quad("FRAME", "L00001", "I00001"));

    quads.forEach(System.out::println);
  }
  
  @Test (enabled = false)
  public void test_deleteMe() {
    String opcode = IntermediateOpcodes.getOpcode("<");

    System.out.println();
  }
}
