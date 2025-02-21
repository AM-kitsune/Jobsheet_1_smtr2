public class mahasiswa13 {
    String nama;
    String nim;
    String kelas;
    double ipk;

    void tampilkanInformasi(){
    System.out.println("Nama :" + nama);
    System.out.println("NIM : " + nim);
    System.out.println("Kelas : " + kelas);
    System.out.println("IPK : " + ipk);
}
    void  ubahKelas (String kelasBaru) {
        kelas = kelasBaru;
    }
    

     void updateIpk(double ipkBaru) {
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
            ipk = ipkBaru;
        } else {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
        }
    }
    String nilaiKinerja(){
        if (ipk >= 3.5){
            return "Kinerja Sangat Baik";
        }else if (ipk >= 3.0){
            return "kinerja baik";
         } else if (ipk >= 2.0){
            return "Kinerja Cukup";
         } else {
            return "Kinerja Kurang";
         }
        }


        public mahasiswa13(){

        }
        public mahasiswa13(String nm, String nim, double ipk, String kls){
            nama = nm ;
            this.nim = nim;
            this.ipk = ipk ;
            kelas = kls;
        }
    }
