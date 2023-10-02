package de.telran.lesson6;

import java.util.Random;
import java.util.Scanner;

public class RandomSimple {
    public static void main(String[] args) {
        int myInt;
        myInt = 15;
        System.out.println("myInt = "+myInt);

        Scanner scanner = new Scanner(System.in);
        myInt = scanner.nextInt();
        System.out.println("Scanner myInt = "+myInt);

        Random random = new Random();
        myInt = random.nextInt();
        System.out.println("Random myInt = "+myInt);

        myInt = random.nextInt(100);   // 0...100
        System.out.println("Random myInt = "+myInt);

        myInt = random.nextInt(90) + 10;  //10...100
        System.out.println("Random myInt = "+myInt);

        myInt = generateIntRandomInterval(10, 20);
        System.out.println("Random myInt = "+myInt);

        //Другой вариант
        myInt = (int) (Math.random()*(100-10)+10);  //0.933546   10...100
        // (Math.random()*(max-min)+min);

    }

    static int generateIntRandomInterval(int min, int max) {
        Random random = new Random();
        int result = random.nextInt(max - min) + min;
        return result;
    }

}
