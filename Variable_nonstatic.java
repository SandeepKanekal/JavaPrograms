class Variable_nonstatic {
    final int a = 5;

    public void dis() {
        System.out.println(a);
    }

    public static void main(String[] args) {
        int b = 1;
        System.out.println(b);
        Variable_nonstatic ob = new Variable_nonstatic();
        System.out.println(ob.a);
        ob.dis();
    }
}