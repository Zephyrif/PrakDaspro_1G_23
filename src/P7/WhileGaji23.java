package P7;
import java.util.Scanner;

public class WhileGaji23 {
    public static void main(String[] args) {
        Scanner scan23 = new Scanner(System.in);
        int jumlahKaryawan, jumlahJamLembur;
        double gajiLembur = 0, totalGajiLembur = 0;
        String jabatan;
        System.out.print("Masukkan jumlah karyawan: ");
        jumlahKaryawan = scan23.nextInt();
        int i = 0;
        while (i < jumlahKaryawan) {
            System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan");
            System.out.println("Masukkan jabatan karyawan ke-" + (i+1) + ": ");
            jabatan = scan23.next();
            System.out.println("Masukkan jumlah jam lebur: ");
            jumlahJamLembur = scan23.nextInt();
            if (jabatan.equalsIgnoreCase("Direktur")) {
                continue;
            } else if (jabatan.equalsIgnoreCase("manajer")) {
                gajiLembur= jumlahJamLembur * 100000;
            } else if (jabatan.equalsIgnoreCase("karyawan")) {
                gajiLembur = jumlahJamLembur * 75000;
            }
            totalGajiLembur += gajiLembur;
            i++;
        }
        System.out.println("Total gaji lembur: " + totalGajiLembur);
        scan23.close();
    }
}
