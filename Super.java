import java.util.Scanner;

class Super {
    public void check(int Number) {
        int sum = 0;
        int OriginalNumber = Number;
        int ReverseNumber = 0;
        int Exponent = 1;
        while (Number != 0) {
            ReverseNumber = ReverseNumber * 10 + (Number % 10);
            Number /= 10;
        }
        Number = ReverseNumber;
        while (Number != 0) {
            sum += (int) Math.pow((Number % 10), Exponent);
            Number /= 10;
            Exponent++;
        }
        if (sum == OriginalNumber)
            System.out.println(OriginalNumber + " is a Super number!!!");
        else
            System.out.println(OriginalNumber + " is not a Super number!!");
    }

    public static void main(String[] args) {
        Super ObjSuper = new Super();
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter a number to check if it is Super!!!");
        int Number = Input.nextInt();
        ObjSuper.check(Number);
        Input.close();
    }
}