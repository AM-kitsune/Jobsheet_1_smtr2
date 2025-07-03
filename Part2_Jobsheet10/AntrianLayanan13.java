public class AntrianLayanan13 {
    Mahasiswa13[] data;
    int front, rear, size, max;

    public AntrianLayanan13(int max){
        this.max = max;
        this.data = new Mahasiswa13[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }
    
    public boolean IsEmpty(){
        if (size == 0) {
            return true;
        }else {
            return false;
        }
    }

    public boolean IsFull(){
        if (size == max) {
            return true;
        }else {
            return false;
        }
    }

    public void tambahAntrian(Mahasiswa13 mhs) {
        if (IsFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
            return;
        }
        rear = (rear + 1 ) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian.");
    }

    public Mahasiswa13 layaniMahasiswa(){
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        }
        Mahasiswa13 mhs = data[front];
        front = (front + 1) % max;
        size--;
        return mhs;
    }

    public void lihatTerdepan(){
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
        }else {
            System.out.print("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
        }
    }

    public void tampilkanSemua(){
        if (IsEmpty()) {
            System.out.println("Antrian kosng.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian.");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.println((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public int getJumlahAntrian(){
        return size;
    }

    public void lihatAkhir() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.print("Mahasiswa terakhir: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }
}
