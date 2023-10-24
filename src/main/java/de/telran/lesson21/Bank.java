package de.telran.lesson21;

public class Bank {
    public boolean isValidAccountNumber(String accountNumber) {
        boolean result = true;
        if(accountNumber==null || accountNumber.isEmpty()) //1
            result = false;
        else if(accountNumber.length()!=14) //2
            result = false;
        else { //3
            result = false;
            for (int i=0; i<accountNumber.length(); i++) {
                if(accountNumber.charAt(i)!='0') {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }

}

//    Проверка номера банковского счета
//    Создайте метод isValidAccountNumber(String accountNumber),который возвращает true в случае успешной проверки.
//     2)   БС может содержать только 14 цифр
//   3)     Все 14 цифр не могут быть нулями
//       1) Номер счета не может быть null или пустым.
//        Проверьте с помощью метода main()
//        Напишите тесты используя библиотеку JUnit

