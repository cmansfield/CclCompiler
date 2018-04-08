package io.github.cmansfield.symbols.data;

import org.apache.commons.collections4.CollectionUtils;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.Optional;
import java.util.List;

import static org.testng.Assert.*;


public class DataTest {
  private Data data;

  @BeforeMethod
  public void setUp() {
    data = new Data().new DataBuilder()
            .returnType("int")
            .accessModifier(AccessModifier.PRIVATE)
            .parameter("P104")
            .parameter("P105")
            .parameter("P106")
            .build();
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
    Data otherData = new Data().new DataBuilder()
            .returnType("int")
            .accessModifier(AccessModifier.PRIVATE)
            .parameter("P104")
            .parameter("P105")
            .parameter("P106")
            .build();

    assertTrue(data.equals(otherData));
  }

  @Test
  public void test_notEquals_parameters() {
    Data otherData = new Data().new DataBuilder()
            .returnType("int")
            .accessModifier(AccessModifier.PRIVATE)
            .parameter("P104")
            .parameter("P105")
            .parameter("P100")
            .build();

    assertFalse(data.equals(otherData));
  }

  @Test
  public void test_notEquals_parameterSize() {
    Data otherData = new Data().new DataBuilder()
            .returnType("int")
            .accessModifier(AccessModifier.PRIVATE)
            .parameter("P104")
            .build();

    assertFalse(data.equals(otherData));
  }

  @Test
  public void test_notEquals_accessModifier() {
    Data otherData = new Data().new DataBuilder()
            .returnType("int")
            .accessModifier(AccessModifier.PUBLIC)
            .parameters(data.getParameters())
            .build();

    assertFalse(data.equals(otherData));
  }

  @Test
  public void test_notEquals_returnType() {
    Data otherData = new Data().new DataBuilder()
            .returnType("void")
            .accessModifiers(data.getAccessModifiers())
            .parameters(data.getParameters())
            .build();

    assertFalse(data.equals(otherData));
  }

  @Test
  public void test_notEquals_type() {
    Data otherData = new Data().new DataBuilder()
            .type("bool")
            .returnType("int")
            .accessModifiers(data.getAccessModifiers())
            .parameters(data.getParameters())
            .build();

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
    Data otherData = new Data().new DataBuilder()
            .returnType("int")
            .accessModifier(AccessModifier.PRIVATE)
            .parameter("P104")
            .parameter("P105")
            .parameter("P106")
            .build();

    assertEquals(data.hashCode(), otherData.hashCode());
  }

  @Test
  public void test_failed_hashCode_parameters() {
    Data otherData = new Data().new DataBuilder()
            .returnType("int")
            .accessModifier(AccessModifier.PRIVATE)
            .parameter("P104")
            .parameter("P105")
            .parameter("P107")
            .build();

    assertNotEquals(data.hashCode(), otherData.hashCode());
  }

  @Test
  public void test_failed_hashCode_accessModifier() {
    Data otherData = new Data().new DataBuilder()
            .returnType("int")
            .accessModifier(AccessModifier.PUBLIC)
            .parameters(data.getParameters())
            .build();

    assertNotEquals(data.hashCode(), otherData.hashCode());
  }
  
  @Test
  public void test_equals_templatePlaceHolders() {
    Data data1 = new Data().new DataBuilder()
            .type("int")
            .templatePlaceHolder("T")
            .templatePlaceHolder("K")
            .build();
    Data data2 = new Data().new DataBuilder()
            .type("int")
            .templatePlaceHolder("T")
            .templatePlaceHolder("K")
            .build();
    
    assertNotNull(data1);
    assertNotNull(data2);
    assertEquals(data1, data2);
  }

  @Test
  public void test_equals_failed_templatePlaceHolders_outOfOrder() {
    Data data1 = new Data().new DataBuilder()
            .type("int")
            .templatePlaceHolder("T")
            .templatePlaceHolder("K")
            .build();
    Data data2 = new Data().new DataBuilder()
            .type("int")
            .templatePlaceHolder("K")
            .templatePlaceHolder("T")
            .build();

    assertNotNull(data1);
    assertNotNull(data2);
    assertNotEquals(data1, data2);
  }
  
  @Test
  public void test_build() {
    Data data = new Data().new DataBuilder()
            .type("")
            .returnType("int")
            .accessModifier(AccessModifier.STATIC)
            .accessModifier(AccessModifier.CONST)
            .accessModifiers(Collections.singletonList(AccessModifier.PUBLIC))
            .parameter("P004")
            .parameter("P005")
            .parameters(Collections.singletonList("P006"))
            .build();
    
    assertNotNull(data);
    assertFalse(data.getType().isPresent());
    assertTrue(data.getReturnType().isPresent());
    assertEquals(data.getReturnType().get(), "int");
    
    List<AccessModifier> accessModifiers = data.getAccessModifiers();
    assertTrue(CollectionUtils.isNotEmpty(accessModifiers));
    assertEquals(accessModifiers.size(), 3);
    assertTrue(accessModifiers.contains(AccessModifier.PUBLIC));
    assertTrue(accessModifiers.contains(AccessModifier.CONST));
    assertTrue(accessModifiers.contains(AccessModifier.STATIC));

    List<String> parameters = data.getParameters();
    assertTrue(CollectionUtils.isNotEmpty(parameters));
    assertEquals(parameters.size(), 3);
    assertTrue(parameters.contains("P004"));
    assertTrue(parameters.contains("P005"));
    assertTrue(parameters.contains("P006"));
  }
  
  @Test (expectedExceptions = IllegalArgumentException.class)
  public void test_build_fail_duplicateAccessModifiers() {
    Data data = new Data().new DataBuilder()
            .accessModifier(AccessModifier.PRIVATE)
            .accessModifier(AccessModifier.PRIVATE)
            .accessModifier(AccessModifier.STATIC)
            .build();
    fail("Should have gotten an IllegalArg exception here");
  }
}
