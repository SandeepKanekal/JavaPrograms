import java.util.Scanner;

class Ascii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("THIS PROGRAM DISPLAYS ASCII VALUES OF CHARACTERS-SO, ENTER ANY CHARACTER(A CHARACTER CAN BE A NUMBER, SYMBOL, ALPHABETS, SPACE ETC.)");
        char ch = sc.next().charAt(0);
        System.out.println("ASCII VALUE OF " + ch + " IS " + (int) ch);
    }
}