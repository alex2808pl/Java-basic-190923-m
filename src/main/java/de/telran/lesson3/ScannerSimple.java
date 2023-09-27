package de.telran.lesson3;

import java.util.Locale;
import java.util.Scanner;

public class ScannerSimple {
    public static void main(String[] args) {
        int myInt = 15;
        System.out.println(myInt);

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH); // настройка локализации

        System.out.print("Введите число: ");
        myInt = scanner.nextInt();
        System.out.println(myInt);

        System.out.print("Введите boolean: ");
        boolean myBool = scanner.nextBoolean();
        System.out.println(myBool);

        System.out.print("Введите дробное число: ");
        double myDouble = scanner.nextDouble();
        System.out.println(myDouble);

        // для строки
        Scanner scannerStr = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String myStr = scannerStr.nextLine();
        System.out.println(myStr);



    }
}
