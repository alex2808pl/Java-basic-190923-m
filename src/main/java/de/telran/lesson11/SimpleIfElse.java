package de.telran.lesson11;

public class SimpleIfElse {
    public static void main(String[] args) {
        System.out.println("Программа начала выполняется");
        int myInt = 16;
        if(myInt >= 15) {
            System.out.println("myInt больше или равно 15");
        }
        else {
            System.out.println("myInt меньше 15");
        }
        System.out.println("Программа выполняется дальше");
    }
}

/*
    Создайте и инициализируйте переменную int = 10
        В блоке if сравните созданную переменную со значением 15
        Внутри блока добавьте инструкцию System.out.println("i is smaller than 15");
        В  блоке else добавьте инструкцию System.out.println("i is greater than 15");
        Проанализируйте вывод
*/
