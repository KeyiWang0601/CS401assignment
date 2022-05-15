import java.io.*;
import java.util.*;

public class Lab0
{
  public static void main( String[] args ) throws Exception
  {
    Scanner kbd = new Scanner( System.in );
    String name;
    int htIninches;
    System.out.print(" Enter your height: ");
    htIninches = kbd.nextInt();
    System.out.println( "You are " + htIninches + " tall");
  }
}
