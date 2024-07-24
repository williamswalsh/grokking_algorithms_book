package sorting.merge_sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeSorterBlind3Test {

    private static final String ASSERTION_ERROR_MESSAGE = "Arrays are not equal and therefore one is not sorted correctly.";

    @Test
    void testMergeSort() {
        int[] arrToSort = {2, 0, 1, 3};
        int[] expectedArr = {0, 1, 2, 3};

        new MergeSorterBlind3().sort(arrToSort);
        assertArrayEquals(expectedArr, arrToSort, ASSERTION_ERROR_MESSAGE);
    }
}