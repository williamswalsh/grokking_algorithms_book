package sorting.insertion_sort;

import sorting.Sorter;

public class InsertionSorterBlind implements Sorter {

    @Override
    public int[] sort(int[] a) {
        int i, curr;

        for (int j = 1; j < a.length; j++) {
            i = j - 1;
            curr = a[j];
            while (i >= 0 && a[i] > curr) {
                a[i+1] = a[i];
                i--;
            }
            a[i+1] = curr;
        }
        return a;
    }
}
