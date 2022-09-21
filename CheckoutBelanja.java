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
public class CheckoutBelanja {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        
        int Sidu, Kiky, Acer, Asus, Ransel, Pouch, Ongkir, HargaBelanja, TotalHarga = 0,OngkirSBY=10000 , OngkirMLG=18000, OngkirKDR=20000, OngkirMJK=14000;
        
        System.out.println("CHECKOUT BARANG BELANJAAN");
        System.out.print("Belanja berapa buku Sidu? ");
        Sidu=in.nextInt();
        System.out.print("Belanja berapa buku Kiky? ");
        Kiky=in.nextInt();
        System.out.print("Belanja berapa laptop Acer? ");
        Acer=in.nextInt();
        System.out.print("Belanja berapa laptop Asus? ");
        Asus=in.nextInt();
        System.out.print("Belanja berapa tas Ransel? ");
        Ransel=in.nextInt();
        System.out.print("Belanja berapa tas Pouch? ");
        Pouch=in.nextInt();
        System.out.println("");
        
        HargaBelanja=(Sidu*15000)+(Kiky*20000)+(Acer*14000000)+(Asus*15000000)+(Ransel*100000)+(Pouch*50000);
        
        System.out.println("KOTA PENGIRIMAN");
        System.out.println("1. Surabaya ");
        System.out.println("2. Malang");
        System.out.println("3. Kediri");
        System.out.println("4. Mojokerto");
        System.out.print("Kemana paket akan dikirimkan? ");
        Ongkir=in.nextInt();
        System.out.println("");
        
        
        switch(Ongkir){
            case 1:TotalHarga=HargaBelanja+10000;break;
            case 2:TotalHarga=HargaBelanja+18000;break;
            case 3:TotalHarga=HargaBelanja+20000;break;
            case 4:TotalHarga=HargaBelanja+14000;break;
        }
        System.out.println("Total Harga Checkout: Rp"+TotalHarga);
        
        
    }
}
