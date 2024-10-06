import java.util.Scanner;

public class CelciusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan celcius: ");
        double eggWeight = scanner.nextDouble();
        double fahrenheit = (eggWeight * 9 / 5) + 32;
        System.out.println("Fahrenheit: " + fahrenheit);
    }
}