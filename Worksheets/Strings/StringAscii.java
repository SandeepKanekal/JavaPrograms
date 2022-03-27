package Worksheets.Strings;
import java.util.Scanner;

public class StringAscii {  // just prints out the ascii value of each character in the word/sentence
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word or sentence");
        String word = sc.nextLine();
        for (int StringIndex = 0; StringIndex < word.length(); StringIndex++) {
            System.out.println(word.charAt(StringIndex) +" ---> " +(int) word.charAt(StringIndex));
        sc.close();
        }
    }
}
