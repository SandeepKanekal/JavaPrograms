/*
Define a class to declare an array of size 20 of double datatype, accept the elements into
the array and perform the following:
• Calculate and print the sum of all the elements.
• Calculate and print the highest value of the array.
 */
package SamplePapers;

import java.util.Scanner;

public class NumberFunc {
    static double[] number = new double[20];
    static double sum;
    static double largestNum;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 20 numbers");
        for (int i = 0; i < number.length; i++)
            number[i] = sc.nextDouble();
        for (double num : number) {
            largestNum = Math.max(largestNum, num);
            sum += num;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Largest Number: " + largestNum);
    }
}
