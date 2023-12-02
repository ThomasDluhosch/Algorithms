package DataStructures;

//

import java.util.Arrays;

public class ArrayStack {

    private int[] stack;
    private int maxSize;
    private int currentSize;

    public ArrayStack(int size) {
        this.stack = new int[size];
        this.maxSize = size;
        this.currentSize = 0;
    }

    public void push(int item) {
        if (currentSize == maxSize)
            resize(maxSize * 2);
        this.stack[currentSize] = item;
        currentSize++;
    }

    public int pop() {
        currentSize--;
        int item = this.stack[currentSize];
        this.stack[currentSize] = 0;
        if (currentSize > 0 && currentSize < maxSize / 4)
            resize(maxSize / 2);
        return item;
    }

    public void getValues() {
        System.out.println(Arrays.toString(this.stack));
    }

    private void resize(int length) {
        int[] newArray = new int[length];
        System.arraycopy(stack, 0, newArray, 0, currentSize);
        stack = newArray;
        maxSize = length;
    }
}