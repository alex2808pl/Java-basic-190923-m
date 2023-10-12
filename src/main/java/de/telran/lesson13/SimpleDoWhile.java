package de.telran.lesson13;

import java.util.Scanner;

public class SimpleDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = getChoiceWhile(scanner);// getChoiceDoWhile(scanner);
        System.out.println("Вы выбрали пункт меню: " + choice);

        if (choice >= 1 && choice <= 4) {
            System.out.print("Вы входите в игру...");
        } else {
            System.out.println("Выходим из игры.");
        }
    }

    private static int getChoiceDoWhile(Scanner scanner) {
        int choice;
        do {
            System.out.println("За кого вы будете играть:");
            System.out.println("1. Орк ");
            System.out.println("2. Человек ");
            System.out.println("3. Эльф ");
            System.out.println("4. Гном ");
            System.out.println("0. Выход ");
            System.out.print("Ваш выбор: ");
            choice = scanner.nextInt();
        } while (!(choice >= 0 && choice <= 4));   //(choice<0 || choice>4)
        return choice;
    }

    private static int getChoiceWhile(Scanner scanner) {
        int choice;
        System.out.println("За кого вы будете играть:");
        System.out.println("1. Орк ");
        System.out.println("2. Человек ");
        System.out.println("3. Эльф ");
        System.out.println("4. Гном ");
        System.out.println("0. Выход ");
        System.out.print("Ваш выбор: ");
        choice = scanner.nextInt();

        while (!(choice >= 0 && choice <= 4)) {    //(choice<0 || choice>4)
            System.out.println("За кого вы будете играть:");
            System.out.println("1. Орк ");
            System.out.println("2. Человек ");
            System.out.println("3. Эльф ");
            System.out.println("4. Гном ");
            System.out.println("0. Выход ");
            System.out.print("Ваш выбор: ");
            choice = scanner.nextInt();
        }
        return choice;
    }
}
