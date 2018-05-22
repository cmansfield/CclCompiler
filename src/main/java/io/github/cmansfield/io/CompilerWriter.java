package io.github.cmansfield.io;

import io.github.cmansfield.secondpass.icode.IntermediateCode;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import io.github.cmansfield.firstpass.symbols.Symbol;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.collections4.BidiMap;

import java.nio.charset.StandardCharsets;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;


public class CompilerWriter {
  private CompilerWriter() {}

  /**
   * This will export the entire symbol table to a json file in a deserialized friendly format
   * 
   * @param symbolTable Symbol table to be exported   
   */
  public static void exportSymbolTable(BidiMap<String, Symbol> symbolTable) throws IOException {
    String fileName = createExportDir() + File.separator + IoConstants.SYMBOL_TABLE_FILE_NAME;
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
   * This will export all of the generated iCode to a json file in a deserialized friendly format
   * 
   * @param iCode   The IntermediateCode object to write out
   */
  public static void exportICode(IntermediateCode iCode) throws IOException {
    String fileNameFull = createExportDir() + File.separator + IoConstants.I_CODE_FILE_NAME;
    ObjectMapper mapper = new ObjectMapper();

    mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

    try (OutputStreamWriter writer = new OutputStreamWriter(
            new FileOutputStream(fileNameFull), StandardCharsets.UTF_8)) {

      String jsonSymbols = mapper.writerWithDefaultPrettyPrinter()
              .writeValueAsString(iCode);
      writer.write(jsonSymbols);
    }
    catch (Exception e) {
      throw new IOException("Unable to save the itermediate code at this time", e);
    }
  }
  
  /**
   * Creates the predetermined export directory
   *
   * @return - Returns a File object of the newly created directory
   */
  private static File createExportDir() {
    File saveFolder = new File(IoConstants.TARGET_DIR);

    try {
      // Try to create the export directory
      saveFolder.mkdir();
    }
    catch (Exception e) {
      throw new RuntimeException(String.format(            // NOSONAR
              "Unable to create directory '%s' at this time%n", 
              IoConstants.TARGET_DIR), e);
    }

    return saveFolder;
  }
}
