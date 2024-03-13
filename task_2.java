package ru.yandex.praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CalculatorTest2 {

    private final int firstNumber;
    private final int secondNumber;
    private final int expected;

    public CalculatorTest2(int firstNumber, int secondNumber, int expected) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.expected = expected;
    }

    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] getMultiplicationData() {
        return new Object[][]{
                {2, 1, 2},
                {2, 2, 4},
                {1, 0, 0},
                {0, 0, 0},
                {-1, 0, 0},
                {-1, 2, -2},
        };
    }

    @Test
    public void shouldBeMultiplication() {
        Calculator calculator = new Calculator();
        int actual = calculator.mult(firstNumber, secondNumber);
        assertEquals(expected, actual);
    }
}
