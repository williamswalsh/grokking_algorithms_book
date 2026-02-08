package sorting.quick_sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * @author William Walsh
 * @version 08 Feb 2025
 * Crappy quick sort implementation without dual pointers.
 */
public class QuickSorterInefficientImplementation {

    static Random random = new Random();
    public static int[] sort(int[] arr) {
        if (arr.length < 2) {
            return arr;
        }

        int pivotIndex = random.nextInt(arr.length);
//        int pivot = arr[0];
        int pivot = arr[pivotIndex];

        List<Integer> arrLessPivotList =  new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(i == pivotIndex) {
                continue;
            }
            arrLessPivotList.add(arr[i]);
        }
        int[] arrLessPivot = arrLessPivotList.stream().mapToInt(i->i).toArray();


        int[] less = Arrays.stream(arrLessPivot)
                .filter(e -> e <= pivot)
                .toArray();

        int[] more = Arrays.stream(arrLessPivot)
                .filter(e -> e > pivot)
                .toArray();

//        return IntStream.concat(Arrays.stream(sort(less)), Arrays.stream(sort(more))).toArray();
        return IntStream.concat(IntStream.concat(Arrays.stream(sort(less)), IntStream.of(pivot)), Arrays.stream(sort(more))).toArray();
    }
}
