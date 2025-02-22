public class DosenMain13 {
    public static void main(String[] args) {
        Dosen13 dosen = new Dosen13();
       dosen.idDosen = "NekoMata3";
       dosen.nama = "Am~Kitsune";
       dosen.statusAktif = true;
       dosen.TahunBerganung = 2020;
       dosen.bidangKeahlian = "Basis Data";
       dosen.tampilkanInformasi();

       dosen.setStatusAktif(false);
       dosen.ubahKeahlian("Basis Data");
       dosen.tampilkanInformasi();

        Dosen13 dosen1 = new Dosen13("Am~Neko", "Khesa Kresna Adjieningrat", true, 2021, "PHP");
        dosen1.tampilkanInformasi();

        dosen1.setStatusAktif(true);
        dosen1.ubahKeahlian("Javascript Fullstack");
        dosen1.tampilkanInformasi();
    }
}