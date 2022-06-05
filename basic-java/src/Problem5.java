// This program checks if a string is palindrome
import java.util.Scanner;

public class Problem5 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan kata: ");
    String word = input.next();
    input.close();

    if (checkPalindrome(word)) {
      System.out.println("Palindrome");
    } else {
      System.out.println("Bukan Palindrome");
    }
  }

  public static boolean checkPalindrome(String word) {
    int x, j = word.length()-1; // Create a variable as forward and backward index

    for (x = 0; x < j; x++) { // The x always increasing
      if (word.charAt(x) != word.charAt(j)) {
        return false;
      }

      j--; // The j will decrease
    }

    return true;
  }
}
