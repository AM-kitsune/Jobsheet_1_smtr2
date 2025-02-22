public class MataKuliahMain13 {
    public static void main(String[] args) {
        matakuliah13 mk1 = new matakuliah13();
        mk1.kodeMK = "RTI242008";
        mk1.nama = "Algoritma Dan Struktur Data";
        mk1.jumlahJam = 4;
        mk1.sks = 2;

        System.out.println();
        mk1.tampilinInformasi();
        mk1.ubahSKS(3);
        mk1.tambahJam(1);
        mk1.kurangiJumlah(8);
        mk1.tampilinInformasi();
    }
}