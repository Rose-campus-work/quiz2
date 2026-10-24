package com.example;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.Test;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void testSum() {
        int expected = 3;
        int actual = calculator.sum(1, 2);
        assertEquals(expected, actual);

    }

    @Test
    public void testSubtract() {
        int expected = -1;
        int actual = calculator.subtract(1, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void testMultiply() {
        int expected = 27;
        int actual = calculator.multiply(3, 9);
        assertEquals(expected, actual);
    }

    @Test
    public void testDivide() {
        int expected = 3;
        int actual = calculator.divide(15, 5);
        assertEquals(expected, actual);
    }

    @Test 
    public void testIsEven() {
        boolean actual = calculator.isEven(4);
        assertTrue(actual);
    }

    @Test 
    public void testIsOdd() {
        boolean actual = calculator.isEven(3);
        assertTrue(!actual);
    }

    @Test 
    public void testIncrementArrays() {
        int[] expected = new int[]{2, 3, 4};
        int[] actual = calculator.incrementArrays(new int[]{1, 2, 3});
        assertArrayEquals(expected, actual);
    }

    @Test 
    public void testDivideByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(1, 0);
        });
    }
}
