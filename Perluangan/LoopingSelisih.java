package Perluangan;

public class LoopingSelisih {
    public static void main(String[] args) {
        int nilai = 1;
        int selisih = 0; 
        for (int i = 0; i < 17; i++) {
            System.out.print(nilai + " ");
            if (i == 0 || i == 1) {
                selisih = 0;
            } else {
                selisih += 2; 
            }
            nilai += selisih; 
        }
    }
}