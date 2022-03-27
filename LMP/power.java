package LMP;

import java.util.Scanner;

class power {
    public static void main(String[] atrgs) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += (int) Math.pow(i, i);
            i++;
        }
        System.out.print("sum = " + sum);
        sc.close();
    }
}