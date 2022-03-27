import java.util.Scanner;

class SpecialNumber {
    public void check(int Number) {
        int Sum = 0;
        int OriginalNumber = Number;
        while (Number != 0) {
            int Factorial = 1;
            for (int LoopControlVar = 1; LoopControlVar <= (Number % 10); LoopControlVar++)
                Factorial *= LoopControlVar;
            Sum += Factorial;
            Number /= 10;
        }
        if (Sum == OriginalNumber)
            System.out.println(OriginalNumber + " IS A SPECIAL NUMBER");
        else
            System.out.println(OriginalNumber + " IS NOT A SPEICAL NUMBER");
    }

    public static void main(String[] args) {
        SpecialNumber objSpecialNumber = new SpecialNumber();
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int Number = input.nextInt();
        objSpecialNumber.check(Number);
        input.close();
    }
}