package seviye3;

import java.util.Scanner;

public class soru8 {
    public static void main(String[] args) {
        // Girilen bir cümlede kaç adet “sesli harf” olduğunu söyleyiniz 

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir cümle giriniz: ");
        String yazi = scanner.nextLine();
        int sesliharfsay = 0;
        String sesliharfler = "aeiouAEIOU";
        for (int i = 0; i < yazi.length(); i++) {
            if (sesliharfler.indexOf(yazi.charAt(i)) != -1) {
                sesliharfsay++;
            }
        }
        System.out.println("Sesli harf sayısı: " + sesliharfsay);
        scanner.close();
    }
}
