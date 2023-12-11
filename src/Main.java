import DataStructures.ArrayQueue;
import DataStructures.ArrayStack;
import Graphs.DepthFirstSearch;
import Graphs.Graph;
import SearchAndSort.*;
import TreesAndTables.BinarySearchTree;

import java.util.Arrays;
import java.util.Random;

import static Graphs.Graph.degree;

public class Main {
    public static void main(String[] args) {

        //testSorting();
        //testArrayQueue();
        //testArrayStack();
        //testBST();
        testGraph();

    }

    private static void testGraph(){

        Graph g = new Graph(10);
        g.addEdge(0,1);
        g.addEdge(0,5);
        g.addEdge(1,8);
        g.addEdge(1,9);
        g.addEdge(2,3);
        g.addEdge(2,5);
        g.addEdge(2,9);
        g.addEdge(3,5);
        g.addEdge(3,1);
        g.addEdge(4,9);
        g.addEdge(5,8);
        g.addEdge(6,9);
        g.addEdge(6,1);
        g.addEdge(7,1);
        g.addEdge(8,8);
        g.addEdge(9,4);
        g.addEdge(9,0);
        System.out.println(g.toString());

        DepthFirstSearch dfs = new DepthFirstSearch(g, 2);
        System.out.println(dfs.hasPathTo(1));
        System.out.println(dfs.pathTo(1));
    }

    private static void testBST(){

        BinarySearchTree bst = new BinarySearchTree();
        System.out.println("bst count: "+bst.size());
        bst.put(1,6);
        bst.put(2,5);
        bst.put(3,4);
        bst.put(4,3);
        bst.put(5,2);
        bst.put(6,1);
        System.out.println("bst count: "+bst.size());

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