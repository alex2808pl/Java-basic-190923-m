package de.telran.lesson11;

public class SimpleIfNested {
    public static void main(String[] args) {
        System.out.println("Программа начала выполняется");
        int myInt = 11;
        if(myInt < 20) {
            System.out.println("myInt меньше 20");
            if(myInt < 15) {
                System.out.println("myInt меньше 15");
                if(myInt < 12) {
                    System.out.println("myInt меньше 12");
                    verifyMore(myInt);
                }
                else {
                    System.out.println("myInt больше 12");
                }
            }
         }
        System.out.println("Программа выполняется дальше");
        //но так лучше не делать, хотя работает ;)
        if(myInt < 20) if(myInt > 15) System.out.println("myInt в интервале от 16...19");

        System.out.println("Программа выполняется еще дальше");
        if(myInt > 15 && myInt < 20) {
            System.out.println("myInt ТОЖЕ в интервале от 16...19");
        }

    }

    private static void verifyMore(int myInt) {
        if(myInt > 0) {
            System.out.println("myInt меньше 12 и больше 0");
            if(myInt > 5) {
                System.out.println("myInt меньше 12 и больше 5");
                if(myInt > 10) {
                    System.out.println("myInt меньше 12 и больше 10");
                }
            }
        }
    }
}

/*    Создайте и инициализируйте переменную int = 10
        В блоке if сравните созданную переменную со значением 10 (==)
        Внутри блока добавьте блок if и сравните переменную со значением 15 ,
            внутри блока добавить инструкцию System.out.println("i is smaller than 15");
        Добавите еще один блок if-else и сравните переменную со значением 12
        В блоке if добавить инструкцию System.out.println("i is smaller than 12 too")
        В  блоке else добавьте инструкцию System.out.println("i is greater than 12");
        Проанализируйте вывод*/
