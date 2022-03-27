package Worksheets.Strings;

import java.util.Scanner;

public class AscendingString { // comparing strings and making printing out them in ascending order of the sum of the ascii values of their characters
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 Strings");
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();
        if (s1.compareTo(s2) < 0 && s1.compareTo(s3) < 0) {
            // in this case, <s1> is the smallest string
            if (s2.compareTo(s3) < 0)
                System.out.println(s1 + ", " + s2 + ", " + s3);
            else
                System.out.println(s1 + ", " + s3 + ", " + s2);
        } else if (s2.compareTo(s1) < 0 && s2.compareTo(s3) < 0) {
            // in this case, <s2> is the smallest string
            if (s1.compareTo(s3) < 0)
                System.out.println(s2 + ", " + s1 + ", " + s3);
            else
                System.out.println(s2 + ", " + s3 + ", " + s1);
        } else if (s3.compareTo(s2) < 0 && s3.compareTo(s1) < 0) {
            // in this case, <s3> is the smallest string
            if (s2.compareTo(s1) < 0)
                System.out.println(s3 + ", " + s2 + ", " + s1);
            else
                System.out.println(s3 + ", " + s1 + ", " + s2);
        }
        sc.close();
    }
}
