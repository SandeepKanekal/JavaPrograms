class series4 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int m = 1; m <= (n - i); m++)
                System.out.print("*");
            System.out.print(i);
            for (int k = 1; k < i; k++)
                System.out.print("*");
            System.out.println();
        }
    }
}