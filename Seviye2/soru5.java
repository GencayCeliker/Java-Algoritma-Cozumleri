package Seviye2;
import java.util.Scanner;
public class soru5 {
    public static void main(String[] args) {
         /*
		 * Girilen bir sayının “tek” mi “çift” mi olduğunu ekrana yazdırınız.  
		 */
        Scanner s1=new Scanner(System.in);
        System.out.print("Lütfen Tek Yada Çift Olduğunu Merak Ettiğiniz Sayıyı Giriniz: ");
        int n=s1.nextInt();
        if(n%2==0)
        {
            System.out.print("Girdiğiniz Sayı Çifttir.");
        }else
        {
            System.out.print("Girdiğiniz Sayı Tektir.");
        }
        s1.close();
    }
}
