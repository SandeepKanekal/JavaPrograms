package Worksheets.Strings;
import java.util.Scanner;

public class ShortestWordInSentence {
    public String extractShortest(String sentence) {
        sentence += " ";
        String ShortestWord = "";
        StringBuilder word = new StringBuilder();
        int ShortestLength = sentence.length();
        for (int index = 0; index < sentence.length(); index++) {
            if (sentence.charAt(index) != ' ')
                word.append(sentence.charAt(index));  // getting each word from the sentence
            else {
                if (word.length() < ShortestLength) {  // comparing if the word is shorter than <ShortestLength>
                    ShortestLength = word.length();
                    ShortestWord = word.toString();
                }
                word = new StringBuilder();
            }
        }
        return ShortestWord;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence = sc.nextLine();
        ShortestWordInSentence Ob = new ShortestWordInSentence();
        String ShortestWord = Ob.extractShortest(sentence);
        System.out.println();
        System.out.println(
                "Shortest word : " + ShortestWord + "\n" + "Length of Shortest word : " + ShortestWord.length());
        sc.close();
    }
}
