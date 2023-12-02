import SearchAndSort.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {9,8,7,6,5,4,3,2,-1};


        System.out.println(Arrays.toString(arr));
        InsertionSort.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Target is on Index: " +BinarySearch.search(arr, 3));
        KnuthShuffle.shuffle(arr);
        System.out.println(Arrays.toString(arr));
        ShellSort.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}