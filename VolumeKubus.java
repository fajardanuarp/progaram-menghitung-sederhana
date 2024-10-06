import java.util.Scanner;
public class VolumeKubus {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan sisi kubus: ");
            double sisi = scanner.nextDouble();

            double volume = sisi * sisi * sisi;

            System.out.println("Volume kubus adalah: " + volume);
        }
    }  
}

    

