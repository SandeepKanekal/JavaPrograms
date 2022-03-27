package patterns;

import java.util.Scanner;

class pattern8 {
    public void DisplayPattern(int r) {
        for (int i = 1; i <= r; i++) {
            for (int m = 1; m <= i; m++) {
                if (m % 2 != 0)
                    System.out.print(1);
                else
                    System.out.print(0);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of lines to be printed");
        int LinesNumber = input.nextInt();
        pattern8 Objpattern8 = new pattern8();
        Objpattern8.DisplayPattern(LinesNumber);
        input.close();
    }
}