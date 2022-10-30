package selection_sort;

/**
 * @author William Walsh
 * @version 30 Oct 2022
 */
public class SelectionSorter implements Sorter {

    @Override
    public int[] sort(int[] arrToSort) {
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

        for (int i = startingIndex; i < arrToSort.length; i++) {
            if (arrToSort[i] < arrToSort[smallestNumIndex]) {
                smallestNumIndex = i;
            }
        }
        return smallestNumIndex;
    }
}
