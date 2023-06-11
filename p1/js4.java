import java.util.ArrayList;
import java.util.Scanner;

public class js4 {
    String nama, nim, umur, jurusan, alamat;
    ArrayList<String> array = new ArrayList<>();

    public void data() {
        Scanner tambah = new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        nama = tambah.nextLine();
        System.out.print("Masukkan nim: ");
        nim = tambah.nextLine();
        System.out.print("Masukkan umur: ");
        umur = tambah.nextLine();
        System.out.print("Masukkan jurusan: ");
        jurusan = tambah.nextLine();
        System.out.print("Masukkan alamat: ");
        alamat = tambah.nextLine();

        array.add(nama);
        array.add(nim);
        array.add(umur);
        array.add(jurusan);
        array.add(alamat);
    }

    public void tampil() {
        System.out.println("Hasil Array: " + array);
    }

    public void cari(int cari) {
        boolean find = false;
        for (int i = 0; i < array.size(); i++) {
            if (i == cari) {
                find = true;
            }
        }

        if (find) {
            System.out.println("Hasil Pencarian: " + array.get(cari));
            hapus(cari);
        } else {
            System.out.println("Data tidak Ditemukan");
        }
    }

    public void hapus(int hapus) {
        array.remove(hapus);
        System.out.println("Anda Berhasil Menghapus data array pada indeks " + hapus);
        tampil();

        Scanner question = new Scanner(System.in);
        System.out.print("Apakah anda ingin menambah data yang sudah dihapus? (y/n): ");
        String sure = question.nextLine();
        int i = hapus;

        if ("Y".equalsIgnoreCase(sure)) {
            Scanner tambah = new Scanner(System.in);
            System.out.print("Masukkan data: ");
            String tbh = tambah.nextLine();
            array.add(i, tbh);
        } else if ("N".equalsIgnoreCase(sure)) {
            System.out.println("Batal");
        }
    }

    public static void main(String[] args) {
        js4 a = new js4();
        a.data();
        a.tampil();
        System.out.println();
        System.out.print("Masukkan indeks yang akan dihapus: ");
        Scanner scan = new Scanner(System.in);
        int search = scan.nextInt();
        a.cari(search);
        a.tampil();
    }
}
