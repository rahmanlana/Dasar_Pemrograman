package Dasarpemrograman;

import java.util.Scanner;

public class Jobshet10_No3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angkaBulan;
        String hasil = null;
        String[] namaBulan = { "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus",
                "September", "Oktober", "November", "Desember" };

        System.out.print("Masukkan Angka Yang anda cari (1 -12) : ");
        angkaBulan = sc.nextInt();

        if (angkaBulan >= 1 && angkaBulan <= 12) {
            for (int i = 0; i < namaBulan.length; i++) {
                if (i == angkaBulan - 1) {
                    hasil = namaBulan[i];
                    break;
                }
            }
            System.out.println("Bulan Yang Anda Pilih Adalah " + hasil);
        } else {
            System.out.println("Input Tidak Valid!");

        }
        sc.close();

    }
}
