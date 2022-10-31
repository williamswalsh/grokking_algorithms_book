package recursive_max;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author William Walsh
 * @version 31 Oct 2022
 */
class MaxFinderTest {
    private static final MaxFinder finder = new MaxFinder();

    @Test
    void testMaxWithEvenNumberOfNumbers() {
        int[] arr = {2, 1, 3, 4};
        assertEquals(4, finder.max(arr));
    }

    @Test
    void testMaxWithOddNumberOfNumbers() {
        int[] arr = {7, 2, 1, 3, 4};
        assertEquals(7, finder.max(arr));
    }

    @Test
    void testMaxWithZeroes() {
        int[] arr = {0, 0, 0};
        assertEquals(0, finder.max(arr));
    }

    @Test
    void testSumWithZeroLengthArray() {
        int[] arr = {};
        assertThrows(IllegalArgumentException.class, () -> finder.max(arr));
    }

    @Test
    void testSumWithNullArray() {
        int[] arr = null;
        assertThrows(IllegalArgumentException.class, () -> finder.max(arr));
    }

    @Test
    void testSumWithArraySizeEqualsOne() {
        int[] arr = { 5 };
        assertEquals(5, finder.max(arr));
    }
}