public class Mahasiswa13 {

    String nim,nama,kelas;
    double ipk;

    public Mahasiswa13(){

    }
    public Mahasiswa13(String nm, String name, String kls, double ip){
        this.nim = nm;
        this.nama =name;
        this.kelas = kls;
        this.ipk = ip;
    }
    void tampilInformasi(){
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK : " + ipk);
    }
}