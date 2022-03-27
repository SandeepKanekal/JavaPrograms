package LMP;

import java.util.Scanner;

class seires {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int m = 1;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (m * i);
            m *= -1;
        }
        System.out.println(sum);
        sc.close();
    }
}