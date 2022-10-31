package recursive_sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author William Walsh
 * @version 31 Oct 2022
 */
class RecursiveSummerTest {

    @Test
    void testSumWithEvenNumberOfNumbers() {
        int[] arrToSum = {2, 1, 3, 4};
        assertEquals(10, new RecursiveSummer().sum(arrToSum));
    }

    @Test
    void testSumWithOddNumberOfNumbers() {
        int[] arrToSum = {2, 1, 3};
        assertEquals(6, new RecursiveSummer().sum(arrToSum));
    }

    @Test
    void testSumWithZeroes() {
        int[] arrToSum = {0, 0, 0};
        assertEquals(0, new RecursiveSummer().sum(arrToSum));
    }

    @Test
    void testSumWithZeroLengthArray() {
        int[] arrToSum = {};
        assertEquals(0, new RecursiveSummer().sum(arrToSum));
    }

    @Test
    void testSumWithLengthOfArrayOne() {
        int[] arrToSum = { 5 };
        assertEquals(5, new RecursiveSummer().sum(arrToSum));
    }
}
