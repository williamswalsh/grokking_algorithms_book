package recursive_max;

import java.security.InvalidParameterException;
import java.util.Arrays;

/**
 * @author William Walsh
 * @version 31 Oct 2022
 */
public class MaxFinder {

    public int max(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("The array passed to max method is null or has a size of 0.");
        }

        if (arr.length == 1) {
            return arr[0];
        }

        int localMax = max(Arrays.copyOfRange(arr, 1, arr.length));

        if (arr[0] > localMax) {
            return arr[0];
        } else {
            return localMax;
        }
    }
}
