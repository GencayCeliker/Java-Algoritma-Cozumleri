package Seviye2;

import java.util.Scanner;

public class soru12 {
    public static void main(String[] args) {
        /*Girilen bir sayının “asal sayı” olup olmadığını söyleyen programı yazınız. ( 
        Asal Sayı: Kendisinden başka ortak böleni olmayan sayılara “asal sayı” denir. 
        Örn: 13 asal sayıdır. 8 asal sayı değildir, 2 ve 4 e bölündüğü için. ) */
        Scanner a = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = a.nextInt();
        boolean asal = true;

        if (sayi <= 1) {
            asal = false;
        } else {
            for (int i = 2; i <= Math.sqrt(sayi); i++) { 
                if (sayi % i == 0) {
                    asal = false;
                    break;
                }
            }
        }

        if (asal) {
            System.out.println(sayi + " asal bir sayıdır.");
        } else {
            System.out.println(sayi + " asal bir sayı değildir.");
        }

        a.close();
    }
}