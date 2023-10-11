package de.telran.lesson12;

public class TernaryOperation {
    public static void main(String[] args) {
        int myInt = 11;
        String printStr;

        if(myInt > 10) {
            printStr = "myInt больше 10";
            if(myInt < 20) {
                printStr = "myInt больше 10 и меньше 20";
            }
        }
        else {
            printStr = "myInt меньше либо равно 10";
        }
        System.out.println(printStr);

        // тернарный оператор
        printStr = (myInt > 10) ? "myInt больше 10" : "myInt меньше либо равно 10";

        // вложенный тернарный оператор (работать будет, но не читаемо)
        printStr = (myInt > 10) ?
                ((myInt < 20) ?  "myInt больше 10 и меньше 20" : "myInt больше 10")
                : "myInt меньше либо равно 10";

        System.out.println(printStr);
    }
}
