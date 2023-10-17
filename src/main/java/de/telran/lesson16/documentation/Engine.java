package de.telran.lesson16.documentation;

public class Engine {
           String type;
        int power;
        void work() {
            System.out.println("Двигатель работает");
        }
        double getWarm() {
            return power  * 1.5;
        }

}
