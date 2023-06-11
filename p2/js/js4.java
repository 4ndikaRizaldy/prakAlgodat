package algodat.p2.js;

import java.util.Scanner;

class Stack1 {
    private String data[];
    private int top;

    public Stack1(int ukuran) {
        data = new String[ukuran];
        top = -1;
    }

    public void push(String datas) {
        if (!isFull()) {
            data[++top] = datas;
        } else {
            System.out.println("Kapasitas Penuh");
        }
    }

    public String pop() {
        if (isEmpty()) {
            System.out.println("Stack Kosong");
            return null;
        }
        return data[top--];
    }

    public String peek() {
        if (isEmpty()) {
            System.out.println("Stack Kosong");
            return null;
        }
        return "data terakhir = " + data[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == data.length - 1);
    }

    public void tampilkan() {
        System.out.println("---------");
        for (int i = 0; i <= top; i++) {
            System.out.println(data[i] + ",");
        }
        System.out.println("---------");
    }
}

public class js4 {
    public static void main(String[] args) {
        System.out.println("Program Stack");
        Scanner input = new Scanner(System.in);
        Stack1 st = new Stack1(5);
        boolean ulangi = true;

        while (ulangi) {
            System.out.println("\nKondisi Stack");
            st.tampilkan();

            System.out.print("\n1. Tambah Data (push)\n2. Hapus Data (pop)\n3. peek\n4. Stop\nPilih = ");
            int pilih = input.nextInt();
            String data;

            switch (pilih) {
                case 1:
                    System.out.print("\nMasukkan Data : ");
                    data = input.next();
                    st.push(data);
                    System.out.println("");
                    break;
                case 2:
                    st.pop();
                    System.out.println("");
                    break;
                case 3:
                    System.out.println(st.peek());
                    System.out.println("");
                    break;
                case 4:
                    ulangi = false;
                    break;
                default:
                    System.out.println("Wrong input");
                    break;
            }
        }
    }
}
