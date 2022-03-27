class slab1 {
    public static void main(String[] args) {
        Input in = new Input();
        System.out.println("Enter name, distance travelled, and Taxi number");
        int km = in.acceptInt();
        String name = in.acceptWord();
        int tn = in.acceptInt();
        int amt = 0;
        if (km <= 10)
            amt = km * 25;
        if (km > 10 && km <= 30)
            amt = (10 * 25) + ((km - 10) * 10);
        if (km > 30 && km <= 70)
            amt = (20 * 10) + (10 * 25) + ((km - 30) * 15);
        if (km > 70)
            amt = (40 * 15) + (20 * 10) + (10 * 25) + ((km - 70) * 12);
        System.out.println("CUSTOMER NAME : " + name);
        System.out.println("TAXI NUMBER : " + tn);
        System.out.println("AMOUNT : ?" + amt);
    }
}