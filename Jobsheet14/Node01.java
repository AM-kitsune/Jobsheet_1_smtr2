public class Node01 {
    Mahasiswa01 mahasiswa;
    Node01 left, right;

    public Node01() {
    }

    public Node01(Mahasiswa01 mahasiswa) {
        this.mahasiswa = mahasiswa;
        left = right = null;
    }
}