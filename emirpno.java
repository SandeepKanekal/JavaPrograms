import java.util.*;

class emirpno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int n = sc.nextInt();
        int rev = 0;
        int c = 0;
        while (n > 0) {
            int t = n % 10;
            rev = rev * 10 + t;
            n /= 10;
        }
        for (int i = 1; i <= rev; i++) {
            if (rev % i == 0)
                c++;
        }
        if (c == 2)
            System.out.println("EMIRP NUMBER");
        else
            System.out.println("NOT AN EMIRP NUMBER");
        sc.close();
    }
}