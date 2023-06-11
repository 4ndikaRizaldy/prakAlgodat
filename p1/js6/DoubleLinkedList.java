package js6;
import js6.Node;

public class DoubleLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public DoubleLinkedList() {
        size = 0;
        this.head = null;
        this.tail = null;
        
    }

    public void insertNode(String item) {
        Node node = new Node(item);
        node.next = null;

        if (this.head == null) {
            this.head = node;
            this.tail = node;
            this.tail.next = null;
            this.tail.prev = null;
            this.size = 1;
        } else {
            Node prev = this.tail;
            this.tail.next = node;
            this.tail = node;
            this.tail.prev = prev;
            this.size++;
        }
    }

    public void insertFirst(String item) {
        Node node = new Node(item);
        node.next = this.head;
        this.head.prev = node;
        this.head = node;
        this.size++;
    }

    public void insertLast(String item) {
        Node node = new Node(item);
        node.next = null;

        if (this.head == null) {
            this.head = node;
            this.tail = node;
            this.tail.next = null;
            this.tail.prev = null;
            this.size = 1;
        } else {
            Node prev = this.tail;
            this.tail.next = node;
            this.tail = node;
            this.tail.prev = prev;
            this.size++;
        }
    }

    public void deleteFirstNode() {
        if (head != null) {
            this.head = this.head.next;
            this.head.prev = null;
            this.size--;
        } else {
            System.out.println("Linked list is empty");
        }
    }

    public void deleteLastNode() {
        if (tail != null) {
            this.tail = this.tail.prev;
            this.tail.next = null;
            this.size--;
        }
    }

    public void deleteNthNode(int position) {
        if (position < 1 || position > size) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 1) {
            deleteFirstNode();
            return;
        }

        if (position == size) {
            deleteLastNode();
            return;
        }

        Node curr = head;
        for (int i = 1; i < position; i++) {
            curr = curr.next;
        }

        curr.prev.next = curr.next;
        curr.next.prev = curr.prev;
        this.size--;
    }

    public void insertNth(String item, int position) {
        if (position < 1 || position > size + 1) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 1) {
            insertFirst(item);
            return;
        }

        if (position == size + 1) {
            insertLast(item);
            return;
        }

        Node newNode = new Node(item);
        Node curr = head;
        for (int i = 1; i < position - 1; i++) {
            curr = curr.next;
        }

        newNode.next = curr.next;
        newNode.prev = curr;
        curr.next.prev = newNode;
        curr.next = newNode;
        this.size++;
    }

    public void tampil() {
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.item);
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        DoubleLinkedList dlist = new DoubleLinkedList();

        dlist.insertNode("Andika");
        dlist.insertNode("Rizaldy");
        dlist.insertNode("Teknik Elektro");
        dlist.insertFirst("Universitas Mataram");
        dlist.insertLast("Narmada");

        dlist.tampil();
        dlist.deleteFirstNode();
        dlist.deleteNthNode(2);
        int center = (int) Math.floor(dlist.size / 2);
        dlist.insertNth("JAKARTA", center);
        dlist.tampil();
    }
}
