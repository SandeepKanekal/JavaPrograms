import java.util.*;

class ReversePrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int Number = input.nextInt();
        int ReversedNumber = 0;
        while (Number > 0) {
            ReversedNumber = ReversedNumber * 10 + (Number % 10);
            Number /= 10;
        }
        int CheckPrime = 0;
        for (int LCV = 1; LCV <= ReversedNumber; LCV++) {
            if (ReversedNumber % LCV == 0)
                CheckPrime++;
        }
        if (CheckPrime == 2)
            System.out.println("REVERSED NUMBER IS PRIME");
        else
            System.out.println("REVERSED NUMBER IS COMPOSITE");
        input.close();
    }
}