import java.util.*;

class palindrome {
    public int check(int n) {
        int ori = n;
        int rev = 0;
        while (n > 0) {
            int t = n % 10;
            rev = rev * 10 + t;
            n /= 10;
        }
        if (rev == ori)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {
        palindrome ob = new palindrome();
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int n = sc.nextInt();
        int i = ob.check(n);
        if (i == 1)
            System.out.println("PALINDROME");
        else
            System.out.println("NOT A PALINDROME");
        sc.close();
    }
}