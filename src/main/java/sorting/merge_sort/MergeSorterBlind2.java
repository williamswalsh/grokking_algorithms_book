package sorting.merge_sort;

import sorting.Sorter;

public class MergeSorterBlind2 implements Sorter {
    @Override
    public int[] sort(int[] a) {
        return mergeSort(a, 0, a.length - 1);
    }

    private int[] mergeSort(int[] a, int low, int high) {
        if (low < high) {
            int mid = (high + low)/2;
            mergeSort(a, low, mid);
            mergeSort(a, mid + 1, high);
            merge(a, low, mid, high);
        }
        return a;
    }

    private void merge(int[] a, int left, int mid, int right) {
        // create sub-array lengths
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // create sub-arrays
        int[] lArr = new int[n1];
        int[] rArr = new int[n2];

        // copy values from 'a' to sub-arrays
        // To create index in left array we use index i and left offset
        for (int i = 0; i < lArr.length; i++) {
            lArr[i] = a[i + left];
        }
        // to create index for second array just use j and for the original array use j + mid + 1
        for (int j = 0; j < rArr.length; j++) {
            rArr[j] = a[j + mid + 1];
        }

        // init vars
        // N.B. must start large array index at left value
        int i = left;
        int l = 0;
        int r = 0;
        int totalLen = n1 + n2;

        // do 3 while merge
        while (i < totalLen && l < n1 && r < n2) {
            if (lArr[l] < rArr[r]) {
                a[i++] = lArr[l++];
            } else {
                a[i++] = rArr[r++];
            }
        }
        while (i < totalLen && l < n1) {
            a[i++] = lArr[l++];
        }
        while (i < totalLen && r < n2) {
            a[i++] = rArr[r++];
        }
    }
}
