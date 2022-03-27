package SamplePapers;

import java.util.Scanner;

public class LargestString {
    static String str1;
    static String str2;
    static String result;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 strings");
        str1 = sc.next().toUpperCase();
        str2 = sc.next().toUpperCase();

        if (!(str1.compareTo(str2) == 0)) {
            result = str1.length() > str2.length() ? str1 : (str1.length() == str2.length()) ? "Both have equal length" : str2;
            result = result.equals("Both have equal length") ? result : result + " has the highest length";
            System.out.println(result);
        } else
            System.out.println("Both strings are the same");
    }
}
