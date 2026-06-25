package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        System.out.println("Setting up test...");
        calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
        System.out.println("Cleaning up after test...");
        calculator = null;
    }

    @Test
    void testAdd() {

        // Arrange
        int a = 2;
        int b = 3;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(5, result);
    }

    @Test
    void testIsEvenTrue() {

        // Arrange
        int number = 4;

        // Act
        boolean result = calculator.isEven(number);

        // Assert
        assertTrue(result);
    }

    @Test
    void testIsEvenFalse() {

        // Arrange
        int number = 5;

        // Act
        boolean result = calculator.isEven(number);

        // Assert
        assertFalse(result);
    }

    @Test
    void testWelcomeMessageNotNull() {

        // Arrange
        // No special setup needed

        // Act
        String message = calculator.getWelcomeMessage();

        // Assert
        assertNotNull(message);
    }

    @Test
    void testErrorMessageNull() {

        // Arrange
        // No special setup needed

        // Act
        String message = calculator.getErrorMessage();

        // Assert
        assertNull(message);
    }
}