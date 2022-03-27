
//EXAMPLES ARE 220 AND 284
import java.util.Scanner;

class amicableno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int m = sc.nextInt();
        System.out.println("ENTER ANOTHER NUMBER");
        int n = sc.nextInt();
        int sum1 = 0;

        int sum2 = 0;
        for (int a = 1; a < m; a++) {
            if (m % a == 0)
                sum1 += a;
        }
        for (int b = 1; b < n; b++) {
            if (n % b == 0)
                sum2 += b;
        }
        if (sum1 == n && sum2 == m)
            System.out.println("AMICABLE NUMBER PAIR");
        else
            System.out.println("NOT AN AMICABLE NUMBER PAIR");
        sc.close();
    }
}