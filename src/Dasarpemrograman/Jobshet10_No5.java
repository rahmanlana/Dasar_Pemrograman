package Dasarpemrograman;

import java.util.Scanner;

public class Jobshet10_No5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] bilanganBulat = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

        int hasil = 0, key = 0;
        System.out.print("Masukan Nilai yang anda cari : ");
        key = sc.nextInt();

        for (int i = 0; i < bilanganBulat.length; i++) {
            if (key == bilanganBulat[i]) {
                hasil = i;
                break;
            }

        }
        System.out.println("Angka " + key + " berada di indeks ke - " + hasil);

    }

}
