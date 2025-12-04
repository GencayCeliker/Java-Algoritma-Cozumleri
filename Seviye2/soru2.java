package Seviye2;

public class soru2 {
    public static void main(String[] args) {
        /*
		 * 100 den 1000 e kadar olan sayıların toplamını hesaplayıp ekrana yazdırınız 
		 */
        int top = 0;
        for (int k = 100; k <= 1000; k++) {
            top = top + k;
        }
        System.out.println("100 den 1000 e kadar olan sayıların toplamı: " + top);
    }
}
