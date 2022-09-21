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
public class SwitchCaseMakanan {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        
        int HargaMakan = 0, uang, kembalian;
        String a="Ya";
        
        System.out.println("MENU WARUNG BU TEDJO");
        System.out.println("bakso");
        System.out.println("mie ayam");
        System.out.println("rawon");
        System.out.println("nasi pecel");
        System.out.println("kupang ");
        System.out.println("");
        
        System.out.print("Masukkan makanan yang dibeli: ");
        String pilihan=in.nextLine();
        
        switch (pilihan){
            case "bakso":HargaMakan=10000;break;
            case "mie ayam":HargaMakan=8000;break;
            case "rawon":HargaMakan=12000;break;
            case "nasi pecel":HargaMakan=7000;break;
            case "kupang":HargaMakan=13000;break;
        }
        
        while(a.equals("Ya")){
            System.out.print("Masukkan makanan yang dibeli: ");
        pilihan=in.nextLine();
        
        switch (pilihan){
            case "bakso":HargaMakan=10000;break;
            case "mie ayam":HargaMakan=8000;break;
            case "rawon":HargaMakan=12000;break;
            case "nasi pecel":HargaMakan=7000;break;
            case "kupang":HargaMakan=13000;break;
        }
        }
        
        System.out.print("Masukkan uang yang dimiliki: ");
        uang=in.nextInt();
        System.out.println("");
        
        if(uang>HargaMakan){
            kembalian=uang-HargaMakan;
            System.out.println("Kembalian: "+kembalian);
        }else{
            System.out.println("Maaf, uang anda kurang.");
        }
        
        
    }
}
