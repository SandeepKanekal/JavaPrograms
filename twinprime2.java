class twinprime2 {
    public int prime(int m) {
        int c = 0;
        for (int i = 1; i <= m; i++) {
            if (m % i == 0)
                c++;
        }
        return c;
    }

    public static void main(String[] args) {
        Input in = new Input();
        System.out.println("Enter 2 numbers");
        int m = in.acceptInt();
        int n = in.acceptInt();
        twinprime2 ob = new twinprime2();
        int diff = Math.abs(m - n);
        int c1 = ob.prime(m);
        int c2 = ob.prime(n);
        if (diff == 2 && (c1 == 2 && c2 == 2))
            System.out.println("TWIN PRIME");
        else
            System.out.println("NOT A TWIN PRIME");
    }
}