package SamplePapers;
import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter a String");
        String word = sc.next();
        StringBuilder reversedWord = new StringBuilder();
        for (int charIndex = word.length() - 1; charIndex >= 0; charIndex--)
            reversedWord.append(word.charAt(charIndex));
        if (reversedWord.toString().equalsIgnoreCase(word))
            System.out.println(word + " is a palindrome String");
        else
            System.out.println(word + " is not a palindrome String");
        sc.close();
    }
}
