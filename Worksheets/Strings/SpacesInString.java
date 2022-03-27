package Worksheets.Strings;

import java.util.Scanner;

public class SpacesInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence = sc.nextLine();
        int CountSpace = 0;
        for (int index = 0; index < sentence.length(); index++) {
            // literally just counting how many spaces are there in the sentences
            if (sentence.charAt(index) == ' ')
                CountSpace++;
        }
        System.out.println("Number of spaces = " + CountSpace);
        sc.close();
    }
}
