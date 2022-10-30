package recursive_countdown;

/**
 * Recursive countdown to 0. Logs count to console output.
 * A count of 0 is the terminal case, 0 will be printed and the method will finish.
 *
 * @author William Walsh
 * @version 30 Oct 2022
 */
public class RecursiveCounter {

    /**
     * @param startingNum must be a positive number. If negative nothing will be printed to console out.
     */
    void countDown(int startingNum) {
        if (startingNum > 0) {
            System.out.println("Countdown: " + startingNum);
            countDown(startingNum - 1 );
        }
    }
}
