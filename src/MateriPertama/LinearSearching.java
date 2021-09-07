package MateriPertama;

import javax.swing.JOptionPane;

public class LinearSearching {

    public static void main(String[] args) {
        String A[];

        A = new String[15];

        JOptionPane.showMessageDialog(null, "===Aplikasi Big Hit Entertiment===");

        int P;
        String batas = JOptionPane.showInputDialog("Masukkan Jumlah Nama Yang Harus Di MAsukkan : ");

        P = Integer.parseInt(batas);

        for (int i = 0; i < P; i++) {
            A[i] = JOptionPane.showInputDialog("Masukkan Nama Member  : ");
        }

        String X = "===Nama Member=== \n";
        for (int i = 0; i < P; i++) {
            X += A[i] + "\n";
        }
        X += "\n";

        JOptionPane.showMessageDialog(null, X);

        String B;

        B = JOptionPane.showInputDialog("Masukkan Nama Member yang Di Cari : ");

        int Cek = 0;
        int D = 0;

        for (int i = 0; i < P; i++) {
            if (A[i].equalsIgnoreCase(B)) {
                Cek = 1;
                D++;
            }

        }

        if (Cek == 1) {
            JOptionPane.showMessageDialog(null, "Nama Member Ada " + D);
        } else {
            JOptionPane.showMessageDialog(null, "Nama Member Tidak ");
        }
    }
}