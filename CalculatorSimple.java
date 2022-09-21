
package tugasrpl;

import java.util.Scanner;


public class CalculatorSimple {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        int a, b, c, d, e, f, g;
        
        System.out.println("KALKULATOR SIMPEL");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        System.out.print("Masukkan Bilangan Pertama = ");
        a=in.nextInt();
        System.out.print("Masukkan Bilangan Kedua = ");
        b=in.nextInt();
        
        c=a+b;
        d=a-b;
        e=a*b;
        f=a/b;
        g=a%b;
        
        
        System.out.println("Hasil Penjumlahan = "+c);
        System.out.println("Hasil Pengurangan = "+d);
        System.out.println("Hasil Perkalian = "+e);
        System.out.println("Hasil Pembagian = "+f);
        System.out.println("Hasil Modulus = "+g);
        
    }
}
