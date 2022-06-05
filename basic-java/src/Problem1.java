import java.util.Scanner;

// This program counts vowel, consonant, and the total of a sentence
public class Problem1 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kalimat: ");
        String sentence = input.nextLine();

        int[] result = findLetter(sentence);

        System.out.println("Jumlah Vokal: " + result[0]);
        System.out.println("Jumlah Konsonan: " + result[1]);
        System.out.println("Total Karakter: " + result[2]);

        input.close();
    }

    public static int[] findLetter(String sentence){
        int[] result = new int[3];
        int vokal = 0;
        int konsonan = 0;
        int total = 0;
        sentence = sentence.toLowerCase().replaceAll(" ", "");
        char[] arrSentence = sentence.toCharArray();

        for (int i = 0; i < sentence.length(); i++) {
            if (arrSentence[i] == 'a' || arrSentence[i] == 'i' || arrSentence[i] == 'u'
            || arrSentence[i] == 'e' || arrSentence[i] == 'o') {
                vokal++;
            } else {
                konsonan++;
            }

            if (arrSentence[i] != ' ') {
                total++;
            }
        } 

        result[0] = vokal;
        result[1] = konsonan;
        result[2] = total;
        return result;
    }
}
