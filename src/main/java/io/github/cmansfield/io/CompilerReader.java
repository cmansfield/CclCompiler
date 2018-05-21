package io.github.cmansfield.io;

import io.github.cmansfield.secondpass.icode.IntermediateCode;
import io.github.cmansfield.firstpass.symbols.Symbol;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import static io.github.cmansfield.io.IoConstants.EXPORT_DIR;


public class CompilerReader {
  private CompilerReader() {}

  /**
   * This will import a json format iCode file from the default export location
   * 
   * @return            An IntermediateCode pojo
   */
  public static IntermediateCode importICode() throws IOException {
    return importICode(EXPORT_DIR + IoConstants.I_CODE_FILE_NAME);    
  }

  /**
   * This will create an IntermediateCode pojo from the supplied json file
   * 
   * @param fileName    A file with iCode in json format
   * @return            An IntermediateCode pojo
   */
  public static IntermediateCode importICode(String fileName) throws IOException {
    ObjectMapper mapper = new ObjectMapper();

    try(InputStream inputstream = new FileInputStream(fileName)) {
      return mapper.readValue(inputstream, IntermediateCode.class);
    }
    catch (Exception e) {
      throw new IOException("Unable to load file " + fileName, e);
    }
  }

  /**
   * This will import a json format SymbolTable file from the default export location
   * 
   * @return            A Map containing all of the imported Symbols
   */
  public static Map<String, Symbol> importSymbolTable() throws IOException {
    return importSymbolTable(EXPORT_DIR + IoConstants.SYMBOL_TABLE_FILE_NAME);
  }
  
  /**
   * This will create SymbolTable Map from the supplied json file
   * 
   * @param fileName    A file containing the symbol table in json format
   * @return            A Map containing all of the imported Symbols
   */
  public static Map<String, Symbol> importSymbolTable(String fileName) throws IOException {
    throw new UnsupportedOperationException("Need to implement a deserializer for the Symbol and Data classes first");
    
//    ObjectMapper mapper = new ObjectMapper();
//
//    try(InputStream inputstream = new FileInputStream(fileName)) {
//      return mapper.readValue(inputstream, new TypeReference<Map<String, Symbol>>(){});
//    }
//    catch (Exception e) {
//      throw new IOException("Unable to load file " + fileName, e);
//    }
  }
}
