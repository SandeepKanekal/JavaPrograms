/*
Define a class to accept a String in Lower case and replace all the vowels present
in the String with Asterisk (*) sign.
 */
package SamplePapers;

import java.util.Scanner;

public class ReplaceVowels {
    static String sentence;
    static char ch;
    static int index;

    public static boolean isVowel(char letter) {
        return letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'A'
                || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        sentence = sc.nextLine();

        for (index = 0; index < sentence.length(); index++) {
            ch = sentence.charAt(index);
            if (ReplaceVowels.isVowel(ch))
                sentence = sentence.replace(ch, '*');
        }

        System.out.println(sentence);
    }
}
