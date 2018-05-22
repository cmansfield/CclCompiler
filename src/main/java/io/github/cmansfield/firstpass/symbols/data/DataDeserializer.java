package io.github.cmansfield.firstpass.symbols.data;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.core.JsonParser;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;


public class DataDeserializer extends JsonDeserializer<Data> {


  @Override
  public Data deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
    ObjectMapper objectMapper = new ObjectMapper();
    Data.DataBuilder dataBuilder = new Data.DataBuilder();
    JsonNode node = jsonParser.getCodec().readTree(jsonParser);

    Iterator<String> fieldNames = node.fieldNames();
    while(fieldNames.hasNext()) {
      String field = fieldNames.next();
      JsonNode childNode = node.get(field);
      
      if("type".equals(field)) {
        dataBuilder.type(childNode.asText());
      }
      else if("returnType".equals(field)) {
        dataBuilder.returnType(childNode.asText());
      }
      else if("accessModifiers".equals(field)) {
        dataBuilder.accessModifiers(
                objectMapper.convertValue(
                        childNode, 
                        new TypeReference<List<AccessModifier>>(){}));
      }
      else if("templatePlaceHolders".equals(field)) {
        dataBuilder.templatePlaceHolders(
                objectMapper.convertValue(
                        childNode,
                        new TypeReference<List<String>>(){}));
      }
      else if("parameters".equals(field)) {
        dataBuilder.parameters(
                objectMapper.convertValue(
                        childNode,
                        new TypeReference<List<String>>(){}));
      }
      else if("typeAnArray".equals(field)) {
        dataBuilder.isTypeAnArray(objectMapper.convertValue(childNode, Boolean.class));
      }
      else {
        throw new IllegalArgumentException(String.format(
                "Unexpected field '%s' while deserializing a Data json object",
                field));
      }
    }
    
    return dataBuilder.build();
  }
}
