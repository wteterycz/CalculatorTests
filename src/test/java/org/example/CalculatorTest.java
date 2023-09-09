package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void sum() {
        // Given
        Calculator calculator = new Calculator();
        // When
        int result = calculator.sum(2, 2);
        // Then
        assertEquals(result,4);
    }

    @Test
    void minus() {
        Calculator calculator = new Calculator();
        int result = calculator.minus(4,2);
        assertEquals(result,2);
    }

    @Test
    void divide() {
        Calculator calculator = new Calculator();
        int result = calculator.divide(4,2);
        assertEquals(result,2);

    }

    @Test
    void multiply() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(3, 3);
        assertEquals(result,9);
    }
}