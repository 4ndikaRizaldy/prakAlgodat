import java.util.ArrayList;
import java.util.Scanner;

public class js3 {
    ArrayList<String> array = new ArrayList<>();

    public void data() {
        array.add("Andika Rizaldy");
        array.add("F1B019024");
        array.add("22");
        array.add("Teknik elektro");
        array.add("Narmada");
    }

    public void tampil() {
        System.out.println("Data Array: " + array);
    }

    public void scan() {
        System.out.print("Masukkan indeks yang akan diedit: ");
        Scanner scan = new Scanner(System.in);
        int search = scan.nextInt();
        cari(search);
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
            edit(cari);
        } else {
            System.out.println("Data tidak Ditemukan");
            scan();
        }
    }

    public void edit(int edit) {
        Scanner upgrade = new Scanner(System.in);
        System.out.print("Masukkan data baru: ");
        String upg = upgrade.nextLine();
        int i = edit;

        if (i == edit) {
            array.set(i, upg);
        }
    }

    public static void main(String[] args) {
        js3 a = new js3();
        a.data();
        a.tampil();
        System.out.println();
        a.scan();
        a.tampil();
    }
}
