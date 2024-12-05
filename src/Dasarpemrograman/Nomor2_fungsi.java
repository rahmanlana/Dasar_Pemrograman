package Dasarpemrograman;

import java.util.Scanner;

public class Nomor2_fungsi {
    static int nilai[][];
    static String[] namaMahasiswa = { "Sari", "Rina", "Yani", "Dwi", "Lusi" };
    static String[] minggu = { "Minggu 1", "Minggu 2", "Minggu 3", "Minggu 4", "Minggu 5", "Minggu 6",
            "Minggu 7" };

    public static void main(String[] args) {
        inputNilai();

        tampilTabel();

        mencariNilai();

        nilaiTertinggiMahasiswa();
    }

    public static int[][] inputNilai() {
        Scanner lana = new Scanner(System.in);
        nilai = new int[5][7];

        System.out.println("input nilai mahaisiswa untuk setiap minggu: ");
        for (int i = 0; i < namaMahasiswa.length; i++) {
            System.out.println("Mahasiswa: " + namaMahasiswa[i]);
            for (int j = 0; j < minggu.length; j++) {
                System.out.print(minggu[j] + ": ");
                nilai[i][j] = lana.nextInt();
            }
        }

        return nilai;
    }

    public static void tampilTabel() {
        System.out
                .println("===========================================================================================");
        System.out.printf("%-15s", "Data Nilai Mahasiswa\n");
        System.out
                .println("===========================================================================================");

        System.out.printf("%-10s", " ");
        for (int i = 0; i < minggu.length; i++) {
            System.out.printf("%-10s", minggu[i]);

        }
        System.out.println();
        for (int i = 0; i < nilai.length; i++) {
            System.out.printf("%-10s", namaMahasiswa[i]);
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.printf("%-10d", nilai[i][j]);
            }
            System.out.println();
        }
        System.out
                .println("===========================================================================================");
    }

    public static int mencariNilai() {

        System.out.println();
        int nilaiTertinggi = 0;
        int indexWeek = 0;
        for (int i = 0; i < nilai.length; i++) {
            indexWeek = i + 1;
            for (int j = 0; j < nilai[i].length; j++) {
                int temp = nilai[i][j];
                if (temp > nilaiTertinggi) {
                    nilaiTertinggi = temp;
                }
            }
        }
        System.out.println("Nilai tertinggi : " + nilaiTertinggi + " pada minggu ke : " + indexWeek);
        return indexWeek;

    }

    public static int[][] nilaiTertinggiMahasiswa() {
        System.out.println();
        System.out.println("------------------------------------------------------------------------------------");
        for (int i = 0; i < minggu.length; i++) {
            int nilaiTertinggi = nilai[0][i];
            String namaTertinggi = namaMahasiswa[0];
            for (int j = 1; j < nilai.length; j++) {
                if (nilai[j][i] > nilaiTertinggi) {
                    nilaiTertinggi = nilai[j][i];
                    namaTertinggi = namaMahasiswa[j];
                }
            }
            System.out.println(minggu[i] + ": Nilai tertinggi adalah " + nilaiTertinggi + " oleh mahasiswa atas nama "
                    + namaTertinggi);
        }
        System.out.println("------------------------------------------------------------------------------------");
        return nilai;

    }

}