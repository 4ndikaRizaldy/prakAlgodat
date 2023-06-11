package algodat.p6;

import java.util.Scanner;

class Node {
    private int info;
    Node kanan;
    Node kiri;

    public Node() {
        kanan = null;
        kiri = null;
        info = 0;
    }

    public Node(int data) {
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

    public static void PostOrder(Node root) {
        if (root == null)
            return;
        PostOrder(root.kiri);
        PostOrder(root.kanan);
        System.out.print(root.getData() + " ");
    }
}

public class MainTree{
    public static void main(String[] args) {
        Tree2 tr = new Tree2();
        Scanner in = new Scanner(System.in);
        System.out.print("Menu\n1.Input\n2.Tampil\n3.Exit\nMasukkan Pilihan : ");
        int inputan = in.nextInt();
        while (inputan != 3) {
            if (inputan == 1) {
                Scanner inp = new Scanner(System.in);
                System.out.print("Inputkan Nilai : ");
                int nilai = inp.nextInt();
                tr.add(nilai);
                System.out.println(nilai + ", berhasil diMasukkan ke dalam tree");
                System.out.print("Masukkan Pilihan : ");
                inputan = in.nextInt();
            } else if (inputan == 2) {
                System.out.print("PostOrder: ");
                Tree2.PostOrder(tr.root);
                System.out.println("");
                System.out.print("Masukkan Pilihan : ");
                inputan = in.nextInt();
            }
        }System.out.println("Terima kasih");
    }
}