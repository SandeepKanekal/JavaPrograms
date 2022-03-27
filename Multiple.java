
//PROGRAM TO DISPLAY SUM OF MULTIPLES OF A NUMBER TILL ANY NUMBER U ENTER
import java.util.*;

class Multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER FOR MULTIPLES");
        int m = sc.nextInt();
        System.out.println("ENTER THE ENDING NUMBER");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = m; i <= n; i += m)
            sum += i;
        System.out.println(sum);
        sc.close();
    }
}