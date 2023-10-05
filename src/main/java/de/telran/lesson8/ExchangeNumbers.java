package de.telran.lesson8;

public class ExchangeNumbers {
    public static void main(String[] args) {
        int a = 2, b = 5;
        System.out.println(" a = "+a+" ,b = "+b);

        int temp = b;
        b = a;
        a = temp;
        System.out.println(" a = "+a+" ,b = "+b);

        //арифметически
        b = a + b;
        a = b - a;
        b = b - a;
        System.out.println(" a = "+a+" ,b = "+b);

    }
}

  /*  Напишите программу на Java для того, чтобы поменять местами значения,
      хранящиеся в двух переменных с помощью третьей переменной:
        На вход: а = 2; b = 5;
        На выход: a = 5; b = 2;
        Используйте переменную temp*/;

