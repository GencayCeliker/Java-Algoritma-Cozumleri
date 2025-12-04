package seviye7;

public class soru6 {
    public static void main(String[] args) {
        /*Ali, hesap makinesiyle oynarken makinenin yalnızca girilen sayının son 
dört basamağını gösterdiğini fark etti. Sonra dört basamaklı başka bir sayı yazdı 
ve "kare alma" tuşuna bastı. Karşısına çıkan aynıydı. Sonra "karekök alma" 
tuşuna bastı, yine aynı sayıyı gördü. Neydi bu dört basamaklı sayı? */
        for (int x = 1000; x <= 9999; x++) {
            int kare = x * x;

            // kare sayının son 4 basamağı, x'e eşit mi?
            if (kare % 10000 == x) {
                System.out.println("Ali'nin gördüğü sayı: " + x);
                System.out.println("Karesi: " + kare);
                break;
            }
        }
    }
}
