package LMP;

import java.util.Scanner;

class perfectno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                sum += i;
        }
        if (sum == n)
            System.out.print("yes");
        else
            System.out.print("no");
        sc.close();
    }
}