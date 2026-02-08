package sorting.insertion_sort;

import sorting.Sorter;

/**
 * @author William Walsh
 * @version 29 Jun 2024
 */
public class InsertionSorterDecrementing implements Sorter {

    @Override
    public int[] sort(int[] a) {
        if (a.length == 0 || a.length == 1) return a;

        int current;
        int i;

        for (int j = 1; j < a.length; j++) {
            current = a[j];
            i = j - 1;

            while(i >= 0 && current > a[i]) {
                a[i+1] = a[i];
                i--;
            }
            a[i+1] = current;
        }
        return a;
    }
}
