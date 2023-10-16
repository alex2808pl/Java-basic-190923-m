package de.telran.lesson14;

public class Task2 {
    public static void main(String[] args) {
        String myStr  = "I don’t like rain !";
        printSymbolString(myStr);
        printSymbolStringContinue(myStr);

    }
    private static void printSymbolStringContinue(String myStr) {
        int length = myStr.length();
        String resultStr = "";
        for(int i = 0; i < length; i++) {
            char myChar = myStr.charAt(i);
            if(myChar=='!' || myChar==' ' || myChar=='’' || myChar=='\'') {
                continue;
            }
            resultStr += myChar+","; // resultStr = resultStr + (myChar+",");

        }
        resultStr = resultStr.substring(0, resultStr.length()-1);
        System.out.println(resultStr);
    }
    private static void printSymbolString(String myStr) {
        int length = myStr.length();
        String resultStr = "";
        for(int i = 0; i < length; i++) {
            char myChar = myStr.charAt(i);
            if(myChar!='!' && myChar!=' ' && myChar!='’' && myChar!='\'') {
                resultStr += myChar+","; // resultStr = resultStr + (myChar+",");
            }
        }
        resultStr = resultStr.substring(0, resultStr.length()-1);
        System.out.println(resultStr);
    }
}

//    Получите от пользователя Строку.
//        Напечатайте все буквы из строки, игнорируйте знаки препинания ?, !, ., ,’ и пробел
//        Для решения используйте цикл и charAt() метод
//        Например:
//        Вход = “I don’t like rain !”
//        выход = I,d,o,n,t,l,i,k,e,r,a,i,n

