package de.telran.lesson4;

public class CastTypes {
    public static void main(String[] args) {
        byte myByte = 15;
        int myInt = myByte;
        System.out.println("myByte = "+myByte);
        System.out.println("myInt = "+myInt);

        short myShort = (short)myInt;
        System.out.println("myShort = "+myShort);

        int myIntBig = 1_000_000;
        myShort = (short)myIntBig;
        System.out.println("myShort = "+myShort);

        double myDbl = myIntBig;
        System.out.println("myDbl = "+myDbl);

        float myFloat = myIntBig;
        System.out.println("myFloat = "+myFloat);

        char mySymb = 'd';
        System.out.println("mySymb = " + mySymb);

        int mySymbInt = 'd';
        System.out.println("mySymbInt = " + mySymbInt);

        char mySymb1 = (char)mySymbInt;
        System.out.println("mySymb1 = " + mySymb1);
    }
}
