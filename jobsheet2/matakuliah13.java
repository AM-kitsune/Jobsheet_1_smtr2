public class matakuliah13 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    void tampilinInformasi(){
        System.out.println("Kode Mata Kuliah : " + kodeMK);
        System.out.println("Nama Mata Kuliah : " + nama);
        System.out.println("SKS Mata Kuliah : " + sks);
        System.out.println("Jumlah Jam : " + jumlahJam);
    }
    void ubahSKS(int sksBaru){
        sks = sksBaru;
    }
    void tambahJam(int jam){
        jumlahJam += jam;
    }
    void kurangiJumlah(int jam){
        if (jumlahJam > jam) {
            jumlahJam  -=jam;
        }else{
            System.out.println("pengurangan tidak dapat dilakukan!");
        }
    }
    public matakuliah13() {

    }
}