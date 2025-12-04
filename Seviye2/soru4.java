package Seviye2;

import java.util.Scanner;

public class soru4 {
    public static void main(String[] args) {
        /*Girilen bir sayıyı başka girilen bir sayıya bölünüz. Ekrana “bölünen” 
         “bölüm” “kalan” sonuçlarını yazdırınız. ( Örn: 13 / 5 işleminde, bölünen = 
         13, bölüm =2, kalan= 3 olur ) */
        Scanner giris = new Scanner(System.in); 
        System.out.print("Bölünen Sayıyı Giriniz: ");
        int N = giris.nextInt(); 
        System.out.print("Bölen Sayıyı Giriniz: ");
        int M = giris.nextInt();      
        int bolum = N / M; 
        int kalan = N % M; 
        System.out.println("Bölünen = " + N);
        System.out.println("Bölüm = " + bolum);
        System.out.println("Kalan = " + kalan);
        giris.close();
    }
}
