package seviye7;

public class soru2 {
    public static void main(String[] args) {
        // Bir sayının başına ve sonuna “2” rakamı eklenerek 83 katı elde ediliyor. Bu 
//tanıma uyan en küçük sayı nedir?
        for (int x = 1; x <= 10000; x++) {
            int yenisayi = 2, basamakbol = x;
            int kuvvet = 1;
            // for (int i = basamakbol ; i >= kuvvet; i++) {
            // kuvvet *= 10;
            // }
            while (basamakbol >= kuvvet) {
                kuvvet = kuvvet * 10;
            }

            yenisayi = yenisayi * kuvvet * 10 + x * 10 + 2;
            if (yenisayi == 83 * x) {
                System.out.println("x: " + x + " = " + yenisayi);
                break;
            }
        }
    }
}
