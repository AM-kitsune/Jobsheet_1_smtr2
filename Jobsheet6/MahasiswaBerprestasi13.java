public class MahasiswaBerprestasi13 {
    Mahasiswa13 [] listMhs;
    int idx;

    MahasiswaBerprestasi13(int jumlahMahasiswa){
        listMhs = new Mahasiswa13[jumlahMahasiswa];
    }

    void tambah(Mahasiswa13 m){
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        }else{
            System.out.println("Data sudah penuh");
        }
    }

    void tampil () {
        for (Mahasiswa13 m : listMhs) {
            m.tampilInformasi();
            System.out.println("----------------------------");
        }
    }

    void bubbleSort(){
        for (int i = 0; i < listMhs.length-1; i++) {
            for (int j = 1; j < listMhs.length; j++) {
                if (listMhs[j].ipk > listMhs[j-1].ipk) {
                    Mahasiswa13 tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                }
            }
        }
    }

    void SelectionSort(){
        for (int i = 0; i < listMhs.length-1; i++) {
            int idxMin=i;
            for (int j = i+1; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin=j;
                }
            }
            Mahasiswa13 tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }

    void InsertionSort(){
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa13 temp = listMhs[i];
            int j=i;
            while (j>0 && listMhs[j-1].ipk<temp.ipk) {
                listMhs[j] = listMhs[j-1];
                j--;
            }
            listMhs[j]= temp;
        }
    }
}