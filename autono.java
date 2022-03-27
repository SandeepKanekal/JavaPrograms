class autono {
    public static void main(String[] args) {
        for (int n = 1; n <= 100000;) {
            int s = n * n;
            int ori = n;
            int c = 0;
            while (n != 0) {
                c++;
                n /= 10;
            }
            if (s % (int) Math.pow(10, c) == ori)
                System.out.println(ori);
            n = ori;
            n++;
        }
    }
}