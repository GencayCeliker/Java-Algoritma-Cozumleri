package Seviye2;

public class soru6 {
    public static void main(String[] args) {
        /* 1den 10a kadar olan sayıların çarpım tablosunu ekrana yazdırınız  */
        for (int i= 1;i <=10;i++) 
        {System.out.println("\n");
            for (int k= 1; k<=10; k++) {
                System.out.println(i+" X " +k+" = "+k*i);
            }
        }
    }
}
