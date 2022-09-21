/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasrpl;

import java.util.Scanner;

/**
 *
 * @author moklet
 */
public class If {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        int a;
        
        System.out.print("Masukkan Bilangan = ");
        a=in.nextInt();
        
        if (a>0 && a<5){
            System.out.println("Bilangan tersebut adalah bilangan 1-5");
        }if (a>5 && a<11){
            System.out.println("Bilangan tersebut adalah bilangan 6-10");
        }if (a>10){
            System.out.println("Bilangan tersebut adalah bilangan yang lebih dari 10");
        }
    }
}
