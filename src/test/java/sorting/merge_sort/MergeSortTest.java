package sorting.merge_sort;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import sorting.MergeSorter;
import sorting.insertion_sort.InsertionSorter;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeSortTest {

    private static final String ASSERTION_ERROR_MESSAGE = "Arrays are not equal and therefore one is not sorted correctly.";

    @Test
    void mergeTest() {
        int[] a = {2, 3, 4};
        int[] b = {1, 2, 7, 9};
        int[] expected = {1, 2, 2, 3, 4, 7, 9};
        int[] out = new MergeSorter().merge(a, b);

        assertArrayEquals(expected, out, ASSERTION_ERROR_MESSAGE);
    }


    @Test
    void testMergeSort() {
        int[] arrToSort = {2, 0, 1, 3};
        int[] expectedArr = {0, 1, 2, 3};

        new MergeSorter().sort(arrToSort);
        assertArrayEquals(expectedArr, arrToSort, ASSERTION_ERROR_MESSAGE);
    }
}
