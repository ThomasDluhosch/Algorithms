package SearchAndSort;

// Erweiterung von InsertionSort (h-sort)
// Jede h-te Stelle wird vorsortiert
// Zum Schluss ist h = 1

import javax.xml.crypto.Data;

public class ShellSort {

    public static void sort(int[] array) {

        int arrayLength = array.length - 1;
        int h = 1;

        while (h < arrayLength / 3) {
            h = 3 * h + 1;
        }
        while (h >= 1) {
            for (int i = h; i < arrayLength; i++) {
                int j = i;
                while (j >= h && array[j] < array[j - h]) {
                    exchange(array, j, j - h);
                    j -= h;
                }
            }
            h = h / 3;
        }
    }

    private static void exchange(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
