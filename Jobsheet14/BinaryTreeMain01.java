public class BinaryTreeMain01 {
    public static void main(String[] args) {
        BinaryTree01 bst = new BinaryTree01();

        // Menambahkan data mahasiswa
        bst.add(new Mahasiswa01("244160121", "Ali", "A", 3.57));
        bst.add(new Mahasiswa01("244160227", "Badar", "B", 3.85));
        bst.add(new Mahasiswa01("244160185", "Candra", "C", 3.21));
        bst.add(new Mahasiswa01("244160220", "Dewi", "B", 3.54));

        System.out.println("\nDaftar semua mahasiswa (in order traversal):");
        bst.traverseInOrder(bst.root);

        System.out.println("\nPencarian data mahasiswa:");
        System.out.print("Cari mahasiswa dengan IPK 3.54 : ");
        String hasilCari = bst.find(3.54) ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);
        System.out.print("Cari mahasiswa dengan IPK 3.22 : ");
        hasilCari = bst.find(3.22) ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);

        bst.add(new Mahasiswa01("244160131", "Devi", "A", 3.72));
        bst.add(new Mahasiswa01("244160205", "Ehsan", "D", 3.37));
        bst.add(new Mahasiswa01("244160170", "Fizi", "B", 3.46));

        System.out.println("\nDaftar semua mahasiswa setelah penambahan 3 mahasiswa:");
        bst.traverseInOrder(bst.root);

        System.out.println("\nPreOrder Traversal:");
        bst.traversePreOrder(bst.root);

        System.out.println("\nPostOrder Traversal:");
        bst.traversePostOrder(bst.root);

        bst.delete(3.57);
        System.out.println("\nDaftar semua mahasiswa setelah penghapusan 1 mahasiswa (in order traversal):");
        bst.traverseInOrder(bst.root);

        BinaryTreeArray01 bta = new BinaryTreeArray01();
        Mahasiswa01 mhs1 = new Mahasiswa01("244160121", "Ali", "A", 3.57);
        Mahasiswa01 mhs2 = new Mahasiswa01("244160185", "Candra", "C", 3.41);
        Mahasiswa01 mhs3 = new Mahasiswa01("244160221", "Badar", "B", 3.75);
        Mahasiswa01 mhs4 = new Mahasiswa01("244160220", "Dewi", "B", 3.35);
        Mahasiswa01 mhs5 = new Mahasiswa01("244160131", "Devi", "A", 3.48);
        Mahasiswa01 mhs6 = new Mahasiswa01("244160205", "Ehsan", "D", 3.61);
        Mahasiswa01 mhs7 = new Mahasiswa01("244160170", "Fizi", "B", 3.86);

        Mahasiswa01[] dataMahasiswa = {mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7, null, null, null};
        int idxLast = 6;
        bta.populateData(dataMahasiswa, idxLast);

        System.out.println("\nInorder Traversal Mahasiswa: (Praktikum2)");
        bta.traverseInOrder(0);

        BinaryTreeArray01 bta2 = new BinaryTreeArray01();
        bta2.add(mhs1);
        bta2.add(mhs2);
        bta2.add(mhs3);
        bta2.add(mhs4);
        bta2.add(mhs5);
        bta2.add(mhs6);
        bta2.add(mhs7);

        System.out.println("\nPreorder Traversal Mahasiswa (setelah add):");
        bta2.traversePreOrder(0);

        // Tugas Praktikum
        System.out.println("\nMahasiswa dengan IPK terkecil:");
        bst.cariMinIPK().tampilInformasi();

        System.out.println("\nMahasiswa dengan IPK terbesar:");
        bst.cariMaxIPK().tampilInformasi();

        System.out.println("\nMahasiswa dengan IPK di atas 3.50:");
        bst.tampilMahasiswaIPKdiAtas(3.50);
    }
}