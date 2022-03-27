import java.util.*;

class clos {
    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        do {
            int sum = 0;
            System.out.println("ENTER A NUMBER - ENTER 0 TO QUIT");
            n = sc.nextInt();
            if (n == 0)
                break;
            for (int i = 1; i <= n; i++)
                sum += i;
            System.out.println("sum = " + sum);
        } while (n != 0);
        sc.close();
    }
}
