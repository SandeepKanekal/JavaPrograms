class matrix {
    public static void main(String[] args) {
        int n = 1;
        for (int i = 1; i <= 3; i++) {
            for (int m = 1; m <= 3; m++) {
                System.out.print(n);
                n += 2;
            }
            n -= 4;
            System.out.println();
        }
    }
}