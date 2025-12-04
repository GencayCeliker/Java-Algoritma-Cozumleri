package seviye3;

public class soru3 {
    public static void main(String[] args) {
        // Ekrana ASCII kod tablosunu yazdırınız?

// ASCII bilgisayarlar ve diğer elektronik cihazlar arasında metin tabanlı
//verilerin temsil edilmesi ve iletilmesi için kullanılan bir karakter
//kodlama standardıdır. ASCII, her karakteri bir sayı ile eşleştirir.
// Bu sayılar 0'dan 127'ye kadar olan tam sayılardır ve her biri bir
//karakteri temsil eder.
        for (int i = 0; i < 300; i++) {
        //System.out.printf("%d: %c%n", i, (char) i);
        System.out.println((char)i);
//%s: Dize (string) format belirtecidir. s değişkeninin değerini yazdırır.
//%d: Tam sayı (decimal) format belirtecidir. i değişkeninin değerini yazdırır.
//%c: Karakter (character) format belirtecidir. (char) i ifadesi
//ile i tam sayısı karaktere dönüştürülür ve yazdırılır.
//%n: Yeni satır karakteridir. Her yazdırma işleminden sonra yeni bir satıra geçilmesini sağlar.
        }
    }
}
