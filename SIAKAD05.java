import java.util.ArrayList;
import java.util.Scanner;

public class SIAKAD05 {

    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = sc05.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatkul = sc05.nextInt();

        ArrayList<ArrayList<Integer>> nilai = new ArrayList<>();

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Input nilai untuk mahasiswa ke-" + (i + 1));
            ArrayList<Integer> nilaiSiswa = new ArrayList<>();

            for (int j = 0; j < jumlahMatkul; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilaiSiswa.add(sc05.nextInt());
            }
            nilai.add(nilaiSiswa);
        }

        System.out.println("\n===============================");
        for (int i = 0; i < jumlahSiswa; i++) {
            ArrayList<Integer> nilaiSiswa = nilai.get(i);
            double totalNilai = 0;

            System.out.println("Nilai mahasiswa ke-" + (i + 1));
            for (int j = 0; j < jumlahMatkul; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": " + nilaiSiswa.get(j) + " ");
                totalNilai += nilaiSiswa.get(j);
            }

            double rataRataSiswa = totalNilai / jumlahMatkul;
            System.out.println("\nRata-rata nilai mahasiswa ke-" + (i + 1) + ": " + rataRataSiswa);
        }

        System.out.println("\n===============================");
        System.out.println("Rata-rata nilai setiap mata kuliah:");
        for (int j = 0; j < jumlahMatkul; j++) {
            double totalNilaiMatkul = 0;

            for (int i = 0; i < jumlahSiswa; i++) {
                totalNilaiMatkul += nilai.get(i).get(j);
            }

            double rataRataMatkul = totalNilaiMatkul / jumlahSiswa;
            System.out.println("Mata kuliah " + (j + 1) + ": " + rataRataMatkul);
        }
    }
}