package sorting.merge_sort;

import sorting.Sorter;

public class MergeSorter implements Sorter {


    @Override
    public int[] sort(int[] a) {
        return mergeSort(a, 0, a.length - 1);
    }

    public int[] mergeSort(int[] arrToSort, int low, int high) {
        if (low < high) {
            int mid = (low + high)/2;
            mergeSort(arrToSort, low, mid);
            mergeSort(arrToSort, mid + 1, high);
            merge(arrToSort, low, mid, high);
        }
        return arrToSort;
    }

    public void merge(int[] arrToSort, int left, int mid, int right) {
        int n1 = mid - left + 1;     // 1 offset - zero based indexing
        int n2 = right - mid;

        int[] lArr = new int[n1];
        int[] rArr = new int[n2];

        for (int i = 0; i < lArr.length; i++) {
            lArr[i] = arrToSort[left + i];
        }
        for (int j = 0; j < rArr.length; j++) {
            rArr[j] = arrToSort[mid + 1 + j];        // 1 offset
        }

        int l = 0;
        int m = 0;
        int n = left;
        int totalLength = n1 + n2;
        while (n < totalLength && l < lArr.length &&  m < rArr.length) {
            if (lArr[l] < rArr[m]) {
                arrToSort[n] = lArr[l];
                l++;
            } else {
                arrToSort[n] = rArr[m];
                m++;
            }
            n++;
        }
        while (n < totalLength && l < lArr.length) {
            arrToSort[n] = lArr[l];
            l++;
            n++;
        }
        while (n < totalLength && m < rArr.length) {
            arrToSort[n] = rArr[m];
            m++;
            n++;
        }
    }

    public int[] merge(int[] a, int[] b) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] out = new int[a.length + b.length];

        while(i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                out[k] = a[i];
                i++;
            } else {
                out[k] = b[j];
                j++;
            }
            k++;
        }
        while(i < a.length) {
            out[k] = a[i];
            i++;
            k++;
        }
        while(j < b.length) {
            out[k] = b[j];
            j++;
            k++;
        }
        return out;
    }
}
