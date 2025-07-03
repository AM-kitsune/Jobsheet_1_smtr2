public class Surat13 {
    String idSurat, kelas, namaMahasiswa;
    char jenisIzin;
    int durasi;

    Surat13(){

    }
    Surat13 (String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi){
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }
}
