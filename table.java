import java.util.Scanner;

class table {
    public static void main(String[] args) {
        int n = 0;
        int check = 0;
        while (check == 0) {
            Scanner sc = new Scanner(System.in);
            System.out.println("ENTER A NUMBER - PRESS 0 TO QUIT");
            n = sc.nextInt();
            for (int i = 1; i <= 15; i++)
                System.out.println(n + " X " + i + " = " + (n * i));
            if (n != 0)
                check++;
            sc.close();
        }
    }
}