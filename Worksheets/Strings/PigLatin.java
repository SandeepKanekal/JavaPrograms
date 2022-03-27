package Worksheets.Strings;

import org.jetbrains.annotations.NotNull;
import java.util.Scanner;

public class PigLatin {  // I don't remember what this thing is also, just search the internet
    public String pigLatinString(@NotNull String word) {
        Vowel ob = new Vowel();
        String PigString;
        int count = 0;
        for (int index = 0; index < word.length(); index++) {
            if (ob.checkIfVowel(word.charAt(index))) {
                count = index;
                break;
            }
        }
        PigString = word.substring(count) + word.substring(0, count) + "ay ";
        return PigString;
    }

    public static void main(String[] args) {
        Vowel ob = new Vowel();
        PigLatin pl = new PigLatin();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence = sc.nextLine();
        StringBuilder word = new StringBuilder();
        sentence += " ";
        StringBuilder PigString = new StringBuilder();
        for (int index = 0; index < sentence.length(); index++) {
            if (sentence.charAt(index) != ' ')
                word.append(sentence.charAt(index));
            else {
                if (ob.checkIfVowel(word.charAt(0)))
                    PigString.append(word).append("yo ");
                else
                    PigString.append(pl.pigLatinString(word.toString()));
                word = new StringBuilder();
            }
        }
        System.out.println(PigString);
        sc.close();
    }
}
