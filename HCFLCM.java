import java.util.*;

class HCFLCM {
    public void H(int m, int n) {
        HCF ob = new HCF();
        int h = ob.check(m, n);
        System.out.println("HCF is " + h);
    }

    public void L(int m, int n) {
        LCM ob = new LCM();
        int l = ob.check2(m, n);
        System.out.println("LCM is " + l);
    }

    public static void main(String[] args) {
        HCFLCM ob = new HCFLCM();
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int m = sc.nextInt();
        System.out.println("ENTER ANOTHER NUMBER");
        int n = sc.nextInt();
        ob.H(m, n);
        ob.L(m, n);
        sc.close();
    }
}