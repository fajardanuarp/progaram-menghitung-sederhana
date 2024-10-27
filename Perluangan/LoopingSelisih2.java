package Perluangan;

public class LoopingSelisih2 {
    public static void main(String[] args) {
        int nilai = 1; 
        int selisih = 1; 
        
        for (int i = 1; i < 17; i++) {
            System.out.print(nilai + " ");
            if (i == 0) {
                nilai += 1; 
            } else {
                nilai += selisih; 
                selisih++; 
            }
        }
    }
}