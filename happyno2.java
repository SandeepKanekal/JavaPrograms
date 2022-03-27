class happyno2 {
    public static void main(int n) {
        int sum = 0;
        if (n == 1 || n == 7)
            System.out.println("yes");
        else {
            while (n > 9) {
                sum = 0;
                while (n > 0) {
                    int t = n % 10;
                    sum += (t * t);
                    n /= 10;
                }
                n = sum;
            }
        }
        if (n == 1)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}