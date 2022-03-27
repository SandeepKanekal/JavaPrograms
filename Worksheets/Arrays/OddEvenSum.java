package Worksheets.Arrays;

import java.util.Scanner;

import Worksheets.Methods;

class OddEvenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int evenSum = 0;
        int oddSum = 0;
        int[] numbers = new int[5];
        System.out.println("Enter 5 numbers");
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = sc.nextInt();
        for (int number : numbers) {
            if (Methods.isEven(number))
                evenSum += number;
            else
                oddSum += number;
        }
        System.out.println("Even sum : " + evenSum);
        System.out.println("Odd sum : " + oddSum);
        sc.close();
    }
}
