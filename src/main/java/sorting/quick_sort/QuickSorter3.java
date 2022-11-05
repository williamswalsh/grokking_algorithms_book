package sorting.quick_sort;

import sorting.Sorter;

import java.util.Random;

/**
 * @author William Walsh
 * @version 03 Nov 2022
 */
public class QuickSorter3 implements Sorter {

    private final Random random = new Random();

    @Override
    public int[] sort(int[] arr) {
        sort(arr, 0, arr.length -1);
        return arr;
    }

    private void sort(int[] arr, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex) {
            return;
        }

        int randomIndex = random.nextInt(highIndex - lowIndex) + lowIndex; // This lowIndex is the offset
        swap(arr, randomIndex, highIndex);

        int pivot = arr[highIndex];

        // create pointers to step through array
        int leftPtr = lowIndex;
        int rightPtr = highIndex;

        while (leftPtr < rightPtr) {
            while (arr[leftPtr] <= pivot && leftPtr < rightPtr) {
                leftPtr++;
            }
            while (pivot <= arr[rightPtr] && leftPtr < rightPtr) {
                rightPtr--;
            }
            // Swap when both left and right ptrs have "swappable" values
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
