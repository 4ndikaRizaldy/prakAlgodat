package algodat.p6;

import java.util.Scanner;

public class Node2 {
    private int info;
    Node2 kanan;
    Node2 kiri;

    public Node2() {
        kanan = null;
        kiri = null;
        info = 0;
    }

    public Node2(int data) {
        this.info = data;
        kiri = kanan = null;
    }

    public void setData(int data) {
        this.info = data;
    }

    public int getData() {
        return info;
    }
}

class Tree2 {
    Node root;

    public Tree2() {
        root = null;
    }

    public int visit() {
        return root.getData();
    }

    public void add(int nilai) {
        root = add(root, nilai);
    }

    public Node add(Node root, int nilai) {
        if (root == null) {
            root = new Node(nilai);
        } else if (root.getData() > nilai) {
            root.kiri = add(root.kiri, nilai);
        } else if (root.getData() < nilai) {
            root.kanan = add(root.kanan, nilai);
        }
        return root;
    }

    public void InOrder(Node root) {
        if (root == null)
            return;
        InOrder(root.kiri);
        System.out.print(root.getData() + " ");
        InOrder(root.kanan);
    }
}

class MainTree {
    public static void main(String[] args) {
        Tree2 tr = new Tree2();
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan banyak nilai: ");
        int jum = inp.nextInt();
        int[] nilai = new int[jum];
        for (int i = 0; i < nilai.length; i++) {
            Scanner in = new Scanner(System.in);
            System.out.print("Nilai ke-" + (i + 1) + " = ");
            int masuk = in.nextInt();
            tr.add(masuk);
        }
        System.out.print("Traversal Tree in Order: ");
        tr.InOrder(tr.root);
        System.out.print("");
    }
}
