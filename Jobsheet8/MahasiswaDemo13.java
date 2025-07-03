import java.util.Scanner;
public class MahasiswaDemo13 {
    public static void main(String[] args) {
        StackTugasMahasiswa13 stack = new StackTugasMahasiswa13(5);
        Scanner sc = new Scanner(System.in);
        int pilih;
        do {
            System.out.println("\nMenu");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat daftar Tugas");
            System.out.println("5. Melihat Tugas Terbawah");
            System.out.println("6. Jumlah Tugas yang Telah Dikumpulkan");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama : ");
                    String nama = sc.nextLine();
                    System.out.print("NIM : ");
                    String nim = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    Mahasiswa13 mhs = new Mahasiswa13(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;
                case 2:
                    Mahasiswa13 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = sc.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                        String biner = stack.konversiDesimalKeBiner(nilai);
                        System.out.println("Nilai Biner Tugas: " + biner);
                    }                    
                    break;
                case 3:
                    Mahasiswa13 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terkhir dikumpulkan oleh " + lihat.nama);
                    }                   
                    break;
                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();                 
                    break;
                case 5:
                    Mahasiswa13 terbawah = stack.peekBottom();
                    if (terbawah != null) {
                        System.out.println("Tugas pertama dikumpulkan oleh " + terbawah.nama);
                    }
                    break;
                case 6:
                    System.out.println("Jumlah tugas yang telah dikumpulkan: " + stack.count());
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilih >= 1 && pilih <= 6);
    }
}
