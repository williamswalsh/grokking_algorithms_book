package sorting.quick_sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSorterRandomPivotPartitionUnboxedTest {

    private static final String ASSERTION_ERROR_MESSAGE = "Arrays are not equal and therefore one is not sorted correctly.";

    @Test
    void sort() {
        int[] arrToSort = {2, 0, 1, 3};
        int[] expectedArr = {0, 1, 2, 3};

        int[] actualArr = new QuickSorterRandomPivotPartitionUnboxed().sort(arrToSort);
        assertArrayEquals(expectedArr, actualArr, ASSERTION_ERROR_MESSAGE);
    }

    @Test
    void testQuickSortMoreElements() {
        int[] arrToSort = {2, 0, 1, 3, 2, 0, 1, 3, 10, 8, 7};
        int[] expectedArr = {0, 0, 1, 1, 2, 2, 3, 3, 7, 8 ,10};

        int[] actualArr = new QuickSorterRandomPivotPartitionUnboxed().sort(arrToSort);
        assertArrayEquals(expectedArr, actualArr, ASSERTION_ERROR_MESSAGE);
    }

    @Test
    void testQuickSortNegativeNumbers() {
        int[] arrToSort = {2, 0, 1, 3, -4, -7};
        int[] expectedArr = {-7, -4, 0, 1, 2, 3};

        int[] actualArr = new QuickSorterRandomPivotPartitionUnboxed().sort(arrToSort);
        assertArrayEquals(expectedArr, actualArr, ASSERTION_ERROR_MESSAGE);
    }

}