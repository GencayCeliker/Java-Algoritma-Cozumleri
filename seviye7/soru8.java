package seviye7;

public class soru8 {
    public static void main(String[] args) {
        /*İki sayının farkı büyüğün 4/5 i olduğuna göre, iki sayının toplamı küçüğün 
kaç katıdır? Bu koşula uyan 1 ila 100 arasındaki tüm tam sayıları bulun.*/
        for (int k = 1; k <= 100; k++) {
            int buyuk = 5 * k;
            if (buyuk <= 100) {
                int toplam = k + buyuk;
                System.out.println("Küçük: " + k + ", Büyük: " + buyuk + ", Toplam: " + toplam);
            }
        }
    }
}
