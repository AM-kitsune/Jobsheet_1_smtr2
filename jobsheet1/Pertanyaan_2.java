import java.util.Scanner;

public class Pertanyaan_2 {
    public static void main(String[] args) {
        Scanner Khesa = new Scanner(System.in);

        System.out.print("Input NIM: ");
        String nim = Khesa.nextLine();
        
        String lastTwoDigits = nim.substring(nim.length() - 2);
        int n = Integer.parseInt(lastTwoDigits);
        if (n < 10) {
            n += 10;
        }
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue; 
            }
            if (i % 2 == 0) {
                System.out.print(i + " "); 
            } else {
                System.out.print("* "); 
            }
        }
        
     
        Khesa.close();
    }
}