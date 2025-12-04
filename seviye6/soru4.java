package seviye6;
import java.io.*;
public class soru4 {
    public static void main(String[] args) {
        /*Programın bulunduğu klasördeki herhangi bir “metin belgesi” içersinde, 
şayet belge içersinde “merhaba” kelimesi geçiyorsa kaçıncı satırlarda bu 
kelimenin geçtiğini ekrana yazdırınız*/
        String dosyaAdi = "C:\\Users\\Gencay\\Desktop\\odevjava\\seviye6\\Yeni Metin Belgesi.txt";
        String arananKelime = "merhaba";
        
        try (BufferedReader oku = new BufferedReader(new FileReader(dosyaAdi))) {
            String satir;
            int satirNumarasi = 0;
            while ((satir = oku.readLine()) != null) {
                satirNumarasi++;
                if (satir.contains(arananKelime)) {
                    System.out.println("Kelime bulundu! Satır: " + satirNumarasi);
                }
                else{
                    System.out.println("Kelime Bulunamadı");
                }
            }
        } catch (IOException e) {
            System.out.println("Bir hata oluştu: " + e.getMessage());
        }
    }    
    
}
