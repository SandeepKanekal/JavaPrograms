import java.util.*;

class funprime {
    public void prime(int n) {
        int c = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                c++;
        }
        if (c == 2)
            System.out.println(n);
    }

    public static void main(String[] args) {
        funprime obj = new funprime();
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NOSE");
        int n = sc.nextInt();
        while (n != 0) {
            int d = n % 10;
            obj.prime(d);
            n /= 10;
        }
        sc.close();
    }
}