package binary_search;

import java.util.List;
import java.util.Optional;

/**
 * @author William Walsh
 * @version 24 Oct 2022
 */
public class BinarySearcher {

    /**
     * Array And ArrayLists use integer indexes.
     * This limits the size of the list.
     * Maximum list index value: 2,147,483,647
     *
     * Binary Search Searches ordered data.
     * For n options the search steps is log n.
     * n = 128
     * log 128 = 7 steps required to find target.
     */
    public Optional<Integer> search(List<Integer> list, int target) {
        int low = 0;
        int high = list.size() - 1;

        while (low <= high) {
            int mid = (low + high)/2;
            int guess = list.get(mid);

            if (guess == target) {
                return Optional.of(mid);
            }

            if (guess > target) {
                System.out.println("Step: guess > target. Mid: " + mid);
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return Optional.empty();
    }
}
