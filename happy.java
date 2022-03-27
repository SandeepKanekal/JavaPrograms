import java.util.Scanner;

class happy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter a number");
        int n = sc.nextInt();
        int a = 1;
        while (a != 0) {
            int sum = 0;
            while (n > 0) {
                int d = n % 10;
                sum = sum + d * d;
                n = n / 10;
            }
            n = sum;
            if (sum < 10) {
                a = 0;
                if (sum == 1)
                    System.out.println("Happy number");
                else
                    System.out.println("Not a Happy number");
            }
        }
        sc.close();
    }
}