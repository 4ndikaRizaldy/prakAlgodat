package js8;
import java.util.Scanner;

public class Double_Circular_linkedlist {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedList list = new LinkedList();
        System.out.println("Testing Double Circular Linked List\n");
        char ch;
        do {
            System.out.println("\nOperasi Double Circular Linked List\n");
            System.out.println("1. Input di awal");
            System.out.println("2. Input di akhir");
            System.out.println("3. Input di posisi tertentu");
            System.out.println("4. Hapus di posisi tertentu");
            System.out.println("5. Cek kosong atau terisi");
            System.out.println("6. Get size");
            System.out.print("Masukkan pilihan: ");
            int pilih = scan.nextInt();
    
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan nilai: ");
                    list.insertAtStart(scan.nextInt());
                    break;
                case 2:
                    System.out.print("Masukkan nilai: ");
                    list.insertAtEnd(scan.nextInt());
                    break;
                case 3:
                    System.out.print("Masukkan nilai: ");
                    int num = scan.nextInt();
                    System.out.print("Masukkan posisi: ");
                    int pos = scan.nextInt();
                    if (pos < 1 || pos > list.getSize())
                        System.out.println("Invalid position\n");
                    else
                        list.insertAtPos(num, pos);
                    break;
                case 4:
                    System.out.print("Masukkan posisi: ");
                    int p = scan.nextInt();
                    if (p < 1 || p > list.getSize())
                        System.out.println("Invalid position\n");
                    else
                        list.deleteAtPos(p);
                    break;
                case 5:
                    System.out.println("Empty status = " + list.isEmpty());
                    break;
                case 6:
                    System.out.println("Size = " + list.getSize() + "\n");
                    break;
                default:
                    System.out.println("Invalid Input\n");
                    break;
            }
            list.display();
            System.out.print("\nLanjutkan? (Masukkan y atau n): ");
            ch = scan.next().charAt(0);
        } while (ch == 'Y' || ch == 'y');
    }
    
}
