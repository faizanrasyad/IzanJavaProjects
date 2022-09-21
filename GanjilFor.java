package tugasrpl;

//NAMA CLASS SALAH
import java.util.Scanner;

//BARIS DAN KOLOM
//BUKAN GANJIL FOR
public class GanjilFor {

    public static void main(String[] args) {
        int i, b, a;

        for (i = 0; i <= 4; i++) {
            for (a = 0; a <= i; a++) {
                System.out.print(" ");
            }
            for (b = 0; b <= i; b++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }

}
