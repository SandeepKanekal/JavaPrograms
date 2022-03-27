class Number {
    public static void main(String[] args) {
        for (int n = 1; n <= 999999999; n++) {
            int s = n * n;
            int c = 0;
            int ori = n;
            while (n > 0) {
                c++;
                n /= 10;
            }
            int i = s % (int) Math.pow(10, c);
            if (i == ori)
                System.out.println(ori);
            n = ori;
        }
    }
}