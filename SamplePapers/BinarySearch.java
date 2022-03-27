/*
Define a class to declare an integer array of size n and accept the elements into the
array. Search for an element input by the user using binary search technique,
display the element if it is found, otherwise display the message “NO SUCH
ELEMENT.
 */

package SamplePapers;

import java.util.Scanner;

public class BinarySearch {
    static int len;
    static int searchElement;
    static int lowerLimit;
    static int upperLimit;
    static int average;
    static boolean isPresent;
    static int i;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of the array");
        len = sc.nextInt();
        int[] ar = new int[len];

        System.out.println("Enter the numbers");
        for (i = 0; i < len; i++)
            ar[i] = sc.nextInt();

        System.out.println("Enter searching element");
        searchElement = sc.nextInt();

        upperLimit = ar.length - 1;

        while (lowerLimit <= upperLimit) {
            average = (lowerLimit + upperLimit) / 2;
            if (searchElement < ar[average])
                upperLimit = average - 1;
            else if (searchElement > ar[average])
                lowerLimit = average + 1;
            else {
                isPresent = true;
                break;
            }
        }

        if (isPresent)
            System.out.println(searchElement + " is found in position " + (average + 1));
        else
            System.out.println(searchElement + " is not found.");
    }
}

