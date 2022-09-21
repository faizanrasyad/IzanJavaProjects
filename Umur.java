
package tugasrpl;

import java.util.Scanner;


public class Umur {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        
        int thn, umur;
        String nama;
        
        System.out.println("BERAPA UMUR ANDA??");
        System.out.println(" ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" ");
        
        System.out.print("Masukkan nama = ");
        nama=input.nextLine();
        System.out.print("Tahun Lahir = ");
        thn=input.nextInt();
        
        umur=2022-thn;
        
        System.out.println("Umur "+nama+" tahun ini adalah "+umur);
        
    }
}
