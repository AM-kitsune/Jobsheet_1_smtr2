import java.util.Scanner;
public class MataKuliahDemo13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kode = null, nama = null, dummy = null;
        int sks = 0, jmlJam = 0, jmlMatkul;
        
        System.out.print("Masukkan banyak data mata kuliah yang ingin didata: "); 
        jmlMatkul = sc.nextInt();                                                   
        sc.nextLine();
        MataKuliah13[] arrayOfMataKuliah = new MataKuliah13[jmlMatkul];             


        for (int i = 0; i < arrayOfMataKuliah.length; i++) {                   
            arrayOfMataKuliah[i] = new MataKuliah13 (kode, nama, sks, jmlJam); 
            arrayOfMataKuliah[i].tambahData(kode, nama, sks, jmlJam, i, dummy);
        }
        
        for (int i = 0; i < arrayOfMataKuliah.length; i++) {                        
            System.out.println("Data Mata Kuliah ke-" + (i + 1));                   
            System.out.println("Kode\t\t: " + arrayOfMataKuliah[i].kode);           
            System.out.println("Nama Mata Kuliah: " + arrayOfMataKuliah[i].nama);   
            System.out.println("SKS\t\t: " + arrayOfMataKuliah[i].sks);             
            System.out.println("Jumlah jam\t: " + arrayOfMataKuliah[i].jmlJam);     
            System.out.println("-----------------------------------");            
        }


        for (int i = 0; i < arrayOfMataKuliah.length; i++) {    
            System.out.println("Data Mata Kuliah ke-" + (i+1)); 
            arrayOfMataKuliah[i].cetakInfo();                   
        }

        

    }
}