package Rekursif;

import java.util.Scanner;

public class Tugas1_23 {
    static void rekursif(int n) {
        if (n <= 0) {
            System.out.println(n);
            return;
        }
        System.out.print(n + ", ");
        rekursif(n - 1);
    }

    static void iteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i);
            if (i != 0)
                System.out.print(", ");
        }
    }

    public static void main(String[] args) {
        Scanner sc23 = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int n = sc23.nextInt();
        System.out.println("Deret rekursif: ");
        rekursif(n);
        System.out.println("Deret iteratif: ");
        iteratif(n);
        sc23.close();
    }
}