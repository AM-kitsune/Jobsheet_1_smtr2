public class Mahasiswa13 {
    String nim, nama, kelas;
    double ipk;

    public Mahasiswa13(){

    }
    
    public Mahasiswa13(String nama, String nim, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi() {
        System.out.println(nama + " - " + nim + " - " + kelas + " - " + ipk);
    }
}