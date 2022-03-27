package LMP;

import java.util.Scanner;

class autono {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int o = n;
        int c = 0;
        while (n > 0) {
            c++;
            n = n / 10;
        }
        int r = (n * n) % (int) Math.pow(10, c);
        if (r == o)
            System.out.println("yes");
        else
            System.out.println("no");
        sc.close();
    }
}