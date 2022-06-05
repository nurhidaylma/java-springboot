// This program tells you if a number is prime
import java.util.Scanner;

public class Problem4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan bilangan: ");
    int number = input.nextInt();

    primeNumber(number);
  }

  public static void primeNumber(int number) {
    if (number % 2 != 0 || number == 2) {
      System.out.println("Bilangan prima");
    } else {
      System.out.println("Bukan bilangan prima");
    }
  }
}
