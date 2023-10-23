package de.telran.lesson19;

public class Task1 {
    public static void main(String[] args) {
        String st1 = "ABBA";
        String st2 = " привет с 70-х";
        System.out.println(concatReversStr(st1, st2));

        char[] arr = {'I', ' ', 'l', 'i', 'k', '?', ' ', 'J', 'a', 'v', 'a'};
        String str = new String(arr);
        str = str.replace("?","e");
        System.out.println(str);
    }

    static String concatReversStr(String str1, String str2) {
        StringBuilder sb = new StringBuilder(str1);
        sb.append(str2);
        sb.reverse();
        return sb.toString();
    }

}

//    Напишите метод, который принимает две строки в аргументах,
//    соединяет их и определяет реверсивный порядок, выведите результат на консоль.
//        concatReversStr(String str1, String str2)
//
//        Дан массив символов, объедините его и замените символ '?' на правильный символ,
//        выведите результат на консоль.
//        char[] arr = {'I', ' ', 'l', 'i', 'k', '?', ' ', 'J', 'a', 'v', 'a'};
