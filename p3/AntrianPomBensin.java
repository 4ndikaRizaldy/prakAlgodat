import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AntrianPomBensin {
    private static Queue<String> antrian = new LinkedList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("===============================");
            System.out.println("Pilih operasi yang ingin dilakukan:");
            System.out.println("1. Tambah pelanggan ke antrian");
            System.out.println("2. Panggil pelanggan");
            System.out.println("3. Tampilkan isi antrian");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    scanner.nextLine();
                    System.out.print("Masukkan nama pelanggan: ");
                    String pelanggan = scanner.nextLine();
                    antrian.add(pelanggan);
                    System.out.println("Pelanggan " + pelanggan + " ditambahkan ke antrian.");
                    break;
                case 2:
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian kosong.");
                    } else {
                        String pelangganDilayani = antrian.poll();
                        System.out.println("Melayani pelanggan: " + pelangganDilayani);
                    }
                    break;
                case 3:
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian kosong.");
                    } else {
                        System.out.println("Isi antrian saat ini:");
                        for (String pel : antrian) {
                            System.out.println(pel);
                        }
                    }
                    break;
                case 0:
                    System.out.println("Terima kasih, program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 0);
    }
}
