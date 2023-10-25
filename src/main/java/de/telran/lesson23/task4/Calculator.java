package de.telran.lesson23.task4;

import java.util.Locale;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH); // для ввода точки в качестве разделителя
        Locale.setDefault(Locale.US); // для вывода точки в качестве разделителя
        char answer;
        do {

            System.out.print("Введите количество аргументов (2 и более): ");
            int argumentCount = scanner.nextInt();

            double[] arguments = new double[argumentCount];
            for (int i=0; i<arguments.length; i++) {
                System.out.print(String.format("Введите значение %d аргумента: ",i+1));
                arguments[i] = scanner.nextDouble();
            }

            char sign;
            do {
                System.out.println("Введите знак операции (+, -, /, *, %): ");
                String signStr = scanner.next();
                sign = signStr.charAt(0);
            }
            while (sign != '+' && sign != '-' && sign != '*' && sign != '/' && sign != '%');

            double result = arguments[0];
            for (int i=1; i<arguments.length; i++) {
                switch (sign) { // Выполнение математической операции в зависимости от введенного знака
                    case '+': // Если пользователь ввёл знак + ...
                        result += arguments[i]; // ... выполняется операция сложения
                        break;
                    case '-': // Если пользователь ввёл знак - ...
                        result -= arguments[i]; // ... выполняется операция вычитания
                        break;
                    case '*': // Если пользователь ввёл знак * ...
                        result *= arguments[i]; // ... выполняется операция умножения
                        break;
                    case '/': // Если пользователь ввёл знак / ...
                        result /= arguments[i]; // ... выполняется операция деления
                        break;
                    case '%': // Если пользователь ввёл знак % ...
                        result %= arguments[i]; // ... выполняется операция деления по модулю (получение остатка от деления)
                }
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i<arguments.length; i++) {
                sb.append(String.format("%.2f", arguments[i]));
                if(i < arguments.length-1) sb.append(sign);
            }
            sb.append("=").append(String.format("%.2f", result));
            System.out.println(sb);

            do {
                System.out.println("Продолжить вычисления? (Y/N) ");
                answer = scanner.next().charAt(0);
            } while (answer != 'Y' && answer != 'y' && answer != 'N' && answer != 'n');

        } while (answer == 'Y' || answer == 'y');

    }
}


//    Обновите функционал до производящего вычисления (+, -, *, /)
//    с произвольным количеством чисел c дробной частью.
//        Количество аргументов пользователь вводит с клавиатуры.
//        Оно должно быть от 2 и более.
//        Тип данных вводимых аргументов должен быть Double.
//        Далее пользователь последовательно вводит значение каждого из аргументов,
//        а затем - знак математической операции, которую необходимо выполнить со
//        значениями введенных аргументов.
//        Результат работы программы необходимо вывести в виде вычисляемого выражения
//        и полученного результата с точностью до двух чисел после запятой.


