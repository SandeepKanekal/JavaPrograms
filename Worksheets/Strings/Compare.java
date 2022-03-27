package Worksheets.Strings;

import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 Strings");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        if (s1.compareToIgnoreCase(s2) != 0)
            System.out.println("Not the same String");
        else
            System.out.println("Same Strings");
        sc.close();
    }
}
