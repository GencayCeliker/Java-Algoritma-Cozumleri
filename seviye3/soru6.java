package seviye3;

import java.util.Scanner;

public class soru6 {
    public static void main(String[] args) {
        //Girilen bir cümleyi ekranın tam orta noktasına yazdırınız.(bunu formüle ediniz) 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir cümle giriniz: ");
        String yazi = scanner.nextLine();
        scanner.close();
        int ekrgen = 95;
        int bossayi = (ekrgen - yazi.length()) / 2;
        String ortyazi = " ".repeat(bossayi) + yazi;
        System.out.println("\n" + ortyazi+"\n");
    }
}