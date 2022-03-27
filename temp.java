class temp {
    public double convert(int F) {
        return (5.0 / 9.0) * (F - 32.0);
    }

    public static void main(String[] args) {
        Input in = new Input();
        System.out.println("Enter temperature in farenheit");
        int F = in.acceptInt();
        temp ob = new temp();
        double C = ob.convert(F);
        System.out.println(C + " DEGREES CELCIUS");
    }
}