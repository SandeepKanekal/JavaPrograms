class slow {
    public static void main(String[] args) {
        Input in = new Input();
        System.out.println("Enter a number");
        int n = in.acceptInt();
        int rev = 0;
        while (n > 0) {
            int t = n % 10;
            rev = rev * 10 + t;
            n = n / 10;
        }
        if (rev % 10 == 0)
            System.out.print("duck number");
        else
            System.out.print("not a duck number");
    }
}