package Ex3;

public class RecursiveHeap {

    private int[] heap;
    private int size;

    public RecursiveHeap(int capacity) {
        heap = new int[capacity];
        size = 0;
    }

    private int parent(int i) {
        return (i - 1) / 2;
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    // Insert new key
    public void insert(int value) {
        heap[size] = value;
        upheap(size);
        size++;
    }

    private void upheap(int i) {

        // Base case
        if (i == 0) return;

        int p = parent(i);

        if (heap[i] >= heap[p]) return;

        //swap with parent
        swap(i, p);

        upheap(p);
    }

    // Test
    public static void main(String[] args) {
        RecursiveHeap h = new RecursiveHeap(20);

        h.insert(30);
        h.insert(20);
        h.insert(10);
        h.insert(25);
        h.insert(5);

        System.out.println("Root = " + h.heap[0]);
    }
}

