package Dasarpemrograman;

import java.util.Scanner;

public class SoalNomor3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        String merkSepatu, kategoriSepatu;
        int hargaSepatu, totalBayar, ukuranSepatu;

        System.out.print("Masukkan Merk Sepatu yang ingin di beli (Converse/Sketcher/Nike): ");
        merkSepatu = sc.next();
        if (merkSepatu.equals("Converse")) {
            System.out.print("Pilih Kategori Sepatu Anda (Slip_On/High_Top): ");
            kategoriSepatu = input.next();
            if (kategoriSepatu.equals("Slip_On")) {
                System.out.print("Masukkan Ukuran Sepatu(36 - 40) :");
                ukuranSepatu = input.nextInt();
                if (ukuranSepatu >= 36) {
                    System.out.print("Harga Sepatu anda Rp.800.000");
                } else if (ukuranSepatu <= 40) {
                    System.out.print("Harga Sepatu anda Rp.800.000");
                }
            } else if (kategoriSepatu.equals("High_Top")) {
                System.out.print("Masukkan Ukuran Sepatu(40 - 44) :");
                ukuranSepatu = input.nextInt();
                if (ukuranSepatu >= 36) {
                    System.out.print("Harga Sepatu anda Rp.1.200.000");
                } else if (ukuranSepatu <= 40) {
                    System.out.print("Harga Sepatu anda Rp.1.200.000");
                }
            }
        } else if (merkSepatu.equals("Sketcher")) {
            System.out.print("Pilih Kategori Sepatu Anda (Woman/Man): ");
            kategoriSepatu = sc.next();
            if (kategoriSepatu.equals("Woman")) {
                System.out.print("Masukkan Ukuran Sepatu(36 - 41) :");
                ukuranSepatu = input.nextInt();
                if (ukuranSepatu >= 36) {
                    System.out.print("Harga Sepatu anda Rp.1.000.000");
                } else if (ukuranSepatu <= 41) {
                    System.out.print("Harga Sepatu anda Rp.1.000.000");
                }
            } else if (kategoriSepatu.equals("Man")) {
                System.out.print("Masukkan Ukuran Sepatu(41 - 44) :");
                ukuranSepatu = input.nextInt();
                if (ukuranSepatu >= 41) {
                    System.out.print("Harga Sepatu anda Rp.1.800.000");
                } else if (ukuranSepatu <= 44) {
                    System.out.print("Harga Sepatu anda Rp.1.800.000");
                }
            }
        } else if (merkSepatu.equals("Nike")) {
            System.out.print("Pilih Kategori Sepatu Anda (Kids/Adult): ");
            kategoriSepatu = sc.next();
            if (kategoriSepatu.equals("Kids")) {
                System.out.print("Masukkan Ukuran Sepatu(36 - 40) :");
                ukuranSepatu = input.nextInt();
                if (ukuranSepatu >= 36) {
                    System.out.print("Harga Sepatu anda Rp.750.000");
                } else if (ukuranSepatu <= 40) {
                    System.out.print("Harga Sepatu anda Rp.750.000");
                }
            } else if (kategoriSepatu.equals("Adult")) {
                System.out.print("Masukkan Ukuran Sepatu(40 - 44) :");
                ukuranSepatu = input.nextInt();
                if (ukuranSepatu >= 40) {
                    System.out.print("Harga Sepatu anda Rp.1.500.000");
                } else if (ukuranSepatu <= 44) {
                    System.out.print("Harga Sepatu anda Rp.1.500.000");
                }
            }
        } else {
            System.out.print("Merk Sepatu yang anda masukkan salah");
        }
    }
}
