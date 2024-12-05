package Dasarpemrograman;

import java.util.Scanner;

public class Jobsheet10_no1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[30];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }
}
