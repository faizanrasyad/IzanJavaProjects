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
public class BayarSPPDSP {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        
        int choice1, choice2, SPP = 0, DSP = 0;
        
        System.out.println("PEMBAYARAN DSP DAN SPP");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Pilih Jalur Masuk Anda");
        System.out.println("1. SBMPTN");
        System.out.println("2. SNMPTN");
        System.out.println("3. Mandiri");
        System.out.print("Dari Jalur Manakah Anda? ");
        choice1=in.nextInt();
        System.out.println("");
        
        switch (choice1){
            case 1:System.out.println("Pilih Golongan Pendapatan Anda");
                   System.out.println("1. Golongan A");
                   System.out.println("2. Golongan B");
                   System.out.println("3. Golongan C");
                   System.out.print("Apa Golongan Pendapatan Anda? ");
                   choice2=in.nextInt();
                   
                   switch (choice2){
                       case 1:DSP=5000000; SPP=500000;break;
                       case 2:DSP=15000000; SPP=1000000;break;
                       case 3:DSP=30000000; SPP=2000000;break;
                   }
                   break;
            case 2:System.out.println("Pilih Golongan Pendapatan Anda");
                   System.out.println("1. Golongan A");
                   System.out.println("2. Golongan B");
                   System.out.println("3. Golongan C");
                   System.out.print("Apa Golongan Pendapatan Anda? ");
                   choice2=in.nextInt();
                   
                   switch (choice2){
                       case 1:DSP=7000000; SPP=500000;break;
                       case 2:DSP=17000000; SPP=1000000;break;
                       case 3:DSP=35000000; SPP=2000000;break;
                   } 
                   break;
            case 3:System.out.println("Pilih Golongan Pendapatan Anda");
                   System.out.println("1. Golongan A");
                   System.out.println("2. Golongan B");
                   System.out.println("3. Golongan C");
                   System.out.print("Apa Golongan Pendapatan Anda? ");
                   choice2=in.nextInt();
                   
                   switch (choice2){
                       case 1:DSP=10000000; SPP=1000000;break;
                       case 2:DSP=25000000; SPP=2000000;break;
                       case 3:DSP=50000000; SPP=3000000;break;
                   }       
                   break;
        }
        System.out.println("");
        System.out.println("Pembayaran DSP Anda Sejumlah Rp"+DSP);
        System.out.println("Pembayaran SPP Anda Sejumlah Rp"+SPP);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
