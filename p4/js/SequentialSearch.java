package algodat.p4.js;

import java.util.Arrays;
import java.util.Random;

public class SequentialSearch {
    public static void main(String[] args) {
        int[] data = generateRandomData(14);
        System.out.println("Data:");
        System.out.println(Arrays.toString(data));
        
        int target = 10; // Nilai yang ingin dicari
        int index = sequentialSearch(data, target); // Melakukan sequential search
        
        if (index != -1) {
            System.out.println("Nilai " + target + " ditemukan pada index " + index);
        } else {
            System.out.println("Nilai " + target + " tidak ditemukan dalam data");
        }
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
    
    // Fungsi untuk melakukan Sequential Search
    public static int sequentialSearch(int[] data, int target) {
        int n = data.length;
        
        for (int i = 0; i < n; i++) {
            if (data[i] == target) {
                System.out.println("Mengecek index " + i); // Menampilkan index yang sedang diperiksa
                return i; // Nilai ditemukan, mengembalikan index
            }
        }
        
        return -1; // Nilai tidak ditemukan
    }
}
