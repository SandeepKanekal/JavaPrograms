import java.util.Scanner;

class overload {
    public void compare(int m, int n) {
        int s = Math.max(m, n);
        System.out.println(s + " is the greater number");
    }

    public void compare(char ch1, char ch2) {
        if ((int) ch1 > (int) ch2)
            System.out.println(ch1 + " is greater in ascii");
        if ((int) ch2 > (int) ch1)
            System.out.println(ch2 + " is greater in ascii");
        if ((int) ch1 == (int) ch2)
            System.out.println("both are equal in ascii");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values");
        int m = sc.nextInt();
        int n = sc.nextInt();
        char ch1 = sc.next().charAt(0);
        char ch2 = sc.next().charAt(0);
        overload ob = new overload();
        ob.compare(m, n);
        ob.compare(ch1, ch2);
        sc.close();
    }
}