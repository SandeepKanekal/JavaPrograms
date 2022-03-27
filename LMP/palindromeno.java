package LMP;

import java.util.Scanner;

class palindromeno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int ori = n;
        int rev = 0;
        while (n > 0) {
            int t = n % 10;
            rev = rev * 10 + t;
            n /= 10;
        }
        if (rev == ori)
            System.out.println("yes");
        else
            System.out.println("no");
        sc.close();
    }
}