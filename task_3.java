package ru.yandex.praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class PalindromeServiceTest {

    private final String checkedText;
    private final boolean expected; // добавь два поля класса: для проверяемой строки и ожидаемого результата

    public PalindromeServiceTest(String checkedText, boolean expected) {  // напиши конструктор с двумя параметрами
        this.checkedText = checkedText;
        this.expected = expected;
    }


    @Parameterized.Parameters // напиши метод для получения тестовых данных
    public static Object[][] getTestData() {
        return new Object[][]{
                {"anna", true},
                {"anka", false},
                {"q", true}
        };
    }
    // напиши тест

    @Test
    public void shouldCheckPalindrome() {

        PalindromeService palindromeService = new PalindromeService();
        boolean actual = palindromeService.isPalindrome(checkedText);
        assertEquals(expected, actual);
        
    }

}
