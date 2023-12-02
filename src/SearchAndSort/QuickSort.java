package SearchAndSort;

// Array wird geshuffled
// Zufälliges PivotElement wird ausgewählt
// Subarrays werden rekursiv sortiert
//
// best: O( )   avg: O( )    worst: O( )

public class QuickSort {

    public static void sort(int[] array) {
        KnuthShuffle.shuffle(array);
        sort(array, 0, array.length - 1);
    }

    private static void sort(int[] array, int lo, int hi) {

        // Hier könnte eine Optimierung stattfinden
        // Selbe wie bei MergeSort mit CUTOFF
        int CUTOFF = 10;
        if (hi <= lo + CUTOFF - 1) {
            InsertionSort.sort(array, lo, hi);
            return;
        }

        // Hier könnte eine Optimierung stattfinden
        // Dabei wäre das PivotElement der Median von 3 Zahlen (lo, lo+(hi-lo)/2, hi)

        int medianIndex = getMedianIndex(array, lo, hi);
        exchange(array, lo, medianIndex);

        int j = partition(array, lo, hi);
        sort(array, lo, j - 1);
        sort(array, j + 1, hi);
    }

    private static int partition(int[] array, int lo, int hi) {
        // array[lo] ist PivotElement
        int i = lo + 1;
        int j = hi;

        while (true) {
            // Item was größer ist als array[lo] wird in i gespeichert
            while (array[i] < array[lo]) {
                if (i == hi) {
                    break;
                }
                i++;
            }
            // Item was kleiner ist als array[lo] wird in j gespeichert
            while (array[lo] < array[j]) {
                if (j == lo) {
                    break;
                }
                j--;
            }
            if (i >= j)
                break;
            exchange(array, i, j);
        }
        exchange(array, lo, j);
        return j;
    }

    private static void exchange(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static int getMedianIndex(int[] array, int lo, int hi) {
        int mid = lo + (hi - lo) / 2;
        if (array[lo] > array[mid]) {
            exchange(array, lo, mid);
        }
        if (array[lo] > array[hi]) {
            exchange(array, lo, hi);
        }
        if (array[mid] > array[hi]) {
            exchange(array, mid, hi);
        }
        return mid;
    }

}
