package LMP;

import java.util.Scanner;

class factorial_div {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a a number");
        int n = sc.nextInt();
        double sum = 0.0;
        double fact = 0;
        double i = 1;
        for (; i <= n; i++) {
            fact = 1;
            int k = 1;
            for (; k <= i; k++)
                fact *= k;
            sum += (i / fact);
        }
        System.out.println(sum);
        sc.close();
    }
}