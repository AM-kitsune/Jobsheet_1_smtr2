import java.util.Scanner;
public class DosenMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen daftarDosen = new DataDosen();
        int pilihan;

        do {
            System.out.println("\nMENU:");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampilkan Data Dosen");
            System.out.println("3. Sorting Usia (Termuda ke Tertua - ASC)");
            System.out.println("4. Sorting Usia (Tertua ke Termuda - DSC)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode dosen: ");
                    String kode = sc.nextLine();
                    System.out.print("Masukkan nama dosen: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan jenis kelamin (true = Laki-laki, false = Perempuan): ");
                    boolean jk = sc.nextBoolean();
                    System.out.print("Masukkan usia dosen: ");
                    int usia = sc.nextInt();

                    Dosen dsn = new Dosen(kode, nama, jk, usia);
                    daftarDosen.tambah(dsn);
                    break;
                case 2:
                    daftarDosen.tampil();
                    break;
                case 3:
                    daftarDosen.sortingASC();
                    break;
                case 4:
                    daftarDosen.sortingDSC();
                    break;
                case 5:
                    System.out.println("Terima kasih! Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Silakan coba lagi.");
            }
        } while (pilihan != 5);
    }
}
