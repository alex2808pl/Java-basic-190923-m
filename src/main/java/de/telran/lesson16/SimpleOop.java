package de.telran.lesson16;

import de.telran.lesson16.documentation.Auto;

public class SimpleOop {
    public static void main(String[] args) {
        Auto auto1 = new Auto();
        auto1.consumptionFuel = 10;
        auto1.volumeTank = 10;
        auto1.сapacity = 3000;
        auto1.weight = 1500;
        auto1.move();
        System.out.println("Сколько груза - "+auto1.getCountCargo());
        System.out.println("Сколько пассажиров - "+auto1.getMaxСountPassengers());

        Auto auto2 = new Auto(20,10,2000, 4000);
        auto2.move();
        System.out.println("Сколько груза - "+auto2.getCountCargo());
        System.out.println("Сколько пассажиров - "+auto2.getMaxСountPassengers());

        Auto auto3 = new Auto("белый", "Audi", 10, 15,5,150,1000,3000);
        auto3.move();
        System.out.println("Сколько груза - "+auto3.getCountCargo());
        System.out.println("Сколько пассажиров - "+auto3.getMaxСountPassengers());
        System.out.println("Я еду на "+auto3.model+" цвет "+auto3.color);

    }
}

