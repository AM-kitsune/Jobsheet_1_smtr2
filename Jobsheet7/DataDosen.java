public class DataDosen {
    Dosen[] dataDosen = new Dosen[10];
    int idx = 0;

    void tambah(Dosen dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data dosen sudah penuh!");
        }
    }

    void tampil() {
        if (idx == 0) {
            System.out.println("Belum ada data dosen.");
        } else {
            for (int i = 0; i < idx; i++) {
                dataDosen[i].tampil();
            }
        }
    }

    void sortingASC() { 
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
        System.out.println("Data berhasil diurutkan (ASC).");
        tampil();
    }

    void sortingDSC() { 
        for (int i = 1; i < idx; i++) {
            Dosen temp = dataDosen[i];
            int j = i;
            while (j > 0 && dataDosen[j - 1].usia < temp.usia) {
                dataDosen[j] = dataDosen[j - 1];
                j--;
            }
            dataDosen[j] = temp;
        }
        System.out.println("Data berhasil diurutkan (DSC).");
        tampil();
    }


    int sequentialSearching(String cari) {
        int posisi = -1;
        int jumlah = 0; 
        for (int i = 0; i < idx; i++) {
            if (dataDosen[i].nama.equalsIgnoreCase(cari)) {
                if (posisi == -1) posisi = i;
                jumlah++;
            }
        }
        if (posisi != -1) {
            System.out.println("Data dosen dengan nama \"" + cari + "\" ditemukan pada indeks " + posisi);
            for (int i = 0; i < idx; i++) {
                if (dataDosen[i].nama.equalsIgnoreCase(cari)) {
                    dataDosen[i].tampil();
                }
            }
            if (jumlah > 1) {
                System.out.println("PERINGATAN: Ditemukan lebih dari satu dosen dengan nama yang sama!");
            }
        } else {
            System.out.println("Data dosen dengan nama \"" + cari + "\" tidak ditemukan.");
        }
        return posisi;
    }

    int findBinarySearch(int cari, int left, int right) {
        if (right >= left) {
            int mid = (left + right) / 2;
            if (dataDosen[mid].usia == cari) {
                return mid;
            } else if (dataDosen[mid].usia > cari) {
                return findBinarySearch(cari, left, mid - 1);
            } else {
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }


    void tampilDataSearch(int usia, int pos) {
        if (pos != -1) {
            int jumlah = 0; 
            for (int i = 0; i < idx; i++) {
                if (dataDosen[i].usia == usia) {
                    dataDosen[i].tampil();
                    jumlah++;
                }
            }
            if (jumlah > 1) {
                System.out.println("PERINGATAN: Ditemukan lebih dari satu dosen dengan usia yang sama!");
            }
        } else {
            System.out.println("Data dosen dengan usia " + usia + " tidak ditemukan");
        }
    }
}
