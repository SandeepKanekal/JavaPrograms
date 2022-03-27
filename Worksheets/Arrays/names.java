package Worksheets.Arrays;

import java.util.Scanner;

public class names {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 names");
        String[] names = new String[5];
        for (int a = 0; a < names.length; a++)
            names[a] = sc.next();
        for (String name : names) System.out.println(name.toUpperCase());
        // String name: names (takes the element of the index equal to the number of iterations)
        // can be read as String <name> in array <names> for better understanding
        // Do not use this in the exam, the board is not as modern as I am -_-
        // ask if still not understood
        sc.close();
    }
}
