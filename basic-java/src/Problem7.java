// This program prints a pyramid of asterisk based on the number you input
import java.util.Scanner;

public class Problem7 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan jumlah baris: ");
    int number = input.nextInt();

    input.close();

    asterisk(number);
  }
  
  public static void asterisk(int number) {
    int k = 0;

    for (int i = 1; i <= number; ++i, k=0) {
      for (int space = 1; space <= number-i; ++space) {
        System.out.print("  ");
      }

      while (k != 2*i-1) {
        System.out.print("* ");
        ++k;
      }

      System.out.println();
    }
    
  }
}
