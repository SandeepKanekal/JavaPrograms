import java.util.*;

class funarm {
    public void arm(int n) {
        int sum = 0;
        int ori = n;
        while (n > 0) {
            int t = n % 10;
            sum += (t * t * t);
            n /= 10;
        }
        if (sum == ori)
            System.out.println(ori + " IS ARMSTRONG");
        else
            System.out.println(ori + " IS LEGWEAK");
    }

    public static void main(String[] agrs) {
        funarm obj = new funarm();
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NOSE");
        int n = sc.nextInt();
        obj.arm(n);
        sc.close();
    }
}