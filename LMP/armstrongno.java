package LMP;

import java.util.Scanner;

class armstrongno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int ori = n;
        int sum = 0;
        while (n > 0) {
            int t = n % 10;
            sum += (t * t * t);
            n /= 10;
        }
        if (sum == ori)
            System.out.println("yes");
        else
            System.out.println("no");
        sc.close();
    }
}