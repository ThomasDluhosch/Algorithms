package SearchAndSort;

// i läuft von links nach rechts das array durch
// j läuft von i nach links zu 0
// a[j] wird mit jedem größeren element getauscht

public class InsertionSort {

    public static void sort(int[] array) {
        int arrayLength = array.length - 1;
        for (int i = 0; i < arrayLength; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    exchange(array, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    private static void exchange(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
