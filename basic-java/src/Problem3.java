// This program lists the factorial number of an input number
import java.util.Scanner;

public class Problem3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Masukkan angka: ");
    int number = input.nextInt();
    input.close();

    findFactor(number);
  }

  public static void findFactor(int number) {
    for (int i = 1; i <= number; i++) {
      if (number%i == 0) {
        System.out.println(i);
      }
    }
  }
}
