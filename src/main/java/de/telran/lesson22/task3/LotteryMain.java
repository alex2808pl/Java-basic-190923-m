package de.telran.lesson22.task3;

import java.util.Arrays;
import java.util.Scanner;

import static de.telran.lesson22.task3.Constants.COUNT_SET_SIZE;
import static de.telran.lesson8.RandomStudent.generateIntRandomInterval;

public class LotteryMain {
    public static void main(String[] args) {
        int[] userNumbers = Utils.getUserLotteryNumber();
        System.out.println(Arrays.toString(userNumbers));

        Lottery lottery = new Lottery();
        lottery.runLottery();
        int[] lotteryNumbers = lottery.getWinnerNumbers();
        System.out.println(Arrays.toString(lotteryNumbers));

        int countWinnerNumber = Utils.compareWinnerNumbers(lotteryNumbers, userNumbers);
        System.out.println("Количество совпавших номеров - "+countWinnerNumber);

    }
}

//    Распределите ответственность написанного кода в соответствующие классы и методы
//        Сохраните номера лотереи в массиве
//        Введите контроль за количеством номеров в лотереи и от пользователя
//        Создайте класс Константы, определите COUNT_SET_SIZE = 5
//        Добавьте проверку пользовательских номеров с номерами лотереи
//        Реализуйте метод в классе Utils
//        Метод должен принимать два массива (lotteryNumber, userNumber)
//        Возвращать количество совпадений
//        Получите от пользователя 5 номеров, сохраните их в массив
//        Протестируйте работу лотереи в классе StartLottery
//        Выведите результаты на консоль


