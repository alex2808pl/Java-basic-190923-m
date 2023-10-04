package de.telran.lesson7;

public class Auto {
    String model;
    int year;
    int mileage;
    String color;

    Auto() {
        model = null;
        year = 0;
        mileage = 0;
    }

    Auto(String argModel) {
        model = argModel;
    }

    Auto(String argModel, int argYear) {
        model = argModel;
        year = argYear;
    }

    Auto(String model, int year, int mileage) {
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    void run() {
        System.out.println(model+" год выпуска "+year+" с пробегом "+mileage+" ЕДЕТ!");
    }

    void turn() {
        System.out.println(model+" год выпуска "+year+" с пробегом "+mileage+" ПОВЕРНУЛ!");
    }
}
