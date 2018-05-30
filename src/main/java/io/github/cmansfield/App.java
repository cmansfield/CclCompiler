package io.github.cmansfield;

import io.github.cmansfield.compiler.CompilerOptions;
import io.github.cmansfield.compiler.Compiler;
import io.github.cmansfield.tcode.TargetCodeGenerator;
import io.github.cmansfield.tcode.ccl.two.operand.CclTargetCodeGenerator;
import org.apache.commons.lang3.StringUtils;
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
            CompilerOptions.GENERATE_COMMENTS);
    TargetCodeGenerator tCode = new CclTargetCodeGenerator();
    compiler.addTCodeGenerator(tCode);

    if(!compiler.compile(fileName)) {
      return;
    }

    compiler.getICode().forEach(System.out::println);
    System.out.println();
    System.out.println("tCode:");
    System.out.println(tCode);
    
    LOGGER.info("Complete");
  }
}
