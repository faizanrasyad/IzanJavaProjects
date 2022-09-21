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
public class SakitDokter {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        
        String nama, keluhan;
        int choice, total = 0;
        
        System.out.print("Nama: ");
        nama=in.nextLine();
        System.out.print("Keluhan: ");
        keluhan=in.nextLine();
        System.out.println("");
        
        System.out.println("Pilihan Tindak Lanjut");
        System.out.println("1. Pasien Sakit Ringan, Perlu Rawat Jalan");
        System.out.println("2. Pasien Sakit Sedang, Perlu Rawat Jalan Dengan Pemantauan");
        System.out.println("3. Pasien Sakit Parah, Perlu Rawat Inap");
        System.out.println("4. Pasien Tidak Sakit");
        System.out.print("Pilih Penindak Lanjutan: ");
        choice=in.nextInt();
        System.out.println("");
        
        switch (choice){
            case 1:total=500000;break;
            case 2:total=500000;break;
            case 3:total=1000000;break;
            case 4:total=10000;break;
        }
        System.out.println("Total Biaya Adalah: Rp"+total);
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
