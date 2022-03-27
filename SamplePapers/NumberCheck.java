/*
Define a class to accept 20 size integer data type  array.  Accept the elements into
the array and perform the following:
 Number of even numbers
 Number of odd numbers
 Number of multiples of 5
 */
package SamplePapers;

import java.util.Scanner;

public class NumberCheck {
    static int[] number = new int[20];
    static int i;
    static int evenNumbers;
    static int oddNumbers;
    static int multiplesOfFive;


    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public boolean isMultipleOfFive(int number) {
        return number % 5 == 0;
    }

    public static void main(String[] args) {
        NumberCheck ob = new NumberCheck();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 20 numbers");
        for (i = 0; i < number.length; i++)
            number[i] = sc.nextInt();

        for (int num : number) {
            if (ob.isEven(num))
                evenNumbers++;
            else
                oddNumbers++;

            if (ob.isMultipleOfFive(num))
                multiplesOfFive++;
        }

        System.out.println("Even Numbers : " + evenNumbers);
        System.out.println("Odd Numbers : " + oddNumbers);
        System.out.println("Multiples of 5 : " + multiplesOfFive);
    }
}
