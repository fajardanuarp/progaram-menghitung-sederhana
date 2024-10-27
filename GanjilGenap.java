import java.util.Scanner;

/**
 * ucup
 */
public class GanjilGenap {

    public static void main(String[] args) {
        
        int num;
        String jenis;

        Scanner input = new Scanner (System.in);

        System.out.print("Masukan angka: ");
        num = input.nextInt();
        
        if (num % 2 == 0) {
            jenis = "Genap";
            
        } else {
            jenis = "Ganjil";
    
        System.out.println(num + " adalah termasuk bilangan " + jenis);
        input.close();
        
    }
  }
}