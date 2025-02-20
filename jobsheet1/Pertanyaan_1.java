import java.util.Scanner;

public class Pertanyaan_1 {

    public static void main(String[] args) {
        int nilaitugas,nilaikuis,nilaiuts,nilaiuas;    
        double nilaiakhir=0;
        Scanner nilai = new Scanner(System.in); 
        do{
        System.out.println("Program menghitung nilai akhir");
        System.out.println("==============================");
        System.out.print("masukan nilai tugas : ");
        nilaitugas = nilai.nextInt();
        System.out.print("masukan nilai kuis : ");
        nilaikuis = nilai.nextInt();
        System.out.print("Masukan nilai UTS : ");
        nilaiuts = nilai.nextInt();
        System.out.print("Masukan nilai UAS : ");
        nilaiuas = nilai.nextInt();
        if (nilaitugas<0 || nilaitugas>100 || nilaikuis<0 || nilaikuis>100 || nilaiuas<0 || nilaiuas>100 || nilaiuts<0 || nilaiuts>100){
            System.out.println("nilai yang anda masukan ada yang tidak valid");
           
        }
        else{
            break;
        }
        }while(true);
        System.out.println("=========================");
        System.out.println("=========================");
       
        nilaiakhir = (0.2*nilaitugas)+(0.2*nilaikuis)+(0.3*nilaiuts)+(0.3*nilaiuas);
        System.out.println("nilai akhir adalah "+nilaiakhir);
        if(nilaiakhir>80 && nilaiakhir<=100){
            System.out.println("Nilai: A");
            System.out.println("======================");
            System.out.println("======================");
            System.out.println("Hore anda lulus");
        }
        else if(nilaiakhir>73 && nilaiakhir<=80){
            System.out.println("Nilai: B+");
            System.out.println("======================");
            System.out.println("======================");
            System.out.println("Horeanda lulus");
        }
        else if(nilaiakhir>65 && nilaiakhir<=73){
            System.out.println("Nilai: B");
            System.out.println("======================");
            System.out.println("======================");
            System.out.println("Hore anda lulus");
        }
        else if(nilaiakhir>60 && nilaiakhir<=65){
            System.out.println("Nilai: C+");
            System.out.println("======================");
            System.out.println("======================");
            System.out.println("Hore anda lulus");
        }
        else if(nilaiakhir>50 && nilaiakhir<=60){
            System.out.println("Nilai: C");
            System.out.println("======================");
            System.out.println("======================");
            System.out.println("Hore anda lulus");
        }
        else if(nilaiakhir>39 && nilaiakhir<=50){
            System.out.println("Nilai: D");
            System.out.println("======================");
            System.out.println("======================");
            System.out.println("Noo!! anda tidak lulus");
        }
        else if(nilaiakhir<=39){
            System.out.println("Nilai: E");
            System.out.println("======================");
            System.out.println("======================");
            System.out.println("Noo! anda tidak lulus");
        }
        nilai.close();
        
        
        
        

    }
}