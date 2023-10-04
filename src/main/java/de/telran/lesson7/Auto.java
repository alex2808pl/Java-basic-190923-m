package de.telran.lesson7;

public class Auto {

    String model;
    int year;
    int mileage;
    String color;

    void run() {
        System.out.println(model+" год выпуска "+year+" с пробегом "+mileage+" ЕДЕТ!");
    }

    void turn() {
        System.out.println(model+" год выпуска "+year+" с пробегом "+mileage+" ПОВЕРНУЛ!");
    }
}
