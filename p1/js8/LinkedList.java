package js8;

public class LinkedList {
    protected Node start;
    protected Node end;
    public int size;
    
    public LinkedList() {
        start = null;
        end = null;
        size = 0;
    }
    
    public boolean isEmpty() {
        return start == null;
    }

    public int getSize(){ 
        return size;
    }
    
    public void insertAtStart(int nilai) {
        Node data = new Node(nilai, null, null);
        
        if (start == null) {
            data.setNext(data);
            data.setPrev(data);
            start = data;
            end = start;
        } else {
            data.setPrev(end);
            end.setNext(data);
            start.setPrev(data);
            data.setNext(start);
        }
        
        start = data;
        size++;
    }

    public void insertAtEnd(int nilai) {
        Node data = new Node(nilai, null, null);
        if (start == null) {
            data.setNext(data);
            data.setPrev(data);
            start = data;
            end = start;
        } else {
            data.setPrev(end);
            end.setNext(data);
            start.setPrev(data);
            data.setNext(start);
            end = data;
        }
        size++;
    }

    public void insertAtPos(int nilai, int pos) {
        Node data = new Node(nilai, null, null);
        if (pos == 1) {
            insertAtStart(nilai);
            return;
        }
        Node ptr = start;
        for (int i=2; i<=size; i++) {
            if (i == pos) {
                Node tmp = ptr.getNext();
                ptr.setNext(data);
                data.setPrev(ptr);
                data.setNext(tmp);
                tmp.setPrev(data);
            }
            ptr = ptr.getNext();
        }
        size++;
    }
    
    public void deleteAtPos(int pos) {
        if (pos == 1) {
            if (size == 1) {
                start = null;
                end = null;
                size = 0;
                return;
            }
            start = start.getNext();
            start.setPrev(end);
            end.setNext(start);
            size--;
            return;
        }
        if (pos == size) {
            end = end.getPrev();
            end.setNext(start);
            start.setPrev(end);
            size--;
        }
        Node ptr = start.getNext();
        for (int i=2; i<=size; i++) {
            if (i == pos) {
                Node prev = ptr.getPrev();
                Node next = ptr.getNext();
                
                prev.setNext(next);
                next.setPrev(prev);
                size--;
                return;
            }
            ptr = ptr.getNext();
        }
    }
    

    public void display() {
        System.out.print("\nDouble Circular Linked List = ");
        Node ptr = start;
        if (size == 0) {
            System.out.print("kosong\n");
            return;
        }
        if (start.getNext() == start) {
            System.out.print(start.getData() + "<->" + ptr.getData() + "\n");
            return;
        }
        System.out.print(start.getData() + " <-> ");
        ptr = start.getNext();
        while (ptr.getNext() != start) {
            System.out.print(ptr.getData() + " <-> ");
            ptr = ptr.getNext();
        }
        System.out.print(ptr.getData() + " <-> ");
        ptr = ptr.getNext();
        System.out.print(ptr.getData() + "\n");
    }
    
}

