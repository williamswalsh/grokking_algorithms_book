package sorting.quick_sort;

import sorting.Sorter;

/**
 * This sorter implements the Quicksort algorithm.
 * To select the pivot it always chooses the end of the array/sub-array.
 * <p>
 * The worst runtime complexity of this implementation is O(n^2).
 * The best runtime  complexity of this implementation is O(n*log n),
 * this would be the case if the median number was chosen each time.
 * <p>
 * Pivot Strategies: pick the end as the pivot.
 *
 * @author William Walsh
 * @version 03 Nov 2022
 */
public class QuickSorterPivotAtEnd implements Sorter {

    @Override
    public int[] sort(int[] a) {
        sort(a, 0, a.length - 1);
        return a;
    }

    private void sort(int[] arr, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex) {
            return;
        }
        // Get pivot point value - use end of array/sub-array
        int pivot = arr[highIndex];

        // create pointers to step through array
        int leftPtr = lowIndex;
        int rightPtr = highIndex;

        while (leftPtr < rightPtr) {
            while (arr[leftPtr] <= pivot && leftPtr < rightPtr) {
                leftPtr++;
            }
            while (arr[rightPtr] >= pivot  && leftPtr < rightPtr) {
                rightPtr--;
            }
            swap(arr, leftPtr, rightPtr);
        }
        // Final swap when pointers point to same element
        // swapping elem pointed at with pivot
        swap(arr, leftPtr, highIndex);

        sort(arr, lowIndex, leftPtr - 1);
        sort(arr, leftPtr + 1, highIndex);
    }

    private void swap(int[] arr, int indexA, int indexB) {
        int tmp = arr[indexB];
        arr[indexB] = arr[indexA];
        arr[indexA] = tmp;
    }
}
