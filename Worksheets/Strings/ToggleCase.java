package Worksheets.Strings;

import java.util.Scanner;

public class ToggleCase {  // AmOgUs becomes aMoGuS
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();

        for (int index = 0; index < str.length(); index++) {
            char ch = str.charAt(index);
            if (!Character.isLetter(ch)){
                System.out.print(ch);
                continue;
            }

            if (ch >= 'A' && ch <= 'Z')
                System.out.print(Character.toLowerCase(ch));
            else
                System.out.print(Character.toUpperCase(ch));
        }
        sc.close();
    }
}
