class SinglyLinkedList {
    class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node head;

    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
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
        temp.next = newNode;
    }

    void deleteAtBeginning() {
        if (head == null)
            return;
        head = head.next;
    }

    void deleteAtEnd() {
        if (head == null)
            return;
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null)
            temp = temp.next;
        temp.next = null;
    }

    void deleteAtPosition(int pos) {
        if (head == null)
            return;
        if (pos == 1) {
            deleteAtBeginning();
            return;
        }
        Node temp = head;
        for (int i = 1; i < pos - 1 && temp.next != null; i++)
            temp = temp.next;
        if (temp.next == null)
            return;
        temp.next = temp.next.next;
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
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.insertAtBeginning(10);
        sll.insertAtEnd(20);
        sll.insertAtPosition(15, 2);
        sll.insertAtPosition(5, 1);
        sll.insertAtEnd(25);
        sll.display();
        sll.deleteAtBeginning();
        sll.display();
        sll.deleteAtEnd();
        sll.display();
        sll.deleteAtPosition(2);
        sll.display();
    }
}
