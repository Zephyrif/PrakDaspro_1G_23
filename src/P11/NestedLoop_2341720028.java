package P11;

import java.util.Scanner;

public class NestedLoop_2341720028{
    public static void main(String[] args) {
        Scanner sc23 = new Scanner(System.in);
        double temps[][] = new double[5][7];
        double  total[] = new double[temps[0].length];
        double  rata[] = new double[temps[0].length];
        for (int i = 0; i < temps.length; i++){
            System.out.println("Masukkan kota ke-" + i);
            for ( int j = 0; j < temps[0].length; j++){
                System.out.print("Masukkan hari ke-" + (j + 1) + ": ");
                temps[i][j] = sc23.nextDouble();
                total[i] += temps[i][j];
                rata[i] = total[i] / temps[0].length;
            }
            System.out.println();
        }
        for (int i = 0; i < temps.length; i++){
            System.out.print("kota ke-" + i + ": ");
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print(temps[i][j] + " ");
            }
            System.out.print(total[i] + " ");
            System.out.println();
            System.out.println("Rata-rata : " + rata[i]);
            System.out.println();
        }
        sc23.close();
    }
}