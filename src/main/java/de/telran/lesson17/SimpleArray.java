package de.telran.lesson17;

import de.telran.lesson7.Auto;

import java.util.Arrays;
import java.util.Random;

public class SimpleArray {
    public static void main(String[] args) {
        int a;
        int[] arr;

        a = 5;
        arr = new int[5];
        printArray(arr);

        arr[2] = 25;
        printArray(arr);

        System.out.println(arr[2]);

        printArrForEach(arr);

        int[] arr1 = {1, 25, 17, 3, 19, 8};
        printArray(arr1);

        System.out.println();
        Random rnd = new Random();
        int[] arr2 = new int[10];
        for (int i=0; i<arr2.length; i++) {
            arr2[i] = rnd.nextInt(10);
        }
        printArray(arr2);

        System.out.println(Arrays.toString(arr2)); // печатаем массив

        // Массивы объектов
        Auto auto = new Auto("Ваз",2005,10_000);
        System.out.println(auto.toString());

        Auto[] autos = new Auto[2];
        autos[0] = auto;
        autos[1] = new Auto("Audi", 2022, 5000);
        System.out.println(Arrays.toString(autos));

        Auto[] autosLiteral = { new Auto("BMW", 2010, 100_000),
                                new Auto("VW", 2015, 50_000),
                                new Auto("Pego", 2011, 33_000)};
        autosLiteral[1].year = 2018;
        System.out.println(Arrays.toString(autosLiteral));

        String[] arrStr = {"Мама", "мыла", "раму"};
        arrStr[1] = "чистила";
        System.out.println(Arrays.toString(arrStr));


    }

    private static void printArrForEach(int[] arr) {
        for(int elem : arr) {
            System.out.println(elem);
        }
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
                System.out.println("arr[" + i + "]=" + arr[i]);
         }
    }
}
