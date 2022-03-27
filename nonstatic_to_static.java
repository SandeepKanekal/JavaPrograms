import java.util.Scanner;

class nonstatic_to_static {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 2 number");
        int n = sc.nextInt();
        int m = sc.nextInt();
        source_of_code ob = new source_of_code();
        int sum = ob.add(n, m);
        System.out.println("SUM = " + sum);
        sc.close();
    }
}