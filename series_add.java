class series_add {
    public void series(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++)
            sum += (1.0 / i);
        System.out.println(sum);
    }

    public void series(int n, int x) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            double fact = 1;
            for (int k = 1; k <= i; k++)
                fact *= k;
            sum = sum + ((x + i) / fact);
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Input in = new Input();
        System.out.println("Enter 3 numbers");
        int n = in.acceptInt();
        int x = in.acceptInt();
        int i = in.acceptInt();
        series_add ob = new series_add();
        ob.series(i);
        ob.series(n, x);
    }
}