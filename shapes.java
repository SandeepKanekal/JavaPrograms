//function overloading - 2 or more functions have the same name - they cannot have the same number of variables (if the data types are same)
class shapes {
    public void area(int s) {
        int sq = s * s;
        System.out.println("AREA OF THE SQ IS " + sq);
    }

    public void area(int l, int b) {
        int rect = l * b;
        System.out.println("AREA OF THE RECT IS " + rect);
    }

    public static void main(String[] args) {
        Input in = new Input();
        System.out.println("Enter side of square");
        int s = in.acceptInt();
        System.out.println("Enter length and breadth of the rectangle");
        int l = in.acceptInt();
        int b = in.acceptInt();
        shapes ob = new shapes();
        ob.area(s);
        ob.area(l, b);
    }
}