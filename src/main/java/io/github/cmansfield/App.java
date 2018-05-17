package io.github.cmansfield;

import io.github.cmansfield.secondpass.icode.IntermediateCode;
import io.github.cmansfield.compiler.CompilerOptions;
import io.github.cmansfield.compiler.Compiler;
import io.github.cmansfield.io.CompilerReader;
import org.apache.commons.lang3.StringUtils;
import io.github.cmansfield.io.IoConstants;
import org.slf4j.LoggerFactory;
import org.apache.log4j.Level;
import org.slf4j.Logger;

import java.io.IOException;


public class App {
  private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
  private static String fileExt = ".ccl";
  
  private static void usage() {
    LOGGER.info("Usage: CclCompiler <Filename{}>", fileExt);
  }
  
  public static void main(String[] args) throws IOException {
    org.apache.log4j.Logger.getRootLogger().setLevel(Level.TRACE);
    if(args.length != 1) {
      usage();
      return;
    }
    String fileName = args[0];

    if(StringUtils.isBlank(fileName)) {
      LOGGER.error("Filename cannot be blank");
      return;
    }
    
    if(!fileName.endsWith(fileExt)) {
      usage();
      return;
    }

    Compiler compiler = new Compiler(
            CompilerOptions.VERBOSE_CHECK, 
            CompilerOptions.EXPORT_SYMBOL_TABLE, 
            CompilerOptions.EXPORT_I_CODE);
    compiler.compile(fileName);
    
    IntermediateCode iCode = CompilerReader.importICode(IoConstants.EXPORT_DIR + IoConstants.I_CODE_FILE_NAME);

//    Compiler compiler = new Compiler(CompilerOptions.VERBOSE_CHECK);
//    if(!compiler.compile(fileName)) {
//      return;
//    }
//
//    compiler.getICode().forEach(System.out::println);
    
    LOGGER.info("Complete");
  }
}
