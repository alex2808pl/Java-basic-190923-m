package de.telran.lesson9;

import java.util.Random;

public class LogicalOperations {
    public static void main(String[] args) {
        Random random = new Random();
        int myInt = random.nextInt(100)-30;

        if(myInt<0 || myInt>80) {
            System.out.println("Не корректная температура в помещении!!!");
            System.exit(0);
        }

        System.out.println("Температура воздуха = "+myInt);
        if(myInt < 15) {
            System.out.println("На улице холодно");
        }
        if(myInt > 30) {
            System.out.println("На улице жарко");
        }
        if (myInt >= 15 && myInt <= 25) {
            System.out.println("На улице тепло");
        }
        if (myInt > 25 && myInt <= 30) {
            System.out.println("На улице очень тепло");
        }

        if(myInt>37) {
            System.out.println("Болен");
        }
        if (!(myInt>37)) {
            System.out.println("Здоров");
        }

    }
}
