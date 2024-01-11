import DataStructures.ArrayQueue;
import DataStructures.ArrayStack;
import DataStructures.SymbolTable;
import SearchAndSort.*;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //testSorting();
        //testArrayQueue();
        //testArrayStack();

        testSymbolTable();

    }

    private static void testSymbolTable(){

        SymbolTable st = new SymbolTable(4);

        st.put(1,2);
        st.put(1,153123);
        System.out.println(st.get(2));



    }

    private static void testSorting() {
        long startTime, endTime;

        int[] arr = generateRandomArray(100000);
        //System.out.println(Arrays.toString(arr));

        startTime = System.currentTimeMillis();
        QuickSort.sort(arr);
        endTime = System.currentTimeMillis();
        System.out.println("QuickSort: (" + (endTime - startTime) + "ms) \n");

        KnuthShuffle.shuffle(arr);
        startTime = System.currentTimeMillis();
        MergeSort.sort(arr);
        endTime = System.currentTimeMillis();
        System.out.println("MergeSort: (" + (endTime - startTime) + "ms) \n");

        KnuthShuffle.shuffle(arr);
        startTime = System.currentTimeMillis();
        InsertionSort.sort(arr);
        endTime = System.currentTimeMillis();
        System.out.println("InsertionSort: (" + (endTime - startTime) + "ms) \n");

        KnuthShuffle.shuffle(arr);
        startTime = System.currentTimeMillis();
        SelectionSort.sort(arr);
        endTime = System.currentTimeMillis();
        System.out.println("SelectionSort: (" + (endTime - startTime) + "ms) \n");

        KnuthShuffle.shuffle(arr);
        startTime = System.currentTimeMillis();
        ShellSort.sort(arr);
        endTime = System.currentTimeMillis();
        System.out.println("ShellSort: (" + (endTime - startTime) + "ms) \n");

    }

    private static void testArrayQueue() {
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

    private static void testArrayStack() {
        ArrayStack st = new ArrayStack(4);
        st.push(7);
        st.push(69);
        st.push(420);
        st.getValues();
        st.push(4561);
        st.push(45261);
        st.getValues();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.getValues();
    }

    private static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }


}