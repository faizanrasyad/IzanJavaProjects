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
public class PostTest {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        int choice;
        
        System.out.println("DAFTAR PIKET KELAS X RPL 6");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("1. Senin");
        System.out.println("2. Selasa");
        System.out.println("3. Rabu");
        System.out.println("4. Kamis");
        System.out.println("5. Jum'at");
        System.out.print("Pilih Hari Piket: ");
        choice=in.nextInt();
        System.out.println("");
        
        if(choice==1){
            System.out.println("Daftar Piket");
            System.out.println("1. Nadia");
            System.out.println("2. Eiza");
            System.out.println("3. Taqi");
            System.out.println("4. Damar");
            System.out.println("5. Rizal");
            System.out.println("6. Rafli");
            System.out.println("7. Zidan M");
            System.out.println("8. Audrey");
        }else if(choice==2){
            System.out.println("Daftar Piket");
            System.out.println("1. Asya");
            System.out.println("2. Revy");
            System.out.println("3. Fairuz");
            System.out.println("4. Tama");
            System.out.println("5. Ardian");
            System.out.println("6. Naufal A");
            System.out.println("7. Tyas");
            System.out.println("8. Bayu");
        }else if(choice==3){
            System.out.println("Daftar Piket");
            System.out.println("1. Fiki");
            System.out.println("2. Hakim");
            System.out.println("3. Tegar");
            System.out.println("4. Bagas");
            System.out.println("5. Yola");
            System.out.println("6. Izan");
            System.out.println("7. Bintang");
            System.out.println("8. Jihan");
        }else if(choice==4){
            System.out.println("Daftar Piket");
            System.out.println("1. Muhammed");
            System.out.println("2. Ucha");
            System.out.println("3. Akmal");
            System.out.println("4. Wikan");
            System.out.println("5. Gilang");
            System.out.println("6. Tama");
            System.out.println("7. Rivaldo");
            System.out.println("8. Dara");
        }else if(choice==5){
            System.out.println("Daftar Piket");
            System.out.println("1. Nova");
            System.out.println("2. Zidan F");
            System.out.println("3. Daffa");
            System.out.println("4. Vindra");
            System.out.println("5. Nauval (AN)");
            System.out.println("6. Naufal R");
            System.out.println("7. Evelyn");
            System.out.println("8. Zaki");
        }else{
            System.out.println("Bukan Hari Piket");
        }
        
        
        
        
        
    }
}
