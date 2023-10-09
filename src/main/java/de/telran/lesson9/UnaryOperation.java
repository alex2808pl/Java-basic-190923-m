package de.telran.lesson9;

public class UnaryOperation {
    public static void main(String[] args) {

        int myInt = 10;
        System.out.println("myInt = " + myInt);
        myInt++;  // myInt = myInt + 1;
        System.out.println("myInt++ " + myInt);
        myInt--; // myInt = myInt - 1;
        System.out.println("myInt-- " + myInt);

        myInt+=2; // myInt = myInt + 2;
        myInt-=3; // myInt = myInt - 3;
        myInt/=2; // myInt = myInt / 2;
        myInt*=5; // myInt = myInt * 5;
        myInt%=2; // myInt = myInt % 2;

        int myInt2 = 15;
        printNumber(myInt2);
        printNumber(myInt2--);
        System.out.println(myInt2);

        System.out.println("myInt2++ "+ myInt2++);
        System.out.println(myInt2);

        System.out.println("++myInt2 "+ (++myInt2));
        System.out.println(myInt2);

        int a1 = 5, a2 = 8;
        System.out.println("Sum = " + sum(5,8));
        System.out.println("Sum = " + sum(a1,a2));
        System.out.println("Sum = " + sum(++a1,a2));
        System.out.println(a1);

    }
    static void printNumber(int number) {
        System.out.println("printNumber() = "+number);
    }

    static int sum(int arg1, int arg2) {
        return arg1 + arg2;
    }
}
