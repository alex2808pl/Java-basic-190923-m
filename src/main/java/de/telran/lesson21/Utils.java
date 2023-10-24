package de.telran.lesson21;

public class Utils {
    public int[] getNumbers() {
        int[] arr = {1,2,3};
        return arr;
    }

    public int findMax(int[] arr) {
        if(arr == null || arr.length == 0)
            return 0; //Integer.MIN_VALUE;

        int max = Integer.MIN_VALUE;
        for (int element : arr) {
            if(max < element) {
                max = element;
            }
        }
        return max;
    }
}
/*
    Создайте метод getNumbers();
    Метод должен возвращать массив из трех целочисленных значений: [1, 2, 3]
        Вызовите метод в main()
        Убедитесь, что метод работает верно*/


