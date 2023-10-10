package de.telran.lesson11;

public class SimpleIfElseIf {
    public static void main(String[] args) {
        System.out.println("Программа начала выполняется");
        int myInt = 18;

        if(myInt == 10) {
            System.out.println("myInt равно 10");
        } else if (myInt == 15) {
            System.out.println("myInt равно 15");
        } else if (myInt == 20) {
            System.out.println("myInt равно 20");
        } else {
            System.out.println("myInt присвоено другое значение");
        }

        System.out.println("Программа выполняется дальше");

        if(myInt >= 0 && myInt < 10) {
            System.out.println("myInt в интервале 0..10");
        } else if (myInt >= 10 && myInt < 15) {
            System.out.println("myInt в интервале 10..15");
        } else if (myInt >= 15 && myInt < 20) {
            System.out.println("myInt в интервале 15..20");
        } else {
            System.out.println("myInt присвоено другое значение");
        }
        System.out.println("Программа ЕЩЕ выполняется дальше");
    }
}

//    Создайте и инициализируйте переменную int = 20
//        В блоке if сравните созданную переменную со значением 10 (==)
//        В блоке if добавить инструкцию System.out.println("i is 10")
//        Добавьте блок else if и сравните переменную со значением 15 (==) , внутри блока добавить инструкцию System.out.println("i is 15");
//        Добавите еще один блок else if и сравните переменную со значением 20 (==)
//        Добавьте блок else добавьте инструкцию System.out.println("i is not present");
//        Проанализируйте вывод
