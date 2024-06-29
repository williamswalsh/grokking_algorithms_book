package iterative_sum;

import recursive_sum.Summer;

import java.util.Arrays;

/**
 * @author William Walsh
 * @version 29 Jun 2024
 */
public class IterativeSummer implements Summer {

    @Override
    public int sum(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("The array passed to sum method is null or has a size of 0.");
        }
        if (arr.length == 1) {
            return arr[0];
        }

        int sum = 0;
        for (int curr : arr) {
            sum += curr;
        }
        return sum;
    }
}
