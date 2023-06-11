package js7;

public class circular_linkedlist {
    public class Node {
        int data;
        Node next;
    
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    private Node head;
    private Node tail;
    private int size;
    
    public circular_linkedlist() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    
    public void isEmpty() {
        if (size == 0) {
            System.out.println("List is empty");
        } else {
            System.out.println("List is not empty");
        }
    }
    
    public void tambahNodeAwal(int data) {
        System.out.println("Tambah node " + data + " di awal");
        Node n = new Node(data);
    
        if (size == 0) {
            head = n;
            tail = n;
            n.next = head;
        } else {
            Node temp = head;
            n.next = temp;
            head = n;
            tail.next = head;
        }
        size++;
    }
    
    public void tambahNodeAkhir(int data) {
        if (size == 0) {
            tambahNodeAwal(data);
        } else {
            Node n = new Node(data);
            tail.next = n;
            tail = n;
            tail.next = head;
            size++;
        }
        System.out.println("\nNode " + data + " is added at the end of the list");
    }
    
    public void addAfter(int value, int position) {
        if (position < 0 || position > size) {
            throw new IllegalArgumentException("Invalid position");
        }
    
        Node newNode = new Node(value);
        Node tempNode = head;
    
        for (int i = 0; i < position; i++) {
            tempNode = tempNode.next;
        }
    
        newNode.next = tempNode.next;
        tempNode.next = newNode;
    
        if (tempNode == tail) {
            tail = newNode;
        }
    
        size++;
        System.out.println("Node " + value + " is added after position " + position);
    }
    
    public void traverse() {
        System.out.print("Circular Linked List:");
    
        if (size <= 0) {
            System.out.print(" List is empty");
        } else {
            Node temp = head;
            do {
                System.out.print(" " + temp.data);
                temp = temp.next;
            } while (temp != head);
        }
    
        System.out.println();
    }

        public static void main(String[] args) {
            circular_linkedlist circularLinkedList = new circular_linkedlist();
            
            circularLinkedList.isEmpty(); 
            circularLinkedList.tambahNodeAwal(2); 
            circularLinkedList.tambahNodeAwal(3); 
            circularLinkedList.tambahNodeAkhir(5); 
            circularLinkedList.traverse(); 
            circularLinkedList.addAfter(10, 1); 
            circularLinkedList.traverse(); 
            circularLinkedList.isEmpty(); 
        }
    
    
    
    
    
}
