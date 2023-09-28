package de.telran.lesson4;

public class TestObject {
    public static void main(String[] args) {
        Human hm1 = new Human();
        System.out.println(hm1);

        hm1.weight = 3;
        hm1.age = 1;
        hm1.name = "Вася";


        System.out.println(hm1);

        Human hmCopy = hm1;
        System.out.println(hmCopy);

        hm1.age = 20;
        hm1.weight = 70;

        hmCopy.isHealthy = true;

        System.out.println("Original = "+hm1);
        System.out.println("Copy = "+hmCopy);

        Human hm2 = new Human();
        System.out.println("hm2 = "+hm2);

        String str;

    }
}
