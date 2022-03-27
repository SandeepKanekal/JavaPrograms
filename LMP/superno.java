package LMP;

import java.util.Scanner;

class superno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        int ori = n;
        int rev = 0;
        while (n > 0) {
            int c = n % 10;
            rev = rev * 10 + c;
            n = n / 10;
        }
        n = rev;
        while (n > 0) {
            int t = n % 10;
            sum += (int) Math.pow(t, i);
            n = n / 10;
            i++;
        }
        if (sum == ori)
            System.out.println("yes");
        else
            System.out.println("no");
        sc.close();
    }
}