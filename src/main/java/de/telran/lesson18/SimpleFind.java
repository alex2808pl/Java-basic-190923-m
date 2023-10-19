package de.telran.lesson18;

import java.util.Arrays;

public class SimpleFind {
    public static void main(String[] args) {
        int[] arrInt = {23, 10, 2, 7, 13, 8, 1, 66, 5, 9};
        System.out.println(Arrays.toString(arrInt));

        int keyFind = 8;
        int indexFind = ArrayUtils.searchLine(arrInt, keyFind);
        System.out.println("Key = "+keyFind+" index = "+indexFind);

        // второй формат передачи данных в поиск
        System.out.println("Key = "+77+" index = "+ArrayUtils.searchLine(arrInt,77));

        keyFind = 13;
        indexFind = ArrayUtils.searchLineBackward(arrInt, keyFind);
        System.out.println("Key = "+keyFind+" index = "+indexFind);


    }

//    static int searchLine(int[] arr, int key) {
//        int index = -1;
//        for (int i=0; i<arr.length; i++) {
//            if(key == arr[i]) {
//                index = i;
//                break;
//            }
//        }
//        return index;
//    }
//
//    static int searchLineBackward(int[] arr, int key) {
//        int index = -1;
//        for (int i = arr.length-1; i>=0; i--) {
//            if(key == arr[i]) {
//                index = i;
//                break;
//            }
//        }
//        return index;
//    }
}
