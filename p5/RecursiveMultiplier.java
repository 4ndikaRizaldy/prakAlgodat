package algodat.p5;

import java.util.Scanner;

public class RecursiveMultiplier {
    public static int rekursif(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * rekursif(n - 1);
        }
    }

    public static int multiply(int a, int b) {
        return a * rekursif(b);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan a : ");
        int a = input.nextInt();
        System.out.print("Masukkan b : ");
        int b = input.nextInt();
        int result = multiply(a, b);
        System.out.println("Hasil Perkalian Bilangan "+ a + " * " + b + " = " + result);
    }
}a
