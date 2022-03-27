package Worksheets.Strings;
import java.util.Scanner;

public class RepeatLetter {  // Check and print the number of consecutive letters in a string
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String sentence = sc.nextLine();
        sentence = sentence.toUpperCase();
        int count = 0;
        for (int index = 0; index < sentence.length() - 1; index++) {
            if (sentence.charAt(index) == sentence.charAt(index + 1))  // checking if the character in index <index> is same as character in index <index+1>
                count++;
        }
        System.out.println(count);
        sc.close();
    }
}
