package packageLab1;

public class CustomString {
  private int length;
  private String value;

  public CustomString() {
    value = "";
    length = 0;
  }

  public CustomString(String str) {
    value = str;
    length = str.length();
  }

  public void setString(String str) {
    value = str;
    length = str.length();
  }

  public String getString() {
    return value;
  }

  public void findWords(int wordLength) {
    final String CONSONANTS = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";

    String words[] = value.split("[ ,.!?]+");
    int foundWords = 0;

    for (String word : words) {
      if (word.length() == wordLength && CONSONANTS.indexOf(word.charAt(0)) != -1) {
        foundWords++;
        System.out.println(word);
      }
    }

    if (foundWords == 0) {
      System.out.println("NO WORDS MATCHING CONDITION WERE FOUND IN THE TEXT. CHANGE THE LENGTH OR MODIFY THE TEXT");
    }
  }
}