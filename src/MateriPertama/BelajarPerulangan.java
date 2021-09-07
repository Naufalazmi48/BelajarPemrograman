package MateriPertama;

import java.util.Scanner;
public class BelajarPerulangan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Perulangan terdiri dari counted loop dan uncounted loop
        //counted loop
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }

        
        //uncounted loop
//        int choose;
//        do {
//            System.out.println("Pilih menu"
//                    + "\n1.Membeli makanan"
//                    + "\n2.Membayar makanan"
//                    + "\n3.Keluar program\n");
//            System.out.print("Masukkan pilihan : ");
//            choose = input.nextInt();
//        } while (choose != 3);
        
        
//        System.out.println("Pilih menu"
//                    + "\n1.Membeli makanan"
//                    + "\n2.Membayar makanan"
//                    + "\n3.Keluar program\n");
//            System.out.print("Masukkan pilihan : ");
//            choose = input.nextInt();
//        while (choose != 3) {            
//            System.out.println("Pilih menu"
//                    + "\n1.Membeli makanan"
//                    + "\n2.Membayar makanan"
//                    + "\n3.Keluar program\n");
//            System.out.print("Masukkan pilihan : ");
//            choose = input.nextInt();
//        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        //Bilangan prima
        final int TERM_OF_PRIMES = 2;
        int resultDivide = 0;
        System.out.print("Cek bilangan prima dari 1 sampai : ");
        int number = input.nextInt();
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                if (i % j == 0) {
                    resultDivide++;
                }
            }
            
            if (resultDivide == TERM_OF_PRIMES){
                System.out.printf("Ini bilangan prima : %d",i);
                System.out.println("");
            }
            
            resultDivide = 0;
        }

    }
}
