//TO DUSPLAY AUTOMORPHIC NUMBERS FROM 1 TO 100000
class automorphicno {
    public static void main(String[] args) {
        for (int n = 1; n <= 100000;) {
            int sq = n * n;
            int c = 0;
            int ori = n;
            while (n > 0) {
                c++;
                n /= 10;
            }
            if (sq % (int) Math.pow(10, c) == ori)
                System.out.println(ori);
            n = ori;
            n++;
        }
    }
}