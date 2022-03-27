class palprime1000 {
    public static void main(String[] args) {
        for (int n = 1; n <= 1000;) {
            int c = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0)
                    c++;
            }
            int ori = n;
            int rev = 0;
            while (n > 0) {
                int t = n % 10;
                rev = rev * 10 + t;
                n /= 10;
            }
            if (c == 2 && (rev == ori))
                System.out.println(ori);
            n = ori;
            n++;
        }
    }
}