
package tugasrpl;

import java.util.Scanner;


public class KonversiCelcius {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        
        double c, f, k, r;
        
        System.out.println("KONVERSI CELCIUS KE SKALA SUHU LAIN");
        System.out.println(" ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" ");
        
        System.out.print("Masukkan Celcius = ");
        c=input.nextDouble();
        
        f=32+c*9/5;
        k=c+273;
        r=c*4/5;
        
        System.out.println("Celcius ke Fahrenheit = "+f);
        System.out.println("Celcius ke Kelvin = "+k);
        System.out.println("Celcius ke Reamur = "+r);
    }
}
