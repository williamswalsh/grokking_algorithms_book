package sorting.quick_sort;

import sorting.Sorter;

import java.util.Random;

/**
 * Quicksort sorts "in place".
 * The space complexity is much less than merge sort which requires 0(n) space,
 * (mergesort requires a separate array to perform the merging)
 *
 * @author William Walsh
 * @version 03 Nov 2022
 */
public class QuickSorter implements Sorter {

    private final Random random = new Random();

    @Override
    public int[] sort(int[] arrToSort) {
        sort(arrToSort, 0, arrToSort.length - 1);
        return arrToSort;
    }

    public void sort(int[] arr, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex) {
            return;
        }

        int pivotIndex = random.nextInt(highIndex - lowIndex) + lowIndex; // This lowIndex is the offset

        // Get Random Pivot value
        int pivot = arr[pivotIndex];
        // Swap the values
        swap(arr, pivotIndex, highIndex);

        // Partition based on the randomIndexPivot value (which is now at the end of the array)
        int leftPointer = partition(arr, lowIndex, highIndex, pivot);

        sort(arr, lowIndex,leftPointer - 1);
        sort(arr, leftPointer + 1, highIndex);
    }

    private int partition(int[] arr, int lowIndex, int highIndex, int pivot) {
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer) {
            while (arr[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }

            while (arr[rightPointer] >= pivot && leftPointer <  rightPointer) {
                rightPointer--;
            }
            swap(arr, leftPointer, rightPointer);
        }
        swap(arr, leftPointer, highIndex);
        return leftPointer;
    }

    private void swap(int[] arr, int indexA, int indexB) {
        int tmp = arr[indexB];
        arr[indexB] = arr[indexA];
        arr[indexA] = tmp;
    }
}
