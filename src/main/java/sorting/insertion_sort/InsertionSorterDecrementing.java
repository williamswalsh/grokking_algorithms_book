package sorting.insertion_sort;

import sorting.Sorter;

/**
 * @author William Walsh
 * @version 29 Jun 2024
 */
public class InsertionSorterDecrementing implements Sorter {

    @Override
    public int[] sort(int[] arrToSort) {
        if (arrToSort.length == 0 || arrToSort.length == 1) return arrToSort;

        int current;
        int i;

        for (int j = 1; j < arrToSort.length; j++) {
            current = arrToSort[j];
            i = j - 1;

            while(i >= 0 && current > arrToSort[i]) {
                arrToSort[i+1] = arrToSort[i];
                i--;
            }
            arrToSort[i+1] = current;
        }
        return arrToSort;
    }
}
