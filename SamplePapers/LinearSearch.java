/*
Define a class to declare an integer array of size n and accept the elements into the array.
Search for an element input by the user using linear search technique, display the element
if it is found, otherwise display the message “NO SUCH ELEMENT.
 */
package SamplePapers;

import java.util.Scanner;

public class LinearSearch {
    static int[] number = new int[10];
    static int searchElement;
    static boolean isPresent;
    static int i;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        for (i = 0; i < number.length; i++)
            number[i] = sc.nextInt();
        System.out.println();
        System.out.println("Enter the searching Element");
        searchElement = sc.nextInt();
        i = 0;
        for (int num : number) {
            if (num == searchElement) {
                isPresent = true;
                break;
            } else
                i++;
        }
        if (isPresent)
            System.out.println(searchElement + " is found in " + (i + 1));
        else
            System.out.println("No such element found");
        sc.close();
    }
}
