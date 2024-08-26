package junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// It can execute each test method so don't affect other method
// It can automatically check result value of method execution.
class CalculatorTest {

    // Remove duplicate code
    Calculator calc = new Calculator();

    @Test
    void add() {
        assertEquals(3, calc.add(1, 2)); // expected value, actual value
    }

    @Test
    void subtract() {
        assertEquals(-1, calc.subtract(1, 2));
    }

    @Test
    void multiply() {
        assertEquals(4, calc.multiply(2, 2));
    }

    @Test
    void divide() {
        assertEquals(1, calc.divide(2, 2));
    }
}