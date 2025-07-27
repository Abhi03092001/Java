class Node {
    String data;
    Node next;

    Node(String data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularSinglyLinkedList {
    Node head = null;
    Node tail = null;

    // Add a node to the list
    public void add(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head; // Make it circular
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head; // Keep it circular
        }
    }

    // Traverse the circular linked list
    public void traverse() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        System.out.println("Circular Singly Linked List:");
        do {
            System.out.println(current.data);
            current = current.next;
        } while (current != head);
    }

    public static void main(String[] args) {
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();

        csll.add("Apple");
        csll.add("Mango");
        csll.add("Banana");
        csll.add("Grapes");

        csll.traverse();
    }
}

