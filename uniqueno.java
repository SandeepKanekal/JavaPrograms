import java.util.*;

class uniqueno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int n = sc.nextInt();
        int x = n;
        int flag = 1;
        for (int i = 1; i <= 9; i++) {
            n = x;
            int c = 0;
            while (n != 0) {
                int d = n % 10;
                if (d == i)
                    c++;
                n /= 10;
            }
            if (c > 1)
                flag = 0;
        }
        if (flag == 1)
            System.out.println("UNIQUE NUMBER");
        else
            System.out.println("NOT A UNIQUE NUMBER");
        sc.close();
    }
}