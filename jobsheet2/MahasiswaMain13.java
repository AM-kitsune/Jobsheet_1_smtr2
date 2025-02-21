public class MahasiswaMain13 {
    public static void main(String[] args) {
        
  
    mahasiswa13 mhs1 = new mahasiswa13();
    mhs1.nama = "Khesa Kresna Adjiengrat";
    mhs1.nim  = "244107020233";
    mhs1.kelas = "TI-1B";
    mhs1.ipk=3.12;

    mhs1.tampilkanInformasi();
    mhs1.ubahKelas("TI-2B");
    mhs1.updateIpk(4.00);
    mhs1.tampilkanInformasi();

    mahasiswa13 mhs2 = new mahasiswa13("Projekt red","2141720160",3.45, "TI-2A");
    mhs2.updateIpk(3.30);
    mhs2.tampilkanInformasi();

    mahasiswa13 mhs3 = new mahasiswa13("Huo-Huo","217463728",3.12, "TI-2d");
    mhs2.updateIpk(3.59);
    mhs2.tampilkanInformasi();
}
}
