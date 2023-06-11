package algodat.p4.js;

import java.util.Arrays;
import java.util.Random;

public class BinarySearch {
    public static void main(String[] args) {
        int[] data = generateRandomData(14); // Menghasilkan 14 data acak
        Arrays.sort(data); // Mengurutkan data secara ascending
        System.out.println("Data:");
        System.out.println(Arrays.toString(data));
        
        int target = 50; // Nilai yang ingin dicari
        int index = binarySearch(data, target); // Melakukan binary search
        
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
    
    // Fungsi untuk melakukan Binary Search (versi rekursif)
    public static int binarySearch(int[] data, int target) {
        int low = 0;
        int high = data.length - 1;
        
        return binarySearchRecursive(data, target, low, high);
    }
    
    private static int binarySearchRecursive(int[] data, int target, int low, int high) {
        if (low > high) {
            return -1; // Basis: Nilai tidak ditemukan
        }
        
        int mid = (low + high) / 2;
        if (data[mid] == target) {
            return mid; // Basis: Nilai ditemukan pada index mid
        } else if (data[mid] < target) {
            return binarySearchRecursive(data, target, mid + 1, high); // Pencarian pada bagian kanan mid
        } else {
            return binarySearchRecursive(data, target, low, mid - 1); // Pencarian pada bagian kiri mid
        }
    }
}
