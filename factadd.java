import java.util.Scanner;

class factadd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter a number");
        int x = sc.nextInt();
        double sum = 0;
        for (int i = 1; i <= 10; i++) {
            int f = 1;
            for (int j = 1; j <= i; j++)
                f *= j;
            sum += Math.pow(x, i) / (x + f);
        }
        System.out.println(sum);
        sc.close();
    }
}