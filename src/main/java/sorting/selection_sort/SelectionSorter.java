package sorting.selection_sort;

import sorting.Sorter;

/**
 * @author William Walsh
 * @version 29 Jun 2024
 */
public class SelectionSorter implements Sorter {

    @Override
    public int[] sort(int[] a) {
        // If array has length 0 -> it can't be sorted -> return array
        // If array has length 1 -> it is already sorted -> return array
        if (a.length == 0 || a.length == 1) return a;

        // second index to find minimum index
        int j;

        // Index of minimum element
        int min;

        // swap variable to perform element swap
        int swapVal;

        // Iterate over array, stop at second last element
        for (int i = 0; i < a.length-1; i++) {

            // second index
            j = i + 1;

            // set the min index to the i'th index
            min = i;

            // This while loop will iterate up through the array until it reaches the last element.
            while (j < a.length) {
                // if j < min -> set j to min
                if (a[j] < a[min]) {
                    min = j;
                }
                // increment j
                j++;
            }

            // once the min index is identified swap the min with the i'th index.
            swapVal = a[i];
            a[i] = a[min];
            a[min] = swapVal;
        }
        return a;
    }

    public int[] sortInMethods(int[] arrToSort) {
        for (int i = 0; i < arrToSort.length; i++) {
            int smallestNumIndex = findSmallest(arrToSort, i);
            swap(arrToSort, i, smallestNumIndex);
        }
        return arrToSort;
    }

    private void swap(int[] array, int indexA, int indexB) {
        int indexANum = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = indexANum;
    }

    private int findSmallest(int[] arrToSort, int startingIndex) {
        int smallestNumIndex = startingIndex;

        for (int i = startingIndex + 1; i < arrToSort.length; i++) {
            if (arrToSort[i] < arrToSort[smallestNumIndex]) {
                smallestNumIndex = i;
            }
        }
        return smallestNumIndex;
    }
}
