package SamplePapers;

import java.util.Scanner;

public class SentenceCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s = sc.nextLine();
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        s += " ";
        s = s.toLowerCase();
        for (int index = 0; index < s.length(); index++) {
            char c = s.charAt(index);
            if (c != ' ')
                s1.append(c);
            else {
                char ch = s1.charAt(0);
                ch = (char) ((int) ch - 32);
                s2.append(ch).append(s1.substring(1)).append(" ");
                s1 = new StringBuilder();
            }
        }
        System.out.println(s2);
        sc.close();
    }
}
