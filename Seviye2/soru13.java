package Seviye2;

public class soru13 {
    public static void main(String[] args) {
        /* 1 den 30 a kadar olan sayılar içersinde yer alan “asal sayı”ları ekrana 
    yazdırınız. */
        for (int j = 1; j <= 30; j++) {
            if (asal(j)) {
                System.out.println("\n" + j);
            }
        }
    }

    public static boolean asal(int sayi) {
        if (sayi <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(sayi); i++) {
            if (sayi % i == 0) {
                return false;
            }
        }
        return true;
    }
}
