import java.util.Scanner;

class duckno {
    public void check(String s) {
        char ch = s.charAt(0);
        if (ch == '0')
            System.out.print("not a duck number");
        else {
            int n = Integer.parseInt(s);
            int c = 0;
            while (n != 0) {
                int t = n % 10;
                if (t == 0)
                    c++;
                n /= 10;
            }
            if (c > 0)
                System.out.print("duck number");
            else
                System.out.print("not a duck number");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        String Number = input.next();
        duckno Obj = new duckno();
        Obj.check(Number);
        input.close();
    }
}