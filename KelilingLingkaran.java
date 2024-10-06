import java.util.Scanner;
public class KelilingLingkaran {

    public static void main(String [] args) {
        try (Scanner scanner = new Scanner(System.in) ) {
            System.out.print("masukan jari-jari lingkaran  ");
            double radius = scanner.nextDouble();

            double keliling = 2 * Math.PI * radius ;

            System.out.println("keliling lingkaran adalah: " + keliling);
        }
        
    }
}