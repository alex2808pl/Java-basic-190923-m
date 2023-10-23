package de.telran.lesson7;

import java.util.Collections;
import java.util.Comparator;

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

        Auto auto3 = new Auto("Audi");
        auto3.run();

        Auto auto4 = new Auto("Porsche", 2020);
        auto4.mileage = 3;
        auto4.run();

        Auto auto5 = new Auto("Lada", 2023, 5);
        auto5.run();

        Auto auto6 = new Auto();
        auto6.run();



    }
}
