package de.telran.lesson24.task2;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH); // для ввода точки в качестве разделителя
        Locale.setDefault(Locale.US); // для вывода точки в качестве разделителя
        char answer;
        String[] resultsHistory = new String[3];

        do {
            System.out.print("Введите количество аргументов (2 и более): ");
            int argumentCount = scanner.nextInt();

            double[] arguments = new double[argumentCount]; //массив аргументов
            char[] signs = new char[argumentCount-1]; //массив для арифм.операций

            for (int i=0; i<arguments.length; i++) {

                System.out.print(String.format("Введите значение %d аргумента: ",i+1));
                arguments[i] = scanner.nextDouble();
                if(i < arguments.length-1) {
                    do {
                        System.out.println("Введите знак операции (+, -, /, *, %): ");
                        String signStr = scanner.next();
                        signs[i] = signStr.charAt(0);
                    }
                    while (signs[i] != '+' && signs[i] != '-' && signs[i] != '*' && signs[i] != '/' && signs[i] != '%');
                }
            }

            double result = arguments[0];
            for (int i=1; i<arguments.length; i++) {
                switch (signs[i-1]) { // Выполнение математической операции в зависимости от введенного знака
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
                if(i < arguments.length-1) sb.append(signs[i]);
            }
            sb.append("=").append(String.format("%.2f", result));
            System.out.println(sb);
            System.out.println();

            // Добавление в историю
            for( int i = resultsHistory.length-1; i > 0; i--) {
                resultsHistory[i] = resultsHistory[i-1];
            }
            resultsHistory[0] = sb.toString();
            System.out.println("История выполненных вычислений:");
            System.out.println(Arrays.toString(resultsHistory));

            do {
                System.out.println("Продолжить вычисления? (Y/N) ");
                answer = scanner.next().charAt(0);
            } while (answer != 'Y' && answer != 'y' && answer != 'N' && answer != 'n');

        } while (answer == 'Y' || answer == 'y');

    }
}


//    1) Вводить знак математической операции перед вводом каждого следующего аргумента.
//        Например, пользователь указывает, что хочет выполнить операцию над тремя аргументами.
//        Программа просит последовательно ввести первый аргумент, знак математической операции,
//        который будет выполнен над значениями первого и второго аргумента, значение второго
//        аргумента, знак математической операции, который будет выполнен над результатом
//        операции между первым и вторым аргументом и третьим аргументом.
//        В результате, программа должна позволять вычислить следующее выражение:
//        3 * 4 - 10.5 + 2 = 3.5
//
//     2) Выводить на экран историю последних 5 вычислений. (3)



