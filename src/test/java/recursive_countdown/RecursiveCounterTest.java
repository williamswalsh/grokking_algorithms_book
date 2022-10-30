package recursive_countdown;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author William Walsh
 * @version 30 Oct 2022
 */
class RecursiveCounterTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void testCountDownSystemOutputHappyPath() {
        new RecursiveCounter().countDown(5);

        assertEquals("Countdown: 5\n" +
                "Countdown: 4\n" +
                "Countdown: 3\n" +
                "Countdown: 2\n" +
                "Countdown: 1\n", outContent.toString());
    }

    @Test
    void testCountDownSystemOutputWithInvalidParamNegativeNumber() {
        new RecursiveCounter().countDown(-5);

        assertEquals(0, outContent.size());
    }
}