package Worksheets.Strings;
import java.util.Scanner;

public class LongestWordInSentence {
    public String extractLongest(String sentence) {
        sentence += " ";
        String LongestWord = "";
        StringBuilder word = new StringBuilder();
        for (int index = 0; index < sentence.length(); index++) {
            if (sentence.charAt(index) != ' ')
                word.append(sentence.charAt(index));  // getting each word from the sentence
                // same as word += sentence.charAt(index);
            if (sentence.charAt(index) == ' ' && word.length() > LongestWord.length()) {
                LongestWord = word.toString();  // <LongestWord> stores <word.toString()> if <word.length()> is more than <LongestWord.length()>
                word = new StringBuilder();  // <word> now stores no value
            }
        }
        return LongestWord;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence = sc.nextLine();
        LongestWordInSentence Ob = new LongestWordInSentence();
        System.out.println();
        System.out.println("Longest word : " + Ob.extractLongest(sentence) + "\n" + "Length of Longest word : " + Ob.extractLongest(sentence).length());
        sc.close();
    }
}
