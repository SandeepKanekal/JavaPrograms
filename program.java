class program {
    public static void main(String[] args) {
        int c = 1;
        for (int i = 1; i <= 40; i += 3) {
            System.out.println(i * c);
            c *= -1;
        }
    }
}