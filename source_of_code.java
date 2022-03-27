class source_of_code {
    public int add(int n, int m) {
        return m + n;
    }

    public static boolean prime(int n) {
        boolean x = false;
        int c = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                c++;
        }
        x = c == 2;
        return x;
    }
}