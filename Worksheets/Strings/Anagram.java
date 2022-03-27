package Worksheets.Strings;

import java.util.Scanner;

class Anagram {
    public String sortString(String s) { // sorting in alphabetical order
        String s1 = "";
        s = s.toUpperCase();
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            for (int i = 0; i < s.length(); i++) {
                if (ch == s.charAt(i))
                    s1 = s1 + ch;
            }
        }
        s1 = s1.trim();
        return s1;
    }

    public static void main(String[] args) {
        Anagram ob = new Anagram();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two words");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = ob.sortString(s1);
        String s4 = ob.sortString(s2);
        if (s3.length() == s4.length()) {
            // checking if the strings are equal
            if (s3.equalsIgnoreCase(s4))
                System.out.println(s1 + ", " + s2 + " are anagrams");
            else
                System.out.println(s1 + ", " + s2 + " are not anagrams");
        } else
            System.out.println(s1 + ", " + s2 + " are not anagrams"); // the strings are not anagrams if the lengths are unequal
        sc.close();
    }
}