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
public class BeliMobil {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        
        int choice1, choice2, HargaMobil=0, Total=0;
        
        System.out.println("DEALER MOBIL HONDA");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("1. Brio");
        System.out.println("2. Jazz");
        System.out.println("3. CR-V");
        System.out.println("4. BR-V");
        System.out.println("5. HR-V");
        System.out.print("Ingin membeli mobil apa? ");
        choice1=in.nextInt();
        System.out.println("");
        
        switch (choice1){
            case 1:HargaMobil=200000000;
            case 2:HargaMobil=280000000;
            case 3:HargaMobil=655000000;
            case 4:HargaMobil=300000000;
            case 5:HargaMobil=518000000;
        }
        System.out.println("PILIH WARNA MOBIL");
        System.out.println("1. Hitam");
        System.out.println("2. Putih");
        System.out.println("3. Merah");
        System.out.println("4. Abu-Abu");
        System.out.print("Apa warna yang anda inginkan? ");
        choice2=in.nextInt();
        System.out.println("");
        
        switch (choice2){
            case 1:Total=HargaMobil+0;
            case 2:Total=HargaMobil+100000;
            case 3:Total=HargaMobil+200000;
            case 4:Total=HargaMobil+150000;
        }
        System.out.println("Total harga mobil anda: Rp"+Total);
        
    }
}
