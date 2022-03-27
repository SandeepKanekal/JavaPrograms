package LMP;

import java.util.Scanner;

class lh {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int s = 9, l = 0;
        while (n > 0) {
            int t = n % 10;
            s = Math.min(t, s);
            l = Math.max(t, l);
            n /= 10;
        }
        System.out.println("largest : " + l + "\tsmallest : " + s);
        sc.close();
    }
}