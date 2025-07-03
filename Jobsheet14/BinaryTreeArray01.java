public class BinaryTreeArray01 {
    Mahasiswa01[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray01() {
        this.dataMahasiswa = new Mahasiswa01[10];
    }

    void populateData(Mahasiswa01[] dataMhs, int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }

    // Tugas Praktikum 4: Method add()
    void add(Mahasiswa01 data) {
        if (dataMahasiswa[0] == null) {
            dataMahasiswa[0] = data;
            idxLast = 0;
        } else {
            int i = 0;
            while (true) {
                if (data.ipk < dataMahasiswa[i].ipk) {
                    if (dataMahasiswa[2 * i + 1] == null) {
                        dataMahasiswa[2 * i + 1] = data;
                        idxLast = 2 * i + 1;
                        break;
                    } else {
                        i = 2 * i + 1;
                    }
                } else {
                    if (dataMahasiswa[2 * i + 2] == null) {
                        dataMahasiswa[2 * i + 2] = data;
                        idxLast = 2 * i + 2;
                        break;
                    } else {
                        i = 2 * i + 2;
                    }
                }
            }
        }
    }

    // Tugas Praktikum 4: Method traversePreOrder()
    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                dataMahasiswa[idxStart].tampilInformasi();
                traversePreOrder(2 * idxStart + 1);
                traversePreOrder(2 * idxStart + 2);
            }
        }
    }
}