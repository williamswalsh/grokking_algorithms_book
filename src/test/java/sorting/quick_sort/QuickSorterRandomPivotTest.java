package sorting.quick_sort;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author William Walsh
 * @version 03 Nov 2022
 */
class QuickSorterRandomPivotTest {
    private static final String ASSERTION_ERROR_MESSAGE = "Arrays are not equal and therefore one is not sorted correctly.";

    @ParameterizedTest
    @MethodSource("arrayProvider")
    public void testReverseArray(int[] arrToSort, int[] expectedOutput) {
        new QuickSorterRandomPivot().sort(arrToSort);

        assertArrayEquals(expectedOutput, arrToSort, ASSERTION_ERROR_MESSAGE);
    }

    // The static method providing test arguments
    private static Stream<Arguments> arrayProvider() {
        return Stream.of(
                // Test case 1: simple array
                Arguments.of(new int[]{2, 1, 0, 3}, new int[]{0, 1, 2, 3}),
                // Test case 2: array with duplicates
                Arguments.of(new int[]{2, 0, 1, 3, 2, 0, 1, 3, 10, 8, 7}, new int[]{0, 0, 1, 1, 2, 2, 3, 3, 7, 8 ,10}),
                // Test case 3: array with negative elements
                Arguments.of(new int[]{2, 0, 1, 3, -4, -7}, new int[]{-7, -4, 0, 1, 2, 3}),
                // Test case 4: single element array
                Arguments.of(new int[]{1}, new int[]{1})
        );
    }
}
