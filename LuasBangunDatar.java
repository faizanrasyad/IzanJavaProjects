
package tugasrpl;

import java.util.Scanner;


public class LuasBangunDatar {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        
        int s, p, r, l, a, t, hasil, pilihan;

        System.out.println("Kalkulator Luas Bangun Datar");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran");
        System.out.println("4. Segitiga");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        System.out.print("Pilih Bangun Datar = ");
        pilihan=input.nextInt();
        
        switch (pilihan){
            case 1:
                 System.out.print("Masukkan panjang sisi = ");
                 s=input.nextInt();
                 hasil=s*s;
                 break;
                 
            case 2:
                System.out.print("Masukkan panjang = ");
                p=input.nextInt();
                System.out.print("Masukkan lebar = ");
                l=input.nextInt();
                hasil=p*l;
                break;
                
            case 3:
                System.out.print("Masukkan panjang jari-jari = ");
                r=input.nextInt();
                double nilai=3.14*r*r;
                System.out.println(nilai);
                break;
                
            case 4:
                System.out.print("Masukkan panjang alas = ");
                a=input.nextInt();
                System.out.print("Masukkan panjang tinggi = ");
                t=input.nextInt();
                hasil=a*t*1/2;
                break;
                    
                
        }        
    
    }
    
}

