package de.telran.lesson2;

public class Operations {
    public static void main(String[] args) {
        int arg1 = 27, arg2 = 4;

        int sum = arg1 + arg2;
        int dif = arg1 - arg2;
        int mult = arg1 * arg2;
        int div = arg1 / arg2;
        int ost = arg1 % arg2;

        System.out.println("arg1 + arg2 = "+sum);
        System.out.println("arg1 - arg2 = "+dif);
        System.out.println("arg1 * arg2 = "+mult);
        System.out.println("arg1 / arg2 = "+div);

//        System.out.println("arg1 / 0 = "+ (arg1 / 0)); // делить на 0 нельзя


        float argF1 = 27, argF2 = 4;
        float divF = argF1 / argF2;
        float ostF = argF1 % argF2;
        System.out.println("argF1 / argF2 = "+divF);
        System.out.println("argF1 % argF2 = "+ostF);

        System.out.println("argF1 / 0 = "+ (argF1 / 0));

        String str1 = "Мама", str2 = " мыла";
        String sumStr = str1 + str2;
        System.out.println("str1 + str2 = "+sumStr);

        // Будьте осторожны при арифметических операциях с char
        char c1 = 'K', c2 = 'M';
        int sumChar = c1 + c2;
        System.out.println(Character.getNumericValue(c1) + " + "+ Character.getNumericValue(c2));

    }
}
