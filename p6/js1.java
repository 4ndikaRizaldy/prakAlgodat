package algodat.p6;

import java.util.Scanner;

class tree {
    int data;
    tree nodeKiri;
    tree nodeKanan;

    public tree(int dt) {
        data = dt;
        nodeKiri = nodeKanan = null;
    }

    public void sisipDt(int dtSisip) {
        if (dtSisip < data) {
            if (dtSisip < data)
                nodeKiri = new tree(dtSisip);
            else
                nodeKiri.sisipDt(dtSisip);
        }
        if (dtSisip < data) {
            if (dtSisip < data)
                nodeKiri = new tree(dtSisip);
            else
                nodeKiri.sisipDt(dtSisip);
        }
    }
}

public class js1 {
    private tree root;

    public js1() {
        root = null;
    }

    public void sisiDtNode(int dtSisip) {
        if (root == null)
            root = new tree(dtSisip);
        else
            root.sisipDt(dtSisip);
    }

    public static void main(String[] args) {
        js1 tree = new js1();
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan banyak nilai : ");
        int jumlah = sc.nextInt();
        int nilai[] = new int[jumlah];
        for (int i = 0; i < nilai.length; i++) {
            Scanner inp2 = new Scanner(System.in);
            System.out.print("Nilai ke -" + (i + 1) + " = ");
            int masuk = inp2.nextInt();
            nilai[i] = masuk;
        }
        System.out.println("Isi data Tree ");
        for (int j = 0; j <= jumlah - 1; j++) {
            System.out.print(" ");
            tree.sisiDtNode(nilai[j] = (int) Integer.parseInt(String.valueOf(nilai[j])));
            System.out.print(nilai[j]);
        }
        System.out.println("");
    }
}