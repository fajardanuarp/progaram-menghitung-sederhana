import java.util.Scanner;

public class Positif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        String jenis;

        System.out.print("Masukan angka yang ingin dicek: ");

        num = sc.nextInt();

        if (num > 0) {
            jenis = "Positif";
        } else if (num < 0) {
            jenis = "netral";
        } else {
            jenis = "negatif";
        }

        System.out.println(num + " adalah " + jenis);
        sc.close();
    }
         
}
