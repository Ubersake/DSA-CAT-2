class SinglyLinkedList {
    // Node class representing each element in the linked list
    static class Node {
        int data;  // Data part of the node
        Node next; // Pointer to the next node

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head; // Head of the linked list

    // Method to insert a node at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head; // New node points to the current head
        head = newNode;      // Head now points to the new node
    }

    // Method to insert a node at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode; // If the list is empty, new node becomes the head
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next; // Traverse to the last node
        }
        current.next = newNode; // Last node points to the new node
    }

    // Method to delete a node from the beginning
    public void deleteFromBeginning() {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }
        head = head.next; // Move head to the next node
    }

    // Method to display the linked list
    public void display() {
        Node current = head;
        if (current == null) {
            System.out.println("List is empty.");
            return;
        }
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Main method to demonstrate the linked list operations
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtBeginning(5);
        list.insertAtEnd(30);

        System.out.println("Linked List after insertions:");
        list.display();

        list.deleteFromBeginning();
        System.out.println("Linked List after deleting from the beginning:");
        list.display();
    }
}