package Dasarpemrograman;

import java.util.Scanner;

public class Jobshet10_No2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[10];

        for (int i = 9; i <= array.length && i >= 0; i--) {
            array[i] = i + 1;
            System.out.println(array[i] + " ");
        }
    }
}
