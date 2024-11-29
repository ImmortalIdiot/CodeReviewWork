import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(-1, calculator.add(-2, 1));
        assertEquals(0, calculator.add(0, 0));
    }

    @Test
    void dif() {
        assertEquals(1, calculator.dif(3, 2));
        assertEquals(-3, calculator.dif(-1, 2));
        assertEquals(0, calculator.dif(5, 5));
    }

    @Test
    void div() {
        assertEquals(2, calculator.div(6, 3));
        assertEquals(0, calculator.div(0, 5));
        assertThrows(IllegalArgumentException.class,
                () -> calculator.div(5, 0), "You can't divide by 0");
    }

    @Test
    void times() {
        assertEquals(6, calculator.times(2, 3));
        assertEquals(-6, calculator.times(-2, 3));
        assertEquals(0, calculator.times(0, 5));
    }

    @Test
    void solver() {
        assertEquals(18, calculator.solver(4, 5, 8, 2));
        assertEquals(11, calculator.solver(3, 4, 4, 2));
        assertThrows(IllegalArgumentException.class,
                () -> calculator.solver(3, 4, 4, 0), "You can't divide by 0");
    }
}