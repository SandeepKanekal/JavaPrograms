package Worksheets.Strings;
import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence = sc.nextLine();
        sentence = " " + sentence;
        StringBuilder word = new StringBuilder();
        for (int index = sentence.length() - 1; index >= 0; index--) {  // looping in the reverse order
            if (sentence.charAt(index) != ' ')
                word.insert(0, sentence.charAt(index));
                // same as word = sentence.charAt(index) + word
            else {
                System.out.print(word + " ");
                word = new StringBuilder();
            }
            sc.close();
        }
    }
}
