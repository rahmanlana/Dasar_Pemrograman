package Dasarpemrograman;

import java.util.Scanner;

public class Fpb20 {

    public static void main(String[] args) {
        Scanner lana20 = new Scanner(System.in);
        int angka1, angka2, hasilFPB;

        System.out.print("Masukan angka ke 1: ");
        angka1 = lana20.nextInt();
        System.out.print("Masukan angka ke 2: ");
        angka2 = lana20.nextInt();

        hasilFPB = hitungFPB(angka1, angka2);

        System.out.println("Hasil fpb dari " + angka1 + " dan angka " + angka2 + " adalah : " + hasilFPB);

        lana20.close();

    }

    public static int hitungFPB(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }

}