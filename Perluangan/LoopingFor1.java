package Perluangan;

public class LoopingFor1 {
    public static void main(String[] args) {
        int hurufA = 0;
        int hurufB = 1;

        System.out.print(hurufA + " " + hurufB + " ");
        
        for (int i = 2; i <= 15; i++) {
            int hurufC = hurufA + hurufB; 
            System.out.print(hurufC + " " );
            hurufA = hurufB;
            hurufB = hurufC;  
        }     
    }
}