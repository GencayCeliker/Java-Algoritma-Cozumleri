package seviye7;

public class soru9 {
    public static void main(String[] args) {
        /* Mehmet bir dükkandan 3 parça eşya aldı. Dükkan sahibinin hesap 
yaparken sayıları toplayacağı yerde çarptığını gördü. Onu uyardığında adam 
patavatsızca "Toplasam da aynı sonuç, yani 5.70 dolar olacaktı" dedi. Mehmet’in 
aldığı eşyaların fiyatları neydi?*/
        for (int i = 1; i <= 570; i++)
            for (int j = 1; j <= 570 - i; j++)
                for (int k = 1; k <= 570 - i - j; k++) {
                    double fiyat1 = i / 100.0, fiyat2 = j / 100.0, fiyat3 = k / 100.0;
                    double top = fiyat1 + fiyat2 + fiyat3, carp = fiyat1 *fiyat2* fiyat3;
                    if (top > 5.699 && top < 5.701 && carp > 5.699 && carp < 5.701) {
                        System.out.println("fiyat1= " + fiyat1+ " fiyat2= " + fiyat2 + " fiyat3= " + fiyat3);
                        return;
                    }
                }
            }
    }
