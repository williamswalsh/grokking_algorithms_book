package iterative_sum;

import org.junit.jupiter.api.Test;
import recursive_sum.RecursiveSummer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * @author William Walsh
 * @version 29 Jun 2024
 */
class RecursiveSummerTest {
    private static final RecursiveSummer summer = new RecursiveSummer();

    @Test
    void testSumWithEvenNumberOfNumbers() {
        int[] arrToSum = {2, 1, 3, 4};
        assertEquals(10, summer.sum(arrToSum));
    }

    @Test
    void testSumWithOddNumberOfNumbers() {
        int[] arrToSum = {2, 1, 3};
        assertEquals(6, summer.sum(arrToSum));
    }

    @Test
    void testSumWithZeroes() {
        int[] arrToSum = {0, 0, 0};
        assertEquals(0, summer.sum(arrToSum));
    }

    @Test
    void testSumWithZeroLengthArray() {
        int[] arrToSum = {};
        assertThrows(IllegalArgumentException.class, () -> summer.sum(arrToSum));
    }

    @Test
    void testSumWithNullArray() {
        int[] arrToSum = null;
        assertThrows(IllegalArgumentException.class, () -> summer.sum(arrToSum));
    }

    @Test
    void testSumWithLengthOfArrayOne() {
        int[] arrToSum = { 5 };
        assertEquals(5, summer.sum(arrToSum));
    }
}
