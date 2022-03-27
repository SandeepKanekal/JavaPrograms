class Twinprime {
    public static void main(String[] args) {
        Input in = new Input();
        System.out.println("Enter 2 numbers");
        int m = in.acceptInt();
        int n = in.acceptInt();
        int counter1 = 0;
        int counter2 = 0;
        for (int i = 1; i <= m; i++) {
            if (m % i == 0)
                counter1++;
        }
        for (int j = 1; j <= n; j++) {
            if (m % j == 0)
                counter2++;
        }
        if ((counter1 == 2 && counter2 == 2) && (m - n == 2 || n - m == 2))
            System.out.println("twim prime");
        else
            System.out.println("not a twin prime");
    }
}