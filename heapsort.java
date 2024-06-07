import java.util.*;

public class HeapSort {
    public static void heapSort(int[] array) {
        // Create a max heap using a custom comparator
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // Insert all elements of the array into the max heap
        for (int num : array) {
            maxHeap.add(num);
        }

        // Extract elements from the max heap and put them back into the array
        for (int i = 0; i < array.length; i++) {
            array[i] = maxHeap.poll();
        }
    }

    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7};

        System.out.println("Original array: " + Arrays.toString(array));

        heapSort(array);

        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}
