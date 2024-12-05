package Dasarpemrograman;

import java.util.Scanner;

public class Jobshet10_No4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputBil = 0, totalNilai = 0;
        double rata;
        System.out.print("input berapa nilai bilangan bulat : ");
        inputBil = sc.nextInt();
        int[] nilaiBilBulat = new int[inputBil];

        for (int i = 0; i < nilaiBilBulat.length; i++) {
            System.out.print("Masukkan Nilai ke - " + (i + 1) + " : ");
            nilaiBilBulat[i] = sc.nextInt();
            totalNilai += nilaiBilBulat[i];
        }

        rata = totalNilai / nilaiBilBulat.length;

        System.out.println("Rata Rata Nilai Anda Adalah " + rata);

    }
}
