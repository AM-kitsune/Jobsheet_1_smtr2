import java.util.Scanner;
public class LayananKRSDPA13 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        AntrianKRSDPA13 antrian = new AntrianKRSDPA13(10);
        int pilihan;
        
        do {
            System.out.println("\n=== SISTEM ANTRIAN KRS DPA ===");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Proses KRS (2 mahasiswa)");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan 2 Mahasiswa Terdepan");
            System.out.println("5. Tampilkan Mahasiswa Terakhir");
            System.out.println("6. Jumlah Mahasiswa dalam Antrian");
            System.out.println("7. Jumlah Mahasiswa Sudah Diproses");
            System.out.println("8. Jumlah Mahasiswa Belum Diproses");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt(); sc.nextLine();
            
            switch (pilihan) {
                case 1:
                    System.out.print("NIM : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    Mahasiswa13 mhs = new Mahasiswa13(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                    
                case 2:
                    antrian.prosesKRS();
                    break;
                    
                case 3:
                    antrian.tampilkanSemua();
                    break;
                    
                case 4:
                    antrian.tampilkan2Depan();
                    break;
                    
                case 5:
                    antrian.lihatAkhir();
                    break;
                    
                case 6:
                    System.out.println("Jumlah dalam antrian: " + antrian.getJumlahAntrian());
                    break;
                    
                case 7:
                    System.out.println("Sudah diproses: " + antrian.getSudahDiproses());
                    break;
                    
                case 8:
                    System.out.println("Belum diproses: " + antrian.getBelumDiproses());
                    break;
                    
                case 9:
                    antrian.clear();
                    break;
                    
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                    
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
        sc.close();
    }
}
