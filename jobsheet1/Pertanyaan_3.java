import java.util.Scanner;

public class Pertanyaan_3 {
    public static void main(String[] args) {
        Scanner Khesa = new Scanner(System.in);

        double rata2ipk=0;
        int[] arraynilai = new int[8];
        int[] arraynilai_ipk = new int[8];
        String[] arraynilai_ipk_huruf = new String[8];
        String[] namamatkul = {"Pancasila","KTI","CTPS","Matematika","Rekayasa Preangkat Lunak","Daspro","Praktikum Daspro","K3"};
        System.out.println("====================================");
        System.out.println("program untuk menghitung ip semester");
        System.out.println("====================================");
    
        
        for(int i=0;i<=7;i++){

            do{
            System.out.print("Masukan nilai untuk Mata Kuliah "+namamatkul[i]+" : ");
            arraynilai[i]=Khesa.nextInt();
            if (arraynilai[i]>100 || arraynilai[i]<0) {
                System.out.println(" Apalah beliau ini, input ulang  lagi kan dawg!!!!");
            }
            else{
                if (arraynilai[i]<=100 && arraynilai[i]>80){
                    arraynilai_ipk[i]+= 4;
                    arraynilai_ipk_huruf[i]= "A";
                }
                else if(arraynilai[i]<=80 && arraynilai[i]>73){
                    arraynilai_ipk[i]+= 3.5;
                    arraynilai_ipk_huruf[i]= "B+";
                }
                else if(arraynilai[i]<=73 && arraynilai[i]>65){
                    arraynilai_ipk[i]+= 3;
                    arraynilai_ipk_huruf[i]= "B"; 
                }
                else if(arraynilai[i]<=65 && arraynilai[i]>60){
                    arraynilai_ipk[i]+= 2.5;
                    arraynilai_ipk_huruf[i]= "C+";
                }
                else if(arraynilai[i]<=60 && arraynilai[i]>50){
                    arraynilai_ipk[i]+= 2;
                    arraynilai_ipk_huruf[i]= "C";
                }
                else if(arraynilai[i]<=50 && arraynilai[i]>39){
                    arraynilai_ipk[i]+= 1;
                    arraynilai_ipk_huruf[i]= "D";
                }
                else if(arraynilai[i]<=39){
                    arraynilai_ipk[i]+= 0;
                    arraynilai_ipk_huruf[i]= "E";
                }
                break;
            }
            }while(true);
        }

        
        
        System.out.println("====================================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("====================================");
        System.out.printf("%-40s %-20s %-20s %-20s %n","MK","Nilai Angka","Nilai Huruf","bobot nilai");
        for(int i=0;i<=7;i++){
            System.out.printf("%-40s %-20d %-20s %-20s %n",namamatkul[i],arraynilai[i],arraynilai_ipk_huruf[i],arraynilai_ipk[i]);
        }
        for(int i=0;i<=7;i++){
             rata2ipk += arraynilai_ipk[i];
        }
        System.out.println("Rata-rata IPK adalah : "+rata2ipk/8);
        Khesa.close();
      
    }
}