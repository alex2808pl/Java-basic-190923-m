package de.telran.lesson24.task3;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Calculator {
    private static Scanner scanner = new Scanner(System.in);
    private static String[] resultsHistory = new String[3];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH); // для ввода точки в качестве разделителя
        Locale.setDefault(Locale.US); // для вывода точки в качестве разделителя
        char answer;

        do {
            String expression = inputExpression();
            System.out.println(expression);
            double[] arguments = parseArguments(expression);
            System.out.println(Arrays.toString(arguments));

            char[] signs = parseSigns(expression); //массив для арифм.операций
            System.out.println(Arrays.toString(signs));

            double result = arguments[0];
            for (int i = 1; i < arguments.length; i++) {
                result = calculate(result, signs[i - 1], arguments[i]);
            }
            printResult(expression, result);

            addResultToHistory(expression, result);
            System.out.println("История выполненных вычислений:");
            System.out.println(Arrays.toString(resultsHistory));

            do {
                System.out.println("Продолжить вычисления? (Y/N) ");
                answer = scanner.next().charAt(0);
            } while (answer != 'Y' && answer != 'y' && answer != 'N' && answer != 'n');

        } while (answer == 'Y' || answer == 'y');
    }

    static String inputExpression() {
        System.out.println("Введите математическое выражение (10.5*5+1-7.1): ");
        scanner.useLocale(Locale.ENGLISH); // для ввода точки в качестве разделителя
        String exp = scanner.nextLine();
        return exp;
    }

    static double[] parseArguments(String expression) {
        int countArgument = countArgumentNumber(expression);
        double[] arguments = new double[countArgument];

        int currentArgumentNumber = 0;
        StringBuilder argumentAsString = new StringBuilder();
        for (int i = 0; i<expression.length(); i++) {
            char symbol = expression.charAt(i);

            if(!isSign(symbol)) {
                argumentAsString.append(symbol);
            }

            if(isSign(symbol) || i==expression.length()-1) {
                double argument = Double.parseDouble(argumentAsString.toString());
                arguments[currentArgumentNumber] = argument;
                currentArgumentNumber++;
                argumentAsString.delete(0, argumentAsString.length());
            }

        }
        return arguments;
    }

    static boolean isSign(char symbol) {
        boolean result = symbol == '+' || symbol == '-' || symbol == '*' || symbol == '/' || symbol == '%';
        return result;
    }

    static int countArgumentNumber(String expression) {
        int argumentCount = 1;
        for (int i=0; i<expression.length(); i++) {
            char symbol = expression.charAt(i);
            if(isSign(symbol))
                argumentCount++;
        }
        return argumentCount;
    }

    static char[] parseSigns(String expression) {
        int  argumentCount = countArgumentNumber(expression);
        char[] signs = new char[argumentCount-1]; //массив для арифм.операций

        int countSignNumber = 0;
        for (int i = 0; i<expression.length(); i++) {
            char symbol = expression.charAt(i);

            if (isSign(symbol)) {
                signs[countSignNumber] = symbol;
                countSignNumber++;
            }
        }
        return signs;
    }

    static double calculate(double argumentOne, char sign, double argumentTwo) {
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
        return result;
    }

    static void printResult(String expression, double result) {
        System.out.println(String.format("%s=%.2f", expression, result));
        System.out.println();
    }

    static void addResultToHistory(String expression, double result) {
//         Добавление в историю
            for( int i = resultsHistory.length-1; i > 0; i--) {
                resultsHistory[i] = resultsHistory[i-1];
            }
            resultsHistory[0] = String.format("%s=%.2f", expression, result);
    }



}


//    Доработайте программу "Калькулятор" (версии 2) таким образом, чтобы она позволяла пользователю вводить
//    вычисляемое математическое выражение в виде одной строки. Например, так 10.5*5+1-7.1
//    и последовательно выполняла бы указанные арифметические операции над аргументами.
//        выполнить рефакторинг программного кода "Калькулятора" таким образом, чтобы каждый логический
//        шаг алгоритма был бы реализован в отдельном методе.
//        создать отдельные методы для выполнения следующих шагов:
//       + 1) String inputExpression() - для ввода строки (вычисляемого математического выражения) с
//        клавиатуры
//        +2) double[] parseArguments(String expression) - для получения из строки математического
//        выражения значений аргументов
//        +3) char[] parseSigns(String expression) - для получения из строки математического выражения
//        знаков математических операций
//       + 4) double calculate(double argumentOne, char sign, double argumentTwo) - для выполнения
//        математической операции над парой аргументов
//       + 5) void printResult(String expression, double result) - для вывода результата
//        вычисления на экран
//        Убедитесь, что приложение работает корректно.




