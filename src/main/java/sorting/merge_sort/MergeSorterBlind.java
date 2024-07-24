package sorting.merge_sort;

import sorting.Sorter;

public class MergeSorterBlind implements Sorter {


    @Override
    public int[] sort(int[] a) {
        return mergeSort(a, 0, a.length - 1);
    }

    private int[] mergeSort(int[] a, int low, int high) {
        if (low < high) {
            int mid = (low + high)/2;
            mergeSort(a, low, mid);
            mergeSort(a, mid+1, high);
            merge(a, low, mid, high);
        }
        return a;
    }

    private void merge(int[] a, int left, int mid, int right) {
//        Create array size
        int n1 = mid - left + 1;
        int n2 = right - mid;

//        Create arrays
        int[] lArr = new int[n1];
        int[] rArr = new int[n2];

//        Copy values from array to sub-array
        for (int i = 0; i < n1; i++) {
            lArr[i] = a[i + left];
        }
        for (int j = 0; j < n2; j++) {
            rArr[j] = a[j + mid + 1];
        }

//        Init vars to travers all three arrays
        int l = 0;
        int r = 0;

//        Must start n at left pointer.
        int n = left;
        int totalLen = n1 + n2;

//        While both arrays have elems
        while(n < totalLen && l < lArr.length && r < rArr.length) {
            if (lArr[l] < rArr[r]) {
                a[n++] = lArr[l++];
            } else {
                a[n++] = rArr[r++];
            }
        }
//        While lArr still has elems
        while(n < totalLen && l < lArr.length) {
            a[n++] = lArr[l++];
        }
//        While rArr still has elems
        while(n < totalLen && r < rArr.length) {
            a[n++] = rArr[r++];
        }
    }
}
