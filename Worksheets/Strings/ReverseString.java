package Worksheets.Strings;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter a String");
        String word = sc.next();
        System.out.print("Reversed word: ");
        for (int charIndex = word.length() - 1; charIndex >= 0; charIndex--)  // loop in the reversed order and print each character
            System.out.print(word.charAt(charIndex));
        sc.close();
    }
}
