package algodat.p4;

import java.util.Scanner;

public class SortingProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah data: ");
        int jumlahData = input.nextInt();

        int[] dataSelectionSort = new int[jumlahData];
        int[] dataInsertionSort = new int[jumlahData];

        System.out.println("Masukkan data:");
        for (int i = 0; i < jumlahData; i++) {
            System.out.print("Data ke-" + (i + 1) + ": ");
            int data = input.nextInt();
            dataSelectionSort[i] = data;
            dataInsertionSort[i] = data;
        }

        System.out.println("\nMetode Selection Sort:");
        selectionSort(dataSelectionSort.clone());

        System.out.println("\nMetode Insertion Sort:");
        insertionSort(dataInsertionSort.clone());
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Tukar posisi elemen
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

            // Tampilkan langkah-langkah
            printArray(arr);
        }
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;

            // Tampilkan langkah-langkah
            printArray(arr);
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
