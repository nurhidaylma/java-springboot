// This program gives you the exponential result from the number you input
import java.util.Scanner;

public class Problem6 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // To input the sentence, please do not include any space
    String word = input.next();
    input.close();

    System.out.println(calculate(word));
  }

  public static int calculate(String word) {
    word = word.replaceAll("[^0-9]", "");
    char[] inChar = word.toCharArray();

    int result = Character.getNumericValue(inChar[0]);

    for (int i = 1; i < Character.getNumericValue(inChar[1]); i++) {
      result = result * Character.getNumericValue(inChar[0]);
    }

    return result;
  }
}
