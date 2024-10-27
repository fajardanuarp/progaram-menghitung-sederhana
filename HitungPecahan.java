import java.util.Scanner;

public class HitungPecahan {
    public static void main(String[] args) {
        int jumlahUang, Uang100000an, Uang50000an, Uang20000an, Uang10000an, Uang5000an, Uang2000an, Uang1000an, Uang500an, Uang200an, Uang100an ;
        Scanner sc = new Scanner(System.in);
        System.out.print( " masukan jumlah uang ");
        jumlahUang = sc.nextInt();

        Uang100000an = jumlahUang / 100000;
        jumlahUang = jumlahUang % 100000;
        System.out.println(Uang100000an + " keping 100000 ");

        Uang50000an = jumlahUang / 50000;
        jumlahUang = jumlahUang % 50000;
        System.out.println(Uang50000an + " keping 50000 ");

        Uang20000an = jumlahUang / 20000;
        jumlahUang = jumlahUang % 20000;
        System.out.println(Uang20000an + " keping 20000 ");

        Uang10000an = jumlahUang / 10000;
        jumlahUang = jumlahUang % 100000;
        System.out.println(Uang10000an + " keping 10000 ");

        Uang5000an = jumlahUang / 5000;
        jumlahUang = jumlahUang % 5000;
        System.out.println(Uang5000an + " keping 5000 ");

        Uang2000an = jumlahUang / 2000;
        jumlahUang = jumlahUang % 2000;
        System.out.println(Uang2000an + " keping 2000 ");

        Uang1000an = jumlahUang / 1000;
        jumlahUang = jumlahUang % 1000;
        System.out.println(Uang1000an + " keping 1000 ");
        
        Uang500an = jumlahUang / 500;
        jumlahUang = jumlahUang % 500;
        System.out.println(Uang500an + " keping 500 ");

        Uang200an = jumlahUang / 200;
        jumlahUang = jumlahUang % 200;
        System.out.println(Uang200an + " keping 200 ");

        Uang100an = jumlahUang / 100;
        jumlahUang = jumlahUang % 100;
        System.out.println(Uang1000an + " keping 100 ");





        sc.close();












    }
        

        
   }

