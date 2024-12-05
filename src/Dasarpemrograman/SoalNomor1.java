package Dasarpemrograman;

import java.util.Scanner;

public class SoalNomor1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilTerbesar, bil1, bil2, bil3;

        System.out.print(" Masukkan Angka pertama: ");
        bil1 = sc.nextInt();
        System.out.print(" Masukkan Angka kedua: ");
        bil2 = sc.nextInt();
        System.out.print(" Masukkan Angka ketiga: ");
        bil3 = sc.nextInt();

        bilTerbesar = bil1;
        if (bil2 > bilTerbesar) {
            bilTerbesar = bil2;
        }
        if (bil3 > bilTerbesar) {
            bilTerbesar = bil3;
        }
        System.out.println("Bilangan terbesar adalah: " + bilTerbesar);

    }
}
