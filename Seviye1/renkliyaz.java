import java.util.Scanner;

public class renkliyaz {
    // ANSI renk kodları
    public static final String RESET = "\u001B[0m";
    public static final String KIRMIZI = "\u001B[31m";
    public static final String YESIL = "\u001B[32m";
    public static final String MAVI = "\u001B[34m";
    public static final String SARI = "\u001B[33m";

    public static void main(String[] args) {
        int kare = 0;
        Scanner a = new Scanner(System.in);

        for (int k = 1; k <= 20; k++) {
            System.out.print(MAVI + k + ". Sayıyı Giriniz: " + RESET);
            kare = a.nextInt();

            System.out.println( "Girilen Sayının Karesi: " + KIRMIZI + (kare * kare)+RESET );

            System.out.println( "Girilen Sayının Kare Kökü: " +SARI + Math.sqrt(kare)+RESET);
            
        }

        a.close(); // Scanner'ı kapatmak iyi bir pratiktir
    }
}
