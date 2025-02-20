

public class Pertanyaan_4 {
    
    public static void main(String[] args) {
        int[][] royalgarden = new int[4][4];
        
        royalgarden[0][0]=10; royalgarden[0][1]=5;royalgarden[0][2]=15;royalgarden[0][3]=7;
        royalgarden[1][0]=6; royalgarden[1][1]=11;royalgarden[1][2]=9;royalgarden[1][3]=12;
        royalgarden[2][0]=2; royalgarden[2][1]=10;royalgarden[2][2]=10;royalgarden[2][3]=5;
        royalgarden[3][0]=5; royalgarden[3][1]=6;royalgarden[3][2]=12;royalgarden[3][3]=9;
        fungsimenghitungtotalharga(royalgarden);
        fungsimenghitungtotalhargaroyalgarden4yangtanamannyaadayangmati(royalgarden);
    }
   
    public static void fungsimenghitungtotalharga(int[][] royalgarden){ 
        String[] namatoko={"Royalgarden1","Royalgarden2","Royalgarden3","Royalgarden4"} ;
        int hargaaglonema = 75000,hargakeladi = 50000,hargaAlocasia=60000,hargaMawar=10000;

        System.out.println("Total seluruh  penjualan jika semua bunga habis terjual");
        System.out.printf("%-15s %-10s %-10s %-10s %-10s %n","Nama toko","Aglonema","Keladi","Alocasia","Mawar");
        for(int i =0;i<=namatoko.length-1;i++){
            System.out.printf("%-15s %-10d %-10d %-10d %-10d %n",namatoko[i],royalgarden[i][0],royalgarden[i][0],royalgarden[i][1],royalgarden[i][2],royalgarden[i][3]);
        }
        System.out.println("Diketahui Harga :");
        System.out.println("Aglonema Rp 75000");
        System.out.println("Keladi   Rp 50000");
        System.out.println("Alocasia Rp 60000");
        System.out.println("Mawar    Rp 10000");

        System.out.println("Maka perolehan dari setiap cabang adalah :");
        System.out.printf("%-15s %-15s %n","Nama toko","Total Pendapatan");
        for(int i=0;i<4;i++){
            System.out.printf("%-15s %-15d %n",namatoko[i],(royalgarden[i][0]*hargaaglonema)+(royalgarden[i][1]*hargakeladi)+(royalgarden[i][2]*hargaAlocasia)+(royalgarden[i][3]*hargaMawar));
        }
        
    } 
    
    public static void fungsimenghitungtotalhargaroyalgarden4yangtanamannyaadayangmati(int[][] adatanamanyangmati){
        int hargaaglonema = 75000,hargakeladi = 50000,hargaAlocasia=60000,hargaMawar=10000;
        System.out.println("==========================================================================");
        System.out.println("jumlah stock bunga yang ada di royalgarden4 adalah : ");
        System.out.printf("%-15s %-15s %-15s %-15s %n","Aglonema","keladi","Alocasia","Mawar");
        System.out.printf("%-15d %-15d %-15d %-15d %n",adatanamanyangmati[3][0],adatanamanyangmati[3][1],adatanamanyangmati[3][2],adatanamanyangmati[3][3]);
        System.out.println("tetapi beberapa bunga ada yang mati :(");
        System.out.println("Jadi stock berkurang (Aglonema -1, Keladi -2, Alocasia -0, Mawar -5)");
        System.out.println("jumlah ulang stock bunga yang ada di royalgarden4 adalah : ");
        System.out.printf("%-15s %-15s %-15s %-15s %n","Aglonema","keladi","Alocasia","Mawar");
        System.out.printf("%-15d %-15d %-15d %-15d %n",adatanamanyangmati[3][0]-1,adatanamanyangmati[3][1]-2,adatanamanyangmati[3][2],adatanamanyangmati[3][3]-5);
        System.out.println("Maka dari itu jumlah keuntungan dari semua bunga royalgarden4 adalah : Rp"+(((adatanamanyangmati[3][0]-1)*hargaaglonema)+((adatanamanyangmati[3][1]-1)*hargakeladi)+((adatanamanyangmati[3][2]-1)*hargaAlocasia)+((adatanamanyangmati[3][3]-1)*hargaMawar)));

    }   
    
}