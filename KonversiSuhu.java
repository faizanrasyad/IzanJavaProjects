
package tugasrpl;

import java.util.Scanner;




public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        
        double c, f, k, r, f1, r1, c1, k1, f2, c2, k2, r2, c3, r3, f3, k3;
        
        System.out.println("KONVERSI SUHU CELCIUS");


        c=30.2;
        f=32+c*9/5;
        k=c+273;
        r=c*4/5;
        
        System.out.println("Celcius ke Fahrenheit = "+f);
        System.out.println("Celcius ke Kelvin = "+k);
        System.out.println("Celcius ke Reamur = "+r);
        
        System.out.println("");
        System.out.println("KONVERSI SUHU FAHRENHEIT");
        
        f1=74.5;
        c1=(f1-32)*5/9;
        k1=(f1-32)*5/9+273;
        r1=(f1-32)*4/9;
        
        System.out.println("Fahrenheit ke Celcius = "+c1);
        System.out.println("Fahrenheit ke Kelvin = "+k1);
        System.out.println("Fahrenheit ke Reamur = "+r1);
        
        System.out.println("");
        System.out.println("KONVERSI SUHU KELVIN");
        
        k2=416;
        c2=k2-273;
        f2=(k2-273)*9/5+32;
        r2=(k2-273)*4/5;
        
        System.out.println("Kelvin ke Celcius = "+c2);
        System.out.println("Kelvin ke Fahrenheit = "+f2);
        System.out.println("Kelvin ke Reamur = "+r2);
        
        System.out.println("");
        System.out.println("KONVERSI SUHU REAMUR");
        
        r3=69.5;
        c3=r3*5/4;
        f3=r3*9/4+32;
        k3=c3+273;
        
        System.out.println("Reamur ke Celcius = "+c3);
        System.out.println("Reamur ke Fahrenheit = "+f3);
        System.out.println("Reamur ke Kelvin = "+k3);
        
    }
}
