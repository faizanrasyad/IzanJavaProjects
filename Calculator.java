package tugasrpl;

import java.util.*;

public class Calculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a, b, choice1, hasil = 0;
        String choice2;

        System.out.println("Kalkulator Sederhana with Java");
        System.out.println();
        do {
            System.out.println("Pilihan Operasi Perhitungan");
            System.out.println("1. Pertambahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            System.out.print("Pilih Operasi = ");
            choice1 = in.nextInt();
            System.out.print("Masukkan Bilangan Pertama = ");
            a = in.nextInt();
            System.out.print("Masukkan Bilangan Kedua = ");
            b = in.nextInt();

            switch (choice1) {
                case 1:
                    hasil = a + b;
                    break;
                case 2:
                    hasil = a - b;
                    break;
                case 3:
                    hasil = a * b;
                    break;
                case 4:
                    hasil = a / b;
                    break;
                default:
                    System.out.println("Inputan error");
            }

            System.out.println("Hasil = " + hasil);
            System.out.println("");
            System.out.print("Apakah Anda Ingin Mengulang? ");
            choice2 = in.next();
            System.out.println("");

        } while (choice2.equalsIgnoreCase("ya"));

    }

}
