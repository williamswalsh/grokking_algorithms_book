package sorting.quick_sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author William Walsh
 * @version 03 Nov 2022
 */
class QuickSorterTest {
    private static final String ASSERTION_ERROR_MESSAGE = "Arrays are not equal and therefore one is not sorted correctly.";

    @Test
    void testQuickSort() {
        int[] arrToSort = {2, 0, 1, 3};
        int[] expectedArr = {0, 1, 2, 3};

        new QuickSorter3().sort(arrToSort);
        assertArrayEquals(expectedArr, arrToSort, ASSERTION_ERROR_MESSAGE);
    }

    @Test
    void testQuickSortMoreElements() {
        int[] arrToSort = {2, 0, 1, 3, 2, 0, 1, 3, 10, 8, 7};
        int[] expectedArr = {0, 0, 1, 1, 2, 2, 3, 3, 7, 8 ,10};

        new QuickSorter().sort(arrToSort);
        assertArrayEquals(expectedArr, arrToSort, ASSERTION_ERROR_MESSAGE);
    }

    @Test
    void testQuickSortNegativeNumbers() {
        int[] arrToSort = {2, 0, 1, 3, -4, -7};
        int[] expectedArr = {-7, -4, 0, 1, 2, 3};

        new QuickSorter().sort(arrToSort);
        assertArrayEquals(expectedArr, arrToSort, ASSERTION_ERROR_MESSAGE);
    }
}
