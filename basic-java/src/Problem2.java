// This program compares the number of char 'x' and char 'o' of a word
import java.util.Scanner;

public class Problem2 {
  public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan kata: ");
    String word = input.nextLine();

    System.out.println(countLetter(word));
  }

  public static boolean countLetter(String word) {
    int countX = 0;
    int countO = 0;

    char[] words = word.toCharArray();

    for (int i = 0; i < word.length(); i++) {
      if (words[i] == 'x') {
        countX++;
      } else {
        countO++;
      }
    }

    if (countO == countX) {
      return true;
    }

    return false;
  }
}
