package MateriPertama;

import java.util.ArrayList;
import java.util.Scanner;

public class BelajarArraylist {
    
    public static void main(String[] args) {        
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> listNilai = new ArrayList();
        ArrayList<String> listNama = new ArrayList();
        
        do {
            System.out.print("Masukkan nama anda : ");
            listNama.add(input.next());
            System.out.print("Masukkan nilai akhir : ");
            listNilai.add(input.nextInt());
            System.out.print("Apakah masih ada mahasiswa lagi? (y/n) ");
        } while (input.next().equalsIgnoreCase("y"));
        
        System.out.print("Masukkan nama yang ingin dicari nilainya : ");
        String namaMahasiswa = input.next();
        
        int indexMahasiswa = listNama.indexOf(namaMahasiswa);
        int nilaiMahasiswa = listNilai.get(indexMahasiswa);
        System.out.printf("Nama %s nilai %d", namaMahasiswa,nilaiMahasiswa );
        
    }
}
