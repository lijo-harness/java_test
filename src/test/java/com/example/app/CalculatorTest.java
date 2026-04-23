package com.example.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    void testMultiply() {
        assertEquals(10, calc.multiply(2, 5));
    }

    @Test
    void testDivide() {
        assertEquals(2, calc.divide(10, 5));
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calc.divide(10, 0));
    }
}
