import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator cl = new Calculator();

    @Test public void add() {
        assertEquals(4, cl.add(2, 2));
    }

    @Test public void subtract() {
        assertEquals(2, cl.subtract(4, 2));
    }

    @Test public void multiply() {
        assertEquals(8, cl.multiply(4, 2));
    }

    @Test public void divide() {
        assertEquals(2, cl.divide(4, 2));
    }

    @Test public void square() {
        assertEquals(4, cl.square(2));
    }

    @Test public void cube() {
        assertEquals(8, cl.cube(2));
    }

    @Test public void power() {
        assertEquals(16, cl.power(2, 4));
    }
}