package sorting.quick_sort;

import sorting.Sorter;

import java.util.Random;

/**
 * Quicksort sorts "in place".
 * The space complexity is much less than merge sort which requires 0(n) space,
 * (mergesort requires a separate array to perform the merging)
 * <p>
 * Pivot Strategies:
 * This implementation uses randomly selected pivot.
 *
 * @author William Walsh
 * @version 03 Nov 2022
 */
public class QuickSorterRandomPivot implements Sorter {

    private final Random random = new Random();

    @Override
    public int[] sort(int[] a) {
        sort(a, 0, a.length - 1);
        return a;
    }

    private void sort(int[] arr, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex) {
            return;
        }

        int pivotIndex = random.nextInt(highIndex - lowIndex) + lowIndex; // This lowIndex is the offset

        // Get Random Pivot value
        int pivot = arr[pivotIndex];
        // Swap the values
        swap(arr, pivotIndex, highIndex);

        // Partition based on the d value (which is now at the end of the array)
        int leftPointer = partition(arr, lowIndex, highIndex, pivot);

        sort(arr, lowIndex,leftPointer - 1);
        sort(arr, leftPointer + 1, highIndex);
    }

    public int partition(int[] arr, int lowIndex, int highIndex, int pivot) {
        int leftPtr = lowIndex;
        int rightPtr = highIndex;

        while (leftPtr < rightPtr) {
            while (arr[leftPtr] <= pivot && leftPtr < rightPtr) {
                leftPtr++;
            }
            while (arr[rightPtr] >= pivot && leftPtr < rightPtr) {
                rightPtr--;
            }
            swap(arr, leftPtr, rightPtr);
        }
        swap(arr, leftPtr, highIndex);
        return leftPtr;
    }

    private void swap(int[] arr, int indexA, int indexB) {
        int tmp = arr[indexB];
        arr[indexB] = arr[indexA];
        arr[indexA] = tmp;
    }
}
