import java.util.Scanner;
public class MahsiswaDemo13 {
    public static void main(String[] args) {
        Mahasiswa13[] arrayOfMahasiswa = new Mahasiswa13[3];
        Scanner sc = new Scanner(System.in);
        String dummy;
        
        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa[i] = new Mahasiswa13();
            
            System.out.println("Masukkan Data Mahasiswa ke-" + (i+1));
            System.out.print("NIM: ");
            arrayOfMahasiswa[i].nim = sc.nextLine(); 
            System.out.print("Nama: ");
            arrayOfMahasiswa[i].nama = sc.nextLine();
            System.out.print("Kelas: ");
            arrayOfMahasiswa[i].kelas = sc.nextLine(); 
            System.out.print("IPK: ");
            dummy = sc.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("---------------------------------");
        }

        for (int i = 0; i < 3; i++) {                           
            System.out.println("Data Mahasiswa ke-" + (i+1));   
            arrayOfMahasiswa[i].cetakInfo();                    
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i+1));           
            System.out.println("NIM: " + arrayOfMahasiswa[i].nim);      
            System.out.println("Nama: " + arrayOfMahasiswa[i].nama);    
            System.out.println("Kelas: " + arrayOfMahasiswa[i].kelas);  
            System.out.println("IPK: " + arrayOfMahasiswa[i].ipk);      
            System.out.println("---------------------------------");  
        }

        arrayOfMahasiswa[0] = new Mahasiswa13();            
        arrayOfMahasiswa[0].nim = "244107020234";           
        arrayOfMahasiswa[0].nama = "Am_Neko"; 
        arrayOfMahasiswa[0].kelas = "TI_1A";               
        arrayOfMahasiswa[0].ipk = (float) 3.92;             

        arrayOfMahasiswa[1] = new Mahasiswa13();            
        arrayOfMahasiswa[1].nim = "280333821";             
        arrayOfMahasiswa[1].nama = "Projekt red"; 
        arrayOfMahasiswa[1].kelas = "TI-1C";                
        arrayOfMahasiswa[1].ipk = (float) 3.90;             

        arrayOfMahasiswa[2] = new Mahasiswa13();            
        arrayOfMahasiswa[2].nim = "244107020233";           
        arrayOfMahasiswa[2].nama = "Am_Kitsune";   
        arrayOfMahasiswa[2].kelas = "TI_1b";                
        arrayOfMahasiswa[2].ipk = (float) 3.29;             

        System.out.println("NIM: " + arrayOfMahasiswa[0].nim);      
        System.out.println("NAMA: " + arrayOfMahasiswa[0].nama);    
        System.out.println("KELAS: " + arrayOfMahasiswa[0].kelas);  
        System.out.println("IPK: " + arrayOfMahasiswa[0].ipk);      
        System.out.println("---------------------------------");  
        System.out.println("NIM: " + arrayOfMahasiswa[1].nim);      
        System.out.println("NAMA: " + arrayOfMahasiswa[1].nama);    
        System.out.println("KELAS: " + arrayOfMahasiswa[1].kelas);  
        System.out.println("IPK: " + arrayOfMahasiswa[1].ipk);      
        System.out.println("---------------------------------");  
        System.out.println("NIM: " + arrayOfMahasiswa[2].nim);      
        System.out.println("NAMA: " + arrayOfMahasiswa[2].nama);    
        System.out.println("KELAS: " + arrayOfMahasiswa[2].kelas);  
        System.out.println("IPK: " + arrayOfMahasiswa[2].ipk);      
        System.out.println("---------------------------------");  
    }
}
