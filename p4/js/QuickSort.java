package algodat.p4.js;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
        int[] data = generateRandomData(14); // Menghasilkan 14 data acak
        System.out.println("Data sebelum diurutkan:");
        System.out.println(Arrays.toString(data));
        
        quickSort(data, 0, data.length - 1); // Mengurutkan data menggunakan Quick Sort
        
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
    
    // Fungsi untuk mengurutkan data menggunakan Quick Sort
    public static void quickSort(int[] data, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(data, low, high); // Membagi data dan mendapatkan pivot index
            
            // Panggil quickSort rekursif pada subarray sebelum dan sesudah pivot
            quickSort(data, low, pivotIndex - 1);
            quickSort(data, pivotIndex + 1, high);
        }
    }
    
    // Fungsi untuk mempartisi data dan mendapatkan pivot index
    public static int partition(int[] data, int low, int high) {
        int pivot = data[high]; // Pilih elemen terakhir sebagai pivot
        int i = low - 1;
        
        for (int j = low; j < high; j++) {
            if (data[j] < pivot) {
                i++;
                // Tukar posisi jika elemen saat ini lebih kecil dari pivot
                int temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }
        
        // Tukar posisi pivot dengan elemen di index berikutnya
        int temp = data[i + 1];
        data[i + 1] = data[high];
        data[high] = temp;
        
        return i + 1; // Mengembalikan pivot index
    }
}
