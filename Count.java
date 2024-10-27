import java.util.Scanner;

public class Count {
    public static void main(String[] args) throws Exception {
        Double totalBelanja, totalBayar, discount;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Total Belanja: ");
        totalBelanja = sc.nextDouble();

        if (totalBelanja > 200000)
          discount = 12.0/100 * totalBelanja;
        else if (totalBelanja > 100000)
          discount = 10.0/100 * totalBelanja;
        else if (totalBelanja > 50000)
          discount = 5.0/100 * totalBelanja;
        else 
            discount = 0.0;

        totalBayar = totalBelanja - discount;
        System.out.println("Total Belanja: " + totalBelanja);
        System.out.println("Discount: " + discount);
        System.out.println("Total Bayar: " + totalBayar);
        sc.close();


   } 
}
