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
public class BeliSayur {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        
        String Sayuran, Buah, Kebutuhan_pokok;
        int  harga = 0;
        
        System.out.println("Pilihan Toko Klontong");
        System.out.println("Sayuran");
        System.out.println("Buah");
        System.out.println("Kebutuhan pokok");
        System.out.println("");
        System.out.print("Masukkan pilihan anda: ");
        String choice=in.nextLine();
        
        switch (choice){
            case "Sayuran":System.out.println("Silahkan Mengambil Sayuran");harga=50000;break;
            case "Buah":System.out.println("Silahkan Mengambil Buah");harga=30000;break;
            case "Kebutuhan pokok":System.out.println("Silahkan Mengambil Kebutuhan Pokok");harga=100000;break;
        }
        
        int uang;
        System.out.print("Masukkan Uang Anda: ");
        uang=in.nextInt();
        int kembali=uang-harga;
        
        if (uang<harga){
            System.out.println("Maaf, Uang Anda Kurang");
        }else{
            System.out.println("Kembalian Anda Sejumlah Rp"+kembali);
        }
        
    }
}
