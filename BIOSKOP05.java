import java.util.Scanner;

public class BIOSKOP05 {

    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);

        String[][] penonton = new String[4][2];

        penonton[0][0] = "Amin";
        penonton[0][1] = "Bena";
        penonton[1][0] = "Candra";
        penonton[1][1] = "Dela";
        penonton[2][0] = "Eka";
        penonton[2][1] = "Farhan";
        penonton[3][0] = "Gisel";
        penonton[3][1] = "Hadi";

        System.out.printf("%s \t %s\n", penonton[0][0], penonton[0][1]);
        System.out.printf("%s \t %s\n", penonton[1][0], penonton[1][1]);
        System.out.printf("%s \t %s\n", penonton[2][0], penonton[2][1]);
        System.out.printf("%s \t %s\n", penonton[3][0], penonton[3][1]);

        System.out.println(penonton.length);
        System.out.println(penonton[0].length);
        System.out.println(penonton[1].length);
        System.out.println(penonton[2].length);
        System.out.println(penonton[3].length);

        System.out.println("\nJumlah baris dalam array penonton (penonton.length): " + penonton.length);

        for (int i = 0; i < penonton.length; i++) {
            System.out.println("Panjang kolom pada baris ke-" + (i + 1) + " (penonton[" + i + "].length): " + penonton[i].length);
        }

        int barisKe = 1;
        for (String[] baris : penonton) {
            System.out.println("Panjang kolom pada baris ke-" + barisKe + " (baris.length): " + baris.length);
            barisKe++;
        }

        System.out.println("\nNama penonton pada baris ke-3:");
        for (int i = 0; i < penonton[2].length; i++) {
            System.out.println(penonton[2][i]);
        }

        System.out.println("\nNama penonton pada baris ke-3:");
        for (String nama : penonton[2]) {
            System.out.println(nama);
        }

        System.out.println("Daftar Penonton:");
        for (int i = 0; i < penonton.length; i++) {
            System.out.print("Baris ke-" + (i + 1) + ": ");
            for (String nama : penonton[i]) {
                System.out.print(nama + " ");
            }
            System.out.println();
        }
    
    }
}