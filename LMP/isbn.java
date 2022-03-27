package LMP;

import java.util.Scanner;

class isbn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the isbn");
        long n = sc.nextLong();
        long rev = 0L;
        int c = 0;
        int sum = 0;
        while (n > 0) {
            c++;
            int t = (int) n % 10;
            rev *= 10 + t;
            n /= 10;
        }
        if (c == 10) {
            for (int i = 1; i <= c; i++) {
                int d = (int) rev % 10;
                sum += d;
            }
            if (sum % 11 == 0)
                System.out.println("yes");
            else
                System.out.println("no");
        } else
            System.out.println("no");
        sc.close();
    }
}