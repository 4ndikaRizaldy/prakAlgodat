package algodat.p2.js;

import java.util.Scanner;

class StackApp {
    private String[] arr;
    private int top;

    public StackApp(int ukuran) {
        arr = new String[ukuran];
        top = -1;
    }

    public void push(String data) {
        if (top < arr.length) {
            arr[++top] = data;
        } else {
            System.out.println("Kapasitas Penuh");
        }
    }

    public String pop() {
        if (top >= 0) {
            return arr[top--];
        } else {
            System.out.println("Stack Kosong");
            return null;
        }
    }

    public void tampilkan() {
        System.out.println("---------");
        for (int i = 0; i <= top; i++) {
            System.out.println(arr[i] + ",");
        }
        System.out.println("---------");
    }
}

public class js2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StackApp st = new StackApp(5);
        boolean ulangi = true;

        while (ulangi) {
            System.out.println("Kondisi Stack");
            st.tampilkan();
            System.out.println("Program Stack");
            System.out.print("\n1. Tambah Data (push)\n2. Hapus Data (pop)\n3. Stop\nPilih = ");
            int pilih = input.nextInt();
            String data;

            switch (pilih) {
                case 1:
                    System.out.print("\nMasukkan Data: ");
                    data = input.next();
                    st.push(data);
                    System.out.println("");
                    break;
                case 2:
                    st.pop();
                    System.out.println("");
                    break;
                case 3:
                    ulangi = false;
                    break;
                default:
                    System.out.println("Wrong input");
                    break;
            }
        }
    }
}
