package algodat.p2.js;
import java.util.Scanner;

class Stack {
    String data[];
    int top;

    public Stack(int ukuran) {
        data = new String[ukuran];
        top = -1;
    }

    public void push(String data) {
        this.data[++top] = data;
    }

    public void tampilkan() {
        System.out.print("Stack = {");
        for (int i = 0; i <= top; i++) {
            System.out.print(data[i] + ",");
        }
        System.out.print("}");
    }
}

public class js1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program memasukkan data pada stack");
        Stack st = new Stack(5);
        char ulangi;

        do {
            System.out.print("\nMasukkan data: ");
            String inputData = input.next();
            st.push(inputData);
            st.tampilkan();

            System.out.print("\nUlangi (Y/N): ");
            ulangi = input.next().charAt(0);
        } while (ulangi == 'Y' || ulangi == 'y');
    }
}
