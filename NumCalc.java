import java.util.Scanner;

public class NumCalc {
    public void num_calc(int a, char ch) {
        if (ch == 's' || ch == 'S')
            System.out.println("Square = " + (a * a));
        else
            System.out.println("Cube = " + (a * a * a));
    }

    public void num_calc(int a, int b, char ch) {
        if (ch == 'p' || ch == 'P')
            System.out.println("Product = " + (a * b));
        else
            System.out.println("Sum = " + (a + b));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number and 's' if the number is to be squared");
        int a = sc.nextInt();
        char ch = sc.next().charAt(0);
        System.out.println("Enter 2 numbers and 'p' if the numbers are to be multiplied");
        int m = sc.nextInt();
        int n = sc.nextInt();
        char ch1 = sc.next().charAt(0);
        System.out.println();
        NumCalc ob = new NumCalc();
        ob.num_calc(a, ch);
        ob.num_calc(m, n, ch1);
        sc.close();
    }
}