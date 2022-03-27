package Worksheets.Strings;
import java.util.Scanner;

public class WordsInString {  // just counts the number of words in a sentence
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence = sc.nextLine();
        int count = 0;
        for (int index = 0; index < sentence.length(); index++) {
            if (sentence.charAt(index) == ' ')
                count++;
        }
        System.out.println("Number of words = " + (count + 1));
        sc.close();
    }
}
