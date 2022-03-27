package Worksheets.Strings;
import java.util.Scanner;

public class ReverseWordInSentence {  // reverses each character in the sentence
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence = sc.nextLine();
        sentence = sentence + " ";
        StringBuilder ReversedWord = new StringBuilder();
        for (int index = 0; index < sentence.length(); index++) {
            if (sentence.charAt(index) != ' ')
                ReversedWord.insert(0, sentence.charAt(index));  // same as ReversedWord = sentence.charAt(index) + ReversedWord
            else {
                System.out.print(ReversedWord.append(" "));
                ReversedWord = new StringBuilder();  // emptying the value if the character is a space
            }
        }
        sc.close();
    }
}
