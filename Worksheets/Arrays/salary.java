package Worksheets.Arrays;

import java.util.Scanner;

public class salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter salaries");
        int[] salary = new int[5];
        int c = 0;
        for (int i = 0; i < salary.length; i++)
            salary[i] = sc.nextInt();
        for (int sal : salary) {
            if (sal > 50000)
                c++;
        }
        System.out.println(c + " employees earn more than 50k a month");
        sc.close();
    }
}
