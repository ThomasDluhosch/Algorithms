package DataStructures;

// First in first out
// Wenn Array voll -> resize()

import java.util.Arrays;

public class ArrayQueue {

    private int[] queue;
    private int maxSize;
    private int currentSize;
    private int head;
    private int tail;

    public ArrayQueue(int size){
        this.queue = new int[size];
        this.maxSize = size;
        this.currentSize = 0;
        this.head = 0;
        this.tail = 0;
    }

    public void enqueue(int item){
        if(currentSize==maxSize)
            resize(maxSize*2);
        this.queue[tail] = item;
        this.tail++;
        this.currentSize++;
    }

    public int dequeue(){
        int item = this.queue[head];
        this.queue[head] = 0;
        currentSize--;
        head++;
        if(currentSize > 0 && currentSize < maxSize / 4)
            resize(maxSize/2);
        return item;
    }

    public void getValues(){
        System.out.println(Arrays.toString(this.queue));
    }

    private void resize(int length) {
        int[] newArray = new int[length];
        for (int i = 0; i < currentSize; i++) {
            newArray[i] = queue[(head + i) % maxSize];
        }
        head = 0;
        tail = currentSize;
        queue = newArray;
        maxSize = length;
    }

}