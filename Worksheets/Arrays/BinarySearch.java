package Worksheets.Arrays;

import java.util.Scanner;

public class BinarySearch {
    static char[] characters = new char[10];
    static char searchElement;
    static int lowerLimit;
    static int upperLimit = characters.length - 1;
    static int average;
    static boolean isPresent;
    static int i;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 characters");
        // Input
        for (i = 0; i < characters.length; i++)
            characters[i] = sc.next().charAt(0);

        System.out.println("\nEnter searching element");
        searchElement = sc.next().charAt(0); // search element

        while (lowerLimit <= upperLimit) {
            average = (lowerLimit + upperLimit) / 2;
            if (searchElement < characters[average])
                upperLimit = average - 1;  // upper limit descreases if its greater than the chatacter in index <average>
            else if (searchElement > characters[average])
                lowerLimit = average + 1;  // lower limit increases if its greater than the chatacter in index <average>
            else {
                isPresent = true;  // flag
                break;
            }
        }
        if (isPresent)
            System.out.println(searchElement + " is found in the " + (average + 1) + " position.");
        else
            System.out.println(searchElement + " is not found.");
    }
}
