class HCF {
    public int check(int a, int b) {
        int h = 1;
        if (a > b || a == b) {
            for (int i = 2; i <= a;) {
                if (a % i == 0 && b % i == 0) {
                    h *= i;
                    a /= i;
                    b /= i;
                } else
                    i++;
            }
        } else {
            for (int i = 2; i <= b;) {
                if (a % i == 0 && b % i == 0) {
                    h *= i;
                    a /= i;
                    b /= i;
                } else
                    i++;
            }
        }
        return h;
    }
}