import java.util.*;

class Functions {
    public void factor(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                System.out.println(i);
        }
    }

    public void primenose(int n) {
        int c = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                c++;
        }
        if (c == 2)
            System.out.println(n + " IS A PRIME NOSE");
        else
            System.out.println(n + " IS A COMPOSITE NOSE");
    }

    public static void main(String[] args) {
        Functions obj = new Functions();// object name is obj
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NOSE");
        int n = sc.nextInt();
        System.out.println("FACTORS OF " + n + " ARE");
        obj.factor(n);// usage of the function factor
        obj.primenose(n);// usage of the function primenose
        sc.close();
    }
}