package Worksheets.Arrays;

import java.util.Scanner;

import Worksheets.Methods;

public class Prime {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = sc.nextInt();

        for (int num : numbers) {
            if (Methods.isPrime(num))
                System.out.println(num);
        }
        sc.close();
    }
}
