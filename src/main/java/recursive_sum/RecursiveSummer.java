package recursive_sum;

import java.util.Arrays;

/**
 * @author William Walsh
 * @version 31 Oct 2022
 */
public class RecursiveSummer implements Summer {

    public int sum(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        if (arr.length == 1) {
            return arr[0];
        }
        return arr[0] + sum(Arrays.copyOfRange(arr, 1, arr.length));
    }
}
