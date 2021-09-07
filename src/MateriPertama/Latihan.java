package MateriPertama;

import java.util.Scanner;

public class Latihan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ip = "";
        System.out.print("Masukkan angka : ");
        int number = input.nextInt();

        for (int i = 1; i <= 32; i++) {
            if (i > number) {
                ip += "0";
            } else {
                ip += "1";
            }
        }

        String convertIp = "";
        for (int i = 0; i < 4; i++) {
            String temp = ip.substring((i * 8), ((i * 8) + 8));
            int ips = 0;
            int first = 128;
            for (int j = 0; j < 8; j++) {
                if (temp.charAt(j) == '1') {
                    ips += first;
                    first /= 2;
                }
            }
            convertIp += ips + ".";
        }

        System.out.println("Hasil : " + convertIp);
    }
}