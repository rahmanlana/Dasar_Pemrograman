package Dasarpemrograman;

import java.util.Scanner;

public class SoalNomor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String namaBuku;
        int jmlhBuku;
        double diskon = 0.0;

        System.out.print("Masukkan nama buku yang ingin dibeli (kamus/novel/lainya): ");
        namaBuku = sc.next();
        System.out.print("Masukkan jumlah buku yang ingin dibeli: ");
        jmlhBuku = sc.nextInt();

        if (namaBuku.equals("kamus")) {
            diskon = 0.1;
            if (jmlhBuku > 2) {
                diskon += 0.02;
            }

        } else if (namaBuku.equals("novel")) {
            diskon = 0.07;
            if (jmlhBuku > 3) {
                diskon += 0.02;
            } else if (jmlhBuku <= 3) {
                diskon += 0.01;
            }
        } else if (namaBuku.equals("lainya") && jmlhBuku > 3) {
            diskon = 0.05;
        }
        System.out.print("diskon yang anda miliki sebesar: " + diskon * 100 + "%");
    }
}
