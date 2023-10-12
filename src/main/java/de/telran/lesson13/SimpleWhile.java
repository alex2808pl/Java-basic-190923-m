package de.telran.lesson13;

public class SimpleWhile {
    public static void main(String[] args) {
        int count = 10;
        while (count > 0) { //истина
            System.out.println("Привет программист "+count);
            count--;

        }
        System.out.println("Программа работает дальше");

        count = 1;
        // Вечный цикл
        while(true) {
            System.out.println("Вечный привет программисту! "+count);
            count++;
            if(count > 10) {
                break;
            }
        }

        System.out.println("Программа работает дальше");
        // Еще одна логика реализации
        count = 0;
        while(true) {
            System.out.println("Вечный привет программисту! "+(++count));
            if(count >= 10) {
                break;
            }
        }
    }
}
