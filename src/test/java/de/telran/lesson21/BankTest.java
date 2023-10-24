package de.telran.lesson21;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    @Test
    void isValidAccountNumberTestNotNullAccount() {
        String expAccount1 = null;
        String expAccount2 = "";

        Bank bankTest = new Bank();
        assertFalse(bankTest.isValidAccountNumber(expAccount1));
        assertFalse(bankTest.isValidAccountNumber(expAccount2));
    }

    @Test
    void isValidAccountNumberTestOnly14Symbols() {
        String expAccount13 = "1234567890123";
        String expAccount15 = "123456789012345";
        String expAccount14 = "12345678901234";

        Bank bankTest = new Bank();
        assertFalse(bankTest.isValidAccountNumber(expAccount13));
        assertFalse(bankTest.isValidAccountNumber(expAccount15));
        assertTrue(bankTest.isValidAccountNumber(expAccount14));
    }

    @Test
    void isValidAccountNumberTestAll0() {
        String expAccountZero = "00000000000000";
        Bank bankTest = new Bank();
        assertFalse(bankTest.isValidAccountNumber(expAccountZero));
    }
}

//    Проверка номера банковского счета
//    Создайте метод isValidAccountNumber(String accountNumber),который возвращает true в случае успешной проверки.
//     2)   БС может содержать только 14 цифр
//   3)     Все 14 цифр не могут быть нулями
//       1) Номер счета не может быть null или пустым.
//        Проверьте с помощью метода main()
//        Напишите тесты используя библиотеку JUnit