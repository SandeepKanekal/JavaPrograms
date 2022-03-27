import java.util.*;

class HCFLCM2 {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int a = sc.nextInt();
        System.out.println("ENTER ANOTHER NUMBER");
        int b = sc.nextInt();
        int hcf = 0;
        if (a >= b) {
            for (int i = 1; i <= a; i++) {
                if (a % i == 0 && b % i == 0)
                    hcf = i;
            }
        } else {
            for (int i = 1; i <= b; i++) {
                if (a % i == 0 && b % i == 0)
                    hcf = i;
            }
        }
        int lcm = (a * b) / hcf;
        System.out.println("HCF IS " + hcf);
        System.out.println("LCM IS " + lcm);
        sc.close();
    }
}