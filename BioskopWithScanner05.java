import java.util.Scanner;

public class BioskopWithScanner05 {

    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);
        int baris, kolom;
        String nama, next;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.print("Masukan nama: ");
            nama = sc05.nextLine();
            System.out.print("Masukan baris: ");
            baris = sc05.nextInt();
            System.out.print("Masukan kolom: ");
            kolom = sc05.nextInt();
            sc05.nextLine();

            penonton[baris-1][kolom-1] = nama;

            System.out.print("Input penonton lainnya? (y/n): ");
            next = sc05.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}