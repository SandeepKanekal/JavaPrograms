//import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "hello";
        System.out.println(s2.compareTo(s1));

        // (int) s1.charAt(0) - s2.charAt(0)

        // if strings are eaual, compareTo returns 0
        // if strings are of same length, compareTo returns the differences between the first characters of the strings
        // if strings are of different length, compareTo returns the difference between the first characters of the strings
    }
}
