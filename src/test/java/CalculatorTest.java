import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("Add two numbers")
    void add() {
        assertEquals(4, Calculator.add(2, 2));
    }

    @Test
    @DisplayName("Multiply two numbers")
    void multiply() {
        assertAll(() -> assertEquals(4, Calculator.multiply(2, 2)),
                () -> assertEquals(-4, Calculator.multiply(2, -2)),
                () -> assertEquals(4, Calculator.multiply(-2, -2)),
                () -> assertEquals(0, Calculator.multiply(0, 5))
        );
    }

    @Test
    @DisplayName("Subtract two numbers")
    void subtraction() {
        assertAll(
                () -> assertEquals(-6, Calculator.subtraction(4, 10)),
                () -> assertEquals(10, Calculator.subtraction(10, 4))
        );
    }

    @Test
    @DisplayName("Division by numbers")
    void division() {
        assertAll(
                () -> assertEquals(5, Calculator.division(10, 2)),
                () -> assertEquals(0, Calculator.division(-1, 4)),
                () -> assertEquals(0, Calculator.division(-1, -4)),
                () -> assertEquals(0, Calculator.division(1, -4))
        );
    }
}