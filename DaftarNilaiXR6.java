/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasrpl;

import java.util.Scanner;

/**
 *
 * @author moklet
 */
public class DaftarNilaiXR6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String nama[] = {"Izan", "Tegar", "Daffa", "Dara", "Audrey", "Jihan"};
        int nilai[] = {100, 75, 80, 95, 85, 90};
        boolean repeat = true;
        do {
            System.out.println("Daftar Nama Peserta Tes");
            System.out.println("1. Izan");
            System.out.println("2. Tegar");
            System.out.println("3. Daffa");
            System.out.println("4. Dara");
            System.out.println("5. Audrey");
            System.out.println("6. Jihan");
            System.out.print("Pilih Nama Yang Anda Ingin Cek Nilainya(Angka): ");
            int a = in.nextInt();
            System.out.println("");

            System.out.println("Nama: " + nama[a - 1]);
            System.out.println("Nilai: " + nilai[a - 1]);

            if (nilai[a - 1] < 90) {
                System.out.println("Maaf, Anda Tidak Lulus.");
            } else {
                System.out.println("Selamat, Anda Lulus!");
            }
            System.out.println("");

            System.out.print("Apakah Anda Ingin Mengecek Kembali? ");
            String b = in.next();

            if (b.equalsIgnoreCase("tidak")) {
                repeat = false;
            }

        } while (repeat == true);

    }
}
