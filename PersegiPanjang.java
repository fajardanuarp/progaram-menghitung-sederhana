import java.util.Scanner;
public class PersegiPanjang {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukan persegi panjang: " );
            double panjang = scanner.nextDouble();

            System.out.print("Masukan lebar persegi panjang: ");
            double lebar = scanner.nextDouble();

            double luas = panjang * lebar;

            System.out.println("Luas persegi panjang adalah: " + luas);

     }
    
  }
}