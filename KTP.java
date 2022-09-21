
package tugasrpl;

import java.util.Scanner;


public class KTP {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        String nik, nama, alamat;
        int umur;
        
        System.out.println("DATA DIRI E-KTP");
        System.out.println("---------------------------------------");
        
        System.out.print("Masukkan NIK = ");
        nik=in.nextLine();
        System.out.print("Masukkan Nama Lengkap = ");
        nama=in.nextLine();
        System.out.print("Masukkan Alamat Lengkap = ");
        alamat=in.nextLine();
        System.out.print("Masukkan Umur = ");
        umur=in.nextInt();
        
        
        System.out.println(" "+"\n"+"HASIL DATA DIRI E-KTP"+"\n"+"NIK: "+nik+"\n"+"Nama: "+nama+"\n"+"Alamat: "+alamat+"\n"+"Umur: "+umur);
        
        
        
        
    }
}
