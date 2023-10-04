package de.telran.lesson7;

public class ConstructorSimple {
    public static void main(String[] args) {
        Auto auto1 = new Auto();
        auto1.model = "BMW";
        auto1.year = 2023;
        auto1.mileage = 100;
        auto1.run();
        auto1.turn();

        Auto auto2 = new Auto();
        auto2.model = "VW";
        auto2.year = 2022;
        auto2.mileage = 5;
        auto2.run();

    }
}
