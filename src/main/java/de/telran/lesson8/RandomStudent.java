package de.telran.lesson8;

import java.util.Random;
import java.util.Scanner;

public class RandomStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Какое количество студентов присутствует: ");
        int countStudents = scanner.nextInt();

        System.out.println("Будет отвечать студент с номером "+generateNumberStudent(countStudents));

    }
     static int generateNumberStudent(int countStudents) {
         int generateNumber = generateIntRandomInterval(2, countStudents);
         return generateNumber;
     }

    static int generateIntRandomInterval(int min, int max) {
        Random random = new Random();
        int result = random.nextInt(max - min) + min;
        return result;
    }
}
