package algodat.p4.js;

import java.util.Arrays;
import java.util.Random;

public class InsertionSort {
    public static void main(String[] args) {
        int[] data = generateRandomData(14); // Menghasilkan 14 data acak
        System.out.println("Data sebelum diurutkan:");
        System.out.println(Arrays.toString(data));
        
        insertionSort(data); // Mengurutkan data menggunakan Insertion Sort
        
        System.out.println("Data setelah diurutkan:");
        System.out.println(Arrays.toString(data));
    }
    
    // Fungsi untuk menghasilkan data acak
    public static int[] generateRandomData(int n) {
        int[] data = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            data[i] = random.nextInt(100); // Menghasilkan angka acak antara 0 hingga 99
        }
        return data;
    }
    
    // Fungsi untuk mengurutkan data menggunakan Insertion Sort
    public static void insertionSort(int[] data) {
        int n = data.length;
        
        for (int i = 1; i < n; i++) {
            int key = data[i];
            int j = i - 1;
            
            // Pindahkan elemen-elemen yang lebih besar dari key ke posisi setelahnya
            while (j >= 0 && data[j] > key) {
                data[j + 1] = data[j];
                j--;
            }
            
            data[j + 1] = key;
        }
    }
}
