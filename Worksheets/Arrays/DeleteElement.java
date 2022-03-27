package Worksheets.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int[] num = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        for (int i = 0; i < num.length; i++) // input
            num[i] = sc.nextInt();

        System.out.println();
        System.out.println("Enter index to remove element from");
        int removeIndex = sc.nextInt();

        if (num.length - 1 - removeIndex >= 0)
            System.arraycopy(num, removeIndex + 1, num, removeIndex, num.length - 1 - removeIndex);
        /*
        Use this instead of the above one
        for (int i=removeIndex; i<num.length-1; i++)
            num[i] = num[i+1];
         */
        System.out.println(Arrays.toString(num));
        sc.close();
    }
}
