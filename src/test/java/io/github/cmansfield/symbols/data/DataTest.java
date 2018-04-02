package io.github.cmansfield.symbols.data;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;
import java.util.List;

import static org.testng.Assert.*;


public class DataTest {
  private Data data;

  @BeforeMethod
  public void setUp() {
    List<String> parameters = new ArrayList<>();
    parameters.add("P104");
    parameters.add("P105");
    parameters.add("P106");
    data = new Data("", "int", AccessModifier.PRIVATE, parameters);
  }

  @Test
  public void test_getReturnType() {
    Optional<String> returnType = data.getReturnType();

    assertNotNull(returnType);
    assertTrue(returnType.isPresent());
    assertEquals(returnType.get(), "int");
  }

  @Test
  public void test_getType() {
    Optional<String> type = data.getType();

    assertNotNull(type);
    assertFalse(type.isPresent());
  }

  @Test
  public void test_getEmptyParameters() {
    data = new Data();
    List<String> parameters = data.getParameters();

    assertNotNull(parameters);
    assertTrue(parameters.isEmpty());
    assertEquals(parameters, Collections.emptyList());
  }

  @Test
  public void test_equals() {
    List<String> parameters = new ArrayList<>();
    parameters.add("P104");
    parameters.add("P105");
    parameters.add("P106");
    Data otherData = new Data("", "int", AccessModifier.PRIVATE, parameters);

    assertTrue(data.equals(otherData));
  }

  @Test
  public void test_notEquals_parameters() {
    List<String> parameters = new ArrayList<>();
    parameters.add("P104");
    parameters.add("P105");
    parameters.add("P100");
    Data otherData = new Data("", "int", AccessModifier.PRIVATE, parameters);

    assertFalse(data.equals(otherData));
  }

  @Test
  public void test_notEquals_parameterSize() {
    List<String> parameters = new ArrayList<>();
    parameters.add("P104");
    Data otherData = new Data("", "int", AccessModifier.PRIVATE, parameters);

    assertFalse(data.equals(otherData));
  }

  @Test
  public void test_notEquals_accessModifier() {
    Data otherData = new Data("", "int", AccessModifier.PUBLIC, data.getParameters());

    assertFalse(data.equals(otherData));
  }

  @Test
  public void test_notEquals_returnType() {
    Data otherData = new Data("", "void", data.getAccessModifier(), data.getParameters());

    assertFalse(data.equals(otherData));
  }

  @Test
  public void test_notEquals_type() {
    Data otherData = new Data("bool", "int", data.getAccessModifier(), data.getParameters());

    assertFalse(data.equals(otherData));
  }

  @Test
  public void test_notEquals_differentObjTypes() {
    assertFalse(data.equals("John"));
  }

  @Test
  public void test_Equals_sameObject() {
    assertTrue(data.equals(data));
  }

  @Test
  public void test_hashCode() {
    List<String> parameters = new ArrayList<>();
    parameters.add("P104");
    parameters.add("P105");
    parameters.add("P106");
    Data otherData = new Data("", "int", AccessModifier.PRIVATE, parameters);

    assertEquals(data.hashCode(), otherData.hashCode());
  }

  @Test
  public void test_failed_hashCode_parameters() {
    List<String> parameters = new ArrayList<>();
    parameters.add("P104");
    parameters.add("P105");
    parameters.add("P107");
    Data otherData = new Data("", "int", AccessModifier.PRIVATE, parameters);

    assertNotEquals(data.hashCode(), otherData.hashCode());
  }

  @Test
  public void test_failed_hashCode_accessModifier() {
    Data otherData = new Data("", "int", AccessModifier.PUBLIC, data.getParameters());

    assertNotEquals(data.hashCode(), otherData.hashCode());
  }
}
