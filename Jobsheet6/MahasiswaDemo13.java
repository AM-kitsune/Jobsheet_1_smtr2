
import java.util.Scanner;
public class MahasiswaDemo13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        sc.nextLine();
        
        MahasiswaBerprestasi13 list = new MahasiswaBerprestasi13(jumlahMahasiswa);
        
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("\nMasukkan data mahasiswa ke-" + (i + 1) + ":");
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine();
            
            list.tambah(new Mahasiswa13(nim, nama, kelas, ipk));
        }
        


        System.out.println();
        System.out.println("Data mahasiswa setelah sorting menggunakan BUBBLE SORT berdasarkan ipk (DESC) : ");
        list.bubbleSort();
        list.tampil();

        System.out.println();
        System.out.println("Data mahasiswa setelah sorting menggunakan SELECTION SORT berdasarkan ipk (ASC) : ");
        list.SelectionSort();
        list.tampil();

        System.out.println();
        System.out.println("Data mahasiswa sebelum sorting : ");
        list.tampil();

        System.out.println();
        System.out.println("Data mahasiswa setelah sorting menggunakan INSERTION SORT berdasarkan ipk (DESC) : ");
        list.InsertionSort();
        list.tampil();
    }
}
