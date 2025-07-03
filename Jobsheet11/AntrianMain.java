import java.util.Scanner;
public class AntrianMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Antrian antrian = new Antrian();
        int pilih;

        do {
            System.out.println("\n== MENU ANTRIAN LAYANAN KEMAHASISWAAN ==");
            System.out.println("1. Tambahkan Data ke Antrian");
            System.out.println("2. Panggil Data");
            System.out.println("3. Cek Antrian Kosong");
            System.out.println("4. Kosongkan Antrian");
            System.out.println("5. Tampilkan Data Terdepan");
            System.out.println("6. Tampilkan Data Terakhir");
            System.out.println("7. Tampilkan Jumlah Antrian");
            System.out.println("8. Tampilkan Semua Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String nama = scan.nextLine();
                    System.out.print("Masukkan NIM Mahasiswa: ");
                    String nim = scan.nextLine();
                    System.out.print("Masukkan Kelas Mahasiswa: ");
                    String kelas = scan.nextLine();
                    System.out.print("Masukkan IPK Mahasiswa: ");
                    double ipk = scan.nextDouble();
                    Mahasiswa13 mhs = new Mahasiswa13(nama, nim, kelas, ipk);
                    antrian.Enqueue(mhs);
                    break;

                case 2:
                    antrian.Dequeue();                
                    break;
                
                case 3:
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian kosong!");
                    } else {
                        System.out.println("Antrian tidak kosong");
                    }
                    break;

                case 4:
                    antrian.clear();
                    break;

                case 5:
                    antrian.tampilTerdepan();
                    break;

                case 6:
                    antrian.tampilTerbelakang();
                    break;

                case 7:
                    antrian.jumlahAntrian();
                    break;

                case 8:
                    antrian.tampilSemua();
                    break;

                case 9:
                    System.out.println("Terima kasih");
                    break;
            
                default:
                    System.out.println("Pilihan tidak valid. Pilih kembali");
                    break;
            }
        } while (pilih != 0);
    }
}
