public class AntrianKRSDPA13 {
    Mahasiswa13[] data;
    int front, rear, size, max, totalLayani;
    
    public AntrianKRSDPA13(int max) {
        this.max = max;
        this.data = new Mahasiswa13[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.totalLayani = 0;
    }
    
    public boolean IsEmpty() {
        return size == 0;
    }
    
    public boolean IsFull() {
        return size == max;
    }
    
    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan");
    }
    
    public void tambahAntrian(Mahasiswa13 mhs) {
        if (IsFull()) {
            System.out.println("Antrian penuh! Maksimal " + max + " mahasiswa.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil ditambahkan ke antrian KRS.");
    }
    
    public void prosesKRS() {
        if (size < 2) {
            System.out.println("Minimal 2 mahasiswa untuk proses KRS");
            return;
        }
        
        System.out.println("Memproses KRS untuk 2 mahasiswa:");
        for (int i = 0; i < 2; i++) {
            Mahasiswa13 mhs = data[front];
            System.out.print((i+1) + ". ");
            mhs.tampilkanData();
            front = (front + 1) % max;
            size--;
            totalLayani++;
        }
        System.out.println("Total mahasiswa diproses: " + totalLayani);
    }
    
    public void tampilkanSemua() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Antrian KRS:");
        System.out.println("No. NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i+1) + ". ");
            data[index].tampilkanData();
        }
    }
    
    public void tampilkan2Depan() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2 mahasiswa");
            return;
        }
        System.out.println("2 Mahasiswa Terdepan:");
        for (int i = 0; i < 2; i++) {
            int index = (front + i) % max;
            System.out.print((i+1) + ". ");
            data[index].tampilkanData();
        }
    }
    
    public void lihatAkhir() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa terakhir:");
            data[rear].tampilkanData();
        }
    }
    
    public int getJumlahAntrian() {
        return size;
    }
    
    public int getSudahDiproses() {
        return totalLayani;
    }
    
    public int getBelumDiproses() {
        return max - size - totalLayani;
    }
}
