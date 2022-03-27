import java.util.*;

class spec_func {
    public void special(int n) {
        int fact = 1;
        int sum = 0;
        int ori = n;
        while (n != 0) {
            fact = 1;
            int d = n % 10;
            for (int i = 1; i <= d; i++)
                fact *= i;
            sum += fact;
            n /= 10;
        }
        if (sum == ori)
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    public static void main(String[] args) {
        spec_func obj = new spec_func();
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int n = sc.nextInt();
        obj.special(n);
        sc.close();
    }
}