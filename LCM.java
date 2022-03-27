class LCM {
    public int check2(int m, int n) {
        int h = 1;
        int ori_m = m;
        int ori_n = n;
        if (m > n || m == n) {
            for (int i = 2; i <= m;) {
                if (m % i == 0 && n % i == 0) {
                    h *= i;
                    m /= i;
                    n /= i;
                } else
                    i++;
            }
        } else {
            for (int i = 2; i <= n;) {
                if (m % i == 0 && n % i == 0) {
                    h *= i;
                    m /= i;
                    n /= i;
                } else
                    i++;
            }
        }
        return (ori_m * ori_n) / h;
    }
}