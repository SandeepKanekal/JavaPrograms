package Worksheets.Strings;

import java.util.Scanner;

public class CommonCharacters { // checks for the common characters in two strings
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 strings");
        String word1 = sc.next();
        String word2 = sc.next();
        word1 = word1.toUpperCase();
        word2 = word2.toUpperCase();
        StringBuilder RepeatedLetters = new StringBuilder();
        char ch3 = ' ';
        for (int index = 0; index < word1.length(); index++) {
            int count = 0;
            char ch1 = word1.charAt(index); // getting the character of <word1> in index <index>
            for (int index2 = 0; index2 < word2.length(); index2++) {
                char ch2 = word2.charAt(index2);  // getting the character of <word2> in index <index2>
                if (ch1 == ch2) {  // comparing the characters
                    count++;  // flag
                    ch3 = ch2;
                }
            }
            if (count >= 1)
                RepeatedLetters.append(ch3).append(", ");  // appending <ch3>.
                // Same as RepeatedLetters += ch3 + ", ";
        }
        String commonChars = RepeatedLetters.substring(0, RepeatedLetters.length() - 2);  // substring is used to remove the last two characters i.e. ", "
        System.out.println("Common Characters : " + commonChars);
        sc.close();
    }
}
