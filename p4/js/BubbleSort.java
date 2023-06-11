package algodat.p4.js;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        int[] data = generateRandomData(14); // Menghasilkan 14 data 
        System.out.println("Data sebelum diurutkan:");
        System.out.println(Arrays.toString(data));
        
        bubbleSort(data); // Mengurutkan data menggunakan Bubble Sort
        
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
    
    // Fungsi untuk mengurutkan data menggunakan Bubble Sort
    public static void bubbleSort(int[] data) {
        int n = data.length;
        boolean swapped;
        
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            
            for (int j = 0; j < n - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    // Tukar posisi jika elemen saat ini lebih besar dari elemen berikutnya
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                    swapped = true;
                }
            }
            
            // Jika tidak ada pertukaran dalam satu iterasi, maka data sudah terurut
            if (!swapped) {
                break;
            }
        }
    }
}
