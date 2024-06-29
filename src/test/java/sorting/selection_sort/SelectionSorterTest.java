package sorting.selection_sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author William Walsh
 * @version 30 Oct 2022
 */
class SelectionSorterTest {

    private static final String ASSERTION_ERROR_MESSAGE = "Arrays are not equal and therefore one is not sorted correctly.";

    @Test
    void testSortWithEvenNumberOfNumbers() {
        int[] arrToSort = {2, 0, 1, 3};
        int [] expectedArr = {0, 1, 2, 3};

        new SelectionSorter().sort(arrToSort);

        assertArrayEquals(expectedArr, arrToSort, ASSERTION_ERROR_MESSAGE);
    }

    @Test
    void testSortWithOddNumberOfNumbers() {
        int[] arrToSort = {2, 0, 1, 3, 4};
        int [] expectedArr = {0, 1, 2, 3, 4};

        new SelectionSorter().sort(arrToSort);

        assertArrayEquals(expectedArr, arrToSort, ASSERTION_ERROR_MESSAGE);
    }

    @Test
    void testSortWithNegativeNumbers() {
        int[] arrToSort = {-2, 0, -1, -3, -4};
        int [] expectedArr = {-4, -3, -2, -1, 0};

        new SelectionSorter().sort(arrToSort);

        assertArrayEquals(expectedArr, arrToSort, ASSERTION_ERROR_MESSAGE);
    }

    @Test
    void testSortWithDuplicateNumbers() {
        int[] arrToSort = {2, 0, 2, 0, 4};
        int [] expectedArr = {0, 0, 2, 2, 4};

        new SelectionSorter().sort(arrToSort);

        assertArrayEquals(expectedArr, arrToSort, ASSERTION_ERROR_MESSAGE);
    }
}
