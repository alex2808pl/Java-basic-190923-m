package de.telran.lesson4;

public class StringSimple {
    public static void main(String[] args) {
        String str1 = "Мама мыла раму";

        String strCopy = str1; //клонирование

        System.out.println(str1);
        System.out.println(strCopy);

        str1 = str1 + " мылом. \n";

        System.out.println(str1);
        System.out.println(strCopy);

        System.out.println("Длина str1 = "+str1.length());

        char symbol = str1.charAt(0);
        System.out.println("Первый символ str1 = "+ symbol);
        symbol = str1.charAt(str1.length()-1);
        System.out.println("Последний символ str1 = "+ symbol);

        String subStr = str1.substring(15);
        System.out.println("Подстрока str1 = "+ subStr);

        subStr = str1.substring(15, 19); //мыло
        System.out.println("Подстрока str1 = "+ subStr);

        System.out.println("str1 содежит ли подстроку мыла = "+ str1.contains("мыла"));


        System.out.println(subStr.toUpperCase());
        System.out.println(str1.toLowerCase());

        String strTemp = strCopy.replace('м', 'н');
        System.out.println(strTemp.replace('М', 'Н'));

    }


}
