class nonstatic_and_static {
    public void display1() {
        System.out.println("Good Morning");
    }

    public static void display2() {
        System.out.println("Hello");
    }

    public static void main() {
        nonstatic_and_static ob = new nonstatic_and_static();// object creation is required to reference nonstatic
                                                             // methods
        ob.display1();
        display2();// directly write method name
    }
}