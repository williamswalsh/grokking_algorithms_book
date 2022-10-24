package binary_search;

import java.util.List;
import java.util.Optional;

/**
 * @author William Walsh
 * @version 24 Oct 2022
 */
public class BinarySearcher {

  /**
   * using integer indexes - limits the size of the potential list size(index)
   *
   * Binary Search
   * Searches ordered data.
   * For n options the search steps is log n.
   * n = 128
   * log 128 = 7 steps required to find target
   **/
  public Optional<Integer> search(List<Integer> list, int target) {
    int low = 0;
    int high = list.size() - 1;

    while(low < high) {
        int mid = low + high;
        int guess = list.get(mid);

        if (guess > target) {
            high = mid - 1;
        }

        if (guess < target) {
            low = mid + 1;
        }

        if (guess == target) {
            return Optional.of(mid);
        }
    }
    return Optional.empty();
  }
}
