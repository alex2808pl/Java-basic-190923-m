package de.telran.lesson22.task3;

import java.util.Scanner;

import static de.telran.lesson22.task3.Constants.COUNT_SET_SIZE;

public class Utils {
    public static int[] getUserLotteryNumber(){
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[COUNT_SET_SIZE];
        System.out.println("Введите Ваши номера: ");
        for (int i = 0; i<COUNT_SET_SIZE; i++) {
            System.out.print("Введите номер "+(i+1)+": ");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static int compareWinnerNumbers(int[] lotteryNumbers, int[] userNumbers) {
        int count = 0;
        for (int userNumber : userNumbers) {
            for(int lotteryNumber : lotteryNumbers) {
                if(userNumber == lotteryNumber) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
