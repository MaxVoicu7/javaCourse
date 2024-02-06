package packageLab1;

import java.util.Scanner;
import java.io.File;

public class Utils {

  public static int readInteger(String message) {
    Scanner inputInt = new Scanner(System.in);
    
    System.out.print(message);
    int value = inputInt.nextInt();

    return value;
  }

  public static String readStringFromConsole(String message) {
    Scanner inputString = new Scanner(System.in);

    System.out.print(message);  
    String value = inputString.nextLine();
     
    return value;
  }

  public static String readStringFromFile() {
    File inputFile = new File("./input.txt");
    Scanner inputStringFromFile = null;
    String value = "";

    try {
      inputStringFromFile = new Scanner(inputFile);

      while (inputStringFromFile.hasNextLine()) {
        value += inputStringFromFile.nextLine() + " ";
      }
    } catch (Exception e) {
      System.out.println("AN ERROR OCCURRED WHILE READING THE FILE!");
      e.printStackTrace();
    } finally {
      if (inputStringFromFile != null) {
        inputStringFromFile.close();
      }
    }
     
    return value;
  }
}