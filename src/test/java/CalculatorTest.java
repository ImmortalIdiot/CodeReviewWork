import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void add() {
        int result = calculator.add(5,3);
        assertEquals(8, result);
    }

    @Test
    void dif() {
        int result = calculator.dif(10,8);
        assertEquals(2, result);
    }

    @Test
    void div() {
        int result = calculator.div(2,2);
        assertEquals(1, result);
    }

    @Test
    void times() {
        int result = calculator.times(5,2);
        assertEquals(10, result);
    }

    @Test
    void solver() {
        int result = calculator.solver(5, 2, 3, 2);
        assertEquals(1, result);
    }
}