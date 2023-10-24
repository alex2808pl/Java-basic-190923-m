package de.telran.lesson21;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SimpleUnit {
    public static void main(String[] args) {
        Utils utils = new Utils();
        int[] myArr = utils.getNumbers();
        System.out.println(Arrays.toString(myArr));
        int max = utils.findMax(utils.getNumbers());
        System.out.println(max);
    }
}
