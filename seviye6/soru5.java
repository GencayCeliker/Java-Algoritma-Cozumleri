package seviye6;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class soru5{
    //] Klavyeden girilen 20 adet öğrencinin adını, vize notunu ve final notunu 
//“ogrenci.txt” dosyasına yazdırınız. Daha sonra bu dosyadan girdiğiniz verileri 
//okutup ekrana tekrar yazdırınız. 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ogrc;
        int vize;
        int fin;
        File file = new File("c:\\Users\\Gencay\\Desktop\\odevjava\\seviye6\\ogrenci.txt");
        for ( int i=1;i<=20;i++) {
            System.out.print("Öğrencinin Adı: ");
            ogrc=sc.nextLine();
            System.out.print("Öğrencinin Vize Notu: ");
            vize=sc.nextInt();
            System.out.print("Öğrencinin Final Notu: ");
            fin=sc.nextInt();
            sc.nextLine(); 
           
                try (FileWriter ekle = new FileWriter(file, true)) {
                    ekle.write("Öğrencinin Adı: "+ogrc + " Vize Notu: "+vize+" Final Notu: "+fin+"\n");
                } catch (IOException e) {
                    System.out.println("Dosyaya yazma hatası: " + e.getMessage());
                }
                 // sayilar.txt dosyasını okuyun ve terminalde yazdırın
        }
        try (Scanner fileScanner = new Scanner(file)) {
        System.out.println("sayilar.txt dosyasının içeriği:");
        while (fileScanner.hasNextLine()) {
             System.out.println(fileScanner.nextLine());
            }
         } catch (IOException e) {
             System.out.println("Dosyayı okuma hatası: " + e.getMessage());
         }
           




        sc.close();
    }
}
