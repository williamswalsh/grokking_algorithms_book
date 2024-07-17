package sorting.insertion_sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSorterAlgoBookTest {

    private static final String ASSERTION_ERROR_MESSAGE = "Arrays are not equal and therefore one is not sorted correctly.";

    @Test
    void insertionSortTest() {
        int[] arrToSort = {2, 1, 0, 3};
        int[] expectedArr = {0, 1, 2, 3};

        new InsertionSorterAlgoBook().sort(arrToSort);
        assertArrayEquals(expectedArr, arrToSort, ASSERTION_ERROR_MESSAGE);
    }

    @Test
    void insertionSortLastElementTest() {
        int[] arrToSort = {2, 3, 1};
        int[] expectedArr = {1, 2, 3};

        new InsertionSorterAlgoBook().sort(arrToSort);
        assertArrayEquals(expectedArr, arrToSort, ASSERTION_ERROR_MESSAGE);
    }
}