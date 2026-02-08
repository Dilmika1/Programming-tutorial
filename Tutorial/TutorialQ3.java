class TutorialQ3 {
    boolean findEvenOrOdd(int number) {
        if (number % 2 == 0)
            return true;
        else
            return false;
    }
}

public class Demo {
    public static void main(String[] args) {
        EvenOddNumber obj = new EvenOddNumber();

        int n1 = 10;
        int n2 = 7;

        if (obj.findEvenOrOdd(n1))
            System.out.println(n1 + " is Even");
        else
            System.out.println(n1 + " is Odd");

        if (obj.findEvenOrOdd(n2))
            System.out.println(n2 + " is Even");
        else
            System.out.println(n2 + " is Odd");
    }
}
