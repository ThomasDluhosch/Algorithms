package TreesAndTables;

public class BinarySearchTree {

    private Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    public int size() {
        return size(this.root);
    }

    private int size(Node n){
        if(n == null)
            return -1;
        return n.count;
    }

    public void put(int key, int value) {
        this.put(this.root, key, value);
    }

    private Node put(Node n, int key, int value) {
        if (n == null) {
            n = new Node(key, value);
            return n;
        }
        else if (key < n.key)
            put(n.left, key, value);
        else if (key > n.key)
            put(n.right, key, value);
        else
            n.value = value;
        n.count = 1 + size(n.left) + size(n.right);
        return n;
    }

    public int get(int key) {
        Node n = this.root;
        while (n != null) {
            if (key < n.key)
                n = n.left;
            else if (key > n.key)
                n = n.right;
            else
                return n.value;
        }
        return -1;
    }





    private static class Node {
        private int key;
        private int value;
        private Node left;
        private Node right;
        private int count = 0;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
            this.count = 1;
        }
    }


}
