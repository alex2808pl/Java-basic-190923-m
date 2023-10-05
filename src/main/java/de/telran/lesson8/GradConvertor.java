package de.telran.lesson8;

import java.util.Scanner;

public class GradConvertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите температуру в градусах Цельсия: ");
        int tempGrad = scanner.nextInt();

        System.out.println("Температура в Кельвинах: "+runKelvinConverter(tempGrad));
        System.out.println("Температура в Фаренгейте: "+runFahrenheitConverter(tempGrad));

        System.out.println(String.format("Температура в Кельвинах: %.2f",runKelvinConverter(tempGrad)));
        System.out.printf("Температура в Кельвинах: %.2f\n",runKelvinConverter(tempGrad));

        System.out.printf("Температура в Кельвинах: %.2f, температура в Фаренгете %.2f\n",runKelvinConverter(tempGrad),runFahrenheitConverter(tempGrad));

    }
    static double runKelvinConverter(double baseValue) {
        return baseValue + 273.15;
    }

    static double runFahrenheitConverter(double baseValue) {
        return 1.8 * baseValue + 32;
    }
}

/*    Напишите класс Converter для конвертации из градусов по Цельсию в Кельвины и фаренгейты:
        У класса должны быть методы для конвертации.
        Реализуйте два метода в классе:
        runKelvinConverter(double baseValue)
        runFahrenheitConverter(double baseValue)*/
