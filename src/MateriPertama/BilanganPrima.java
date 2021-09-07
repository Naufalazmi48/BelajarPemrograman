
package MateriPertama;

import java.util.Scanner;

public class BilanganPrima {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int TERM_OF_PRIMES = 2;
        int resultDivide = 0, number;
        
        System.out.print("Bilangan prima dari 1 sampai : ");
        number = input.nextInt();
        
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                if(i % j == 0){
                    resultDivide++;
                }
            }
            
            if (resultDivide == TERM_OF_PRIMES){
                System.out.println("Ini adalahan bilangan prima : "+ i);
            }
            
            resultDivide = 0;
        }
    }   
}