
package tugasrpl;

import java.util.Scanner;


public class KelilingPersegiPanjang {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        
        int p, l, kel;
        
        System.out.println("KELILING PERSEGI PANJANG");
        System.out.println(" ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" ");
        
        System.out.print("Masukkan panjang = ");
        p=input.nextInt();
        System.out.print("Masukkan lebar = ");
        l=input.nextInt();
        
        kel=2*(p+l);
        
        System.out.println("Keliling Persegi Panjang = "+kel);
        
    }
}
