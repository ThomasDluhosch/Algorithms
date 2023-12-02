package SearchAndSort;

// An welchem Index in einem Array steht der Wert 'target'?

public class BinarySearch {

    public static int search(int[] array, int target) {

        int lo = 0;
        int hi = array.length - 1;
        int mid;

        while (lo < hi) {
            mid = lo + (hi - lo) / 2;
            if (target < array[mid])
                hi = mid - 1;
            else if (target > array[mid])
                lo = mid + 1;
            else
                return mid;
        }
        return -1;
    }
}