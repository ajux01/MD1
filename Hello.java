import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

import java.io.File;
import java.math.BigInteger;
import java.nio.file.Files;
import java.security.MessageDigest;
import java.util.concurrent.Callable;

@Command(
  name = "HelloWorld",
  description = "It prints"
) 
public class Hello implements Runnable {
  public static void main (String[] args) {
    new CommandLine(new Hello()).execute(args);
  }
    
   @Override
  public void run() {
    System.out.println("Hello World!");

}

}
