
package tugasrpl;

import java.util.Scanner;


public class RataRata {
    public static void main(String[] args) {
        Scanner input=new Scanner  (System.in);
        
        int mat, ing, ind, fis, kim, rpl, inf, sen, mean;
        String nama;
        
        System.out.println("RATA-RATA NILAI SISWA SDN ASGARD 3");
        System.out.println(" ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" ");
        
        System.out.print("Masukkan nama lengkap = ");
        nama=input.nextLine();
        System.out.println(" ");
        
        System.out.print("Masukkan nilai Matematika = ");
        mat=input.nextInt();
        System.out.print("Masukkan nilai Bahasa Inggris = ");
        ing=input.nextInt();
        System.out.print("Masukkan nilai Bahasa Indonesia = ");
        ind=input.nextInt();
        System.out.print("Masukkan nilai Fisika = ");
        fis=input.nextInt();
        System.out.print("Masukkan nilai Kimia = ");
        kim=input.nextInt();
        System.out.print("Masukkan nilai Produktif RPL = ");
         rpl=input.nextInt();
        System.out.print("Masukkan nilai Informatika = ");
        inf=input.nextInt();
        System.out.print("Masukkan nilai Seni Budaya = ");
        sen=input.nextInt();
        
        
        mean=(mat+ing+ind+fis+kim+rpl+inf+sen)/8;
                
        System.out.println("Nilai Rata-Rata = "+mean);
        
        if (mean>75){
            System.out.println("Selamat "+nama+", kamu lulus!!");
        }else{
            System.out.println("Mohon maaf "+nama+", kamu gagal.");
        }
      
        
    }
}
