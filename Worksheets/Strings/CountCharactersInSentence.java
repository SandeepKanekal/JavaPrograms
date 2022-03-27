package Worksheets.Strings;
import java.util.Scanner;

public class CountCharactersInSentence {
    public void getNumberOfCharacters(String sentence) {
        sentence=sentence.toUpperCase();
        int[] count = new int[256];
        for (int index = 0; index < sentence.length(); index++)
            count[sentence.charAt(index)]++;  // this counts the number of occurrences of each character
        char[] characters = new char[sentence.length()];
        for (int index = 0; index < sentence.length(); index++) {
            characters[index] = sentence.charAt(index);  // storing each character in an array
            int OmitRepeat = 0;
            for (int j = 0; j <= index; j++) {
                if (sentence.charAt(index) == characters[j])  // checking for repetitions
                    OmitRepeat++;
            }
            if (OmitRepeat == 1 && sentence.charAt(index)!=' ')
                System.out.println("Number of occurrences of " + sentence.charAt(index) + " = " + count[sentence.charAt(index)]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence = sc.nextLine();
        CountCharactersInSentence Obj = new CountCharactersInSentence();
        Obj.getNumberOfCharacters(sentence);
        sc.close();
    }
}
