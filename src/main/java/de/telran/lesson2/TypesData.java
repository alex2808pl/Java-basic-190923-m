package de.telran.lesson2;

public class TypesData {
    public static void main(String[] args) {
        int myInt;
        myInt = 25;
        System.out.println(myInt);
        int myIntOther = 10;

        myInt = 13;
        System.out.println(myInt);

        //Целочисленные типы
        byte myByte = 18;  // -128...127
        short mySchort = 200; //-32768 ... 32767
        int myInt1 = 40_000; //-2147483648 ... 2147483647
        long myLong = 100_000; // –9 223 372 036 854 775 808 .... 9 223 372 036 854 775 807

        //Дробные числа
        float myFloat = 1233.14f; // -3.4*10E38 ... 3.4*10E38;
        double myDouble = 1000.85; //±4.9*10E-324 ... ±1.8*10E308.

        char myChar = 'd'; // для хранения символа
        String myStr = "мама мыла раму"; // для хранения строки

        boolean myBool = true; // false - логический тип

        System.out.println("Моя переменная myByte = "+myByte);
        System.out.println("mySchort = "+mySchort);
        System.out.println("myInt1 = "+myInt1);
        System.out.println("myLong = "+myLong);
        System.out.println("myFloat = "+myFloat);
        System.out.println("myDouble = "+myDouble);
        System.out.println("myChar = "+myChar);
        System.out.println("myStr = "+myStr);
        System.out.println("myBool = "+myBool);
    }
}
