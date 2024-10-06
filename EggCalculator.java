import java.util.Scanner;

public class EggCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah telur (kg): ");
        double eggWeight = scanner.nextDouble();

        double totalPrice = eggWeight * 28000;
        System.out.print("Total bayar: " + totalPrice + "\n");

        System.out.print("Masukkan uang yang diberikan: ");
        double payment = scanner.nextDouble();

        double change = payment - totalPrice;
        System.out.println("Uang kembalian: " + change);
    }
}