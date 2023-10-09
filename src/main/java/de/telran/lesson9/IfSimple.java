package de.telran.lesson9;

import java.util.Scanner;

public class IfSimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число = ");
        int myInt = scanner.nextInt();

        myInt = 10;

        if(myInt > 18) {
            System.out.println("Число больше 18");
        }

        int sum = myInt + 5;
        System.out.println("Сумма = "+sum);

        if (sum > 0) {
            System.out.println("Сумма положительна");
        }
        else {
            System.out.println("Сумма отрицателбная");
        }

        System.out.println("Программа работает дальше");

    }
}
