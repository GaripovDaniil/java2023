package src;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathOneTest {

    @Test
    void factThatFactorialOfNegativeIsException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> MathOne.fact(-2));
    }

    @Test
    void factThatFactorialOfNullIsOne() {
        assertEquals(1, MathOne.fact(0));
    }

    @Test
    void factThatFactorialOfOneIsOne() {
        assertEquals(1, MathOne.fact(1));
    }

    @Test
    void factThatFactorialOfPositiveIsTrue() {
        assertEquals(24, MathOne.fact(4));
    }

    @Test
    void factThatFactorialOfBigPositiveIsTrue() {
        assertEquals(479_001_600, MathOne.fact(12));
    }

    @Test
    void factThatSignOfNullIsNull() {
        assertEquals(0, MathOne.sign(0));
    }

    @Test
    void factThatSignOfNegativeIsNegative() {
        assertEquals(-1, MathOne.sign(-123));
    }

    @Test
    void factThatSignOfPositiveIsPositive() {
        assertEquals(1, MathOne.sign(123));
    }
}