package de.telran.lesson6;

import java.util.Scanner;

public class MethodSimple {
    public static void main(String[] args) {
        int a = 15, b = 10;
        int sum = a + b;
        System.out.println("sum = "+sum);

        a = 25;
        b = 19;
        sum = a + b;
        System.out.println("sum = "+sum);

        printSum(a, b);
        printSum(13, 18);

        sum = 12 + 25 + 16;
        System.out.println("sum = "+sum);

        printSum(12, 25);
        printSum(37, 16);

        sum = getSum(a,b) + 16;
        System.out.println("sum = "+sum);

        sum = getSum(getSum(a,b), 16); //getSum(44,16)
        System.out.println("sum ( getSum(getSum(a,b), 16)) = "+sum);

        sum = getSum(a, b, 16);
        System.out.println("sum ( getSum(a, b, 16)) = "+sum);

//        int myInt = inputInt();
//        System.out.println(myInt);
    }

    static void printSum(int arg1, int arg2) {
        int sum = arg1 + arg2;
        System.out.println(arg1+" + "+arg2+" = "+sum);
    }

    static int getSum(int arg1, int arg2) {
        int sum = arg1 + arg2;
//        System.out.println(arg1+" + "+arg2+" = "+sum);
        return sum;  // return arg1 + arg2;
    }

    static int getSum(int arg1, int arg2, int arg3) {
        return arg1 + arg2 + arg3;
    }

    static int inputInt() {
        System.out.print("Введите целое число ");
        Scanner scanner = new Scanner(System.in);
        int intVal = scanner.nextInt();
        return intVal;
    }
}
