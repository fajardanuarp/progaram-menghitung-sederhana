
import java.util.Scanner;  // Import the Scanner class

public class compare {
    public static void main(String[] args) {
    int num1, num2;
    String statue;

    Scanner sc = new Scanner(System.in);  
    System.out.print("Masukan angka pertama: ");
    num1 = sc.nextInt();

    System.out.print("Masukan angka kedua ");
    num2 = sc.nextInt();

    if ( num1 > num2) {
         statue = " lebih besar dari";  
    } else if (num1 > num2) {
         statue = "sama dengan";
    } else {
         statue = "kurang dari";
    }

    System.out.println(num1 + "itu" + statue + "" + num2);
    sc.close();

  } 
    
}
