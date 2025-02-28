
import java.util.Scanner;
public class MataKuliah13 {
    public String kode;
    public String nama;
    public int sks;
    public int jmlJam;
    Scanner sc = new Scanner(System.in);
    
    void tambahData(String kode, String nama, int sks, int jmlJam, int i, String dummy) {
        System.out.println("Masukkan Data Mata Kuliah ke- " + (i + 1));
            System.out.print("Kode\t\t: ");
            kode = sc.nextLine();
            System.out.print("Nama Mata Kuliah: ");
            nama = sc.nextLine();
            System.out.print("SKS\t\t: ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam\t: ");
            dummy = sc.nextLine();
            jmlJam = Integer.parseInt(dummy);
            System.out.println("-----------------------------------");
    }
    
    void cetakInfo() {
        System.out.println("Kode: " + kode);
        System.out.println("Nama Mata Kuliah: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah jam: " + jmlJam);
        System.out.println("-----------------------------------"); 
    }
    
    public MataKuliah13(String kode, String nama, int sks, int jmlJam) {
    this.kode = kode;
    this.nama = nama;
    this.sks = sks;
    this.jmlJam = jmlJam;
    }
}
