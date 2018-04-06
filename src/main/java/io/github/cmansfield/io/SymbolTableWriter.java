package io.github.cmansfield.io;

import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.collections4.BidiMap;
import io.github.cmansfield.symbols.Symbol;

import java.nio.charset.StandardCharsets;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;


public class SymbolTableWriter {
  private SymbolTableWriter() {}

  /**
   * This will export the entire symbol table to a json file in a deserialize friendly format
   * 
   * @param symbolTable Symbol table to be exported   
   */
  public static void exportSymbolTable(BidiMap<String, Symbol> symbolTable) throws IOException {
    final String symbolTableFileName = "symbolTable.json";
    String fileName = createExportDir() + File.separator + symbolTableFileName;
    ObjectMapper mapper = new ObjectMapper();

    // The Jdk8Module is used to serialize Optional objects and ensure we get the enclosed object
    mapper.registerModule(new Jdk8Module());
    mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    
    try (OutputStreamWriter writer = new OutputStreamWriter(
            new FileOutputStream(fileName), StandardCharsets.UTF_8)) {
      
      String jsonSymbols = mapper.writerWithDefaultPrettyPrinter()
              .writeValueAsString(symbolTable);
      writer.write(jsonSymbols);
    }
    catch (Exception e) {
      throw new IOException("Unable to save the Symbol Table at this time", e);
    }
  }

  /**
   * Creates the predetermined export directory
   *
   * @return - Returns a File object of the newly created directory
   */
  private static File createExportDir() {
    final String directory = "export";
    File saveFolder = new File(directory);

    try {
      // Try to create the export directory
      saveFolder.mkdir();
    }
    catch (Exception e) {
      throw new RuntimeException(String.format("Unable to create directory '%s' at this time%n", directory), e);   // NOSONAR
    }

    return saveFolder;
  }
}
