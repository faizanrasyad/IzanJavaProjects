package tugasrpl;

import java.util.Scanner;

public class PenilaianXRPL6 {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);

        System.out.println("PENILAIAN X RPL 6");
        System.out.println();

        System.out.print("Masukkan Nilai Pertama: ");
        int satu=in.nextInt();
        System.out.print("Masukkan Nilai Kedua: ");
        int dua=in.nextInt();
        System.out.print("Masukkan Nilai Ketiga: ");
        int tiga=in.nextInt();
        System.out.print("Masukkan Nilai Keempat: ");
        int empat=in.nextInt();
        System.out.print("Masukkan Nilai Kelima: ");
        int lima=in.nextInt();

        System.out.println("-------------------------------------------------------");
        System.out.println("HASIL PENILAIAN");

        // Percabangan Nilai Pertama
        if (satu<=60){
            System.out.println("Nilai Pertama: "+satu+" -- Nilai Anda Kurang");
        }else if(satu>60 && satu<=70){
            System.out.println("Nilai Pertama: "+satu+" -- Nilai Anda Cukup");
        }else if(satu>70 && satu<=80){
            System.out.println("Nilai Pertama: "+satu+" -- Nilai Anda Baik");
        }else if(satu>80){
            System.out.println("Nilai Pertama: "+satu+" -- Nilai Anda Luwar Binasa");
        }else{
            System.out.println("Inputan Error");
        }

        // Percabangan Nilai Kedua
        if (dua<=60){
            System.out.println("Nilai Kedua: "+dua+" -- Nilai Anda Kurang");
        }else if(dua>60 && dua<=70){
            System.out.println("Nilai Kedua: "+dua+" -- Nilai Anda Cukup");
        }else if(dua>70 && dua<=80){
            System.out.println("Nilai Kedua: "+dua+" -- Nilai Anda Baik");
        }else if(dua>80){
            System.out.println("Nilai Kedua: "+dua+" -- Nilai Anda Luwar Binasa");
        }else{
            System.out.println("Inputan Error");
        }

        // Percabangan Nilai Ketiga
        if (tiga<=60){
            System.out.println("Nilai Ketiga: "+tiga+" -- Nilai Anda Kurang");
        }else if(tiga>60 && tiga<=70){
            System.out.println("Nilai Ketiga: "+tiga+" -- Nilai Anda Cukup");
        }else if(tiga>70 && tiga<=80){
            System.out.println("Nilai Ketiga: "+tiga+" -- Nilai Anda Baik");
        }else if(tiga>80){
            System.out.println("Nilai Ketiga: "+tiga+" -- Nilai Anda Luwar Binasa");
        }else{
            System.out.println("Inputan Error");
        }

        // Percabangan Nilai Keempat
        if (empat<=60){
            System.out.println("Nilai Keempat: "+empat+" -- Nilai Anda Kurang");
        }else if(empat>60 && empat<=70){
            System.out.println("Nilai Keempat: "+empat+" -- Nilai Anda Cukup");
        }else if(empat>70 && empat<=80){
            System.out.println("Nilai Keempat: "+empat+" -- Nilai Anda Baik");
        }else if(empat>80){
            System.out.println("Nilai Keempat: "+empat+" -- Nilai Anda Luwar Binasa");
        }else{
            System.out.println("Inputan Error");
        }

        // Percabangan Nilai Kelima
        if (lima<=60){
            System.out.println("Nilai Kelima: "+lima+" -- Nilai Anda Kurang");
        }else if(lima>60 && lima<=70){
            System.out.println("Nilai Kelima: "+lima+" -- Nilai Anda Cukup");
        }else if(lima>70 && lima<=80){
            System.out.println("Nilai Kelima: "+lima+" -- Nilai Anda Baik");
        }else if(lima>80){
            System.out.println("Nilai Kelima: "+lima+" -- Nilai Anda Luwar Binasa");
        }else{
            System.out.println("Inputan Error");
        }

        System.out.println();
        System.out.println("RATA RATA NILAI");
        double jumlah=satu+dua+tiga+empat+lima;
        jumlah=jumlah/5;
        if (jumlah<=60){
            System.out.println("Rata Rata Nilai: "+jumlah+" -- Nilai Anda Kurang");
        }else if(jumlah>60 && jumlah<=70){
            System.out.println("Rata Rata Nilai: "+jumlah+" -- Nilai Anda Cukup");
        }else if(jumlah>70 && jumlah<=80){
            System.out.println("Rata Rata Nilai: "+jumlah+" -- Nilai Anda Baik");
        }else if(jumlah>80){
            System.out.println("Rata Rata Nilai: "+jumlah+" -- Nilai Anda Luwar Binasa");
        }else{
            System.out.println("Inputan Error");
        }

    }
}
