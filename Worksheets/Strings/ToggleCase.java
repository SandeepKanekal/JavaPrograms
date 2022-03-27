package Worksheets.Strings;

import java.util.Scanner;

public class ToggleCase {  // AmOgUs becomes aMoGuS
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        for (int index = 0; index < str.length(); index++) {
            char ch = str.charAt(index);
            if (!Character.isLetter(ch)) {  // checking if there is a special character
                System.out.println("Special character found");
                break;
            }
            if (ch >= 'A' && ch <= 'Z')
                System.out.print((char) (ch + 32));
            else if (ch >= 'a' && ch <= 'z')
                System.out.print((char) (ch - 32));
            else
                System.out.print(" ");
        }
        sc.close();
    }
}
