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
public class LoopingStudyCase {

    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        
        int a,b=1;
        
        System.out.print("Masukkan Angka: ");
        a=in.nextInt();
        
        while (b<=a){
            System.out.println(b);
            b+=2;
        }
        
    }
}
