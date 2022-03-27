import java.util.Scanner;

class Time {
    int hr;
    int min;

    public void input(int h, int m) {
        hr = h;
        min = m;
    }

    public Time addTime(Time t1, Time t2) {
        Time t3 = new Time();
        t3.hr = t1.hr + t2.hr + ((t1.min + t2.min) / 60);
        t3.min = (t1.min + t2.min) % 60;
        return t3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE INPUT");
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();
        Time t1 = new Time();
        Time t2 = new Time();
        t1.input(h1, m1);
        t2.input(h2, m2);
        t1.addTime(t1, t2);
        Time t3 = new Time();
        t3 = t3.addTime(t1, t2);
        System.out.println(t3.hr + "hr " + t3.min + "min");
        sc.close();
    }
}
