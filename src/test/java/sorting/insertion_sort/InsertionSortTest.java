package sorting.insertion_sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class InsertionSortTest {

    private static final String ASSERTION_ERROR_MESSAGE = "Arrays are not equal and therefore one is not sorted correctly.";

    @Test
    void testInsertionSort() {
        int[] arrToSort = {2, 1, 0, 3};
        int[] expectedArr = {0, 1, 2, 3};

        new InsertionSorter().sort(arrToSort);
        assertArrayEquals(expectedArr, arrToSort, ASSERTION_ERROR_MESSAGE);
    }

    @Test
    void testInsertionSortOrderedInReverse() {
        int[] arrToSort = {3, 2, 1, 0};
        int[] expectedArr = {0, 1, 2, 3};

        new InsertionSorter().sort(arrToSort);
        assertArrayEquals(expectedArr, arrToSort, ASSERTION_ERROR_MESSAGE);
    }

    @Test
    void testInsertionSortMoreElements() {
        int[] arrToSort = {2, 0, 1, 3, 2, 0, 1, 3, 10, 8, 7};
        int[] expectedArr = {0, 0, 1, 1, 2, 2, 3, 3, 7, 8 ,10};

        new InsertionSorter().sort(arrToSort);
        assertArrayEquals(expectedArr, arrToSort, ASSERTION_ERROR_MESSAGE);
    }

    @Test
    void testInsertionSortNegativeNumbers() {
        int[] arrToSort = {2, 0, 1, 3, -4, -7};
        int[] expectedArr = {-7, -4, 0, 1, 2, 3};

        new InsertionSorter().sort(arrToSort);
        assertArrayEquals(expectedArr, arrToSort, ASSERTION_ERROR_MESSAGE);
    }

}
