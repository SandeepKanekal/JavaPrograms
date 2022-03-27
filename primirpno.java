import java.util.*;

class primirpno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int n = sc.nextInt();
        int ori = n;
        int c1 = 0;
        int rev = 0;
        int c2 = 0;
        while (n > 0) {
            int t = n % 10;
            rev = rev * 10 + t;
            n /= 10;
        }
        n = ori;
        for (int a = 1; a <= n; a++) {
            if (n % a == 0)
                c1++;
        }
        for (int b = 1; b <= rev; b++) {
            if (rev % b == 0)
                c2++;
        }
        if (c1 == 2 && c2 == 2)
            System.out.println("PRIMIRP NUMBER");
        else
            System.out.println("NOT A PRIMIRP NUMBER");
        sc.close();
    }
}