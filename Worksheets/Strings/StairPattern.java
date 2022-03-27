/*
Just does this
Enter a string value
amogus
A
- M
- - O
- - - G
- - - - U
- - - - - S
 */

package Worksheets.Strings;

import java.util.Scanner;

public class StairPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string value");
        String s = sc.nextLine();
        s = s.trim();  // removing redundant spaces
        s = s.toUpperCase();
        for (int index = 0; index < s.length(); index++) {
            for (int i = 0; i < index; i++)
                System.out.print("- ");  // print "- " till <i> stays lower than <index> (index is also lineNumber - 1)
            System.out.print(s.charAt(index));  // printing the character at the end of the lines
            System.out.println();  // creating a newline
        }
        sc.close();
    }
}
