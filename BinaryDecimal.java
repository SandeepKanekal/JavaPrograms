import java.util.Scanner;

class BinaryDecimal {
    public void convert(int n) {
        int ori = n;
        StringBuilder s = new StringBuilder();
        while (n != 0) {
            int t = n % 2;
            s.insert(0, t);
            n /= 2;
        }
        System.out.println(ori + " IN DECIMAL IS " + s);
    }

    public void convert(long n) {
        long ori = n;
        int sum = 0;
        int c = 0;
        while (n > 0) {
            int t = (int) n % 10;
            int d = (int) Math.pow(2, c) * t;
            sum += d;
            c++;
            n /= 10;
        }
        System.out.println(ori + " IN BINARY IS " + sum);
    }

    public static void main(String[] args) {
        BinaryDecimal ob = new BinaryDecimal();
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A DECIMAL VALUE");
        int dec = sc.nextInt();
        System.out.println("ENTER A BINARY VALUE");
        long bin = sc.nextLong();
        ob.convert(dec);
        ob.convert(bin);
        sc.close();
    }
}