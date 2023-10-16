package de.telran.lesson14;

public class SimpleIncludeFor {
    public static void main(String[] args) {
        int m = 7, n = 4;
        for (int i = 1; i <= n; i++) { //количество недель
            for (int j = 1; j <= m; j++) { // количество дней недели
                System.out.print("#");
            }
            System.out.println();
        }


    }
}
