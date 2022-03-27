package Worksheets.Strings;
import java.util.Scanner;

public class CountCharacter {  // just a modified version of linear search
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence and the character");
        String sentence = sc.nextLine();
        char character = sc.next().charAt(0);  // character to be counted
        int count = 0;
        for (int index = 0; index < sentence.length(); index++) {
            if(sentence.charAt(index)==character)
            count++;  // accumulator
        }
        System.out.println("Number of " +character +"(s) in " +sentence + " = " +count);
        sc.close();
    }
}
