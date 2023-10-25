package de.telran.lesson23.task2;

import java.util.Locale;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH); // для ввода точки в качестве разделителя
        Locale.setDefault(Locale.US); // для вывода точки в качестве разделителя

        System.out.println("Разделитель между цело и дробной частью - точка!");
        System.out.print("Введите значение первого аргумента: ");
        double argumentOne = scanner.nextDouble();

        System.out.println("Введите знак операции (+, -, /, *, %): ");
        String signStr = scanner.next();
        char sign = signStr.charAt(0);
        if (sign != '+' && sign != '-' && sign != '*' && sign != '/' && sign != '%') { // Проверка введенного с клавиатуры значения операции на вхождение в допустимый диапазон операций
            System.out.println(sign + " не корректная операция!");
            return; //exit(1);
        }

        System.out.print("Введите значение второго аргумента: ");
        double argumentTwo = scanner.nextDouble();
        if(argumentTwo == 0.0 && (sign == '/' || sign == '%')) {
            System.out.println("На 0 делить нельзя!");
            return; //exit(1);
        }

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

        System.out.println(String.format("%.2f %s %.2f = %.2f",argumentOne, sign, argumentTwo, result));

    }
}


//    Используйте оператор switch-case вместо оператора if-else при обработке введенной
//    математической операции.
//        К списку арифметических операций, выполняемых калькулятором, добавьте поддержку
//        операции деления по модулю (%), возвращающую остаток от деления.
