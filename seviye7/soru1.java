package seviye7;

public class soru1 {
    public static void main(String[] args) {
        //Onlar basamağındaki rakamı 3, birler ve yüzler basamaklarındaki rakamları 
//4'er azaldığında kendisinin yarısına eşit olan 3 basamaklı sayı kaçtır?
        for (int a = 1; a <= 9; a++) {
            for (int c = 0; c <= 9; c++) {
                int b = 3; // onlar basamağı sabit
                int sayi = 100 * a + 10 * b + c;
                int yeni = 100 * (a - 4) + 10 * b + (c - 4);
                if (yeni == sayi / 2) {
                    System.out.println("Aranan sayı: " + sayi);
                }
            }
        }
    }
}
