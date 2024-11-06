import java.util.ArrayList;
import java.util.Scanner;

public class SIAKAD05 {

    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);

        int jumlahSiswa, jumlahMatkul;
        double totalPerMatkul, totalPerSiswa;
        int[][] nilai = new int[4][3];
        System.out.println("Masukan jumlah siswa: ");
        int jumlahSiswaa = sc05.nextInt();
        System.out.println("Masukan jumlah mata kuliah ");
        int jumlahMatkull = sc05.nextInt();

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j+i) + ": ");
                nilai[i][j] = sc05.nextInt();
            }
        }
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            double totalPerSiswaa = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j+1) + ": ");
                nilai[i][j] = sc05.nextInt();
                totalPerSiswa += nilai[i][j];
            }

            System.out.println("Nilai rata-rata: " + totalPerSiswa);
        }

        System.out.println("\n===============================");
        System.out.println("Rata-Rata Nilai Setiap Mata Kuliah:");

        for (int j = 0; j < 3; j++) {
            double totalPerMatkull = 0;

            for (int i = 0; i < 4; i++); {
                totalPerMatkul += totalPerSiswa += nilai[i][j];
            }

            System.out.println("Mata Kuliah " + (j + i) + ": " + totalPerMatkul / 4);
        }
    }
}
