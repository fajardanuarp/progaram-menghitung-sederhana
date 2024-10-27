import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        double totalBayar;
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan Total Belanja: ");
        totalBayar = sc.nextDouble();

        if (totalBayar > 70000) {
             totalBayar -= (totalBayar * 0.1);
             System.out.println("Total yang harus dibayar: " + totalBayar);
             System.out.println("Diskon 40% berlaku");
             System.out.println("Kembalian: " + (totalBayar - 70000));
             } else {
             System.out.println("Total yang harus dibayar: " + totalBayar);
             System.out.println("Diskon 0% berlaku");
             System.out.println("Kembalian: " + (totalBayar - 70000));
            
        }
    }
}
