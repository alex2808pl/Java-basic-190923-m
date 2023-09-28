package de.telran.lesson4;

public class Human {
    String name;
    int age;
    int weight;
    boolean isHealthy;

    void run() {
        int speed = 10;
        System.out.println(name + "с весом "+weight+" возраст "+age+" идет со скоростью "+speed);
    }

    void sing() {
        System.out.println(name + "с весом "+weight+" возраст "+age+" ПОЕТ!");
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", isHealthy=" + isHealthy +
                '}';
    }
}
