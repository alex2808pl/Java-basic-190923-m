package de.telran.lesson23.task3;

import java.util.Locale;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH); // для ввода точки в качестве разделителя
        Locale.setDefault(Locale.US); // для вывода точки в качестве разделителя
        char answer;
        do {
            System.out.println("Разделитель между цело и дробной частью - точка!");
            System.out.print("Введите значение первого аргумента: ");
            double argumentOne = scanner.nextDouble();

            char sign;
            do {
                System.out.println("Введите знак операции (+, -, /, *, %): ");
                String signStr = scanner.next();
                sign = signStr.charAt(0);
            }
            while (sign != '+' && sign != '-' && sign != '*' && sign != '/' && sign != '%');

            double argumentTwo;
            do {
                System.out.print("Введите значение второго аргумента: ");
                argumentTwo = scanner.nextDouble();
                if (argumentTwo == 0.0 && (sign == '/' || sign == '%')) {
                    System.out.println("На 0 делить нельзя!");
                }
            }
            while (argumentTwo == 0.0 && (sign == '/' || sign == '%'));

            double result = 0.0;
            switch (sign) { // Выполнение математической операции в зависимости от введенного знака
                case '+': // Если пользователь ввёл знак + ...
                    result = argumentOne + argumentTwo; // ... выполняется операция сложения
                    break;
                case '-': // Если пользователь ввёл знак - ...
                    result = argumentOne - argumentTwo; // ... выполняется операция вычитания
                    break;
                case '*': // Если пользователь ввёл знак * ...
                    result = argumentOne * argumentTwo; // ... выполняется операция умножения
                    break;
                case '/': // Если пользователь ввёл знак / ...
                    result = argumentOne / argumentTwo; // ... выполняется операция деления
                    break;
                case '%': // Если пользователь ввёл знак % ...
                    result = argumentOne % argumentTwo; // ... выполняется операция деления по модулю (получение остатка от деления)
            }

            System.out.println(String.format("%.2f %s %.2f = %.2f", argumentOne, sign, argumentTwo, result));

            do {
                System.out.println("Продолжить вычисления? (Y/N) ");
                answer = scanner.next().charAt(0);
            } while (answer != 'Y' && answer != 'y' && answer != 'N' && answer != 'n');

        } while (answer == 'Y' || answer == 'y');

    }
}


//    1) Реализации интерактивного меню. После завершения вычислений калькулятор должен спрашивать
//    желает ли пользователь выполнить еще вычисление. Если пользователь вводит "Y", то калькулятор
//    выполняет новый цикл работы - запрашивает значения аргументов и знак математической операции,
//    выполняет вычисления и выводит на экран ответ. После этого снова спрашивает желает ли пользователь
//    выполнить еще вычисление. Если пользователь вводит "N", то работа программы завершается.
//    2)Ввода корректного значения выбора пользователя в интерактивном меню - "Y" или "N".
//        Если пользователь ввёл иной символ - программа должна попросить ввести ответ снова,
//        до тех под, пока пользователь не введет символ "Y" или "N".
//    3)Ввода корректного значения второго аргумента (знаменателя), если пользователь выбрал знак деления.
//        Если пользователь выбрал операцию деления и ввёл значение второго аргумента = 0, то программа должна
//        запрашивать ввод нового значения аргумента до тех пор, пока оно не будет не равно нулю.

//    4)Аналогично программа должна повторно запрашивать ввод знака математической операции до тех пор,
//        пока он не будет введён корректно.
