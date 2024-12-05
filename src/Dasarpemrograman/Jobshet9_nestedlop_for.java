package Dasarpemrograman;

import java.util.Scanner;

public class Jobshet9_nestedlop_for {
    public static void main(String[] args) {
        Scanner lana_21 = new Scanner(System.in);
        int sumCol1 = 0;
        int sumCol2 = 0;
        int sumCol3 = 0;
        int sumCol4 = 0;
        int sumCol5 = 0;
        for (int i = 1; i <= 5; i++) {
            int j = 1;
            while (j <= 5) {
                int result = i * j;
                System.out.print(result + "\t");
                if (j == 1) {
                    sumCol1 += result;
                } else if (j == 2) {
                    sumCol2 += result;
                } else if (j == 3) {
                    sumCol3 += result;
                } else if (j == 4) {
                    sumCol4 += result;
                } else if (j == 5) {
                    sumCol5 += result;
                }

                j++;
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Sum: " + sumCol1 + "\t" + sumCol2 + "\t" + sumCol3 + "\t" + sumCol4 + "\t" + sumCol5);
    }

}
