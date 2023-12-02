package SearchAndSort;

// Nicht besonders Effizient -> Scannt von links nach rechts
// Finde Minimum im Array -> Vertausche a[min] mit a[j]
// Alles kleiner i -> sortiert | Alles größer i -> unsortiert

public class SelectionSort {

    public static void sort(int[] array) {
        int min;

        for (int i = 0; i < array.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;//searching for lowest index
                }
            }
            exchange(array, i, min);
        }
    }

    private static void exchange(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}