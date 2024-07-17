package sorting.insertion_sort;

import sorting.Sorter;

public class InsertionSorterAlgoBook implements Sorter {
    @Override
    public int[] sort(int[] a) {
        int min, tmp;
        for (int i = 0; i < a.length-1; i++) {
            min = i;
            for (int j = i; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            tmp = a[i];
            a[i] = a[min];
            a[min] = tmp;
        }
        return a;
    }
}
