package Worksheets.Strings;

import java.util.Scanner;

public class Capitalize { // capitalizes the first character of each word
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s = sc.nextLine();
        StringBuilder s1 = new StringBuilder(); // gets each word in the sentence
        StringBuilder s2 = new StringBuilder(); // output
        s += " ";   
        s = s.toLowerCase();
        for (int index = 0; index < s.length(); index++) {
            char c = s.charAt(index);
            if (c != ' ')
                s1.append(c); // if the character is not a space, we append it to the word variable
            else {
                char ch = s1.charAt(0); // getting the first letter
                ch = (char) ((int)ch - 32); // capitalization of the first letter
                s2.append(ch).append(s1.substring(1)).append(" ");
                /*
                s2.append(ch) - appends the first letter
                .append(s1.substring(1) - appends the remaining of the word
                .append(" ") - appends a space

                However, the board does not know what append is, instead of append, use the += operator
                if append is used more than once in the same line, use the + operator
                here is the expression for line 21:
                s2 += ch + s1.substring(1) + " ";
                 */
                s1 = new StringBuilder();
            }
        }
        System.out.println(s2);
        sc.close();
    }
}
