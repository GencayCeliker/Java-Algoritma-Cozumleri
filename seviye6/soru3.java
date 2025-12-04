package seviye6;

import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class soru3 {
    public static void main(String[] args) {
        /* Klavyeden girilen 10 adet sayıyı “sayilar.txt” dosyasının devamına 
yazdırınız. */
        Scanner a = new Scanner(System.in);
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i + ". Sayıyı Giriniz: ");
                int b = a.nextInt();
                // sayilar.txt dosyasına sayıyı ekleyin
                File file = new File("c:\\Users\\Gencay\\Desktop\\odevjava\\seviye6\\sayilar.txt");
                try (FileWriter ekle = new FileWriter(file, true)) {
                    ekle.write(b + "\n");
                } catch (IOException e) {
                    System.out.println("Dosyaya yazma hatası: " + e.getMessage());
                }

                // sayilar.txt dosyasını okuyun ve terminalde yazdırın
                try (Scanner fileScanner = new Scanner(file)) {
                    System.out.println("sayilar.txt dosyasının içeriği:");
                    while (fileScanner.hasNextLine()) {
                        System.out.println(fileScanner.nextLine());
                    }
                } catch (IOException e) {
                    System.out.println("Dosyayı okuma hatası: " + e.getMessage());
                }
            }
        } finally {
            a.close(); // Scanner nesnesini kapatın
        }
    }
}