 import java.util.Scanner; 

public class NilaiCount {
    public static void main(String[] args) {
       int angka;
       String nilai;

       System.out.println("masukan angka: ");
       Scanner input = new Scanner(System.in);

       angka = input.nextInt();

       if (angka >= 90 ) {
           nilai = " A ";
       } else if (angka >= 80) {
           nilai = " B ";
       } else if (angka >= 70) {
           nilai = " C ";
       } else if (angka >= 60) {
           nilai = " D ";
       } else {
           nilai = " E ";
       }

       System.out.println( angka + "mendapatkan nilai abjad " + nilai );
       input.close();
    }   
}
