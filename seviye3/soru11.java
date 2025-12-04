package seviye3;

import java.util.Scanner;

public class soru11 {
    public static void main(String[] args) {
        //Peşpeşe girilen 10 adet kelimenin “en küçük” ve “en büyük” uzunlukta 
        //hangi kelimenin olduğunu söyleyen programı yazınız 
        Scanner scanner = new Scanner(System.in);
        String[] kelimeler = new String[10];
        System.out.println("10 adet kelime giriniz:");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". kelime: ");
            kelimeler[i] = scanner.nextLine();
        }
        String enKucukKelime = kelimeler[0];
        String enBuyukKelime = kelimeler[0];
        for (int i = 1; i < kelimeler.length; i++) {
            if (kelimeler[i].length() < enKucukKelime.length()) {
                enKucukKelime = kelimeler[i];
            }
            if (kelimeler[i].length() > enBuyukKelime.length()) {
                enBuyukKelime = kelimeler[i];
            }
        }
        System.out.println("En küçük kelime: " + enKucukKelime);
        System.out.println("En büyük kelime: " + enBuyukKelime);
        scanner.close();
    }
}
