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
public class GanjilFor2 {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        int a,b ;
        
        System.out.print("Masukkan batas bilangan: ");
        b=in.nextInt();
        
        for (a=1;a<=b;a+=2){
            System.out.print(a+"\t");
        }
        System.out.println("");
    }
}
