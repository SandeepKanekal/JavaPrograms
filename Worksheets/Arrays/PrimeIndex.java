package Worksheets.Arrays;

import java.util.Scanner;

public class PrimeIndex { // just prints out the elements in prime index positions
    public boolean isPrimeNumber(int n) {
        int counter = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                counter++;
        }
        return counter == 2;
    }

    public static void main(String[] args) {
        PrimeIndex ob = new PrimeIndex();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 Numbers");
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = sc.nextInt();
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            if (ob.isPrimeNumber(i))
                System.out.println(numbers[i]);
        }
        sc.close();
    }
}
