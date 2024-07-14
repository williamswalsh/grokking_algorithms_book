package binary_search;

import org.junit.jupiter.api.Test;
import search.binary_search.BinarySearcher;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author William Walsh
 * @version 24 Oct 2022
 */
class BinarySearcherTest {

    @Test
    void testSearchOddNumbersOnly() {
        int target = 3;
        int expectedIndexOfTarget = 1;
        List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 9);
        Optional<Integer> indexOfTarget = new BinarySearcher().search(numbers, target);

        assertFalse(indexOfTarget.isEmpty());
        assertEquals(
                expectedIndexOfTarget, indexOfTarget.get(), "The index should be the index of the target.");
    }

    @Test
    void testSearchOddAndEvenNumbers() {
        int target = 3;
        int expectedIndexOfTarget = 2;
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Optional<Integer> indexOfTarget = new BinarySearcher().search(numbers, target);

        assertFalse(indexOfTarget.isEmpty());
        assertEquals(
                expectedIndexOfTarget, indexOfTarget.get(), "The index should be the index of the target.");
    }

    @Test
    void testSearchEvenNumberOfElements() {
        int target = 3;
        int expectedIndexOfTarget = 2;
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        Optional<Integer> indexOfTarget = new BinarySearcher().search(numbers, target);

        assertFalse(indexOfTarget.isEmpty());
        assertEquals(
                expectedIndexOfTarget, indexOfTarget.get(), "The index should be the index of the target.");
    }

    @Test
    void testSearchTargetNotInList() {
        int target = 3;
        List<Integer> numbers = Arrays.asList(1, 2, 4, 5, 6, 7, 8, 9);
        Optional<Integer> indexOfTarget = new BinarySearcher().search(numbers, target);

        assertTrue(indexOfTarget.isEmpty());
    }

    @Test
    void testSearchTargetTargetLastElement() {
        int target = 9;
        int expectedIndexOfTarget = 7;
        List<Integer> numbers = Arrays.asList(1, 2, 4, 5, 6, 7, 8, 9);
        Optional<Integer> indexOfTarget = new BinarySearcher().search(numbers, target);

        assertFalse(indexOfTarget.isEmpty());
        assertEquals(
                expectedIndexOfTarget, indexOfTarget.get(), "The index should be the index of the target.");
    }

    @Test
    void testSearchTargetTargetFirstElement() {
        int target = 1;
        int expectedIndexOfTarget = 0;
        List<Integer> numbers = Arrays.asList(1, 2, 4, 5, 6, 7, 8, 9);
        Optional<Integer> indexOfTarget = new BinarySearcher().search(numbers, target);

        assertFalse(indexOfTarget.isEmpty());
        assertEquals(
                expectedIndexOfTarget, indexOfTarget.get(), "The index should be the index of the target.");
    }
}
