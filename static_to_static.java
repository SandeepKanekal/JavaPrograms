class static_to_static {
    public static void main(String[] args) {
        Input in = new Input();
        System.out.println("Enter a number");
        int n = in.acceptInt();
        boolean x = source_of_code.prime(n);
        if (x)
            System.out.println("prime");
        else
            System.out.println("composite");
    }
}