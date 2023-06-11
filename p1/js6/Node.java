package js6;

public class Node {
    String item;
    Node next;
    Node prev;

    public Node(String item) {
        this.item = item;
        this.next = null;
        this.prev = null;
    }

    public void tampil() {
        System.out.print(item + " ");
    }
}