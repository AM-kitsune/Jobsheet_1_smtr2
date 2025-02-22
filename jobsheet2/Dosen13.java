public class Dosen13 {
    String idDosen, nama, bidangKeahlian;
    int TahunBerganung;
    boolean statusAktif;

    void tampilkanInformasi() {
        System.out.println("Masukkan ID Dosen: " + idDosen);
        System.out.println("Masukkan nama lengkap Dosen: " + nama);
        System.out.println("Status Aktif Dosen: " + statusAktif);
        System.out.println("Tahun bergabung Dosen: " + TahunBerganung);
        System.out.println("Masa Kerja Dosen: " + hitungMasaKerja(2025) + " tahun");
        System.out.println("Bidang keahlian Dosen: " + bidangKeahlian);
        System.out.println();
    }

    void setStatusAktif(boolean status) {
        statusAktif = status;
        System.out.println("Status dosen diubah menjadi: " + (status ? "Aktif" : "Non Aktif") + "\n");
    }

    int hitungMasaKerja(int Tahun) {
        return Tahun - TahunBerganung;
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
        System.out.println("Bidang keahlian diubah menjadi: " + bidangKeahlian + "\n");

    }

    public Dosen13() {
    } 

    public Dosen13(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.TahunBerganung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }
}