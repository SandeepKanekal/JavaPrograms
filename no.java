import java.util.*;

class no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER OF TIMES TO BE DISPLAYED");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int f = 1;
            for (int t = 1; t <= i; t++)
                f *= t;
            double d = f / i;
            System.out.println(i + "/" + i + "!= " + i + "/" + f + "= " + (1 / d));
        }
        sc.close();
    }
}