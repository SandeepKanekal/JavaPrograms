package Worksheets.Arrays;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        int[] num = new int[10];
        boolean isPresent = false;
        int searchElement;
        int i;
        for (i = 0; i < num.length; i++)
            num[i] = sc.nextInt();
        System.out.println();
        System.out.println("Enter the searching Element");
        searchElement = sc.nextInt();
        for (i = 0; i < num.length; i++) {
            if (num[i] == searchElement) {
                isPresent = true;
                break;
            }
        }
        if (isPresent)
            System.out.println("Index position of " + searchElement + "  is " + i);
        sc.close();
    }
}
