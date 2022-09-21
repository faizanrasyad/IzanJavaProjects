
package tugasrpl;

import java.util.Scanner;


public class LuasPersegiPanjang {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        
        int p, l, luas;
        
        System.out.println("LUAS PERSEGI PANJANG");
        System.out.println(" ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" ");
        
        System.out.print("Masukkan panjang = ");
        p=input.nextInt();
        System.out.print("Masukkan lebar = ");
        l=input.nextInt();
        
        luas=p*l;
        
        System.out.println("Luas Persegi Panjang = "+luas);
    }
}
