package de.telran.lesson16.documentation;

public class Auto {
    Engine engine;
    public String color; // цвет
    public String model;
    int mileAge;
    public int volumeTank; //объем бензобака
    public int consumptionFuel; //расход топлива на 100 км
    int maxSpeed;
    public int weight; // вес авто
    public int сapacity; //грузоподьемность

    public Auto() {
    }

    public Auto(int volumeTank, int consumptionFuel, int weight, int сapacity) {
        this.volumeTank = volumeTank;
        this.consumptionFuel = consumptionFuel;
        this.weight = weight;
        this.сapacity = сapacity;
    }

    public Auto(String color, String model, int mileAge, int volumeTank, int consumptionFuel, int maxSpeed, int weight, int сapacity) {
        this.color = color;
        this.model = model;
        this.mileAge = mileAge;
        this.volumeTank = volumeTank;
        this.consumptionFuel = consumptionFuel;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.сapacity = сapacity;
    }

    public void move() {
        System.out.println("Авто едет и проедет " + volumeTank / consumptionFuel * 100 + " км.");
        System.out.println("Если едите с мах скоростью " + maxSpeed + " то вы проедите " + getLengthMaxSpeed()+ " км.");
    }

    // метод для расчета веса груза, который может перевезти авто
    public int getCountCargo() {
        return сapacity - weight;
    }

    public int getMaxСountPassengers() {
        return getCountCargo() / 100; //100 макс вес пассажира
    }

    private double getLengthMaxSpeed() {
        return volumeTank / consumptionFuel * 100 * 0.8;
    }

    class Engine {
        String type;
        int power;
        void work() {
            System.out.println("Двигатель работает");
        }
        double getWarm() {
            return power * maxSpeed * 1.5;
        }
    }
}
