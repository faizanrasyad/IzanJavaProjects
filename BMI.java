package tugasrpl;

import java.net.SocketTimeoutException;
import java.util.Scanner;

// Referensi Diambil Dari https://kelasprogrammer.com/program-java-menghitung-berat-badan-ideal/

public class BMI {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        String ulang;
        double ideal=0;

        System.out.println("Kalkulator BMI");
        System.out.println();

        do{
        System.out.println("1. Laki-Laki");
        System.out.println("2. Perempuan");
        System.out.print("Masukkan Jenis Kelamin: ");
        int kelamin=in.nextInt();

        System.out.print("Masukkan Berat Badan (Kg): ");
        float berat=in.nextFloat();

        System.out.print("Masukkan Tinggi Badan (Cm): ");
        float tinggi=in.nextFloat();

        System.out.println("--------------------------------------------------------------");

        float meter=tinggi/100;
        float bmi=berat/meter*meter;

        System.out.print("BMI Anda Adalah "+bmi+" -- ");

        if (bmi<18.5){
            System.out.println("Anda Kurus");
        }else if (bmi<=24.9){
            System.out.println("Anda Normal");
        }else if (bmi<29.9){
            System.out.println("Anda Overweight"); 
        }else {
            System.out.println("Anda Obesitas"); 
        }

        switch (kelamin){
            case 1:ideal=(tinggi-100)-(0.1*(tinggi-100));break;
            case 2:ideal=(tinggi-100)-(0.15*(tinggi-100));break;
        }

        int hasil=(int)ideal;
        System.out.println("Berat Badan Ideal Anda Adalah "+hasil+" Kg");
        System.out.println();

        System.out.print("Apakah Anda Ingin Mengecek Kembali? ");
        ulang=in.next();
        System.out.println();

        }while(ulang.equalsIgnoreCase("iya"));

    }
}
