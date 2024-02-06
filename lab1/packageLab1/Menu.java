package packageLab1;

public class Menu {

  private CustomString str = null;
  int numberOfOptions = 7;

  public void execute() {
    int userChoice = 0;

    do {
      printOptions();
      userChoice = Utils.readInteger("\nEnter selected option: ");
      executeSelectedOption(userChoice);
    } while (userChoice != numberOfOptions);
  }

  private void printOptions() {
    System.out.println("\nSelect one of the following options");
    System.out.println("\t1. Read string from console");
    System.out.println("\t2. Read string from input.txt");
    System.out.println("\t3. Use default string given by the program");
    System.out.println("\t4. Display string");
    System.out.println("\t5. Modify string");
    System.out.println("\t6. Extracts all the words of a given length that start with a consonant");
    System.out.println("\t7. Exit program");
  }

  private void executeSelectedOption(int selectedOption) {
    String defaultValue;

    switch (selectedOption) {
      case 1:
        if (str != null) {
          System.out.println("STRING IS ALREADY INITIALIZED. IF YOU WANT TO MODIFY IT, USE ANOTHER OPTION");
        } else {
          defaultValue = Utils.readStringFromConsole("Enter the string you want to analyse and when you finish, hit enter!\nStart here: ");
          str = new CustomString(defaultValue);
        }

        return;

      case 2:    
        if (str != null) {
          System.out.println("STRING IS ALREADY INITIALIZED. IF YOU WANT TO MODIFY IT, USE ANOTHER OPTION");
        } else {
          System.out.println("\nReading string from input.txt");
          defaultValue = Utils.readStringFromFile();
          str = new CustomString(defaultValue);
        }

        return;

      case 3:
        if (str != null) {
          System.out.println("STRING IS ALREADY INITIALIZED. IF YOU WANT TO MODIFY IT, USE ANOTHER OPTION");
        } else {
          str = new CustomString();
        }
        
        return;

      case 4:   
        if (str == null) {
          System.out.println("INITIALIZE THE STRING BEFORE TRYING TO DISPLAY IT");
        } else {
          System.out.println("\nYour string: " + str.getString());
        }

        return;

      case 5:
        if (str == null) {
          System.out.println("INITIALIZE THE STRING BEFORE TRYING TO MODIFY IT");
        } else {
          defaultValue = Utils.readStringFromConsole("Enter the new string: ");
          str.setString(defaultValue);
        }
        
        return;

      case 6:
        int wordLength = Utils.readInteger("Enter the length of the word: ");
        str.findWords(wordLength);
        return;

      case 7:
        System.out.println("Thanks for using my program :)");
        break;

      default: 
        System.out.println("INVALID OPTION SELECTED. TRY AGAIN!");
    }
  }
}