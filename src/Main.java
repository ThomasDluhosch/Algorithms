import DataStructures.ArrayQueue;
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

        //testArrayQueue();

    }

    private static void testArrayQueue(){
        ArrayQueue que = new ArrayQueue(4);
        que.enqueue(3);
        que.enqueue(22);
        que.enqueue(69);
        que.enqueue(420);
        que.getValues();
        que.enqueue(563);
        que.getValues();
        que.enqueue(324);
        que.enqueue(56235413);
        que.enqueue(5612343);
        que.enqueue(56323);
        que.getValues();
        que.dequeue();
        que.dequeue();
        que.dequeue();
        que.dequeue();
        que.dequeue();
        que.dequeue();
        que.dequeue();
        que.dequeue();
        que.getValues();
    }
}