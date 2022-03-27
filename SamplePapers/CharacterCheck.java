/*
Define a class to declare a character array of size ten, accept the character into the array
and perform the following:
• Count the number of uppercase letters in the array and print.
• Count the number of vowels in the array and print.
 */
package SamplePapers;

import java.util.Scanner;

public class CharacterCheck {
    static char[] chars = new char[10];
    static int uppercaseLetters;
    static int vowels;
    static int i;

    public static boolean isVowel(char letter) {
        return letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U';
    }

    public static boolean isUppercase(char letter) {
        return letter >= 'A' && letter <= 'Z';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 characters");
        for (i = 0; i < chars.length; i++)
            chars[i] = sc.next().charAt(0);
        for (char ch : chars) {
            if (CharacterCheck.isUppercase(ch)) uppercaseLetters++;
            if (CharacterCheck.isVowel(ch)) vowels++;
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Uppercase Letters: " + uppercaseLetters);
    }
}
