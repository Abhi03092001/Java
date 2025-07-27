public class day14task10 {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    // Constructor
    public day14task10(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Add element to the queue
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + value);
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = value;
        size++;
        System.out.println("Enqueued: " + value);
    }

    // Remove element from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int value = queue[front];
        front = (front + 1) % capacity;
        size--;
        System.out.println("Dequeued: " + value);
        return value;
    }

    // Peek at the front element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        return queue[front];
    }

    // Display all elements in the queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity;
            System.out.print(queue[index] + " ");
        }
        System.out.println();
    }

    // Main method to test the queue
    public static void main(String[] args) {
        day14task10 q = new day14task10(5);

        System.out.println("Is empty? " + q.isEmpty());
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60); // Should not add

        System.out.println("Is full? " + q.isFull());
        q.display();

        System.out.println("Front element (peek): " + q.peek());

        q.dequeue();
        q.dequeue();
        q.display();

        System.out.println("Is empty? " + q.isEmpty());
        System.out.println("Is full? " + q.isFull());
    }
}
