import java.util.LinkedList;

public class GenericQueue<T> {
    private LinkedList<T> list = new LinkedList<>();

    // Check if the queue is empty
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Get the size of the queue
    public int getSize() {
        return list.size();
    }

    // Enqueue operation
    public void enqueue(T data) {
        list.addLast(data);
    }

    // Dequeue operation
    public T dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return list.removeFirst();
    }

    // Peek operation (get the front element without removing it)
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return list.getFirst();
    }

    public static void main(String[] args) {
        GenericQueue<Integer> queue = new GenericQueue<>();
        
        // Enqueue elements
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        
        // Display size of the queue
        System.out.println("Queue size: " + queue.getSize()); // Output: Queue size: 3
        
        // Peek the front element
        System.out.println("Front element: " + queue.peek()); // Output: Front element: 1
        
        // Dequeue elements
        System.out.println("Dequeued: " + queue.dequeue()); // Output: Dequeued: 1
        System.out.println("Dequeued: " + queue.dequeue()); // Output: Dequeued: 2
        
        // Display size of the queue
        System.out.println("Queue size: " + queue.getSize()); // Output: Queue size: 1
    }
}
