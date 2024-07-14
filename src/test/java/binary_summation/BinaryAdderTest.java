package binary_summation;

import org.junit.jupiter.api.Test;
import sorting.insertion_sort.InsertionSorterBlind;

import static org.junit.jupiter.api.Assertions.*;

class BinaryAdderTest {


    private static final String ASSERTION_ERROR_MESSAGE = "Arrays are not equal and the binary adder didn't work as expected.";

    @Test
    void binaryAdderTest() {
        boolean[] a = {false, true, false, true};
        boolean[] b = {true, true, false, true};
        boolean[] expectedArr = {true, false, false, true, false};

        assertArrayEquals(expectedArr, new BinaryAdder().add(a, b), ASSERTION_ERROR_MESSAGE);
    }

    @Test
    void binaryAdderInvalidInputTest() {
        boolean[] a = {true};
        boolean[] b = {true, true, false, true};
        assertThrows(IllegalArgumentException.class, () -> new BinaryAdder().add(a, b));
    }
}