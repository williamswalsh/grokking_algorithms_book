package sorting.merge_sort;

import sorting.Sorter;

public class MergeSorterBlind3 implements Sorter {


    @Override
    public int[] sort(int[] arrToSort) {
        return mergeSort(arrToSort, 0, arrToSort.length - 1);
    }

    private int[] mergeSort(int[] a, int low, int high) {
        if (low < high){
            int mid = (low + high)/2;
            mergeSort(a, low, mid);
            mergeSort(a, mid + 1, high);
            merge(a, low, mid, high);
        }
        return a;
    }

    private void merge(int[] a, int left, int mid, int right) {
        // create sub-array sizes
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // create sub-arrays
        int[] lArr = new int[n1];
        int[] rArr = new int[n2];

        // copy values into sub-arrays - N.B. index offsets
        for (int i = 0; i < lArr.length; i++) {
            lArr[i] = a[i + left];
        }
        for (int j = 0; j < rArr.length; j++) {
            rArr[j] = a[j + mid + 1];
        }

        // create indexes to do merge
        // total length is calculated using n1 -> which is calculated using the left offset
        // comparing totalLength to i
        int i = left;
        int l = 0;
        int r = 0;
        int totalLen = n1 + n2;

        // while both sub-arrays still contain values
        while (i < totalLen && l < lArr.length && r < rArr.length) {
            // Using ternary operator here - could use if-else.
            a[i++] = (lArr[l] < rArr[r])? lArr[l++]: rArr[r++];
        }
        // while right sub-array still contains values
        while (i < totalLen && r < rArr.length) {
            a[i++] = rArr[r++];
        }
        // while left sub-array still contains values
        while (i < totalLen && l < lArr.length) {
            a[i++] = lArr[l++];
        }
    }
}
