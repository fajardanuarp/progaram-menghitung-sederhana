import java.util.Scanner;

public class Kelulusan {
    public static void main(String[] args) {
        int Nilai = 0;
        String Lulus;

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai anda : ");
        Nilai = sc.nextInt();

        if  (Nilai > 75) {
            Lulus = "Lulus";
        } else if (Nilai < 75) {
            Lulus = "Tidak lulus";
        } else {
            Lulus = "Tidak lulus";
        }

        System.out.println("Nilai itu termasuk kedalam kategori " + Lulus);
        sc.close();


    }
}
