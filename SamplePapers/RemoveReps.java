/*
Define a class to accept a word in Lower case and display the new word after
removing all the repeated letters.
 */
package SamplePapers;

import java.util.Scanner;

public class RemoveReps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String\n");
        String word = sc.nextLine();
        int len = word.length();
        char c = ' ';
        StringBuilder bin = new StringBuilder();
        for (int i = 0; i < len; i++) {
            char ch1 = word.charAt(i);
            for (int j = i + 1; j < len; j++) {
                char ch2 = word.charAt(j);
                if (ch1 == ch2)
                    word = word.replace(ch2, c);
            }
            if (!Character.isWhitespace(ch1))
                bin.append(ch1);
        }
        System.out.println(bin);
    }
}
