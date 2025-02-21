public class MahasiswaMain13 {
    public static void main(String[] args) {
        
  
    mahasiswa13 mhs1 = new mahasiswa13();
    mhs1.nama = "Khesa Kresna Adjiengrat";
    mhs1.nim  = "244107020233";
    mhs1.kelas = "TI-1B";
    mhs1.ipk= 2.92;

    mhs1.tampilkanInformasi();
    mhs1.ubahKelas("TI-2B");
    mhs1.updateIpk(4.00);
    mhs1.tampilkanInformasi();
}
}
