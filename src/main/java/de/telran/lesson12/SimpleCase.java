package de.telran.lesson12;

public class SimpleCase {
    public static void main(String[] args) {
        int myInt = 15;

        if(myInt == 10) {
            System.out.println("myInt равно 10");
        } else if (myInt == 15) {
            System.out.println("myInt равно 15");
        } else if (myInt == 20) {
            System.out.println("myInt равно 20");
        } else {
            System.out.println("myInt присвоено другое значение");
        }

        switch (myInt) {
            case 10:
                System.out.println("myInt равно 10");
                break;
            case 15:
                System.out.println("myInt равно 15");
                break;
            case 20:
                System.out.println("myInt равно 20");
                break;
            default:
                System.out.println("myInt присвоено другое значение");
        }

        String myStr = "Пн";
        int temperature = -20;
        int numberDayOfWeek;
        switch (myStr) {
            case "Пн":
                numberDayOfWeek = 1;
                switch (temperature) {
                    case -20:
                        System.out.println("Ребенок в школу не идет "+temperature);
                        break;
                    case 0:
                        System.out.println("Осторожно, может быть гололед");
                        break;
                    default:
                        System.out.println("Не зависим от температуры");
                }
                break;
            case "Вт":
                numberDayOfWeek = 2;
                break;
            case "Ср":
                numberDayOfWeek = 3;
                break;
            case "Чт":
                numberDayOfWeek = 4;
                break;
            case "Пт":
                numberDayOfWeek = 5;
                break;
            case "Сб":
                numberDayOfWeek = 6;
                if(temperature > 15) {
                    System.out.println("Мы поедем на дачу");
                }
                break;
            case "Вс":
                numberDayOfWeek = 7;
                break;
            default:
                numberDayOfWeek = Integer.MAX_VALUE;
        }
        System.out.println(myStr+" это "+numberDayOfWeek+" день недели");
    }
}
