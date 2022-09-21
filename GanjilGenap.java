
package tugasrpl;

import java.util.Scanner;


public class GanjilGenap {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        
        int a, gg;
        
        System.out.println("MENENTUKAN GANJIL GENAP");
        System.out.println(" ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" ");
        
        System.out.print("Masukkan Bilangan = ");
        a=input.nextInt();
   
        gg=a%2;
 
        
        if (gg==0){
            System.out.println("Bilangan "+a+" adalah Bilangan Genap");
        }else{
            System.out.println("Bilangan "+a+" adalah Bilangan Ganjil");
        }
    }
}
