package LMP;

import java.util.Scanner;

class amicableno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 2 number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0)
                sum1 += i;
        }
        for (int j = 1; j < b; j++) {
            if (b % j == 0)
                sum2 += j;
        }
        if (sum1 == b && sum2 == a)
            System.out.print("amicable number");
        else
            System.out.print("not an amicable number");
        sc.close();
    }
}