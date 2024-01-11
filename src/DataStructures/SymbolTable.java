package DataStructures;

import SearchAndSort.BinarySearch;

public class SymbolTable {

    private int[] storage;

    public SymbolTable(int size) {
        this.storage = new int[size];
    }

    public void put(int key, int value) {
        this.storage[key] = value;
    }

    public int get(int key) {
        int i = rank(key, this.storage);
        if (i != 0 && key == this.storage[i]) {
            return this.storage[i];
        } else {
            return 0;
        }
    }

    public boolean contains(int key) {
        return get(key) != 0;
    }

    // Implemented as lazy deletion
    public void delete(int key) {
        put(key, 0);
    }


    private int rank(int key, int[] storage) {

        int lo = 0;
        int mid;
        int hi = this.storage.length - 1;

        return BinarySearch.search(this.storage, key);
    }


}
