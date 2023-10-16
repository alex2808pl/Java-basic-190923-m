package de.telran.lesson14;

public class SimpleFor {
    public static void main(String[] args) {
        int myInt = 8;

        printIntervalWhile(myInt);
        System.out.println();

        printIntervalFor(myInt);
        System.out.println();

        printIntervalForInfinity(myInt);
        System.out.println();

        printIntervalForInfinity2(myInt);
    }

    private static void printIntervalForInfinity2(int myInt) {
        //еще одна реализация вечного цикла
        for(int counter = 1;;counter++) {
            if(counter> myInt) break;
            System.out.println(counter);
        }
    }

    private static void printIntervalForInfinity(int myInt) {
        int counter = 1;
        //вечный цикл
        for(;;) {
            System.out.println(counter);
            counter++;
            if(counter > myInt) break;
        }
    }

    private static void printIntervalFor(int myInt) {
        //for
        for (int counter = 1; counter <= myInt; counter++) {
            if(counter==5) continue; // 5-ка на экран не напечатается
            System.out.println(counter);
        }
    }

    private static void printIntervalWhile(int myInt) {
        int counter = 1;
        while(counter <= myInt) {
            System.out.println(counter);
            counter++;
        }
    }
}

//    Реализуйте метод, принимающий в параметре число.
//        Распечатайте все входящие значения числа
//
//        Например:
//        Вход = 8
//        Выход =
//        1
//        2
//        3
//        …
//        8

