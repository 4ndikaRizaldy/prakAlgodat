package algodat.p4.js;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        int[] data = generateRandomData(14); // Menghasilkan 14 data acak
        System.out.println("Data sebelum diurutkan:");
        System.out.println(Arrays.toString(data));
        
        selectionSort(data); // Mengurutkan data menggunakan Selection Sort
        
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
    
    // Fungsi untuk mengurutkan data menggunakan Selection Sort
    public static void selectionSort(int[] data) {
        int n = data.length;
        
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            
            // Cari elemen terkecil pada subarray yang belum diurutkan
            for (int j = i + 1; j < n; j++) {
                if (data[j] < data[minIndex]) {
                    minIndex = j;
                }
            }
            
            // Tukar posisi elemen terkecil dengan elemen pertama pada subarray yang belum diurutkan
            int temp = data[minIndex];
            data[minIndex] = data[i];
            data[i] = temp;
        }
    }
}
