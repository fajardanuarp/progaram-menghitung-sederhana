import java.util.Scanner;
public class penjualanJeruk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah jeruk yang ingin dibeli: ");
        int jumlahJeruk = scanner.nextInt();
        int harga;
        if (jumlahJeruk == 1) {
            harga = 3000;
        } else if (jumlahJeruk == 2) {
            harga = 5000;
        } else if (jumlahJeruk == 5) {
            harga = 10000;
        }else if (jumlahJeruk % 5 == 0) {
            harga = jumlahJeruk*10000 / 5;
        }else if (jumlahJeruk > 5) {
            harga = (jumlahJeruk / 5) * 10000 + (jumlahJeruk % 5) * 3000 - 1000;
        } else {
            harga = 0;
        }
        System.out.println("Beli " + jumlahJeruk + " = " + harga + " Rupiah");
        scanner.close();
    }
}