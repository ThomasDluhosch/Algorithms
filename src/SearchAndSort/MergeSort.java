package SearchAndSort;

import java.util.Arrays;

// Implementation von Top-Down MergeSort (Rekursiv)
// not inplace      stable
// best: O(1/2N logN)   avg: O(N logN)    worst: O(N logN)

public class MergeSort {

    public static void sort(int[] array) {
        int[] copy = Arrays.copyOf(array, array.length);
        sort(array, copy, 0, array.length - 1);
    }

    private static void sort(int[] array, int[] copy, int lo, int hi) {

        // Verbesserung mit CUTOFF für kleine Subarrays (10-15 items)
        // Für kleine SubArrays ist InsertionSort performanter
        int CUTOFF = 10;
        if (hi <= lo + CUTOFF - 1) {
            InsertionSort.sort(array);
            return;
        }

        int mid = lo + (hi - lo) / 2;

        // Verbesserung mit Test ob Arrays schon in Reihenfolge
        // merge() wird gespart
        if (array[mid] <= array[mid + 1])
            return;

        sort(array, copy, lo, mid);
        sort(array, copy, mid + 1, hi);
        merge(array, copy, lo, mid, hi);
    }

    private static void merge(int[] array, int[] copy, int lo, int mid, int hi) {

        System.arraycopy(array, lo, copy, lo, hi - lo + 1);
        int i = lo;
        int j = mid + 1;

        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                array[k] = copy[j];
                j++;
            } else if (j > hi) {
                array[k] = copy[i];
                i++;
            } else if (copy[j] < copy[i]) {
                array[k] = copy[j];
                j++;
            } else {
                array[k] = copy[i];
                i++;
            }
        }
    }
}