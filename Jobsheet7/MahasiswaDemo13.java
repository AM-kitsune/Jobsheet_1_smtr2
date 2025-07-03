import java.util.Scanner;
public class MahasiswaDemo13 {
    public static void main(String[] args) {
        MahasiswaBerprestasi13 list = new MahasiswaBerprestasi13();
        Scanner sc = new Scanner(System.in);
        int jumlahMhs = 5;

        for (int i = 0; i < jumlahMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i+1));
            System.out.print("NIM : ");
            String nim = sc.nextLine();
            System.out.print("Nama : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK : ");
            String ip = sc.nextLine();
            Double ipk = Double.parseDouble(ip);
            System.out.println("------------------------");
            list.tambah (new Mahasiswa13(nim, nama, kelas, ipk));
        }

        list.tampil();
        System.out.println("-----------------------------");
        System.out.println("Pencarian Data");
        System.out.println("-----------------------------");
        System.out.println("Masukkan ipk mahasiswa yang dicari : ");
        System.out.print("IPK : ");
        double cari = sc.nextDouble();

        System.out.println("Manggunakan sequential searching");
        double posisi = list.sequensialSearching(cari);
        int pss = (int) posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);
    }
}
