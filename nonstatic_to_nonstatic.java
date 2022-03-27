import java.util.*;

class nonstatic_to_nonstatic {
    public int obj(int a, int b) {
        source_of_code ob = new source_of_code();
        return ob.add(a, b);
    }

    public static void main(String[] args) {
        nonstatic_to_nonstatic o = new nonstatic_to_nonstatic();
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER 2 NUMBERS");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = o.obj(a, b);
        System.out.println("SUM = " + sum);
        sc.close();
    }
}