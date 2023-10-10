package de.telran.lesson11;

public class SimpleReturn {
    public static void main(String[] args) {
        int arg1 = 10, arg2 = 0;
        System.out.println("arg1 = " + arg1 + "  arg2 = " + arg2);
        if(arg2 == 0) {
            System.out.println("На 0 делить нельзя");
            return;
        }

        div(arg1, arg2);

        int res = divReturn(arg1, arg2);
        if (res==Integer.MIN_VALUE) {
            System.out.println("divReturn : На 0 делить нельзя");
        } else {
            System.out.println("Main res = " + res);
        }

//        System.out.println("Expression = "+divReturn(arg1, arg2)*10);
    }

    static void div(int par1, int par2) {
        if(par2 == 0) {
            System.out.println("На 0 делить нельзя");
            return;
        }
        int result = par1 / par2;
        System.out.println("result = "+result);
    }

    static int divReturn(int par1, int par2) {
        if(par2 == 0) {
            return Integer.MIN_VALUE;
        }
        int result = par1 / par2;
        return result;
    }
}
