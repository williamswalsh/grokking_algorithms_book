package sorting.insertion_sort;

import sorting.Sorter;

public class InsertionSorterBlind implements Sorter {

    @Override
    public int[] sort(int[] arrToSort) {
        int i, curr;

        for (int j = 1; j < arrToSort.length; j++) {
            i = j - 1;
            curr = arrToSort[j];
            while (i >= 0 && arrToSort[i] > curr) {
                arrToSort[i+1] = arrToSort[i];
                i--;
            }
            arrToSort[i+1] = curr;
        }
        return arrToSort;
    }
}
