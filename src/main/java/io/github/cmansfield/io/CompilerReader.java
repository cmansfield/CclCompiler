package io.github.cmansfield.io;

import io.github.cmansfield.secondpass.icode.IntermediateCode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


public class CompilerReader {
  private CompilerReader() {}

  /**
   * This will import a json format iCode file from the default export location
   * 
   * @return            An IntermediateCode pojo
   */
  public static IntermediateCode importICode() throws IOException {
    return importICode(IoConstants.I_CODE_FILE_NAME);    
  }

  /**
   *  This will create an IntermediateCode pojo from the supplied json file
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
}
