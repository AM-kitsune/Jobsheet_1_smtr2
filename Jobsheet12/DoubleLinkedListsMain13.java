import java.util.Scanner;
public class DoubleLinkedListsMain13 {
    public static Mahasiswa13 inputMahasiswa(Scanner scan) {
        System.out.print("Masukkan NIM: ");
        String nim = scan.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scan.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = scan.nextLine();
        System.out.print("Masukkan IPK: ");
        double ipk = scan.nextDouble();
        return new Mahasiswa13(nim, nama, kelas, ipk);
    }
    public static void main(String[] args) {
        DoublelinkedLists13 list = new DoublelinkedLists13();
        Scanner scan = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nMenu Double Linked List Mahasiswa");
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah di akhir");
            System.out.println("3. Hapus di awal");
            System.out.println("4. Hapus di akhir");
            System.out.println("5. Tampilkan data");
            System.out.println("6. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("7. Tambah data  setelah NIM");
            System.out.println("0. keluar");
            System.out.print("Pilih menu: ");
            pilihan = scan.nextInt();
            scan.nextLine();
            switch (pilihan) {
                case 1:
                    Mahasiswa13 mhs = inputMahasiswa(scan);
                    list.addFirst(mhs);
                    break;
                case 2:
                    Mahasiswa13 mhs1 = inputMahasiswa(scan);
                    list.addLast(mhs1);
                    break;
                case 3:
                    list.removeFirst();
                    break;
                case 4:
                    list.removeLast();
                    break;
                case 5:
                    list.print();
                    break;
                case 6:
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nim = scan.nextLine()
                    ;
                    Node13 found = list.search(nim);
                    if (found != null) {
                        System.out.println("Data ditemukan: ");
                        found.data.tampil();
                    }else {
                        System.out.println("Data tidak ditemukan");
                    }
                    break;
                case 7:
                    System.out.print("Masukkan NIM yang dicari: ");
                    String cariNIM = scan.nextLine();
                    Mahasiswa13 mhsNIM = inputMahasiswa(scan);
                    list.insertAfter(cariNIM, mhsNIM);
                    break;
                case 0:
                    System.out.println("Keluar dari program!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        } while (pilihan != 0);
        scan.close();
    }
}
