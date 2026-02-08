package sorting.insertion_sort;

import sorting.Sorter;

/**
 * @author William Walsh
 * @version 29 Jun 2024
 */
public class InsertionSorter implements Sorter {

    @Override
    public int[] sort(int[] a) {
        if (a.length == 0 || a.length == 1) return a;

        int current;
        int j;

//        Simple iteration starting at 2nd element until final element
        for (int i = 1; i < a.length; i++) {

//            Set the value of the i'th element
            current = a[i];
//            Set the second index to (1-1)=0
//            j is one less than i at the start of the for block.
            j = i - 1;

//            While the second index j is >=0
//            AND
//            the current element is less than the j'th element
            while(j >= 0 && current < a[j]) {
//            copy the value from the j'th position to the j'th+1 position
                a[j+1] = a[j];
//                Decrement the j index.
//                This will keep decrementing and until it gets to -1
                j--;
            }
            // add 1 to j to get the final position of current in the sorted section of the array.
            a[j+1] = current;
        }
        return a;
    }
}
