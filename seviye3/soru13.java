package seviye3;

import java.util.Random;

public class soru13 {
    public static void main(String[] args) {
        // Ekrana rastgele koordinatlara rastgele renklerle rastgele harfler yazdırınız 
        Random a = new Random();
        int kordinat;
        String[] alfabe = { "A", "B", "C", "D", "E", "F", "G", "H", "K", "L", "M", "N", "X", "Y", "Z" };
        String[] renk = { SARI, MAVI, KIRMIZI, MAGENTA, YESIL };
        /*
         * for(int i=0;i<5;i++) {
         * kordinat=a.nextInt(1,13);
         * if(i<5) {
         * System.out.print(renk[i]+dizi[kordinat]+" ".repeat(kordinat));
         * }
         */
        int i;
        for (int j = 0; j <500; j++) {
            i = a.nextInt(0, renk.length);
            kordinat = a.nextInt(0, alfabe.length);
            System.out.print(renk[i] + alfabe[kordinat]+ "  ".repeat(kordinat));
        }
    }

    public static final String SARI = "\u001B[33m";
    public static final String MAVI = "\u001B[36m";
    public static final String KIRMIZI = "\u001B[31m";
    public static final String MAGENTA = "\u001B[35m";
    public static final String YESIL ="\u001B[32m";
}