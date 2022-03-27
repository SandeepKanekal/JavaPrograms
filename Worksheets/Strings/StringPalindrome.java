package Worksheets.Strings;
import java.util.Scanner;

public class StringPalindrome {  // checks if the reversed sentence is the same as the original string
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String word = sc.next();
        StringBuilder reversedWord = new StringBuilder();
        for (int charIndex = word.length() - 1; charIndex >= 0; charIndex--)  // looping in the reversed order
            reversedWord.append(word.charAt(charIndex));

        // Checking
        if (reversedWord.toString().equalsIgnoreCase(word))
            System.out.println(word + " is a palindrome String");
        else
            System.out.println(word + " is not a palindrome String");
        sc.close();
    }
}
