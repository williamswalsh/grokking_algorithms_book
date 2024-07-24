package recursive_sum;

import java.util.Arrays;

public class RecursiveSummerBlind implements Summer{
    @Override
    public int sum(int[] a) {
        if (a == null || a.length == 0) {
            throw new IllegalArgumentException("The array passed to sum method is null or has a size of 0.");
        }
        if (a.length == 1) {
            return a[0];
        }
        return a[0] + sum(Arrays.copyOfRange(a, 1, a.length));
    }
}
