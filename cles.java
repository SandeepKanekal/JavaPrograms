class cles {
    public static void main(String[] args) {
        for (int n = 1; n <= 100000; n++) {
            int sum = 0;
            int fact = 1;
            for (int i = 1; i <= n; i++)
                fact *= i;
            while (fact != 0) {
                int t = fact % 10;
                sum += t;
                fact /= 10;
            }
            if (sum == n)
                System.out.println(n);
        }
    }
}