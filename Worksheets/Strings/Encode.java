package Worksheets.Strings;

import java.util.Scanner;

public class Encode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String sentence = sc.next();
        StringBuilder number = new StringBuilder();
        sentence = sentence.toUpperCase();
        for (int index = 0; index < sentence.length(); index++) {
            char ch = sentence.charAt(index);
            switch (ch) {
                // number.append(ch) is same as number += ch
                // -> should be replaced with : since the board doesn't know about this
                case 'A', 'B', 'C' -> number.append('1');
                case 'E', 'F', 'D' -> number.append('2');
                case 'G', 'H', 'I' -> number.append('3');
                case 'J', 'K', 'L' -> number.append('4');
                case 'M', 'N', 'O' -> number.append('5');
                case 'P', 'Q', 'R', 'S' -> number.append('6');
                case 'T', 'U', 'V' -> number.append('7');
                case 'W', 'X', 'Y', 'Z' -> number.append('8');
            }
        }
        System.out.println(number);
        sc.close();
    }
}
