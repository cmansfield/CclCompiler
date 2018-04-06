package io.github.cmansfield;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.io.IOException;


public class App {
  private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
  private static String fileExt = ".ccl";
  
  private static void usage() {
    LOGGER.info("Usage: CclCompiler <Filename{}>", fileExt);
  }
  
  public static void main(String[] args) throws IOException {
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
    
    Compiler compiler = new Compiler();
    if(!compiler.compile(fileName)) {
      return;
    }

    LOGGER.info("Complete");
  }
}
