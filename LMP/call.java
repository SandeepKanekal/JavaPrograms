package LMP;

import java.util.Scanner;

class call {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of calls made");
        int n = sc.nextInt();
        double cost = 0.0;
        if (n <= 100)
            cost = 150 + (100 * 0);
        else if (n <= 200)
            cost = 150 + (100 * 0) + ((n - 100) * 0.90);
        else if (n <= 400)
            cost = 150 + (100 * 0) + (100 * 0.90) + ((n - 200) * 0.80);
        else cost = 150 + (100 * 0) + (100 * 0.90) + (200 * 0.80) + ((n - 400) * 0.70);
        System.out.println("number of calls made : " + n);
        System.out.println("cost = Rs." + cost);
        sc.close();
    }
}