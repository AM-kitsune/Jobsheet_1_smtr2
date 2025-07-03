import java.util.Scanner;
public class mainPangkat13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = input.nextInt();

        pangkat13[] png = new pangkat13[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan basis elemen ke-" +(i+1)+": ");
            int basis = input.nextInt();
            System.out.print("Masukkan pangkat elemen ke-" +(i+1)+": ");
            int pangkat = input.nextInt();
            png[i] = new pangkat13(basis, pangkat);
        }

        System.out.println("HASIL PANGKAT BRUTEFORCE: ");
        for (pangkat13 p : png) {
            System.out.println(p.nilai + "^" + p.pangkat + ": " + p.pangkatBF());
        }
        System.out.println("HASIL PANGKAT DIVIDE AND CONQUER: ");
        for (pangkat13 p : png) {
            System.out.println(p.nilai + "^" + p.pangkat + ": " + p.pangkatDC(p.nilai, p.pangkat));
        }
    }
}
