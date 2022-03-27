class series5 {
    public static void main(String[] args) {
        Input in = new Input();
        System.out.println("Enter a number");
        int a = in.acceptInt();
        double sum = 0;
        for (int i = -1; i >= -10; i--)
            sum += (a + i) / (a + i + 11);
        System.out.println(sum);
    }
}