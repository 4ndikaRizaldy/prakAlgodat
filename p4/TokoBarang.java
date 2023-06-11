package algodat.p4;

import java.util.*;

class Barang {
    private String nama;
    private int harga;

    public Barang(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }
}

class TokoBarang {
    private List<Barang> daftarBarang;

    public TokoBarang() {
        daftarBarang = new ArrayList<>();
    }

    public void tambahBarang(String nama, int harga) {
        Barang barang = new Barang(nama, harga);
        daftarBarang.add(barang);
        System.out.println("Barang berhasil ditambahkan.");
    }

    public void hapusBarang(String nama) {
        for (Barang barang : daftarBarang) {
            if (barang.getNama().equalsIgnoreCase(nama)) {
                daftarBarang.remove(barang);
                System.out.println("Barang berhasil dihapus.");
                return;
            }
        }
        System.out.println("Barang tidak ditemukan.");
    }

    public void cariBarang(String nama) {
        for (Barang barang : daftarBarang) {
            if (barang.getNama().equalsIgnoreCase(nama)) {
                System.out.println("Barang ditemukan:");
                System.out.println(barang.getNama() + " (Harga: " + barang.getHarga() + ")");
                return;
            }
        }
        System.out.println("Barang tidak ditemukan.");
    }

    public void listBarangUrutkan() {
        if (daftarBarang.isEmpty()) {
            System.out.println("Toko tidak memiliki barang.");
            return;
        }

        Collections.sort(daftarBarang, new Comparator<Barang>() {
            @Override
            public int compare(Barang barang1, Barang barang2) {
                return barang1.getNama().compareTo(barang2.getNama());
            }
        });

        System.out.println("Daftar Barang:");
        for (Barang barang : daftarBarang) {
            System.out.println(barang.getNama() + " (Harga: " + barang.getHarga() + ")");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TokoBarang toko = new TokoBarang();

        int pilihan = 0;
        while (pilihan != 5) {
            System.out.println("===== MENU =====");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Hapus Barang");
            System.out.println("3. Cari Barang");
            System.out.println("4. List Barang");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 
            switch (pilihan) {
                case 1:
                    System.out.print("Nama barang: ");
                    String nama = scanner.nextLine();
                    System.out.print("Harga barang: ");
                    int harga = scanner.nextInt();
                    scanner.nextLine(); 
                    toko.tambahBarang(nama, harga);
                    break;
                case 2:
                    System.out.print("Nama barang yang akan dihapus: ");
                    String namaHapus = scanner.nextLine();
                    toko.hapusBarang(namaHapus);
                    break;
                case 3:
                    System.out.print("Nama barang yang akan dicari: ");
                    String namaCari = scanner.nextLine();
                    toko.cariBarang(namaCari);
                    break;
                case 4:
                    toko.listBarangUrutkan();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan program!");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
                    break;
            }

            System.out.println();
        }

        scanner.close();
    }
}
