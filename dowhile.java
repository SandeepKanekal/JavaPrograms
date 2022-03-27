import java.util.*;

class dowhile {
    public static void main(String[] args) {
        int sum = 0;
        int n = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("ENTER A NUMBER - 0 TO STOP");
            n = sc.nextInt();
            sum += n;
        } while (n != 0);
        System.out.println("SUM OF ENTERED NUMBERS IS " + sum);
        sc.close();
    }
}