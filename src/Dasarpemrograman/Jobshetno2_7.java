package Dasarpemrograman;

import java.util.Scanner;

public class Jobshetno2_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double jamKerja, gajiHarian, bonus, totalBonus = 0, totalJamKerja = 0;
        // int pegawai = 0;

        // Memulai perulangan do-while
        do {
            // Input jam kerja
            System.out.print("Masukkan jam kerja (masukkan angka negatif untuk keluar): ");
            jamKerja = input.nextDouble();

            // Jika jam kerja negatif, keluar dari loop
            if (jamKerja < 0) {
                System.out.println("Program berhenti. Tidak ada pegawai yang diproses.");
                break;
            }

            // Input gaji harian
            System.out.print("Masukkan gaji harian: ");
            gajiHarian = input.nextDouble();

            // Cek apakah jam kerja lebih dari 8 jam
            if (jamKerja > 8) {
                bonus = 0.2 * gajiHarian; // Bonus 20% dari gaji harian
            } else {
                bonus = 0; // Tidak ada bonus jika jam kerja kurang dari atau sama dengan 8
            }
            totalBonus += bonus;
            totalJamKerja += jamKerja;
            // Menampilkan hasil
            System.out.println("Gaji Harian: " + gajiHarian);
            System.out.println("Bonus: " + bonus);
            // jamKerja++;

        } while (jamKerja > 0);
        System.out.println("Total Jamm Kerja Yang di Proses: " + totalJamKerja);
        System.out.println("Total Bonus: " + totalBonus);
        
        input.close();
    }
}