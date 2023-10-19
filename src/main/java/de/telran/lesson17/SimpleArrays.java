package de.telran.lesson17;

import java.util.Arrays;

public class SimpleArrays {
    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 2, 4, 9, 34};
        System.out.println(Arrays.toString(arr));

        //copyOf
        int[] arrCopy = Arrays.copyOf(arr,5);
        System.out.println(Arrays.toString(arrCopy));

        arrCopy = Arrays.copyOf(arr,10);
        System.out.println(Arrays.toString(arrCopy));

        //copyOfRange
        int[] arrCopyRange = Arrays.copyOfRange(arr, 3,7);
        System.out.println(Arrays.toString(arrCopyRange));

        //sort
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
