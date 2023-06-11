package algodat.p2.tugas;

import java.util.Scanner;
import java.util.Stack;

public class DecimalConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Program Konversi Desimal => Biner, Oktal & Heksadesimal\n");
        System.out.print("Masukkan nilai desimal: ");
        int decimal = input.nextInt();
        
        convertDanCetak(decimal, 2, "biner");
        convertDanCetak(decimal, 8, "oktal");
        convertDanCetak(decimal, 16, "heksadesimal");
    }
    
    public static void convertDanCetak(int decimal, int basis, String format) {
        Stack<Character> stack = new Stack<>();
        
        while (decimal > 0) {
            int sisa = decimal % basis;
            if (sisa < 10) {
                stack.push((char) (sisa + '0'));
            } else {
                stack.push((char) (sisa - 10 + 'A'));
            }
            decimal /= basis;
        }
        
        System.out.print("Hasil " + format + ": ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
        System.out.println();
    }
}
