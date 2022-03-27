package Worksheets.Arrays;

import java.util.Scanner;
import java.util.Arrays;

// A program which appends values to the position specified
public class index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input stuff
        System.out.println("Enter the Length of the Array");
        int length = sc.nextInt();
        int[] numbers = new int[(length + 1)];
        System.out.println("Enter the values");
        for (int i = 0; i < numbers.length - 1; i++)
            numbers[i] = sc.nextInt();
        System.out.println("input details: ");
        System.out.println(Arrays.toString(numbers));

        System.out.println("enter a number to place in the array");
        int number = sc.nextInt();
        System.out.println("enter the position to place the element at");
        int indexPos = sc.nextInt();

        if (numbers.length - indexPos >= 0)
            System.arraycopy(numbers, indexPos - 1, numbers, indexPos, numbers.length - indexPos);
        numbers[indexPos - 1] = number;
        /*
        Prefer this instead
        index = indexPos - 1;
        for (int i = index; i<numbers.length-1; i++)
            numbers[index] = numbers[index+1];
        numbers[indexPos - 1] = number;
         */
        System.out.println("updated details:- ");
        System.out.println(Arrays.toString(numbers));
        sc.close();
    }
}
