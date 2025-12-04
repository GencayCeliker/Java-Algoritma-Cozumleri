package Seviye2;
import java.util.Scanner;
public class soru7 {
    public static void main(String[] args) {
        /*  “8” sayısının faktoriyel hesabını yapınız ve ekrana yazdırınız. Bu programı 
        geliştirip kullanıcının bir sayı girmesini ve bu sayının faktöriyelini hesaplayan 
        programı yazınız.   */
        int c=1;
        for (int b=8;b>1;b--){ c=c*b;}
        System.out.println("8Faktöriyelin cevabı:"+c);
        System.out.print("Faktöriyeli Hesaplamak İçin Sayı Giriniz: ");
        Scanner n=new Scanner(System.in);
        int sayi=n.nextInt();
        int f=1;
        for(int a=sayi;a>1;a--)
        {
            f=f*a;
        }n.close();
        System.out.println(sayi+" Sayısının Faktöriyeli = "+f);
    }
}
