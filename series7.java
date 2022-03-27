import java.util.*;

class series7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER LIMIT");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int fact = 0;
            for (int j = 1; j <= i; j++)
                fact += j;
            sum += fact;
        }
        System.out.println("SUM = " + sum);
        sc.close();
    }
}