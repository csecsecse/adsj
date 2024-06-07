import java.util.*;

public class MaxHeapPriorityQueueExample {
    public static void main(String[] args) {
        // Creating a max heap using a custom comparator
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // Inserting elements into the max heap
        maxHeap.add(10);
        maxHeap.add(30);
        maxHeap.add(20);
        maxHeap.add(5);

        // Printing the elements of the max heap
        System.out.println("Elements of the max heap:");
        while (!maxHeap.isEmpty()) {
            System.out.println(maxHeap.poll());
        }
    }
}
