package Seviye2;

public class soru10 {
    public static void main(String[] args) {
        /* 1 den 100 e kadar olan sayılar içersinde  
        X^2 + Y^2 = 61 veya X^2 + Y^2 = 35 şartını sağlayan x ve y değerlerini 
        ekrana yazdırınız */
        int islem;
        for (int x = 1; x <= 100; x++) {
            for (int y = 1; y <= 100; y++) {
                islem = x * x + y * y;
                if (islem == 35 || islem == 61) {
                    System.out.println(islem + " Olabilmesi İçin " + "X Değeri: " + x + " Y Değeri " + y + " Olmalı  ");
                }
            }
        }
    }
}
