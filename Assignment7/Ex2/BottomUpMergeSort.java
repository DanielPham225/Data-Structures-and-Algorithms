package Ex2;

import java.util.LinkedList;
import java.util.Queue;

public class BottomUpMergeSort {

    // Merge 2 sorted queues
    private static Queue<Integer> merge(Queue<Integer> a, Queue<Integer> b) {
        Queue<Integer> result = new LinkedList<>();

        while (!a.isEmpty() && !b.isEmpty()) {
            if (a.peek() <= b.peek())
                result.add(a.poll());
            else
                result.add(b.poll());
        }

        // Add leftovers
        result.addAll(a);
        result.addAll(b);

        return result;
    }

    // Bottom-up merge sort
    public static Queue<Integer> mergeSort(int[] arr) {

        Queue<Queue<Integer>> bigQueue = new LinkedList<>();

        //Each item in its own queue
        for (int x : arr) {
            Queue<Integer> q = new LinkedList<>();
            q.add(x);
            bigQueue.add(q);
        }

        //Merge pairs
        while (bigQueue.size() > 1) {
            Queue<Integer> q1 = bigQueue.poll();
            Queue<Integer> q2 = bigQueue.poll();

            Queue<Integer> merged = merge(q1, q2);
            bigQueue.add(merged);
        }

        return bigQueue.poll(); // final sorted queue
    }

    public static void main(String[] args) {

        int[] data = {5, 1, 8, 3, 2, 9, 4};

        Queue<Integer> sorted = mergeSort(data);

        System.out.println("Sorted result:");
        while (!sorted.isEmpty()) {
            System.out.print(sorted.poll() + " ");
        }
    }
}

