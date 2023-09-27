package de.telran.lesson3;

public class ValueView {
    static int classInt;
    static String classStr;
    static Integer classIntObj;
    public static void main(String[] args) {
        int myInt = 12;
        System.out.println(myInt);
        int myInt2;
        myInt2 = 0;
        System.out.println(myInt2);

        String myStr = "Мама"; // "", null
        System.out.println(myStr);
        System.out.println("classStr = " + classStr);
        System.out.println("classIntObj = " + classIntObj);
        classIntObj = 255;
        System.out.println("classIntObj = " + classIntObj);

        System.out.println(classInt);
        classInt = 22;
        printValue();

        classInt = 66;
        System.out.println(classInt);
    }

    static void printValue() {
        int myInt = 18;
        System.out.println(classInt);
    }
}
