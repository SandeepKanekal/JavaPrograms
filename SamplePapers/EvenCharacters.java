package SamplePapers;

import java.util.Scanner;

public class EvenCharacters {
    static String[] str = new String[10];

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 Strings\n");
        for (int i = 0; i < str.length; i++)
            str[i] = sc.next();
        System.out.println("Strings with even number of characters are:\n");
        for (String s : str) {
            if (EvenCharacters.isEven(s.length()))
                System.out.println(s);
        }
    }
}
