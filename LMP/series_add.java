package LMP;

import java.util.Scanner;

class series_add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int sum = 0;
        int s = 0;
        for (int i = 1; i <= n; i++) {
            s = 0;
            for (int j = 1; j <= i; j++)
                s += j;
            sum += s;
        }
        System.out.println(sum);
        sc.close();
    }
}