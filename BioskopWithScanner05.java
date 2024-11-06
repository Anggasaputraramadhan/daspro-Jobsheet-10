import java.util.Scanner;

public class BioskopWithScanner05 {

    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);

        String[][] penonton = new String[4][2];

        int menuOption;
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\nMenu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            menuOption = sc05.nextInt();
            sc05.nextLine();

            switch (menuOption) {
                case 1:
                    inputPenonton(penonton, sc05);
                    break;

                case 2:
                    tampilkanPenonton(penonton);
                    break;

                case 3:
                    System.out.println("Keluar dari program...");
                    isRunning = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        }

        sc05.close();
    }

    public static void inputPenonton(String[][] penonton, Scanner sc) {
        int baris, kolom;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Masukkan nomor baris (1-4): ");
            baris = sc.nextInt();
            System.out.print("Masukkan nomor kolom (1-2): ");
            kolom = sc.nextInt();
            sc.nextLine();

            if (baris >= 1 && baris <= penonton.length && kolom >= 1 && kolom <= penonton[0].length) {
            
                penonton[baris - 1][kolom - 1] = sc.nextLine();
                System.out.println("Data penonton berhasil diinput pada baris " + baris + ", kolom " + kolom + ".");
                validInput = true;
            } else {
                System.out.println("Nomor baris atau kolom tidak valid! Silakan coba lagi.");
            }
        }
    }

    public static void tampilkanPenonton(String[][] penonton) {
        System.out.println("\nDaftar Penonton:");
        for (int i = 0; i < penonton.length; i++) {
            System.out.print("Baris ke-" + (i + 1) + ": ");
            for (int j = 0; j < penonton[i].length; j++) {
                if (penonton[i][j] != null) {
                    System.out.print(penonton[i][j] + " ");
                } else {
                    System.out.print("Kosong ");
                }
            }
            System.out.println();

        }
    }
}