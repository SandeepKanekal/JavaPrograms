package patterns;

class pattern4 {
    public static void main(String[] args) {
        int n = 1;
        int d = -1;
        for (int i = 1; i <= 5; i++) {
            for (int m = 1; m <= i; m++) {
                System.out.print(n);
                n++;
            }
            d++;
            n -= d;
            System.out.println();
        }
    }
}