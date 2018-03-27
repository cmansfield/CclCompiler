package io.github.cmansfield;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;


public class App {
  private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
  
  private static void usage() {
    LOGGER.info("Usage: CclCompiler <Filename>");
  }
  
  public static void main(String[] args) {
    if(args.length != 1) {
      usage();
    }
    String fileName = args[0];    
    
    try(BufferedReader inputStream = new BufferedReader(new FileReader(fileName))) {
      String inputLine;
      
      while((inputLine = inputStream.readLine()) != null) {
        LOGGER.info(inputLine);
      }
      
    }
    catch (FileNotFoundException e) {
      LOGGER.warn("Unable to load file {}", fileName);
    }
    catch (Exception e) {
      LOGGER.warn("", e);
    }
    
  }
}
