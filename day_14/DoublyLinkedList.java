class DoublyLinkedList {
    class Node {
        int data;
        Node prev, next;
        Node(int d) {
            data = d;
        }
    }

    Node head;

    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        if (head != null)
            head.prev = newNode;
        head = newNode;
    }

    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
    }

    void insertAtPosition(int data, int pos) {
        if (pos == 1) {
            insertAtBeginning(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++)
            temp = temp.next;
        if (temp == null)
            return;
        newNode.next = temp.next;
        if (temp.next != null)
            temp.next.prev = newNode;
        temp.next = newNode;
        newNode.prev = temp;
    }

    void deleteAtBeginning() {
        if (head == null)
            return;
        head = head.next;
        if (head != null)
            head.prev = null;
    }

    void deleteAtEnd() {
        if (head == null)
            return;
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.prev.next = null;
    }

    void deleteAtPosition(int pos) {
        if (head == null)
            return;
        if (pos == 1) {
            deleteAtBeginning();
            return;
        }
        Node temp = head;
        for (int i = 1; i < pos && temp != null; i++)
            temp = temp.next;
        if (temp == null)
            return;
        if (temp.prev != null)
            temp.prev.next = temp.next;
        if (temp.next != null)
            temp.next.prev = temp.prev;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtBeginning(10);
        dll.insertAtEnd(20);
        dll.insertAtPosition(15, 2);
        dll.insertAtPosition(5, 1);
        dll.insertAtEnd(25);
        dll.display();
        dll.deleteAtBeginning();
        dll.display();
        dll.deleteAtEnd();
        dll.display();
        dll.deleteAtPosition(2);
        dll.display();
    }
}
