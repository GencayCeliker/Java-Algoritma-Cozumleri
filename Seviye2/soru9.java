package Seviye2;

import java.util.Random;

public class soru9 {
    public static void main(String[] args) {
        /*  Ekrana 20 adet rastgele tamsayılar yazdırınız*/
        Random r = new Random();
        for (int i = 1; i <= 20; i++) {
            int a = r.nextInt();
            System.out.println(i + ". Random Sayı Oluşturuluyor: " + a);
        }
    }
}
