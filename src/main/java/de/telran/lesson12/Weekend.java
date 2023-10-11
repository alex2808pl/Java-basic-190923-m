package de.telran.lesson12;

public class Weekend {
    public static void main(String[] args) {
        int day = 6;

        if(day >= 1 && day <=5) {
            System.out.println("Рабочий день");
        }
        else if (day == 6 || day == 7){
            System.out.println("Выходной день");
        }
        else {
            System.out.println("Не корректный день недели");
        }

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Рабочий день");
                break;
            case 6:
            case 7:
                System.out.println("Выходной день");
                break;
            default:
                System.out.println("Не корректный день недели");
        }

//        // только с jdk 14+
//        switch (day) {
//            case 1,2,3,4,5:
//                System.out.println("Рабочий день");
//                break;
//            case 6,7:
//                System.out.println("Выходной день");
//                break;
//            default:
//                System.out.println("Не корректный день недели");
//        }
    }
}
