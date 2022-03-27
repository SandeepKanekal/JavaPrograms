import java.util.Scanner;

class prime2 {
    public void prime(int n) {
        int c = 0;
        int counter = 0;
        while (n > 0) {
            c = 0;
            int i = 1;
            for (; i <= n; i++) {
                if (n % i == 0)
                    c++;
            }
            if (c == 2) {
                counter++;
                System.out.println(n);
            }
            if (counter == 5)
                break;
            n++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        prime2 ob = new prime2();
        ob.prime(n);
        sc.close();
    }
}