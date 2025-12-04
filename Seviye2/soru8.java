package Seviye2;

import java.util.Scanner;

public class soru8 {
    public static void main(String[] args) {
        /* Peşpeşe girilen 10 tane sayının kaç tanesinin tek, kaç tanesinin çift 
        olduğunu söyleyen, ve bu tek-çift sayıların toplamını ekrana yazdıran 
        programı yazınız.  */
        int tek = 0;
        int cift = 0;
        int ta = 0, ca = 0;

        Scanner sa = new Scanner(System.in);
        for (int k = 1; k <= 10; k++) {
            System.out.print(k + ".Sayıyı Giriniz: ");
            int n = sa.nextInt();
            if (n % 2 == 0) {
                cift = cift + n;
                ca++;
                System.out.println("Çift SayılarınToplamı: " + cift + "Çift Adeti" + ca);
            } else {
                tek = tek + n;
                ta++;
                System.out.println("Tek SayılarınToplamı: " + tek + " Tek Adedi: " + ta);
            }

        }
        System.out.println("Tek Ve Çift Sayıların Toplamı: " + (tek + cift));
        sa.close();
    }

}
