import java.util.Scanner;
public class SuratDemo13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat13 stack = new StackSurat13(50);

        while (true) {
            System.out.println("\nMenu Pengelolaan Surat Izin");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("5. Keluar");
            System.out.print("Pilih Menu : ");
            int pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat : ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa : ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    System.out.print("jenis Izin (S/I) : ");
                    char jenis = sc.nextLine().charAt(0);
                    System.out.print("Durasi (jam) : ");
                    int durasi = sc.nextInt();

                    Surat13 suratbaru = new Surat13(id, nama, kelas, jenis, durasi);
                    stack.push(suratbaru);
                    System.out.println("Surat berhasil ditambahkan!");
                    break;
                case 2:
                    Surat13 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("\nMemproses Surat Izin dari " + diproses.namaMahasiswa);
                        System.out.println("Detail Surat:");
                        System.out.println("ID Surat : " + diproses.idSurat);
                        System.out.println("Nama Mahasiswa : " + diproses.namaMahasiswa);
                        System.out.println("Kelas : " + diproses.kelas);
                        System.out.println("Jenis Izin : " + (diproses.jenisIzin == 'S' ? "sakit" : "Izin"));
                        System.out.println("Durasi : " + diproses.durasi + " jam");
                    }else {
                        System.out.println("Belum ada surat!");
                    }
                    break;
                case 3:
                    Surat13 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Surat Terakhir Masuk:");
                        System.out.println("ID Surat : " + lihat.idSurat);
                        System.out.println("Nama Mahasiswa : " + lihat.namaMahasiswa);
                        System.out.println("Kelas : " + lihat.kelas);
                        System.out.println("Jenis Izin : " + (lihat.jenisIzin == 'S' ? "sakit" : "Izin"));
                        System.out.println("Durasi : " + lihat.durasi + " jam");
                    }else {
                        System.out.println("Belum ada surat!");
                    }
                    break;
                case 4:
                    System.out.print("Masukkan Nama Mahasiswa : ");
                    String cariNama = sc.nextLine();
                    stack.cariBerdasarkanNama(cariNama);
                    break;
                case 5:
                    break;
                default:
                    break;
            }
        }
    }

}
