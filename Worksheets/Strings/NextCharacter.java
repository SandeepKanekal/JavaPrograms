package Worksheets.Strings;
import java.util.Scanner;

public class NextCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = sc.next();
        for (int index = 0; index < word.length(); index++)
            System.out.print((char) (word.charAt(index) + 1));
        sc.close();
    }
}
