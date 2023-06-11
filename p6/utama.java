package algodat.p6;

import java.util.Scanner;

class BinaryTree {
    public Node Root;

    public void AddNode(Node node) {
        if (Root == null) {
            Root = node;
        } else {
            InputNode(Root, node);
        }
    }

    public void InputNode(Node Parent, Node node) {
        if (Parent.GetData() > node.GetData()) {
            if (Parent.SisiKiri == null) {
                Parent.SisiKiri = node;
            } else {
                InputNode(Parent.SisiKiri, node);
            }
        } else {
            if (Parent.SisiKanan == null) {
                Parent.SisiKanan = node;
            } else {
                InputNode(Parent.SisiKanan, node);
            }
        }
    }

    public static boolean CariData(Node Root, int data) {
        if (Root == null) {
            return false;
        } else {
            if (Root.GetData() == data) {
                return true;
            } else if (Root.GetData() > data) {
                return CariData(Root.SisiKiri, data);
            } else {
                return CariData(Root.SisiKanan, data);
            }
        }
    }
}

class Node {
    private int data;
    public Node SisiKiri;
    public Node SisiKanan;

    Node(int data) {
        this.data = data;
    }

    public int GetData() {
        return data;
    }
}

public class utama {
    public static void main(String[] args) {
        BinaryTree ob1 = new BinaryTree();
        Scanner in = new Scanner(System.in);
        System.out.print("Menu\n1.Input\n2.Cari\n3.Exit\nMasukkan Pilihan : ");
        int inputan = in.nextInt();
        while (inputan != 3) {
            if (inputan == 1) {
                Scanner inp = new Scanner(System.in);
                System.out.print("Inputkan Nilai : ");
                int nilai = inp.nextInt();
                ob1.AddNode(new Node(nilai));
                System.out.println(nilai + ", berhasil dimasukkan ke dalam tree");
                System.out.print("Masukkan Pilihan : ");
                inputan = in.nextInt();
            } else if (inputan == 2) {
                Scanner inp2 = new Scanner(System.in);
                System.out.print("Masukkan nilai yang akan dicari : ");
                int p2 = inp2.nextInt();
                if (BinaryTree.CariData(ob1.Root, p2) == true) {
                    System.out.println(p2 + " ada pada tree");
                } else if (BinaryTree.CariData(ob1.Root, p2) == false) {
                    System.out.println(p2 + " tidak ada dalam tree");
                }
                System.out.println("");
                System.out.print("Masukkan Pilihan : ");
                inputan = in.nextInt();
            }
        }
        System.out.println("Terima Kasih");
    }
}