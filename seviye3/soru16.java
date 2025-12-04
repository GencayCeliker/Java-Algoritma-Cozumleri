package seviye3;
import java.util.Scanner;
public class soru16 {
    public static void main(String[] args) throws InterruptedException {
/* Girilen bir cümleyi 10 karakter genişliğindeki bir bant üzerinde kayan 
yazı şeklinde gösteriniz: Örn, 
Girilen cümle: “merhaba ben programlama öğreniyorum” olsun 
Bu cümleyi birinci karakterden itibaren başlatarak, 10 karakterini alıp ekrana 
aynı koordinatlara basınız. Bunu sürekli hale getirdiğinizde kayan yazıyı elde 
etmiş olacaksınız.  
“Merhaba be” ( 10 karakter genişliğinde bant ) 
“erhaba ben” 
( 10 karakter genişliğinde bant ) 
“rhaba ben “  ( 10 karakter genişliğinde bant ) 
“haba ben p”  ( 10 karakter genişliğinde bant ) 
… 
şeklinde aynı satır-sutun koordinatlarına yukardaki formülü yazdırınız.   */


        Scanner al = new Scanner(System.in);
        System.out.print("Bir cümle giriniz: ");
        String cumle = al.nextLine();
        al.close();

        int karakteruz = 10;

        if (cumle.length() < karakteruz) {
            System.out.println("Cümle 10 karakterden küçük olamaz!");
            return;
        }

        for (int i = 0; i <= cumle.length() - karakteruz; i++) {
            System.out.print("\r" + cumle.substring(i, i + karakteruz));
            Thread.sleep(500);
        }
    }
}