import java.util.Scanner;

public class ThisKeyword {
    final int a;
    final int b;

    public ThisKeyword(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void display() {
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter 2 numbers");
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        ThisKeyword Obj = new ThisKeyword(firstNumber, secondNumber);
        Obj.display();
        sc.close();
    }
}
