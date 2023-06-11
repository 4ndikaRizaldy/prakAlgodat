package algodat.p2.js;

import java.util.Scanner;

class StackApps {
    private String[] data;
    private int top;

    public StackApps(int ukuran) {
        data = new String[ukuran];
        top = -1;
    }

    public void push(String datas) {
        if (top < data.length) {
            data[++top] = datas;
        } else {
            System.out.println("Kapasitas Penuh");
        }
    }

    public String pop() {
        if (top >= 0) {
            return data[top--];
        } else {
            System.out.println("Stack Kosong");
            return null;
        }
    }

    public String peek() {
        if (top >= 0) {
            return "Data terakhir = " + data[top];
        } else {
            System.out.println("Stack Kosong");
            return null;
        }
    }

    public void tampilkan() {
        System.out.println("---------");
        for (int i = 0; i <= top; i++) {
            System.out.println(data[i] + ",");
        }
        System.out.println("---------");
    }
}

public class js3 {
    public static void main(String[] args) {
        System.out.println("Program Stack");
        Scanner input = new Scanner(System.in);
        StackApps st = new StackApps(5);
        boolean ulangi = true;

        while (ulangi) {
            System.out.println("\nKondisi Stack");
            st.tampilkan();
            System.out.print("\n1. Tambah Data (push)\n2. Hapus Data (pop)\n3. Peek\n4. Stop\nPilih = ");
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
