package search.linear_search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinearSearcherTest {

    @Test
    void searchValueExistsTest() {
        int[] a = {2, 4, 5, 0, 29, 7};
        assertEquals(4, new LinearSearcher().search(a, 29));
    }

    @Test
    void searchValueNonExistentTest() {
        int[] a = {2, 4, 5, 0, 29, 7};
        assertEquals(-1, new LinearSearcher().search(a, 77));
    }

    @Test
    void searchWithNullReturnValueExistsTest() {
        int[] a = {2, 4, 5, 0, 29, 7};
        assertEquals(4, new LinearSearcher().searchWithNullReturn(a, 29));
    }

    @Test
    void searchWithNullReturnValueNonExistentTest() {
        int[] a = {2, 4, 5, 0, 29, 7};
        assertNull(new LinearSearcher().searchWithNullReturn(a, 77));
    }
}