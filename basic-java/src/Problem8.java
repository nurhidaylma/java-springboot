// This program generates multiplication table based on the input number
import java.util.Scanner;

public class Problem8 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int number = input.nextInt();
    input.close();

    createTable(number);
  }

  public static void createTable(int number) {
    for (int i = 1; i <= number; i++) {
      for (int j = 1; j <= number; j++) {
        System.out.format("%4d", i*j);
      }
      System.out.println();
    }
  }
}
