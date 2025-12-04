package seviye3;

import java.util.Scanner;

public class soru17 {
    public static void main(String[] args) throws InterruptedException {
        /* Klavyeden girilen bir kelimeyi sırasıyla ekranın solundan sağına kadar, 
yukardan aşağıya kadar, solundan sağına kadar, aşağıdan yukarıya kadar  
beklemeli aralıklarla kaydırılmasını sağlayınız. Görsel bir gösteri yapınız.  */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir kelime giriniz: ");
        String kelime = scanner.nextLine();
        scanner.close();

        int tg = 80; // Terminal genişliği
        int ty = 24; // Terminal yüksekliği
        int bs = 100; // Bekleme süresi (milisaniye)

        // Solundan sağına kaydırma
        for (int i = 0; i <= tg - kelime.length(); i++) {
            System.out.print("\r" + " ".repeat(i) + kelime);
            Thread.sleep(bs);
        }

        // Yukarıdan aşağıya kaydırma
        for (int i = 0; i < ty; i++) {
            clearScreen();
            System.out.print("\r" + " ".repeat(tg - kelime.length()) + kelime);
            System.out.println();
            Thread.sleep(bs);
        }

        // Sağından soluna kaydırma
        for (int i = tg - kelime.length(); i >= 0; i--) {
            System.out.print("\r" + " ".repeat(i) + kelime);
            Thread.sleep(bs);
        }

        // Aşağıdan yukarıya kaydırma
        for (int i = ty - 1; i >= 0; i--) {
            clearScreen();
            System.out.print("\r" + " ".repeat(tg - kelime.length()) + kelime);
            System.out.println();
            Thread.sleep(bs);
        }
    }

    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}