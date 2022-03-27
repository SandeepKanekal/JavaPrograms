import java.util.Scanner;

class func_rprime {
    public int prime(int n) {
        int c = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                c++;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        func_rprime obj = new func_rprime();
        int x = obj.prime(n);
        if (x == 2)
            System.out.println("PRIME");
        else
            System.out.println("COMPOSITE");
        sc.close();
    }
}